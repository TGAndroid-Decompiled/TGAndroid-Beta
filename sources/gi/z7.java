package gi;

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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.zb0;
public final class z7 extends FrameLayout {
    public final int f14042a = 0;
    public final Object f14043b;
    public final Object f14044c;
    public final Object d;
    public Object f14045e;
    public Object f14046f;
    public Object h;

    public z7(zb0 zb0Var, Context context) {
        super(context);
        this.h = zb0Var;
        this.f14043b = new ArrayList(4);
        this.f14044c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i3 = 0; i3 < 4; i3++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView, mf.e(50, 50, 51));
            ((ArrayList) this.f14043b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView2, mf.e(50, 50, 51));
            ((ArrayList) this.f14044c).add(textView2);
        }
    }

    public static void a(z7 z7Var, boolean z10) {
        ArrayList arrayList = (ArrayList) z7Var.f14044c;
        ArrayList arrayList2 = (ArrayList) z7Var.f14043b;
        StringBuilder sb2 = (StringBuilder) z7Var.d;
        if (sb2.length() == 0) {
            return;
        }
        oe oeVar = (oe) z7Var.f14046f;
        if (oeVar != null) {
            org.telegram.messenger.g0.r(oeVar);
            z7Var.f14046f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) z7Var.f14045e;
        if (animatorSet != null) {
            animatorSet.cancel();
            z7Var.f14045e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < 4; i3++) {
                TextView textView = (TextView) arrayList2.get(i3);
                int i10 = (textView.getAlpha() > 0.0f ? 1 : (textView.getAlpha() == 0.0f ? 0 : -1));
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (i10 != 0) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i3);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            z7Var.f14045e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) z7Var.f14045e).playTogether(arrayList3);
            ((AnimatorSet) z7Var.f14045e).addListener(new ub0(z7Var, 2));
            ((AnimatorSet) z7Var.f14045e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        zb0.a((zb0) z7Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f14044c;
        ArrayList arrayList2 = (ArrayList) this.f14043b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        for (int i3 = length + 1; i3 < 4; i3++) {
            TextView textView3 = (TextView) arrayList2.get(i3);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i3);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        oe oeVar = (oe) this.f14046f;
        if (oeVar != null) {
            org.telegram.messenger.g0.r(oeVar);
        }
        oe oeVar2 = new oe(this, length, 2);
        this.f14046f = oeVar2;
        org.telegram.messenger.g0.i3(oeVar2, 1500L);
        for (int i10 = 0; i10 < length; i10++) {
            TextView textView5 = (TextView) arrayList2.get(i10);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, c(i10)));
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
        AnimatorSet animatorSet = (AnimatorSet) this.f14045e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f14045e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f14045e).playTogether(arrayList3);
        ((AnimatorSet) this.f14045e).addListener(new ub0(this, 0));
        ((AnimatorSet) this.f14045e).start();
        zb0.a((zb0) this.h);
    }

    public int c(int i3) {
        return org.telegram.messenger.k5.D(30.0f, i3, (getMeasuredWidth() - (org.telegram.messenger.g0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.g0.L(10.0f);
    }

    public void d(boolean z10) {
        int i3;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f14044c;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        TextView textView = (TextView) this.d;
        boolean z11 = bd.f21784a0;
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
        textView.setLayoutParams(mf.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f14042a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f14046f;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, (org.telegram.ui.ActionBar.e6) this.f14043b));
                canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f14042a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f14044c;
                ArrayList arrayList2 = (ArrayList) this.f14043b;
                oe oeVar = (oe) this.f14046f;
                if (oeVar != null) {
                    org.telegram.messenger.g0.r(oeVar);
                    this.f14046f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f14045e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f14045e = null;
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
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f14042a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public z7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f14046f = new Paint(1);
        this.f14043b = e6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(bd.f21784a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        boolean z10 = bd.f21784a0;
        addView(textView, mf.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14044c = imageView;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.f14045e = w1Var;
        imageView.setImageDrawable(w1Var);
        w1Var.a(-1);
        w1Var.b(-1);
        w1Var.f28772k = 220.0f;
        addView(imageView, mf.d(24, 24.0f, (bd.f21784a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ai.b(this, 28));
    }
}
