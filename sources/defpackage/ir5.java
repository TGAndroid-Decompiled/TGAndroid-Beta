package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ir5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public ya5 c;
    public boolean d;
    public final jr5 e;

    public ir5(jr5 jr5Var, Context context) {
        super(context);
        this.e = jr5Var;
        this.b = new ArrayList();
    }

    public final void a(ya5 ya5Var, boolean z) {
        this.d = true;
        jr5 jr5Var = this.e;
        jr5Var.Z1.k(ya5Var, ya5Var.getUid());
        AnimatorSet animatorSet = jr5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            jr5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            jr5Var.X1 = animatorSet2;
            animatorSet2.addListener(new hr5(this, (byte) 1));
            jr5Var.X1.setDuration(150L);
            jr5Var.X1.setInterpolator(s33.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(ya5Var);
    }

    public final void b(ya5 ya5Var) {
        this.d = false;
        jr5 jr5Var = this.e;
        jr5Var.Z1.l(ya5Var.getUid());
        ya5Var.setOnClickListener(null);
        AnimatorSet animatorSet = jr5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            jr5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        jr5Var.X1 = animatorSet2;
        animatorSet2.addListener(new u5(this, ya5Var, (byte) 27));
        jr5Var.X1.setDuration(150L);
        this.c = ya5Var;
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
        s49 K;
        AnimatorSet animatorSet;
        xc xcVar;
        int i4;
        jr5 jr5Var = this.e;
        xc xcVar2 = jr5Var.P1;
        ns9 ns9Var = jr5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - gl.L(26.0f);
        int L2 = gl.L(10.0f);
        int L3 = gl.L(10.0f);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (!(childAt instanceof ya5)) {
                xcVar = xcVar2;
            } else {
                xcVar = xcVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), 1073741824));
                if (childAt != this.c && childAt.getMeasuredWidth() + i6 > L) {
                    L2 = de9.w(8.0f, childAt.getMeasuredHeight(), L2);
                    i6 = 0;
                }
                if (childAt.getMeasuredWidth() + i7 > L) {
                    L3 = de9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i7 = 0;
                }
                int L4 = gl.L(13.0f) + i6;
                if (!this.a) {
                    ya5 ya5Var = this.c;
                    if (childAt == ya5Var) {
                        childAt.setTranslationX(gl.L(13.0f) + i7);
                        childAt.setTranslationY(L3);
                    } else if (ya5Var != null) {
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
                    i6 = de9.w(9.0f, childAt.getMeasuredWidth(), i6);
                }
                i7 = de9.w(9.0f, childAt.getMeasuredWidth(), i7);
            }
            i5++;
            xcVar2 = xcVar;
        }
        xc xcVar3 = xcVar2;
        int L5 = gl.L(42.0f) + L3;
        final int L6 = gl.L(42.0f) + L2;
        if (jr5Var.g2 != null) {
            if (jr5Var.a2) {
                c = Math.min(jr5Var.m2, L6);
            } else {
                c = 0;
            }
        } else {
            c = b00.c(52.0f, Math.min(jr5Var.m2, L6), 0);
        }
        int i8 = jr5Var.o2;
        if (jr5Var.g2 == null && jr5Var.Z1.m() > 0) {
            i3 = gl.L(56.0f);
        } else {
            i3 = 0;
        }
        jr5Var.o2 = i3;
        if (c != jr5Var.i2 || i8 != i3) {
            jr5Var.i2 = c;
            if (ns9Var.getAdapter() != null && ns9Var.getAdapter().b() > 0 && (K = ns9Var.K(0)) != null) {
                ns9Var.getAdapter().g(0);
                jr5Var.L1.g1(0, K.a.getTop() - ns9Var.getPaddingTop());
                if (ns9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ae0(this, (byte) 6));
                    ofFloat.setDuration(ns9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(jr5Var.m2, L6);
        int i9 = jr5Var.e2;
        if (i9 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i9, min);
            ofInt.addUpdateListener(new ni4(this, (byte) 12));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L6 > jr5Var.m2) {
                gl.d3(new Runnable(this) {
                    public final ir5 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i10 = L6;
                        ir5 ir5Var = this.b;
                        switch (b) {
                            case 0:
                                jr5 jr5Var2 = ir5Var.e;
                                jr5Var2.P1.smoothScrollTo(0, i10 - jr5Var2.m2);
                                return;
                            default:
                                jr5 jr5Var3 = ir5Var.e;
                                jr5Var3.P1.smoothScrollTo(0, i10 - jr5Var3.m2);
                                return;
                        }
                    }
                });
            }
        } else if (xcVar3.getMeasuredHeight() + xcVar3.getScrollY() > L6) {
            gl.d3(new Runnable(this) {
                public final ir5 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i10 = L6;
                    ir5 ir5Var = this.b;
                    switch (b) {
                        case 0:
                            jr5 jr5Var2 = ir5Var.e;
                            jr5Var2.P1.smoothScrollTo(0, i10 - jr5Var2.m2);
                            return;
                        default:
                            jr5 jr5Var3 = ir5Var.e;
                            jr5Var3.P1.smoothScrollTo(0, i10 - jr5Var3.m2);
                            return;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = jr5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            jr5Var.X1.addListener(new hr5(this, (byte) 0));
            jr5Var.X1.start();
            this.a = true;
        }
        if (jr5Var.X1 == null) {
            jr5Var.e2 = min;
            jr5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        ns9Var.setTranslationY(0.0f);
    }
}
