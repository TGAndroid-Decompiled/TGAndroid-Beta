package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class mz3 extends lt9 {
    public static final int[] e0 = {2131232132, 2131232124, 2131232126, 2131232123, 2131232134, 2131232128, 2131232129, 2131232125};
    public static final int[] f0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final jz3 E;
    public final jz3 F;
    public final lz3 G;
    public final HashMap H;
    public final int I;
    public ValueAnimator J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public final Runnable R;
    public int S;
    public final int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public float d0;
    public final boolean h;
    public boolean n;
    public ln r;
    public final ylb s;
    public final boolean w;
    public final jz3 x;
    public final jz3 y;

    public mz3(Context context, ylb ylbVar, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, int i2, boolean z5) {
        super(context);
        int i3;
        boolean z6;
        this.h = !z8c.h(z8c.t0).p();
        this.n = true;
        this.H = new HashMap();
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.S = 6;
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = true;
        this.b0 = false;
        this.c0 = true;
        this.d0 = 11.0f;
        this.w = z4;
        this.s = ylbVar;
        this.R = runnable;
        this.T = i;
        this.Q = i2;
        this.P = z5;
        fz3 fz3Var = new fz3(this, context, z4, z5);
        this.b = fz3Var;
        fz3Var.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i == 4) {
            LinearLayout linearLayout = this.b;
            jz3 jz3Var = new jz3(this, context, 2131232133, false);
            this.x = jz3Var;
            linearLayout.addView(jz3Var);
            jz3Var.setContentDescription(jb6.M0(2131754755, null));
        }
        if (i == 3) {
            i3 = 2131232132;
        } else {
            i3 = 2131232131;
        }
        i3 = i == 6 ? 2131231066 : i3;
        if (z) {
            LinearLayout linearLayout2 = this.b;
            jz3 jz3Var2 = new jz3(this, context, i3, false);
            this.y = jz3Var2;
            linearLayout2.addView(jz3Var2);
            jz3Var2.setContentDescription(jb6.M0(2131746094, null));
            jz3Var2.a = -934918565L;
        }
        if (z2) {
            LinearLayout linearLayout3 = this.b;
            jz3 jz3Var3 = new jz3(this, context, 2131232127, false);
            this.E = jz3Var3;
            linearLayout3.addView(jz3Var3);
            jz3Var3.setContentDescription(jb6.M0(2131751112, null));
            jz3Var3.setAlpha(0.0f);
            jz3Var3.a = 98352451L;
        }
        if (!z4) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = e0[i4];
                if (i4 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jz3 jz3Var4 = new jz3(this, context, i5, z6);
                jz3Var4.setContentDescription(f(i4));
                this.b.addView(jz3Var4);
            }
            o();
            return;
        }
        if (z3) {
            LinearLayout linearLayout4 = this.b;
            lz3 lz3Var = new lz3(this, context);
            this.G = lz3Var;
            linearLayout4.addView(lz3Var);
            lz3Var.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            jz3 jz3Var5 = new jz3(this, context, 2131232759, true);
            this.F = jz3Var5;
            linearLayout5.addView(jz3Var5);
            jz3Var5.setContentDescription(jb6.M0(2131745229, null));
            jz3Var5.a = 1434631203L;
            jz3Var5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i) {
        switch (i) {
            case 0:
                return jb6.M0(2131751132, null);
            case 1:
                return jb6.M0(2131751131, null);
            case 2:
                return jb6.M0(2131751130, null);
            case 3:
                return jb6.M0(2131751129, null);
            case 4:
                return jb6.M0(2131751128, null);
            case 5:
                return jb6.M0(2131751127, null);
            case 6:
                return jb6.M0(2131751126, null);
            case 7:
                return jb6.M0(2131751125, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(s14 s14Var) {
        return s14Var.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return cmb.n0(this.s);
    }

    public abstract boolean h(int i);

    public final void j(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        if (z && !this.c0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jz3 jz3Var = this.x;
        if (jz3Var != null) {
            i++;
        }
        if (!this.W || jz3Var != null) {
            i = Math.max(1, i);
        }
        int i3 = this.M;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i4);
            if (childAt instanceof lz3) {
                lz3 lz3Var = (lz3) childAt;
                int i6 = 0;
                int i7 = i5;
                while (i6 < lz3Var.b.getChildCount()) {
                    View childAt2 = lz3Var.b.getChildAt(i6);
                    if (childAt2 instanceof jz3) {
                        jz3 jz3Var2 = (jz3) childAt2;
                        if (i == i7) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        jz3Var2.g(z5, z2);
                    }
                    i6++;
                    i7++;
                }
                i2 = i7 - 1;
            } else {
                if (childAt instanceof jz3) {
                    jz3 jz3Var3 = (jz3) childAt;
                    if (i == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jz3Var3.g(z4, z2);
                }
                i2 = i5;
            }
            if (i >= i5 && i <= i2) {
                this.M = i4;
            }
            i4++;
            i5 = i2 + 1;
        }
        int i8 = this.M;
        lz3 lz3Var2 = this.G;
        if (i3 != i8) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.K;
            float f2 = this.M;
            float f3 = 1.0f;
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new dz1(this, f, f2, (byte) 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(d53.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = gm.R1(f, f2, 1.0f);
                this.b.invalidate();
            }
            if (lz3Var2 != null) {
                if (this.M != 1 && !this.h) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 != lz3Var2.n) {
                    lz3Var2.n = z3;
                    if (!z3) {
                        lz3Var2.a(0);
                    }
                    ValueAnimator valueAnimator2 = lz3Var2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z2) {
                        float f4 = lz3Var2.r;
                        if (!z3) {
                            f3 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
                        lz3Var2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new et1(lz3Var2, (byte) 24));
                        lz3Var2.c.setDuration(475L);
                        lz3Var2.c.setInterpolator(d53.h);
                        lz3Var2.c.start();
                    } else {
                        if (!z3) {
                            f3 = 0.0f;
                        }
                        lz3Var2.r = f3;
                        lz3Var2.invalidate();
                        lz3Var2.requestLayout();
                        lz3Var2.c();
                        lz3Var2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i) {
            if (lz3Var2 != null && this.M == 1 && i >= 1 && i <= lz3Var2.b.getChildCount() + 1) {
                int i9 = (i - 1) * 36;
                lz3Var2.b(gm.L(i9 - 6), gm.L(i9 + 24));
            }
            this.N = i;
        }
    }

    public final int k() {
        boolean z = this.P;
        ylb ylbVar = this.s;
        if (z) {
            return on2.p(cmb.v0(cmb.Ml, ylbVar), 12);
        }
        int i = this.T;
        if (i != 5 && i != 7) {
            return cmb.p1(0.18f, cmb.v0(cmb.Df, ylbVar));
        }
        return cmb.p1(0.09f, this.Q);
    }

    public final void l(boolean z) {
        int i;
        jz3 jz3Var = this.E;
        if (jz3Var != null) {
            boolean z2 = this.a0;
            if (z2 || this.b0 != z) {
                this.b0 = z;
                float f = 0.0f;
                if (z2) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    jz3Var.setVisibility(i);
                    if (z) {
                        f = 1.0f;
                    }
                    jz3Var.setAlpha(f);
                } else {
                    jz3Var.setVisibility(0);
                    ViewPropertyAnimator animate = jz3Var.animate();
                    if (z) {
                        f = 1.0f;
                    }
                    animate.alpha(f).setDuration(200L).setInterpolator(d53.h).withEndAction(new y8c((byte) 16, this, z)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z) {
        jz3 jz3Var = this.y;
        if (jz3Var == null) {
            return;
        }
        if (z) {
            jz3Var.setBackground(new ck3(k()));
        } else {
            jz3Var.setBackground(null);
        }
    }

    public final void n(boolean z) {
        this.n = z;
        this.b.invalidate();
    }

    public final void o() {
        int i = 0;
        final int i2 = 0;
        while (i < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof lz3) {
                lz3 lz3Var = (lz3) childAt;
                int i3 = 0;
                while (i3 < lz3Var.b.getChildCount()) {
                    lz3Var.b.getChildAt(i3).setOnClickListener(new View.OnClickListener(this) {
                        public final mz3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r3;
                            int i4 = i2;
                            mz3 mz3Var = this.b;
                            switch (b) {
                                case 0:
                                    mz3Var.h(i4);
                                    return;
                                default:
                                    mz3Var.h(i4);
                                    return;
                            }
                        }
                    });
                    i3++;
                    i2++;
                }
                i2--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final mz3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r3;
                        int i4 = i2;
                        mz3 mz3Var = this.b;
                        switch (b) {
                            case 0:
                                mz3Var.h(i4);
                                return;
                            default:
                                mz3Var.h(i4);
                                return;
                        }
                    }
                });
            }
            i++;
            i2++;
        }
        jz3 jz3Var = this.F;
        if (jz3Var != null) {
            jz3Var.setOnClickListener(new sf3(this, (byte) 7));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.b.setPadding(gm.L(this.d0), 0, gm.L(11.0f), 0);
        super.onMeasure(i, i2);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz3.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i) {
        this.S = i;
    }

    public void setPaddingLeft(float f) {
        this.d0 = f;
    }

    public void e() {
    }

    public void i(jz3 jz3Var) {
    }
}
