package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class ny0 extends nx0 {
    public static final int R1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public mm H1;
    public boolean I1;
    public boolean J1;
    public lt3 K1;
    public boolean L1;
    public boolean M1;
    public float N1;
    public int O1;
    public int P1;
    public int Q1;
    public final Drawable l1;
    public final as m1;
    public final d79 n1;
    public final jy0 o1;
    public boolean p1;
    public int q1;
    public final e r1;
    public final boolean s1;
    public final hy0 t1;
    public float u1;
    public boolean v1;
    public float w1;
    public boolean x1;
    public boolean y1;
    public final RectF z1;

    public ny0(Context context, e eVar, my0 my0Var) {
        super(my0Var.b, my0Var.g, context, my0Var.a);
        hy0 hy0Var;
        this.u1 = 0.4f;
        this.v1 = true;
        this.w1 = 1.0f;
        this.x1 = false;
        this.z1 = new RectF();
        this.Q1 = 1;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = true;
        this.G1 = false;
        this.I1 = false;
        this.O1 = -1;
        boolean z = my0Var.c;
        boolean z2 = my0Var.d;
        boolean z3 = my0Var.e;
        int i = my0Var.f;
        this.r1 = eVar;
        this.s1 = z;
        this.l1 = context.getDrawable(2131231240).mutate();
        if (z2) {
            hy0 hy0Var2 = new hy0(this, context, z3, z);
            this.t1 = hy0Var2;
            hy0Var = hy0Var2;
        } else {
            hy0Var = new iy0(this, context, z3, z);
        }
        d79 I0 = I0(context);
        this.n1 = I0;
        as asVar = new as((byte) 1);
        this.m1 = asVar;
        if (z3) {
            asVar.k1(true);
        }
        I0.setLayoutManager(asVar);
        hy0 hy0Var3 = this.t1;
        if (hy0Var3 != null) {
            hy0Var3.setBottomSheetContainerView(this.c);
            this.t1.setTargetListView(I0);
        }
        if (z) {
            I0.setHasFixedSize(true);
            I0.setAdapter(H0(I0));
            this.O = hy0Var;
            hy0Var.addView(I0, tre.c(-2.0f, -1));
        } else {
            I0.setAdapter(new ly0(this, H0(I0), context));
            this.b = hy0Var;
            jy0 jy0Var = new jy0(this, context, hy0Var);
            this.o1 = jy0Var;
            yob.h(aob.h5, this.J0, jy0Var);
            yob.l(jy0Var, 5, aob.G6, this.J0);
            yob.l(jy0Var, 3, aob.z8, this.J0);
            jy0Var.setBackButtonImage(2131231243);
            yob.l(jy0Var, 1, aob.y8, this.J0);
            jy0Var.setCastShadows(true);
            jy0Var.setTitle(K0());
            jy0Var.setActionBarMenuOnItemClick(new s8(this, (byte) 11));
            hy0Var.addView(I0);
            hy0Var.addView(jy0Var, tre.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            I0.j(new y(hy0Var, (byte) 9));
        }
        if (i == 2) {
            U0();
        }
        Q0(hy0Var);
        W0();
    }

    @Override
    public boolean D() {
        return false;
    }

    public final void E0() {
        d79 d79Var = this.n1;
        if (d79Var != null && d79Var.getLayoutManager() != null && this.O1 >= 0) {
            int top = (this.P1 - this.b.getTop()) - d79Var.getPaddingTop();
            if (d79Var.getLayoutManager() instanceof x46) {
                ((x46) d79Var.getLayoutManager()).g1(this.O1, top);
            }
            this.O1 = -1;
        }
    }

    public boolean F0(View view, float f, float f2) {
        return true;
    }

    public final void G0() {
        hc hcVar = this.Z;
        if (hcVar != null && this.b != null && this.s0 != null && V0() && !this.s1) {
            Rect bounds = this.s0.getBounds();
            if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
                hcVar.d(((this.b.getMeasuredHeight() - bounds.top) - hl.L(30.0f)) - ((int) this.b.getTranslationY()));
            } else {
                hcVar.d(0);
            }
        }
    }

    public c79 H0(d79 d79Var) {
        return new ox0(this, (byte) 6);
    }

    public d79 I0(Context context) {
        return new gu(this, context, this.J0, (byte) 2);
    }

    public int J0() {
        return hl.L(56.0f);
    }

    public CharSequence K0() {
        return ob6.M0(2131743884, null);
    }

    public final boolean L0() {
        if (vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void R0(Canvas canvas, FrameLayout frameLayout) {
        int i = this.Q1;
        Drawable drawable = this.l1;
        jy0 jy0Var = this.o1;
        if (i == 1) {
            boolean z = this.v1;
            float f = this.w1;
            if (z) {
                if (f != 1.0f) {
                    this.w1 = f + 0.10666667f;
                    frameLayout.invalidate();
                }
            } else if (f != 0.0f) {
                this.w1 = f - 0.10666667f;
                frameLayout.invalidate();
            }
            this.w1 = Utilities.i(this.w1, 1.0f, 0.0f);
            if (jy0Var != null && jy0Var.getVisibility() == 0 && jy0Var.getAlpha() != 0.0f && this.w1 != 0.0f) {
                drawable.setBounds(this.u0, jy0Var.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + jy0Var.getBottom());
                drawable.setAlpha((int) (jy0Var.getAlpha() * 255.0f * this.w1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                    frameLayout.invalidate();
                }
            }
            this.p1 = true;
        } else if (i == 2 && ((int) (this.w1 * 255.0f)) != 0 && this.v1) {
            drawable.setBounds(this.u0, jy0Var.getBottom() + ((int) jy0Var.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + jy0Var.getBottom() + ((int) jy0Var.getTranslationY()));
            drawable.setAlpha((int) (this.w1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.M1) {
            canvas.restore();
            this.M1 = false;
        }
    }

    public void S0(Canvas canvas, View view) {
        int i;
        float f;
        ImageView imageView;
        Paint paint;
        boolean z;
        float f2;
        int i2;
        this.M1 = false;
        if (!this.s1) {
            boolean z2 = this.J1;
            d79 d79Var = this.n1;
            if (z2) {
                int height = d79Var.getHeight();
                for (int i3 = 0; i3 < d79Var.getChildCount(); i3++) {
                    View childAt = d79Var.getChildAt(i3);
                    int S = RecyclerView.S(childAt);
                    if (S != -1 && S != d79Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.I1) {
                            i2 = (int) childAt.getTranslationY();
                        } else {
                            i2 = 0;
                        }
                        height = Math.min(height, top + i2);
                    }
                }
                i = height - hl.L(16.0f);
            } else {
                f89 L = d79Var.L(0);
                int i4 = -hl.L(16.0f);
                if (L != null) {
                    View view2 = L.a;
                    i4 = view2.getBottom() - hl.L(16.0f);
                    if (this.I1) {
                        i = ((int) view2.getTranslationY()) + i4;
                    }
                }
                i = i4;
            }
            int i5 = (i - ((this.B1 + this.C1) + this.D1)) + this.E1;
            if (this.x1 && this.y1) {
                if (this.Q1 == 2) {
                    f2 = 8.0f;
                } else {
                    f2 = 16.0f;
                }
                i5 -= hl.L(f2);
            }
            float f3 = i5;
            this.N1 = f3;
            P0(f3);
            int i6 = this.Q1;
            float f4 = 1.0f;
            jy0 jy0Var = this.o1;
            if (i6 == 1) {
                float L2 = 1.0f - ((hl.L(16.0f) + i5) / J0());
                if (L2 < 0.0f) {
                    L2 = 0.0f;
                }
                if (L2 != 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                hl.T3(jy0Var, z, 1.0f, true, this.p1);
            } else if (i6 == 2) {
                float max = Math.max(((hl.L(8.0f) + (i5 - this.E1)) + this.C1) - hl.m, 0.0f);
                mm mmVar = this.H1;
                if (max == 0.0f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float e = mmVar.e(false, f);
                if (e != 0.0f && e != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                    this.M1 = true;
                }
                this.w1 = e;
                f4 = hl.R1(1.0f, 0.5f, e);
                jy0Var.e.setAlpha(e);
                M0(e);
                jy0Var.e.setScaleX(e);
                jy0Var.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                jy0Var.e.setScaleY(e);
                ema titleTextView = jy0Var.getTitleTextView();
                titleTextView.setTranslationX(hl.R1(hl.L(21.0f) - titleTextView.getLeft(), 0.0f, e) + 0.0f);
                if (this.L1) {
                    titleTextView.setTranslationX(((jy0Var.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                jy0Var.setTranslationY(max);
                i5 -= hl.U1(e, 0, hl.L(13.0f) + (((this.A1 - this.B1) - this.C1) - this.D1));
                jy0Var.getBackground().setBounds(0, hl.U1(e, jy0Var.getHeight(), 0), jy0Var.getWidth(), jy0Var.getHeight());
                int i7 = (e > 0.5f ? 1 : (e == 0.5f ? 0 : -1));
                boolean z3 = this.G1;
                if (i7 > 0) {
                    if (z3) {
                        this.G1 = false;
                        jy0Var.setTag(1);
                    }
                } else if (!z3) {
                    this.G1 = true;
                    jy0Var.setTag(null);
                }
            }
            if (V0()) {
                boolean z4 = this instanceof ao0;
                Drawable drawable = this.s0;
                if (!z4) {
                    drawable.setBounds(0, i5, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    drawable.setBounds(-hl.L(6.0f), i5, hl.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                G0();
                this.s0.draw(canvas);
                if (this.x1 && f4 > 0.0f) {
                    int L3 = hl.L(36.0f);
                    int L4 = hl.L(20.0f) + i5;
                    RectF rectF = this.z1;
                    rectF.set((view.getMeasuredWidth() - L3) / 2.0f, L4, (view.getMeasuredWidth() + L3) / 2.0f, hl.L(4.0f) + L4);
                    aob.s0.setColor(aob.v0(aob.zj, this.J0));
                    aob.s0.setAlpha((int) (paint.getAlpha() * f4));
                    canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
                }
            }
            N0(canvas, i5);
        }
    }

    public final void T0() {
        d79 d79Var = this.n1;
        if (d79Var != null && this.m1 != null && d79Var.getChildCount() > 0) {
            View view = null;
            int i = -1;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < d79Var.getChildCount(); i3++) {
                View childAt = d79Var.getChildAt(i3);
                int S = RecyclerView.S(childAt);
                if (S >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                    view = childAt;
                    i = S;
                }
            }
            if (view != null) {
                this.O1 = i;
                this.P1 = this.b.getTop() + view.getTop();
                this.h1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void U0() {
        if (this.s1) {
            return;
        }
        this.Q1 = 2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        this.B1 = currentActionBarHeight;
        this.A1 = currentActionBarHeight + hl.m;
        this.C1 = hl.L(16.0f);
        this.D1 = hl.L(-20.0f);
        this.H1 = new mm(this.b, 0L, 350L, k43.h);
        this.o1.e.setPivotX(0.0f);
        this.n1.setClipToPadding(true);
    }

    public boolean V0() {
        return true;
    }

    public final void W0() {
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        jy0 jy0Var = this.o1;
        if (jy0Var != null && jy0Var.getTag() != null) {
            hl.l3(this, L0());
            return;
        }
        e eVar = this.r1;
        if (eVar != null) {
            hl.l3(this, eVar.isLightStatusBar());
        }
    }

    public void X0() {
        jy0 jy0Var = this.o1;
        if (jy0Var != null) {
            jy0Var.setTitle(K0());
        }
    }

    public final void Y0() {
        jy0 jy0Var = this.o1;
        if (jy0Var != null && !TextUtils.equals(K0(), jy0Var.getTitle())) {
            jy0Var.N(K0(), false, 350L, k43.h);
        }
    }

    @Override
    public void e0() {
        P0(this.N1);
        G0();
    }

    @Override
    public final boolean f() {
        jy0 jy0Var = this.o1;
        if (jy0Var != null && jy0Var.getTag() != null) {
            return L0();
        }
        e eVar = this.r1;
        if (eVar != null) {
            return eVar.isLightStatusBar();
        }
        return L0();
    }

    public void M0(float f) {
    }

    public void P0(float f) {
    }

    public void Q0(wma wmaVar) {
    }

    public void N0(Canvas canvas, int i) {
    }

    public void O0(int i, int i2) {
    }

    public ny0(org.telegram.ui.ActionBar.e r3, boolean r4, boolean r5, defpackage.vnb r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(org.telegram.ui.ActionBar.e, boolean, boolean, vnb):void");
    }

    public ny0(android.content.Context r2, org.telegram.ui.ActionBar.e r3, boolean r4, boolean r5, defpackage.vnb r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(android.content.Context, org.telegram.ui.ActionBar.e, boolean, boolean, vnb):void");
    }

    public ny0(int r2, defpackage.vnb r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(int, vnb, android.content.Context, boolean):void");
    }

    public ny0(android.content.Context r2, org.telegram.ui.ActionBar.e r3, boolean r4, boolean r5, int r6, defpackage.vnb r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(android.content.Context, org.telegram.ui.ActionBar.e, boolean, boolean, int, vnb):void");
    }

    public ny0(defpackage.vnb r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(vnb, android.content.Context, boolean):void");
    }

    public ny0(org.telegram.ui.ActionBar.e r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.<init>(org.telegram.ui.ActionBar.e, boolean):void");
    }
}
