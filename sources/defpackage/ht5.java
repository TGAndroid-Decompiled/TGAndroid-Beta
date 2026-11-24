package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ht5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public wc5 c;
    public boolean d;
    public final it5 e;

    public ht5(it5 it5Var, Context context) {
        super(context);
        this.e = it5Var;
        this.b = new ArrayList();
    }

    public final void a(wc5 wc5Var, boolean z) {
        this.d = true;
        it5 it5Var = this.e;
        it5Var.Z1.k(wc5Var, wc5Var.getUid());
        AnimatorSet animatorSet = it5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            it5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            it5Var.X1 = animatorSet2;
            animatorSet2.addListener(new gt5(this, (byte) 1));
            it5Var.X1.setDuration(150L);
            it5Var.X1.setInterpolator(d53.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(wc5Var);
    }

    public final void b(wc5 wc5Var) {
        this.d = false;
        it5 it5Var = this.e;
        it5Var.Z1.l(wc5Var.getUid());
        wc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = it5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            it5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        it5Var.X1 = animatorSet2;
        animatorSet2.addListener(new u5(this, wc5Var, (byte) 27));
        it5Var.X1.setDuration(150L);
        this.c = wc5Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, View.ALPHA, 1.0f, 0.0f));
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
        int c;
        int i3;
        u69 K;
        AnimatorSet animatorSet;
        xd xdVar;
        int i4;
        it5 it5Var = this.e;
        xd xdVar2 = it5Var.P1;
        pu9 pu9Var = it5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - gm.L(26.0f);
        int L2 = gm.L(10.0f);
        int L3 = gm.L(10.0f);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (!(childAt instanceof wc5)) {
                xdVar = xdVar2;
            } else {
                xdVar = xdVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824));
                if (childAt != this.c && childAt.getMeasuredWidth() + i6 > L) {
                    L2 = hg9.v(8.0f, childAt.getMeasuredHeight(), L2);
                    i6 = 0;
                }
                if (childAt.getMeasuredWidth() + i7 > L) {
                    L3 = hg9.v(8.0f, childAt.getMeasuredHeight(), L3);
                    i7 = 0;
                }
                int L4 = gm.L(13.0f) + i6;
                if (!this.a) {
                    wc5 wc5Var = this.c;
                    if (childAt == wc5Var) {
                        childAt.setTranslationX(gm.L(13.0f) + i7);
                        childAt.setTranslationY(L3);
                    } else if (wc5Var != null) {
                        float f = L4;
                        if (childAt.getTranslationX() != f) {
                            i4 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f));
                        } else {
                            i4 = 1;
                        }
                        float f2 = L2;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i4];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.c) {
                    i6 = hg9.v(9.0f, childAt.getMeasuredWidth(), i6);
                }
                i7 = hg9.v(9.0f, childAt.getMeasuredWidth(), i7);
            }
            i5++;
            xdVar2 = xdVar;
        }
        xd xdVar3 = xdVar2;
        int L5 = gm.L(42.0f) + L3;
        final int L6 = gm.L(42.0f) + L2;
        if (it5Var.g2 != null) {
            if (it5Var.a2) {
                c = Math.min(it5Var.m2, L6);
            } else {
                c = 0;
            }
        } else {
            c = b10.c(52.0f, Math.min(it5Var.m2, L6), 0);
        }
        int i8 = it5Var.o2;
        if (it5Var.g2 == null && it5Var.Z1.m() > 0) {
            i3 = gm.L(56.0f);
        } else {
            i3 = 0;
        }
        it5Var.o2 = i3;
        if (c != it5Var.i2 || i8 != i3) {
            it5Var.i2 = c;
            if (pu9Var.getAdapter() != null && pu9Var.getAdapter().b() > 0 && (K = pu9Var.K(0)) != null) {
                pu9Var.getAdapter().g(0);
                it5Var.L1.g1(0, K.a.getTop() - pu9Var.getPaddingTop());
                if (pu9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new af0(this, (byte) 6));
                    ofFloat.setDuration(pu9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(it5Var.m2, L6);
        int i9 = it5Var.e2;
        if (i9 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i9, min);
            ofInt.addUpdateListener(new fh4(this, (byte) 14));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L6 > it5Var.m2) {
                gm.c3(new Runnable(this) {
                    public final ht5 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i10 = L6;
                        ht5 ht5Var = this.b;
                        switch (b) {
                            case 0:
                                it5 it5Var2 = ht5Var.e;
                                it5Var2.P1.smoothScrollTo(0, i10 - it5Var2.m2);
                                return;
                            default:
                                it5 it5Var3 = ht5Var.e;
                                it5Var3.P1.smoothScrollTo(0, i10 - it5Var3.m2);
                                return;
                        }
                    }
                });
            }
        } else if (xdVar3.getMeasuredHeight() + xdVar3.getScrollY() > L6) {
            gm.c3(new Runnable(this) {
                public final ht5 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i10 = L6;
                    ht5 ht5Var = this.b;
                    switch (b) {
                        case 0:
                            it5 it5Var2 = ht5Var.e;
                            it5Var2.P1.smoothScrollTo(0, i10 - it5Var2.m2);
                            return;
                        default:
                            it5 it5Var3 = ht5Var.e;
                            it5Var3.P1.smoothScrollTo(0, i10 - it5Var3.m2);
                            return;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = it5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            it5Var.X1.addListener(new gt5(this, (byte) 0));
            it5Var.X1.start();
            this.a = true;
        }
        if (it5Var.X1 == null) {
            it5Var.e2 = min;
            it5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        pu9Var.setTranslationY(0.0f);
    }
}
