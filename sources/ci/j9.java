package ci;

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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.ue0;
public final class j9 extends FrameLayout {
    public final int f5285a = 0;
    public final Object f5286b;
    public final Object f5287c;
    public final Object d;
    public Object f5288e;
    public Object f5289f;
    public Object h;

    public j9(ue0 ue0Var, Context context) {
        super(context);
        this.h = ue0Var;
        this.f5286b = new ArrayList(4);
        this.f5287c = new ArrayList(4);
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
            addView(textView, w7.x5.e(50, 50, 51));
            ((ArrayList) this.f5286b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(AndroidUtilities.dp(25.0f));
            textView2.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView2, w7.x5.e(50, 50, 51));
            ((ArrayList) this.f5287c).add(textView2);
        }
    }

    public static void a(j9 j9Var, boolean z10) {
        ArrayList arrayList = (ArrayList) j9Var.f5287c;
        ArrayList arrayList2 = (ArrayList) j9Var.f5286b;
        StringBuilder sb2 = (StringBuilder) j9Var.d;
        if (sb2.length() == 0) {
            return;
        }
        lf lfVar = (lf) j9Var.f5289f;
        if (lfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lfVar);
            j9Var.f5289f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) j9Var.f5288e;
        if (animatorSet != null) {
            animatorSet.cancel();
            j9Var.f5288e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                TextView textView = (TextView) arrayList2.get(i10);
                int i11 = (textView.getAlpha() > 0.0f ? 1 : (textView.getAlpha() == 0.0f ? 0 : -1));
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (i11 != 0) {
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
            j9Var.f5288e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) j9Var.f5288e).playTogether(arrayList3);
            ((AnimatorSet) j9Var.f5288e).addListener(new qe0(j9Var, 2));
            ((AnimatorSet) j9Var.f5288e).start();
        } else {
            for (int i12 = 0; i12 < 4; i12++) {
                ((TextView) arrayList2.get(i12)).setAlpha(0.0f);
                ((TextView) arrayList.get(i12)).setAlpha(0.0f);
            }
        }
        ue0.a((ue0) j9Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f5287c;
        ArrayList arrayList2 = (ArrayList) this.f5286b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e7) {
            FileLog.e(e7);
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
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, AndroidUtilities.dp(20.0f), 0.0f));
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
        lf lfVar = (lf) this.f5289f;
        if (lfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lfVar);
        }
        lf lfVar2 = new lf(this, length, 2);
        this.f5289f = lfVar2;
        AndroidUtilities.runOnUIThread(lfVar2, 1500L);
        for (int i11 = 0; i11 < length; i11++) {
            TextView textView5 = (TextView) arrayList2.get(i11);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, c(i11)));
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
        AnimatorSet animatorSet = (AnimatorSet) this.f5288e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5288e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f5288e).playTogether(arrayList3);
        ((AnimatorSet) this.f5288e).addListener(new qe0(this, 0));
        ((AnimatorSet) this.f5288e).start();
        ue0.a((ue0) this.h);
    }

    public int c(int i10) {
        return org.telegram.messenger.q.D(30.0f, i10, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * ((StringBuilder) this.d).length())) / 2) - AndroidUtilities.dp(10.0f);
    }

    public void d(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f5287c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f7 = 53.0f;
        } else {
            f7 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(w7.x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5285a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f5289f;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20787d7, (org.telegram.ui.ActionBar.d6) this.f5286b));
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
        switch (this.f5285a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f5287c;
                ArrayList arrayList2 = (ArrayList) this.f5286b;
                lf lfVar = (lf) this.f5289f;
                if (lfVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(lfVar);
                    this.f5289f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f5288e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f5288e = null;
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
        switch (this.f5285a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5289f = new Paint(1);
        this.f5286b = d6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        ai.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20894j5, d6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, w7.x5.a(-2.0f, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f, -1, 23));
        ImageView imageView = new ImageView(context);
        this.f5287c = imageView;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f5288e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(-1);
        f2Var.b(-1);
        f2Var.f20595k = 220.0f;
        addView(imageView, w7.x5.a(24.0f, 16.0f, 0.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        imageView.setOnClickListener(new ai.v0(this, 12));
    }
}
