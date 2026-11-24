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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class fy0 extends fx0 {
    public static final int R1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public lm H1;
    public boolean I1;
    public boolean J1;
    public ts3 K1;
    public boolean L1;
    public boolean M1;
    public float N1;
    public int O1;
    public int P1;
    public int Q1;
    public final Drawable l1;
    public final zr m1;
    public final o39 n1;
    public final by0 o1;
    public boolean p1;
    public int q1;
    public final d r1;
    public final boolean s1;
    public final zx0 t1;
    public float u1;
    public boolean v1;
    public float w1;
    public boolean x1;
    public boolean y1;
    public final RectF z1;

    public fy0(Context context, d dVar, ey0 ey0Var) {
        super(ey0Var.b, ey0Var.g, context, ey0Var.a);
        zx0 zx0Var;
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
        boolean z = ey0Var.c;
        boolean z2 = ey0Var.d;
        boolean z3 = ey0Var.e;
        int i = ey0Var.f;
        this.r1 = dVar;
        this.s1 = z;
        this.l1 = context.getDrawable(2131231240).mutate();
        if (z2) {
            zx0 zx0Var2 = new zx0(this, context, z3, z);
            this.t1 = zx0Var2;
            zx0Var = zx0Var2;
        } else {
            zx0Var = new ay0(this, context, z3, z);
        }
        o39 H0 = H0(context);
        this.n1 = H0;
        zr zrVar = new zr((byte) 1);
        this.m1 = zrVar;
        if (z3) {
            zrVar.k1(true);
        }
        H0.setLayoutManager(zrVar);
        zx0 zx0Var3 = this.t1;
        if (zx0Var3 != null) {
            zx0Var3.setBottomSheetContainerView(this.c);
            this.t1.setTargetListView(H0);
        }
        if (z) {
            H0.setHasFixedSize(true);
            H0.setAdapter(G0(H0));
            this.O = zx0Var;
            zx0Var.addView(H0, nme.c(-2.0f, -1));
        } else {
            H0.setAdapter(new dy0(this, G0(H0), context));
            this.b = zx0Var;
            by0 by0Var = new by0(this, context, zx0Var);
            this.o1 = by0Var;
            zkb.h(bkb.g5, this.J0, by0Var);
            zkb.l(by0Var, 5, bkb.F6, this.J0);
            zkb.l(by0Var, 3, bkb.y8, this.J0);
            by0Var.setBackButtonImage(2131231243);
            zkb.l(by0Var, 1, bkb.x8, this.J0);
            by0Var.setCastShadows(true);
            by0Var.setTitle(J0());
            by0Var.setActionBarMenuOnItemClick(new r8(this, (byte) 10));
            zx0Var.addView(H0);
            zx0Var.addView(by0Var, nme.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            H0.j(new y(zx0Var, (byte) 9));
        }
        if (i == 2) {
            T0();
        }
        P0(zx0Var);
        V0();
    }

    public final void D0() {
        o39 o39Var = this.n1;
        if (o39Var != null && o39Var.getLayoutManager() != null && this.O1 >= 0) {
            int top = (this.P1 - this.b.getTop()) - o39Var.getPaddingTop();
            if (o39Var.getLayoutManager() instanceof t26) {
                ((t26) o39Var.getLayoutManager()).g1(this.O1, top);
            }
            this.O1 = -1;
        }
    }

    @Override
    public boolean E() {
        return false;
    }

    public boolean E0(View view, float f, float f2) {
        return true;
    }

    public final void F0() {
        gc gcVar = this.Z;
        if (gcVar != null && this.b != null && this.s0 != null && U0() && !this.s1) {
            Rect bounds = this.s0.getBounds();
            if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
                gcVar.c(((this.b.getMeasuredHeight() - bounds.top) - gl.L(30.0f)) - ((int) this.b.getTranslationY()));
            } else {
                gcVar.c(0);
            }
        }
    }

    public n39 G0(o39 o39Var) {
        return new gx0(this, (byte) 6);
    }

    public o39 H0(Context context) {
        return new fu(this, context, this.J0, (byte) 2);
    }

    public int I0() {
        return gl.L(56.0f);
    }

    public CharSequence J0() {
        return k96.M0(2131743990, null);
    }

    public final boolean K0() {
        if (bm2.h(bkb.v0(bkb.g5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void Q0(Canvas canvas, FrameLayout frameLayout) {
        int i = this.Q1;
        Drawable drawable = this.l1;
        by0 by0Var = this.o1;
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
            if (by0Var != null && by0Var.getVisibility() == 0 && by0Var.getAlpha() != 0.0f && this.w1 != 0.0f) {
                drawable.setBounds(this.u0, by0Var.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + by0Var.getBottom());
                drawable.setAlpha((int) (by0Var.getAlpha() * 255.0f * this.w1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                    frameLayout.invalidate();
                }
            }
            this.p1 = true;
        } else if (i == 2 && ((int) (this.w1 * 255.0f)) != 0 && this.v1) {
            drawable.setBounds(this.u0, by0Var.getBottom() + ((int) by0Var.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + by0Var.getBottom() + ((int) by0Var.getTranslationY()));
            drawable.setAlpha((int) (this.w1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.M1) {
            canvas.restore();
            this.M1 = false;
        }
    }

    public void R0(Canvas canvas, View view) {
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
            o39 o39Var = this.n1;
            if (z2) {
                int height = o39Var.getHeight();
                for (int i3 = 0; i3 < o39Var.getChildCount(); i3++) {
                    View childAt = o39Var.getChildAt(i3);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != o39Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.I1) {
                            i2 = (int) childAt.getTranslationY();
                        } else {
                            i2 = 0;
                        }
                        height = Math.min(height, top + i2);
                    }
                }
                i = height - gl.L(16.0f);
            } else {
                s49 K = o39Var.K(0);
                int i4 = -gl.L(16.0f);
                if (K != null) {
                    View view2 = K.a;
                    i4 = view2.getBottom() - gl.L(16.0f);
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
                i5 -= gl.L(f2);
            }
            float f3 = i5;
            this.N1 = f3;
            O0(f3);
            int i6 = this.Q1;
            float f4 = 1.0f;
            by0 by0Var = this.o1;
            if (i6 == 1) {
                float L = 1.0f - ((gl.L(16.0f) + i5) / I0());
                if (L < 0.0f) {
                    L = 0.0f;
                }
                if (L != 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                gl.U3(by0Var, z, 1.0f, true, this.p1);
            } else if (i6 == 2) {
                float max = Math.max(((gl.L(8.0f) + (i5 - this.E1)) + this.C1) - gl.m, 0.0f);
                lm lmVar = this.H1;
                if (max == 0.0f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float e = lmVar.e(false, f);
                if (e != 0.0f && e != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                    this.M1 = true;
                }
                this.w1 = e;
                f4 = gl.R1(1.0f, 0.5f, e);
                by0Var.e.setAlpha(e);
                L0(e);
                by0Var.e.setScaleX(e);
                by0Var.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                by0Var.e.setScaleY(e);
                jia titleTextView = by0Var.getTitleTextView();
                titleTextView.setTranslationX(gl.R1(gl.L(21.0f) - titleTextView.getLeft(), 0.0f, e) + 0.0f);
                if (this.L1) {
                    titleTextView.setTranslationX(((by0Var.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                by0Var.setTranslationY(max);
                i5 -= gl.U1(e, 0, gl.L(13.0f) + (((this.A1 - this.B1) - this.C1) - this.D1));
                by0Var.getBackground().setBounds(0, gl.U1(e, by0Var.getHeight(), 0), by0Var.getWidth(), by0Var.getHeight());
                int i7 = (e > 0.5f ? 1 : (e == 0.5f ? 0 : -1));
                boolean z3 = this.G1;
                if (i7 > 0) {
                    if (z3) {
                        this.G1 = false;
                        by0Var.setTag(1);
                    }
                } else if (!z3) {
                    this.G1 = true;
                    by0Var.setTag(null);
                }
            }
            if (U0()) {
                boolean z4 = this instanceof ao0;
                Drawable drawable = this.s0;
                if (!z4) {
                    drawable.setBounds(0, i5, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    drawable.setBounds(-gl.L(6.0f), i5, gl.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                F0();
                this.s0.draw(canvas);
                if (this.x1 && f4 > 0.0f) {
                    int L2 = gl.L(36.0f);
                    int L3 = gl.L(20.0f) + i5;
                    RectF rectF = this.z1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, gl.L(4.0f) + L3);
                    bkb.s0.setColor(bkb.v0(bkb.yj, this.J0));
                    bkb.s0.setAlpha((int) (paint.getAlpha() * f4));
                    canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
                }
            }
            M0(canvas, i5);
        }
    }

    public final void S0() {
        o39 o39Var = this.n1;
        if (o39Var != null && this.m1 != null && o39Var.getChildCount() > 0) {
            View view = null;
            int i = -1;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < o39Var.getChildCount(); i3++) {
                View childAt = o39Var.getChildAt(i3);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                    view = childAt;
                    i = R;
                }
            }
            if (view != null) {
                this.O1 = i;
                this.P1 = this.b.getTop() + view.getTop();
                this.h1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void T0() {
        if (this.s1) {
            return;
        }
        this.Q1 = 2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        this.B1 = currentActionBarHeight;
        this.A1 = currentActionBarHeight + gl.m;
        this.C1 = gl.L(16.0f);
        this.D1 = gl.L(-20.0f);
        this.H1 = new lm(this.b, 0L, 350L, s33.h);
        this.o1.e.setPivotX(0.0f);
        this.n1.setClipToPadding(true);
    }

    public boolean U0() {
        return true;
    }

    public final void V0() {
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        by0 by0Var = this.o1;
        if (by0Var != null && by0Var.getTag() != null) {
            gl.m3(this, K0());
            return;
        }
        d dVar = this.r1;
        if (dVar != null) {
            gl.m3(this, dVar.isLightStatusBar());
        }
    }

    public void W0() {
        by0 by0Var = this.o1;
        if (by0Var != null) {
            by0Var.setTitle(J0());
        }
    }

    public final void X0() {
        by0 by0Var = this.o1;
        if (by0Var != null && !TextUtils.equals(J0(), by0Var.getTitle())) {
            by0Var.N(J0(), false, 350L, s33.h);
        }
    }

    @Override
    public void e0() {
        O0(this.N1);
        F0();
    }

    @Override
    public final boolean f() {
        by0 by0Var = this.o1;
        if (by0Var != null && by0Var.getTag() != null) {
            return K0();
        }
        d dVar = this.r1;
        if (dVar != null) {
            return dVar.isLightStatusBar();
        }
        return K0();
    }

    public void L0(float f) {
    }

    public void O0(float f) {
    }

    public void P0(cja cjaVar) {
    }

    public void M0(Canvas canvas, int i) {
    }

    public void N0(int i, int i2) {
    }

    public fy0(org.telegram.ui.ActionBar.d r3, boolean r4, boolean r5, defpackage.wjb r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(org.telegram.ui.ActionBar.d, boolean, boolean, wjb):void");
    }

    public fy0(android.content.Context r2, org.telegram.ui.ActionBar.d r3, boolean r4, boolean r5, defpackage.wjb r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(android.content.Context, org.telegram.ui.ActionBar.d, boolean, boolean, wjb):void");
    }

    public fy0(int r2, defpackage.wjb r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(int, wjb, android.content.Context, boolean):void");
    }

    public fy0(android.content.Context r2, org.telegram.ui.ActionBar.d r3, boolean r4, boolean r5, int r6, defpackage.wjb r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(android.content.Context, org.telegram.ui.ActionBar.d, boolean, boolean, int, wjb):void");
    }

    public fy0(defpackage.wjb r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(wjb, android.content.Context, boolean):void");
    }

    public fy0(org.telegram.ui.ActionBar.d r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.<init>(org.telegram.ui.ActionBar.d, boolean):void");
    }
}
