package kh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.ye;
public final class z8 extends FrameLayout {
    public final int f16466a = 0;
    public final Object f16467b;
    public final Object f16468c;
    public final Object d;
    public Object f16469e;
    public Object f16470f;
    public Object h;

    public z8(yc0 yc0Var, Context context) {
        super(context);
        this.h = yc0Var;
        this.f16467b = new ArrayList(4);
        this.f16468c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i9 = 0; i9 < 4; i9++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(AndroidUtilities.dp(25.0f));
            textView.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView, g7.e6.e(50, 50, 51));
            ((ArrayList) this.f16467b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(AndroidUtilities.dp(25.0f));
            textView2.setPivotY(AndroidUtilities.dp(25.0f));
            addView(textView2, g7.e6.e(50, 50, 51));
            ((ArrayList) this.f16468c).add(textView2);
        }
    }

    public static void a(z8 z8Var, boolean z10) {
        ArrayList arrayList = (ArrayList) z8Var.f16468c;
        ArrayList arrayList2 = (ArrayList) z8Var.f16467b;
        StringBuilder sb2 = (StringBuilder) z8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        ye yeVar = (ye) z8Var.f16470f;
        if (yeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yeVar);
            z8Var.f16470f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) z8Var.f16469e;
        if (animatorSet != null) {
            animatorSet.cancel();
            z8Var.f16469e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            for (int i9 = 0; i9 < 4; i9++) {
                TextView textView = (TextView) arrayList2.get(i9);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i9);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            z8Var.f16469e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) z8Var.f16469e).playTogether(arrayList3);
            ((AnimatorSet) z8Var.f16469e).addListener(new uc0(z8Var, 2));
            ((AnimatorSet) z8Var.f16469e).start();
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                ((TextView) arrayList2.get(i10)).setAlpha(0.0f);
                ((TextView) arrayList.get(i10)).setAlpha(0.0f);
            }
        }
        yc0.a((yc0) z8Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f16468c;
        ArrayList arrayList2 = (ArrayList) this.f16467b;
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
        for (int i9 = length + 1; i9 < 4; i9++) {
            TextView textView3 = (TextView) arrayList2.get(i9);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i9);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        ye yeVar = (ye) this.f16470f;
        if (yeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yeVar);
        }
        ye yeVar2 = new ye(this, length, 2);
        this.f16470f = yeVar2;
        AndroidUtilities.runOnUIThread(yeVar2, 1500L);
        for (int i10 = 0; i10 < length; i10++) {
            TextView textView5 = (TextView) arrayList2.get(i10);
            float[] fArr2 = {c(i10)};
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, fArr2));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i10);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property5, c(i10)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.f16469e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f16469e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f16469e).playTogether(arrayList3);
        ((AnimatorSet) this.f16469e).addListener(new uc0(this, 0));
        ((AnimatorSet) this.f16469e).start();
        yc0.a((yc0) this.h);
    }

    public int c(int i9) {
        return org.telegram.messenger.l0.D(30.0f, i9, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * ((StringBuilder) this.d).length())) / 2) - AndroidUtilities.dp(10.0f);
    }

    public void d(boolean z10) {
        int i9;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f16468c;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z11 && z10) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(g7.e6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f16466a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f16470f;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, (org.telegram.ui.ActionBar.b6) this.f16467b));
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f16466a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f16468c;
                ArrayList arrayList2 = (ArrayList) this.f16467b;
                ye yeVar = (ye) this.f16470f;
                if (yeVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(yeVar);
                    this.f16470f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f16469e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f16469e = null;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (i13 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i13);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i13));
                        TextView textView2 = (TextView) arrayList.get(i13);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i13));
                    } else {
                        ((TextView) arrayList2.get(i13)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i13)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f16466a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    public z8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f16470f = new Paint(1);
        this.f16467b = b6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        ll.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f16468c = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f16469e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        h2Var.b(-1);
        h2Var.f23455k = 220.0f;
        addView(imageView, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new x8(this, 0));
    }
}
