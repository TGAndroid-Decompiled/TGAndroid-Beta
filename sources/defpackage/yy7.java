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
public final class yy7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int a;
    public final int b;
    public final tg5 c;
    public final fz7 d;

    public yy7(fz7 fz7Var, int i, int i2, tg5 tg5Var) {
        this.d = fz7Var;
        this.a = i;
        this.b = i2;
        this.c = tg5Var;
    }

    @Override
    public final void onGlobalLayout() {
        float f;
        int L;
        float f2;
        b6 b6Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f3;
        float f4;
        float f5;
        float f6;
        long j;
        fz7 fz7Var = this.d;
        b6 b6Var2 = fz7Var.e;
        ArrayList arrayList = fz7Var.a0;
        int[] iArr2 = fz7Var.i0;
        e29 e29Var = fz7Var.N;
        fz7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!fz7Var.Q && fz7Var.isAttachedToWindow()) {
            fz7Var.setAlpha(1.0f);
            e29Var.getAnimatedDrawable().I(0, false, false);
            e29Var.getAnimatedDrawable().K(37);
            e29Var.d();
            fz7Var.o(true);
            hl.d3(new fe7(this, (byte) 20), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            fz7Var.R = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = hl.q;
            int i = point.x;
            int i2 = point.y + hl.m;
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
            int childCount = b6Var2.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = b6Var2.getChildAt(i12);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr2);
                int measuredWidth = i3 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
                int measuredHeight = i6 - ((childAt.getMeasuredHeight() / 2) + iArr2[i10]);
                obj.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - hl.L(40.0f);
                if (i12 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    b6Var = b6Var2;
                    float[] fArr = new float[i10];
                    fArr[0] = 1.0f;
                    view = childAt;
                    iArr = iArr2;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, property, fArr), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                    d = max;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    b6Var = b6Var2;
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
                obj.a.addListener(new ad5(animatorSet, (byte) 24));
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
                b6Var2 = b6Var;
                iArr2 = iArr;
                max = d;
                i10 = 1;
            }
            final double d2 = max;
            arrayList2.add(ObjectAnimator.ofFloat(fz7Var.w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fz7 fz7Var2 = yy7.this.d;
                    double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = fz7Var2.a0;
                        if (i13 < arrayList3.size()) {
                            bz7 bz7Var = (bz7) arrayList3.get(i13);
                            if (bz7Var.b <= animatedFraction) {
                                bz7Var.a.start();
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
            k43 k43Var = k43.h;
            animatorSet2.setInterpolator(k43Var);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fz7Var.b0, 1.0f);
            ofFloat3.addUpdateListener(new pv7(this, (byte) 2));
            ofFloat3.addListener(new xy7(this, (byte) 0));
            ofFloat3.setDuration(420L);
            ofFloat3.setInterpolator(k43Var);
            arrayList2.add(ofFloat3);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new xy7(this, (byte) 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            fz7Var.S = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!hl.O1() && fz7Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (xea.q == 0) {
                    f2 = i / 2.0f;
                } else {
                    f2 = i;
                }
                f = f2 / 2.0f;
                L = hl.L(30.0f);
            } else {
                f = i / 2.0f;
                L = hl.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(e29Var, View.TRANSLATION_X, i3 - hl.L(29.0f), f - L), ObjectAnimator.ofFloat(e29Var, View.TRANSLATION_Y, i6 - hl.L(29.0f), fz7Var.M), ObjectAnimator.ofFloat(e29Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(e29Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(k43.g);
            animatorSet5.start();
        }
    }
}
