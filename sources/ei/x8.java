package ei;

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
import org.telegram.messenger.nk;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.me0;
public final class x8 extends FrameLayout {
    public final int f10105a = 0;
    public final Object f10106b;
    public final Object f10107c;
    public final Object d;
    public Object e;
    public Object f10108f;
    public Object h;

    public x8(me0 me0Var, Context context) {
        super(context);
        this.h = me0Var;
        this.f10106b = new ArrayList(4);
        this.f10107c = new ArrayList(4);
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
            addView(textView, w7.z5.e(50, 50, 51));
            ((ArrayList) this.f10106b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(AndroidUtilities.dp(25.0f));
            textView2.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView2, w7.z5.e(50, 50, 51));
            ((ArrayList) this.f10107c).add(textView2);
        }
    }

    public static void a(x8 x8Var, boolean z10) {
        ArrayList arrayList = (ArrayList) x8Var.f10107c;
        ArrayList arrayList2 = (ArrayList) x8Var.f10106b;
        StringBuilder sb2 = (StringBuilder) x8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        hf hfVar = (hf) x8Var.f10108f;
        if (hfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hfVar);
            x8Var.f10108f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) x8Var.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            x8Var.e = null;
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
            x8Var.e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) x8Var.e).playTogether(arrayList3);
            ((AnimatorSet) x8Var.e).addListener(new he0(x8Var, 2));
            ((AnimatorSet) x8Var.e).start();
        } else {
            for (int i12 = 0; i12 < 4; i12++) {
                ((TextView) arrayList2.get(i12)).setAlpha(0.0f);
                ((TextView) arrayList.get(i12)).setAlpha(0.0f);
            }
        }
        me0.a((me0) x8Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f10107c;
        ArrayList arrayList2 = (ArrayList) this.f10106b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            FileLog.e(e);
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
        hf hfVar = (hf) this.f10108f;
        if (hfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hfVar);
        }
        hf hfVar2 = new hf(this, length, 2);
        this.f10108f = hfVar2;
        AndroidUtilities.runOnUIThread(hfVar2, 1500L);
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
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.e).playTogether(arrayList3);
        ((AnimatorSet) this.e).addListener(new he0(this, 0));
        ((AnimatorSet) this.e).start();
        me0.a((me0) this.h);
    }

    public int c(int i10) {
        return org.telegram.messenger.g0.D(30.0f, i10, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * ((StringBuilder) this.d).length())) / 2) - AndroidUtilities.dp(10.0f);
    }

    public void d(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f10107c;
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
        textView.setLayoutParams(w7.z5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10105a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f10108f;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20995d7, (org.telegram.ui.ActionBar.d6) this.f10106b));
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
        switch (this.f10105a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f10107c;
                ArrayList arrayList2 = (ArrayList) this.f10106b;
                hf hfVar = (hf) this.f10108f;
                if (hfVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(hfVar);
                    this.f10108f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.e = null;
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
        switch (this.f10105a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public x8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f10108f = new Paint(1);
        this.f10106b = d6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        nk.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21100j5, d6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, w7.z5.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f10107c = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.e = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        g2Var.b(-1);
        g2Var.f20872k = 220.0f;
        addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ah.g0(this, 23));
    }
}
