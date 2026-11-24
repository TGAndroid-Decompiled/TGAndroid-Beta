package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
public final class ux7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int a;
    public final int b;
    public final fd5 c;
    public final by7 d;

    public ux7(by7 by7Var, int i, int i2, fd5 fd5Var) {
        this.d = by7Var;
        this.a = i;
        this.b = i2;
        this.c = fd5Var;
    }

    @Override
    public final void onGlobalLayout() {
        float f;
        int L;
        float f2;
        a6 a6Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f3;
        float f4;
        float f5;
        float f6;
        long j;
        by7 by7Var = this.d;
        a6 a6Var2 = by7Var.e;
        ArrayList arrayList = by7Var.a0;
        int[] iArr2 = by7Var.i0;
        s09 s09Var = by7Var.N;
        by7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!by7Var.Q && by7Var.isAttachedToWindow()) {
            by7Var.setAlpha(1.0f);
            s09Var.getAnimatedDrawable().I(0, false, false);
            s09Var.getAnimatedDrawable().K(37);
            s09Var.d();
            by7Var.o(true);
            gm.d3(new kl7(this, (byte) 12), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            by7Var.R = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = gm.q;
            int i = point.x;
            int i2 = point.y + gm.m;
            int i3 = this.a;
            int i4 = i - i3;
            int i5 = i4 * i4;
            int i6 = this.b;
            int i7 = i2 - i6;
            int i8 = i7 * i7;
            int i9 = i3 * i3;
            int i10 = 1;
            int i11 = i6 * i6;
            double max = Math.max(Math.max(Math.max(Math.sqrt(i8 + i5), Math.sqrt(i8 + i9)), Math.sqrt(i9 + i11)), Math.sqrt(i11 + i5));
            arrayList.clear();
            int childCount = a6Var2.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = a6Var2.getChildAt(i12);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr2);
                int measuredWidth = i3 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
                int measuredHeight = i6 - ((childAt.getMeasuredHeight() / 2) + iArr2[i10]);
                obj.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - gm.L(40.0f);
                if (i12 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    a6Var = a6Var2;
                    float[] fArr = new float[i10];
                    fArr[0] = 1.0f;
                    view = childAt;
                    iArr = iArr2;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, property, fArr), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                    d = max;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    a6Var = a6Var2;
                    iArr = iArr2;
                    d = max;
                    view = childAt;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.a = animatorSet3;
                Property property2 = View.SCALE_X;
                if (i12 == -1) {
                    f3 = 1.0f;
                    f4 = 0.9f;
                } else {
                    f3 = 1.04f;
                    f4 = 0.6f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property2, f4, f3);
                Property property3 = View.SCALE_Y;
                if (i12 == -1) {
                    f5 = 1.0f;
                    f6 = 0.9f;
                } else {
                    f5 = 1.04f;
                    f6 = 0.6f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property3, f6, f5), ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
                obj.a.addListener(new v85(animatorSet, (byte) 27));
                AnimatorSet animatorSet4 = obj.a;
                if (i12 == -1) {
                    j = 232;
                } else {
                    j = 200;
                }
                animatorSet4.setDuration(j);
                obj.a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i12++;
                a6Var2 = a6Var;
                iArr2 = iArr;
                max = d;
                i10 = 1;
            }
            final double d2 = max;
            arrayList2.add(ObjectAnimator.ofFloat(by7Var.w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    by7 by7Var2 = ux7.this.d;
                    double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = by7Var2.a0;
                        if (i13 < arrayList3.size()) {
                            xx7 xx7Var = (xx7) arrayList3.get(i13);
                            if (xx7Var.b <= animatedFraction) {
                                xx7Var.a.start();
                                arrayList3.remove(i13);
                                i13--;
                            }
                            i13++;
                        } else {
                            return;
                        }
                    }
                }
            });
            d53 d53Var = d53.h;
            animatorSet2.setInterpolator(d53Var);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(by7Var.b0, 1.0f);
            ofFloat3.addUpdateListener(new fx7(this, (byte) 1));
            ofFloat3.addListener(new tx7(this, (byte) 0));
            ofFloat3.setDuration(420L);
            ofFloat3.setInterpolator(d53Var);
            arrayList2.add(ofFloat3);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new tx7(this, (byte) 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            by7Var.S = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!gm.O1() && by7Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (gda.q == 0) {
                    f2 = i / 2.0f;
                } else {
                    f2 = i;
                }
                f = f2 / 2.0f;
                L = gm.L(30.0f);
            } else {
                f = i / 2.0f;
                L = gm.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(s09Var, View.TRANSLATION_X, i3 - gm.L(29.0f), f - L), ObjectAnimator.ofFloat(s09Var, View.TRANSLATION_Y, i6 - gm.L(29.0f), by7Var.M), ObjectAnimator.ofFloat(s09Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(s09Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(d53.g);
            animatorSet5.start();
        }
    }
}
