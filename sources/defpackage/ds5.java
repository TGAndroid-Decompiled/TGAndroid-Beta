package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ds5 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public wc5 d;
    public int e;
    public final es5 f;

    public ds5(es5 es5Var, Context context) {
        super(context);
        this.f = es5Var;
        this.c = new ArrayList();
    }

    public final void a(wc5 wc5Var) {
        es5 es5Var = this.f;
        es5Var.E.remove(wc5Var.getKey());
        es5Var.F.remove(wc5Var);
        wc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new u5(this, wc5Var, (byte) 26));
        this.a.setInterpolator(d53.h);
        this.a.setDuration(320L);
        this.d = wc5Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        float min;
        int i3;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(8.0f);
        int i4 = size - (L << 1);
        int i5 = L;
        int i6 = i5;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt instanceof wc5) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), 1073741824));
                if (childAt != this.d && childAt.getMeasuredWidth() + i9 > i4) {
                    i6 += gm.L(34.0f);
                    i9 = 0;
                }
                if (childAt.getMeasuredWidth() + i10 > i4) {
                    i5 += gm.L(34.0f);
                    i10 = 0;
                }
                int i11 = L + i9;
                if (!this.b) {
                    wc5 wc5Var = this.d;
                    if (childAt == wc5Var) {
                        childAt.setTranslationX(L + i10);
                        childAt.setTranslationY(i5);
                    } else if (wc5Var != null) {
                        float f = i11;
                        if (childAt.getTranslationX() != f) {
                            i3 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f));
                        } else {
                            i3 = 1;
                        }
                        float f2 = i6;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i11);
                        childAt.setTranslationY(i6);
                    }
                }
                if (childAt != this.d) {
                    int v = hg9.v(6.0f, childAt.getMeasuredWidth(), i9);
                    i8 = Math.max(i8, i6);
                    i9 = v;
                }
                i10 = hg9.v(6.0f, childAt.getMeasuredWidth(), i10);
            }
            i7++;
        }
        int v2 = hg9.v(28.0f, i8, L);
        if (!this.b) {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                this.e = v2;
                animatorSet.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.e = Math.max(v2, gm.L(28.0f) + i5 + L);
            }
        }
        es5 es5Var = this.f;
        h94 h94Var = es5Var.a;
        if (es5Var.F.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(v2, es5Var.x);
        }
        h94Var.a(min);
        setMeasuredDimension(size, this.e);
    }
}
