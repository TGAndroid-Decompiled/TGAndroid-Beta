package nh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.nd0;
public final class l8 extends FrameLayout {
    public final int f18047a = 0;
    public final Object f18048b;
    public final Object f18049c;
    public final Object d;
    public Object f18050e;
    public Object f18051f;
    public Object h;

    public l8(nd0 nd0Var, Context context) {
        super(context);
        this.h = nd0Var;
        this.f18048b = new ArrayList(4);
        this.f18049c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(AndroidUtilities.dp(25.0f));
            textView.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView, i7.f6.e(50, 50, 51));
            ((ArrayList) this.f18048b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(AndroidUtilities.dp(25.0f));
            textView2.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView2, i7.f6.e(50, 50, 51));
            ((ArrayList) this.f18049c).add(textView2);
        }
    }

    public static void a(l8 l8Var, boolean z10) {
        ArrayList arrayList = (ArrayList) l8Var.f18049c;
        ArrayList arrayList2 = (ArrayList) l8Var.f18048b;
        StringBuilder sb2 = (StringBuilder) l8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        bf bfVar = (bf) l8Var.f18051f;
        if (bfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bfVar);
            l8Var.f18051f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) l8Var.f18050e;
        if (animatorSet != null) {
            animatorSet.cancel();
            l8Var.f18050e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                TextView textView = (TextView) arrayList2.get(i10);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i10);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            l8Var.f18050e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) l8Var.f18050e).playTogether(arrayList3);
            ((AnimatorSet) l8Var.f18050e).addListener(new jd0(l8Var, 2));
            ((AnimatorSet) l8Var.f18050e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        nd0.a((nd0) l8Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f18049c;
        ArrayList arrayList2 = (ArrayList) this.f18048b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb2.length();
        sb2.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f, 1.0f));
        float[] fArr = {AndroidUtilities.dp(20.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, fArr));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, AndroidUtilities.dp(20.0f), 0.0f));
        for (int i10 = length + 1; i10 < 4; i10++) {
            TextView textView3 = (TextView) arrayList2.get(i10);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i10);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        bf bfVar = (bf) this.f18051f;
        if (bfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bfVar);
        }
        bf bfVar2 = new bf(this, length, 2);
        this.f18051f = bfVar2;
        AndroidUtilities.runOnUIThread(bfVar2, 1500L);
        for (int i11 = 0; i11 < length; i11++) {
            TextView textView5 = (TextView) arrayList2.get(i11);
            float[] fArr2 = {c(i11)};
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, fArr2));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i11);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property5, c(i11)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.f18050e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f18050e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f18050e).playTogether(arrayList3);
        ((AnimatorSet) this.f18050e).addListener(new jd0(this, 0));
        ((AnimatorSet) this.f18050e).start();
        nd0.a((nd0) this.h);
    }

    public int c(int i10) {
        return org.telegram.messenger.x3.D(30.0f, i10, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * ((StringBuilder) this.d).length())) / 2) - AndroidUtilities.dp(10.0f);
    }

    public void d(boolean z10) {
        int i10;
        float f9;
        float f10;
        ImageView imageView = (ImageView) this.f18049c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f9 = 53.0f;
        } else {
            f9 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(i7.f6.d(-1, -2.0f, 23, f9, 0.0f, f10, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f18047a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f18051f;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, (org.telegram.ui.ActionBar.c6) this.f18048b));
                canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f18047a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f18049c;
                ArrayList arrayList2 = (ArrayList) this.f18048b;
                bf bfVar = (bf) this.f18051f;
                if (bfVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bfVar);
                    this.f18051f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f18050e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f18050e = null;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (i14 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i14);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i14));
                        TextView textView2 = (TextView) arrayList.get(i14);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i14));
                    } else {
                        ((TextView) arrayList2.get(i14)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i14)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f18047a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public l8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f18051f = new Paint(1);
        this.f18048b = c6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, i7.f6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f18049c = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f18050e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        h2Var.b(-1);
        h2Var.f23476k = 220.0f;
        addView(imageView, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new mh.n(this, 6));
    }
}
