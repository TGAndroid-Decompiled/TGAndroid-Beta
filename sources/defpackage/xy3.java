package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class xy3 extends cv9 {
    public static final int[] e0 = {2131232131, 2131232123, 2131232125, 2131232122, 2131232133, 2131232127, 2131232128, 2131232124};
    public static final int[] f0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final uy3 E;
    public final uy3 F;
    public final wy3 G;
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
    public mm r;
    public final vnb s;
    public final boolean w;
    public final uy3 x;
    public final uy3 y;

    public xy3(Context context, vnb vnbVar, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, int i2, boolean z5) {
        super(context);
        int i3;
        boolean z6;
        this.h = !yac.h(yac.t0).p();
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
        this.s = vnbVar;
        this.R = runnable;
        this.T = i;
        this.Q = i2;
        this.P = z5;
        qy3 qy3Var = new qy3(this, context, z4, z5);
        this.b = qy3Var;
        qy3Var.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i == 4) {
            LinearLayout linearLayout = this.b;
            uy3 uy3Var = new uy3(this, context, 2131232132, false);
            this.x = uy3Var;
            linearLayout.addView(uy3Var);
            uy3Var.setContentDescription(ob6.M0(2131754751, null));
        }
        if (i == 3) {
            i3 = 2131232131;
        } else {
            i3 = 2131232130;
        }
        i3 = i == 6 ? 2131231065 : i3;
        if (z) {
            LinearLayout linearLayout2 = this.b;
            uy3 uy3Var2 = new uy3(this, context, i3, false);
            this.y = uy3Var2;
            linearLayout2.addView(uy3Var2);
            uy3Var2.setContentDescription(ob6.M0(2131746088, null));
            uy3Var2.a = -934918565L;
        }
        if (z2) {
            LinearLayout linearLayout3 = this.b;
            uy3 uy3Var3 = new uy3(this, context, 2131232126, false);
            this.E = uy3Var3;
            linearLayout3.addView(uy3Var3);
            uy3Var3.setContentDescription(ob6.M0(2131751140, null));
            uy3Var3.setAlpha(0.0f);
            uy3Var3.a = 98352451L;
        }
        if (!z4) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = e0[i4];
                if (i4 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                uy3 uy3Var4 = new uy3(this, context, i5, z6);
                uy3Var4.setContentDescription(f(i4));
                this.b.addView(uy3Var4);
            }
            o();
            return;
        }
        if (z3) {
            LinearLayout linearLayout4 = this.b;
            wy3 wy3Var = new wy3(this, context);
            this.G = wy3Var;
            linearLayout4.addView(wy3Var);
            wy3Var.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            uy3 uy3Var5 = new uy3(this, context, 2131232758, true);
            this.F = uy3Var5;
            linearLayout5.addView(uy3Var5);
            uy3Var5.setContentDescription(ob6.M0(2131745223, null));
            uy3Var5.a = 1434631203L;
            uy3Var5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i) {
        switch (i) {
            case 0:
                return ob6.M0(2131751160, null);
            case 1:
                return ob6.M0(2131751159, null);
            case 2:
                return ob6.M0(2131751158, null);
            case 3:
                return ob6.M0(2131751157, null);
            case 4:
                return ob6.M0(2131751156, null);
            case 5:
                return ob6.M0(2131751155, null);
            case 6:
                return ob6.M0(2131751154, null);
            case 7:
                return ob6.M0(2131751153, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(c14 c14Var) {
        return c14Var.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return aob.n0(this.s);
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
        uy3 uy3Var = this.x;
        if (uy3Var != null) {
            i++;
        }
        if (!this.W || uy3Var != null) {
            i = Math.max(1, i);
        }
        int i3 = this.M;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i4);
            if (childAt instanceof wy3) {
                wy3 wy3Var = (wy3) childAt;
                int i6 = 0;
                int i7 = i5;
                while (i6 < wy3Var.b.getChildCount()) {
                    View childAt2 = wy3Var.b.getChildAt(i6);
                    if (childAt2 instanceof uy3) {
                        uy3 uy3Var2 = (uy3) childAt2;
                        if (i == i7) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        uy3Var2.g(z5, z2);
                    }
                    i6++;
                    i7++;
                }
                i2 = i7 - 1;
            } else {
                if (childAt instanceof uy3) {
                    uy3 uy3Var3 = (uy3) childAt;
                    if (i == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    uy3Var3.g(z4, z2);
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
        wy3 wy3Var2 = this.G;
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
                ofFloat.addUpdateListener(new gy1(this, f, f2, (byte) 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(k43.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = hl.R1(f, f2, 1.0f);
                this.b.invalidate();
            }
            if (wy3Var2 != null) {
                if (this.M != 1 && !this.h) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 != wy3Var2.n) {
                    wy3Var2.n = z3;
                    if (!z3) {
                        wy3Var2.a(0);
                    }
                    ValueAnimator valueAnimator2 = wy3Var2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z2) {
                        float f4 = wy3Var2.r;
                        if (!z3) {
                            f3 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
                        wy3Var2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new az1(wy3Var2, (byte) 23));
                        wy3Var2.c.setDuration(475L);
                        wy3Var2.c.setInterpolator(k43.h);
                        wy3Var2.c.start();
                    } else {
                        if (!z3) {
                            f3 = 0.0f;
                        }
                        wy3Var2.r = f3;
                        wy3Var2.invalidate();
                        wy3Var2.requestLayout();
                        wy3Var2.c();
                        wy3Var2.s.b.invalidate();
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
            if (wy3Var2 != null && this.M == 1 && i >= 1 && i <= wy3Var2.b.getChildCount() + 1) {
                int i9 = (i - 1) * 36;
                wy3Var2.b(hl.L(i9 - 6), hl.L(i9 + 24));
            }
            this.N = i;
        }
    }

    public final int k() {
        boolean z = this.P;
        vnb vnbVar = this.s;
        if (z) {
            return vm2.o(aob.v0(aob.Nl, vnbVar), 12);
        }
        int i = this.T;
        if (i != 5 && i != 7) {
            return aob.p1(0.18f, aob.v0(aob.Ef, vnbVar));
        }
        return aob.p1(0.09f, this.Q);
    }

    public final void l(boolean z) {
        int i;
        uy3 uy3Var = this.E;
        if (uy3Var != null) {
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
                    uy3Var.setVisibility(i);
                    if (z) {
                        f = 1.0f;
                    }
                    uy3Var.setAlpha(f);
                } else {
                    uy3Var.setVisibility(0);
                    ViewPropertyAnimator animate = uy3Var.animate();
                    if (z) {
                        f = 1.0f;
                    }
                    animate.alpha(f).setDuration(200L).setInterpolator(k43.h).withEndAction(new xac((byte) 16, this, z)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z) {
        uy3 uy3Var = this.y;
        if (uy3Var == null) {
            return;
        }
        if (z) {
            uy3Var.setBackground(new kj3(k()));
        } else {
            uy3Var.setBackground(null);
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
            if (childAt instanceof wy3) {
                wy3 wy3Var = (wy3) childAt;
                int i3 = 0;
                while (i3 < wy3Var.b.getChildCount()) {
                    wy3Var.b.getChildAt(i3).setOnClickListener(new View.OnClickListener(this) {
                        public final xy3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r3;
                            int i4 = i2;
                            xy3 xy3Var = this.b;
                            switch (b) {
                                case 0:
                                    xy3Var.h(i4);
                                    return;
                                default:
                                    xy3Var.h(i4);
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
                    public final xy3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r3;
                        int i4 = i2;
                        xy3 xy3Var = this.b;
                        switch (b) {
                            case 0:
                                xy3Var.h(i4);
                                return;
                            default:
                                xy3Var.h(i4);
                                return;
                        }
                    }
                });
            }
            i++;
            i2++;
        }
        uy3 uy3Var = this.F;
        if (uy3Var != null) {
            uy3Var.setOnClickListener(new mh3(this, (byte) 6));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.b.setPadding(hl.L(this.d0), 0, hl.L(11.0f), 0);
        super.onMeasure(i, i2);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy3.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i) {
        this.S = i;
    }

    public void setPaddingLeft(float f) {
        this.d0 = f;
    }

    public void e() {
    }

    public void i(uy3 uy3Var) {
    }
}
