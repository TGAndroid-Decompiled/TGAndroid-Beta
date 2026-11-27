package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class kt5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public zc5 c;
    public boolean d;
    public final lt5 e;

    public kt5(lt5 lt5Var, Context context) {
        super(context);
        this.e = lt5Var;
        this.b = new ArrayList();
    }

    public final void a(zc5 zc5Var, boolean z) {
        this.d = true;
        lt5 lt5Var = this.e;
        lt5Var.Z1.k(zc5Var.getUid(), zc5Var);
        AnimatorSet animatorSet = lt5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            lt5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            lt5Var.X1 = animatorSet2;
            animatorSet2.addListener(new jt5(this, (byte) 1));
            lt5Var.X1.setDuration(150L);
            lt5Var.X1.setInterpolator(k43.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(zc5Var);
    }

    public final void b(zc5 zc5Var) {
        this.d = false;
        lt5 lt5Var = this.e;
        lt5Var.Z1.l(zc5Var.getUid());
        zc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = lt5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            lt5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        lt5Var.X1 = animatorSet2;
        animatorSet2.addListener(new v5(this, zc5Var, (byte) 27));
        lt5Var.X1.setDuration(150L);
        this.c = zc5Var;
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
        int d;
        int i3;
        f89 L;
        AnimatorSet animatorSet;
        yc ycVar;
        int i4;
        lt5 lt5Var = this.e;
        yc ycVar2 = lt5Var.P1;
        gw9 gw9Var = lt5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L2 = size - hl.L(26.0f);
        int L3 = hl.L(10.0f);
        int L4 = hl.L(10.0f);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (!(childAt instanceof zc5)) {
                ycVar = ycVar2;
            } else {
                ycVar = ycVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
                if (childAt != this.c && childAt.getMeasuredWidth() + i6 > L2) {
                    L3 = uh9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i6 = 0;
                }
                if (childAt.getMeasuredWidth() + i7 > L2) {
                    L4 = uh9.w(8.0f, childAt.getMeasuredHeight(), L4);
                    i7 = 0;
                }
                int L5 = hl.L(13.0f) + i6;
                if (!this.a) {
                    zc5 zc5Var = this.c;
                    if (childAt == zc5Var) {
                        childAt.setTranslationX(hl.L(13.0f) + i7);
                        childAt.setTranslationY(L4);
                    } else if (zc5Var != null) {
                        float f = L5;
                        if (childAt.getTranslationX() != f) {
                            i4 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f));
                        } else {
                            i4 = 1;
                        }
                        float f2 = L3;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i4];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L5);
                        childAt.setTranslationY(L3);
                    }
                }
                if (childAt != this.c) {
                    i6 = uh9.w(9.0f, childAt.getMeasuredWidth(), i6);
                }
                i7 = uh9.w(9.0f, childAt.getMeasuredWidth(), i7);
            }
            i5++;
            ycVar2 = ycVar;
        }
        yc ycVar3 = ycVar2;
        int L6 = hl.L(42.0f) + L4;
        final int L7 = hl.L(42.0f) + L3;
        if (lt5Var.g2 != null) {
            if (lt5Var.a2) {
                d = Math.min(lt5Var.m2, L7);
            } else {
                d = 0;
            }
        } else {
            d = c00.d(52.0f, Math.min(lt5Var.m2, L7), 0);
        }
        int i8 = lt5Var.o2;
        if (lt5Var.g2 == null && lt5Var.Z1.m() > 0) {
            i3 = hl.L(56.0f);
        } else {
            i3 = 0;
        }
        lt5Var.o2 = i3;
        if (d != lt5Var.i2 || i8 != i3) {
            lt5Var.i2 = d;
            if (gw9Var.getAdapter() != null && gw9Var.getAdapter().b() > 0 && (L = gw9Var.L(0)) != null) {
                gw9Var.getAdapter().g(0);
                lt5Var.L1.g1(0, L.a.getTop() - gw9Var.getPaddingTop());
                if (gw9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ce0(this, (byte) 6));
                    ofFloat.setDuration(gw9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(lt5Var.m2, L7);
        int i9 = lt5Var.e2;
        if (i9 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i9, min);
            ofInt.addUpdateListener(new ch4(this, (byte) 14));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L7 > lt5Var.m2) {
                hl.c3(new Runnable(this) {
                    public final kt5 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i10 = L7;
                        kt5 kt5Var = this.b;
                        switch (b) {
                            case 0:
                                lt5 lt5Var2 = kt5Var.e;
                                lt5Var2.P1.smoothScrollTo(0, i10 - lt5Var2.m2);
                                return;
                            default:
                                lt5 lt5Var3 = kt5Var.e;
                                lt5Var3.P1.smoothScrollTo(0, i10 - lt5Var3.m2);
                                return;
                        }
                    }
                });
            }
        } else if (ycVar3.getMeasuredHeight() + ycVar3.getScrollY() > L7) {
            hl.c3(new Runnable(this) {
                public final kt5 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    int i10 = L7;
                    kt5 kt5Var = this.b;
                    switch (b) {
                        case 0:
                            lt5 lt5Var2 = kt5Var.e;
                            lt5Var2.P1.smoothScrollTo(0, i10 - lt5Var2.m2);
                            return;
                        default:
                            lt5 lt5Var3 = kt5Var.e;
                            lt5Var3.P1.smoothScrollTo(0, i10 - lt5Var3.m2);
                            return;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = lt5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            lt5Var.X1.addListener(new jt5(this, (byte) 0));
            lt5Var.X1.start();
            this.a = true;
        }
        if (lt5Var.X1 == null) {
            lt5Var.e2 = min;
            lt5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L7, L6));
        gw9Var.setTranslationY(0.0f);
    }
}
