package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.zg0;
public class ImageReceiver implements ls, org.telegram.ui.Components.o5 {
    public static final PorterDuffColorFilter G1;
    public static final PorterDuffColorFilter H1;
    public static final float[] I1;
    public boolean A0;
    public boolean A1;
    public boolean B0;
    public Drawable C0;
    public int C1;
    public int D;
    public String D0;
    public ab.b0 D1;
    public nc E;
    public BitmapShader E0;
    public di.j4 E1;
    public Object F;
    public boolean F0;
    public boolean F1;
    public Bitmap G;
    public boolean G0;
    public BitmapShader H;
    public TLRPC.Document H0;
    public ComposeShader I;
    public boolean I0;
    public Bitmap J;
    public boolean J0;
    public BitmapShader K;
    public float K0;
    public Canvas L;
    public float L0;
    public Paint M;
    public float M0;
    public hc N;
    public float N0;
    public hc O;
    public float O0;
    public String P;
    public String Q;
    public int R;
    public boolean R0;
    public Drawable S;
    public boolean S0;
    public BitmapShader T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public hc W;
    public String X;
    public String Y;
    public Integer Y0;
    public int Z;
    public List f21177a;
    public Drawable f21178a0;
    public boolean f21180b;
    public BitmapShader f21181b0;
    public ArrayList f21183c;
    public BitmapShader f21184c0;
    public int f21186d0;
    public View f21188e;
    public int f21189e0;
    public int f21190e1;
    public int f21191f;
    public hc f21192f0;
    public boolean f21193f1;
    public String f21194g0;
    public lc f21195g1;
    public Object h;
    public String f21196h0;
    public float f21197h1;
    public int f21198i0;
    public Drawable f21200j0;
    public long f21201j1;
    public BitmapShader f21202k0;
    public boolean l1;
    public Drawable m0;
    public boolean f21205m1;
    public boolean f21206n;
    public String f21207n0;
    public boolean f21208o0;
    public ColorFilter f21209o1;
    public int f21210p0;
    public boolean f21211p1;
    public long f21212q0;
    public long f21213q1;
    public boolean f21214r;
    public int f21215r0;
    public long f21216r1;
    public long f21217s;
    public float f21221t1;
    public int f21223u1;
    public boolean f21224v0;
    public String f21225v1;
    public boolean f21227w0;
    public int f21229x;
    public boolean f21231x1;
    public boolean f21232y;
    public boolean f21234y1;
    public boolean f21235z0;
    public int f21226w = 1;
    public boolean f21204l0 = true;
    public boolean f21218s0 = true;
    public boolean f21220t0 = true;
    public boolean f21222u0 = true;
    public int f21230x0 = 1;
    public int f21233y0 = -1;
    public final RectF P0 = new RectF();
    public boolean Q0 = true;
    public boolean V0 = true;
    public final int[] W0 = new int[4];
    public boolean X0 = true;
    public final RectF f21179a1 = new RectF();
    public final Matrix f21182b1 = new Matrix();
    public final Path f21185c1 = new Path();
    public float f21187d1 = 1.0f;
    public float f21199i1 = 1.0f;
    public byte f21203k1 = 1;
    public float n1 = 0.05f;
    public int f21219s1 = 150;
    public final ArrayList f21228w1 = new ArrayList();
    public boolean f21236z1 = false;
    public boolean B1 = true;
    public final Paint Z0 = new Paint(3);
    public int d = p10.f24470s0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        G1 = new PorterDuffColorFilter(-2236963, mode);
        H1 = new PorterDuffColorFilter(-4473925, mode);
        I1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.f21188e = view;
    }

    public final float A() {
        return this.L0 + this.N0;
    }

    public final void A0(RectF rectF) {
        if (rectF != null) {
            this.K0 = rectF.left;
            this.L0 = rectF.top;
            this.M0 = rectF.width();
            this.N0 = rectF.height();
        }
    }

    public final zg0 B() {
        Drawable drawable = this.f21200j0;
        if (drawable instanceof zg0) {
            return (zg0) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof zg0) {
            return (zg0) drawable2;
        }
        Drawable drawable3 = this.f21178a0;
        if (drawable3 instanceof zg0) {
            return (zg0) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof zg0) {
            return (zg0) drawable4;
        }
        return null;
    }

    public final void B0(int i7) {
        this.M0 = i7;
    }

    public final int C() {
        return this.U;
    }

    public final void C0(float f10) {
        this.K0 = f10;
    }

    public final int[] D() {
        return this.W0;
    }

    public final void D0(float f10) {
        this.L0 = f10;
    }

    public final int[] E() {
        if (!this.V0) {
            return null;
        }
        return this.W0;
    }

    public final void E0(int i7) {
        this.f21229x = i7;
        if (this.f21231x1) {
            this.D = qs.e().f25137p & (~this.f21229x);
        }
    }

    public final Drawable F() {
        return this.m0;
    }

    public final void F0(long j3, long j10) {
        this.f21213q1 = j3;
        this.f21216r1 = j10;
        Drawable drawable = this.f21200j0;
        if (drawable instanceof org.telegram.ui.Components.v5) {
            ((org.telegram.ui.Components.v5) drawable).C(j3, j10);
        }
    }

    public final int G(int i7) {
        if (i7 == 1) {
            return this.Z;
        }
        if (i7 == 3) {
            return this.f21198i0;
        }
        return this.R;
    }

    public final void G0(int i7, int i10, boolean z9) {
        while (i7 < 0) {
            i7 += 360;
        }
        while (i7 > 360) {
            i7 -= 360;
        }
        this.f21186d0 = i7;
        this.U = i7;
        this.f21189e0 = i10;
        this.V = i10;
        this.f21193f1 = z9;
    }

    public final boolean H() {
        return this.Q0;
    }

    public final void H0(View view) {
        this.f21188e = view;
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null && this.f21231x1) {
            View view2 = this.f21188e;
            if (m10.f38880r0 == null) {
                m10.f38880r0 = new WeakReference(view2);
            }
        }
    }

    public final boolean I() {
        if (this.S == null && this.f21178a0 == null && this.m0 == null && this.f21200j0 == null) {
            return false;
        }
        return true;
    }

    public final void I0(int i7) {
        this.f21190e1 = i7;
    }

    public final boolean J() {
        if (this.S == null && this.f21200j0 == null) {
            return false;
        }
        return true;
    }

    public final void J0(int i7) {
        L0(new int[]{i7, i7, i7, i7});
    }

    public final boolean K() {
        if (this.S == null && this.f21200j0 == null && this.f21178a0 == null && this.m0 == null && this.Q == null && this.f21196h0 == null) {
            return false;
        }
        return true;
    }

    public final void K0(int i7, int i10, int i11, int i12) {
        L0(new int[]{i7, i10, i11, i12});
    }

    public final boolean L() {
        if (this.S == null && this.f21200j0 == null && !(this.m0 instanceof d51)) {
            return false;
        }
        return true;
    }

    public void L0(int[] iArr) {
        int i7 = iArr[0];
        this.X0 = true;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            int[] iArr2 = this.W0;
            if (i10 >= iArr2.length) {
                break;
            }
            int i11 = iArr2[i10];
            int i12 = iArr[i10];
            if (i11 != i12) {
                z9 = true;
            }
            if (i7 != i12) {
                this.X0 = false;
            }
            iArr2[i10] = i12;
            i10++;
        }
        if (z9) {
            Drawable drawable = this.S;
            if (drawable != null && this.T == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.f21200j0;
            if (drawable2 != null && this.f21202k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f21178a0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.m0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean M() {
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null && m10.f38860b0) {
            return true;
        }
        return false;
    }

    public final void M0() {
        if (!this.V0) {
            this.V0 = true;
            Drawable drawable = this.S;
            if (drawable != null && this.T == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.f21200j0;
            if (drawable2 != null && this.f21202k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f21178a0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.m0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean N() {
        if (this.A0 && this.C0 != null && !this.B0) {
            return true;
        }
        return false;
    }

    public final void N0(Drawable drawable) {
        org.telegram.ui.Components.r6 r6Var;
        Drawable drawable2 = this.m0;
        if (drawable != drawable2) {
            if (drawable2 instanceof org.telegram.ui.Components.r6) {
                if (!drawable2.equals(drawable)) {
                    r6Var = (org.telegram.ui.Components.r6) this.m0;
                } else {
                    return;
                }
            } else {
                r6Var = null;
            }
            this.m0 = drawable;
            if (this.f21231x1 && (drawable instanceof org.telegram.ui.Components.r6)) {
                ((org.telegram.ui.Components.r6) drawable).c(this);
            }
            if (this.f21231x1 && r6Var != null) {
                r6Var.b(this);
            }
        }
    }

    public final boolean O(float f10, float f11) {
        float f12 = this.K0;
        if (f10 >= f12 && f10 <= f12 + this.M0) {
            float f13 = this.L0;
            if (f11 >= f13 && f11 <= f13 + this.N0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0(boolean z9, boolean z10) {
        if (this.Q0 != z9) {
            this.Q0 = z9;
            if (z10) {
                invalidate();
                di.j4 j4Var = this.E1;
                if (j4Var != null) {
                    j4Var.run();
                }
            }
        }
    }

    public final boolean P() {
        if (!this.f21231x1) {
            this.f21231x1 = true;
            this.D = qs.e().f25137p & (~this.f21229x);
            boolean z9 = this.f21232y;
            int i7 = qs.f25021j1;
            if (!z9) {
                ab.b0 b0Var = this.D1;
                if (b0Var != null) {
                    b0Var.b();
                    this.D1 = null;
                }
                ab.b0 b0Var2 = (ab.b0) new ps(qs.e(), this).f24620b;
                b0Var2.c(qs.f25039m4);
                b0Var2.c(i7);
                b0Var2.c(qs.f25026k1);
                this.D1 = b0Var2;
            }
            if (Y()) {
                return true;
            }
            zg0 B = B();
            if (B != null) {
                B.I0.add(this);
                B.E = this.f21218s0;
            }
            if (B != null && this.f21222u0 && (!B.z() || this.D == 0)) {
                B.start();
            }
            org.telegram.ui.Components.v5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.f21220t0 && this.D == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.i5 l10 = l();
            if (l10 != null) {
                l10.b(this);
            }
            if (qs.e().g()) {
                didReceivedNotification(i7, this.d, 512);
            }
            Drawable drawable = this.m0;
            if (drawable instanceof org.telegram.ui.Components.r6) {
                ((org.telegram.ui.Components.r6) drawable).c(this);
            }
            if (this.f21183c != null) {
                for (int i10 = 0; i10 < this.f21183c.size(); i10++) {
                    ((kc) this.f21183c.get(i10)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z9) {
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null) {
            boolean z10 = this.f21224v0;
            if (!m10.f38875n0) {
                m10.f38885v0 = z10;
            }
            m10.start();
            return;
        }
        zg0 B = B();
        if (B != null && !B.f41003k0) {
            B.H(z9);
        }
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.f21200j0 && this.f21196h0 != null) {
            gc.D().Q(this.f21196h0);
            this.f21196h0 = null;
        } else if (drawable == this.S && this.Q != null) {
            gc.D().Q(this.Q);
            this.Q = null;
        } else if (drawable == this.f21178a0 && this.Y != null) {
            gc.D().Q(this.Y);
            this.Y = null;
        }
        u0(this.f21192f0, this.f21194g0, this.O, this.P, this.W, this.X, this.f21178a0, this.f21212q0, this.f21207n0, this.h, this.f21215r0);
    }

    public final void Q0() {
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        zg0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        ab.b0 b0Var;
        if (this.f21231x1) {
            this.f21231x1 = false;
            hc hcVar = this.O;
            if (hcVar != null || this.f21192f0 != null || this.W != null || this.m0 != null) {
                if (this.E == null) {
                    this.E = new Object();
                }
                nc ncVar = this.E;
                ncVar.f24178e = this.f21192f0;
                ncVar.f24179f = this.f21194g0;
                ncVar.f24175a = hcVar;
                ncVar.f24176b = this.P;
                ncVar.f24177c = this.W;
                ncVar.d = this.X;
                ncVar.f24180g = this.m0;
                ncVar.h = this.f21212q0;
                ncVar.f24183k = this.f21207n0;
                ncVar.f24181i = this.f21215r0;
                ncVar.f24182j = this.h;
            }
            if (!this.f21232y && (b0Var = this.D1) != null) {
                b0Var.b();
                this.D1 = null;
            }
            Drawable drawable = this.m0;
            if (drawable instanceof org.telegram.ui.Components.r6) {
                ((org.telegram.ui.Components.r6) drawable).b(this);
            }
            if (this.m0 != null) {
                N0(null);
                this.f21184c0 = null;
            }
            f();
            this.Z0.setShader(null);
            if (this.f21190e1 == 0) {
                this.f21221t1 = 0.0f;
            }
            org.telegram.ui.Components.i5 l10 = l();
            if (l10 != null) {
                l10.o(this);
            }
            org.telegram.ui.Components.v5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            zg0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.f21183c != null) {
                for (int i7 = 0; i7 < this.f21183c.size(); i7++) {
                    ArrayList arrayList = ((di.u9) ((kc) this.f21183c.get(i7))).f9853a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((di.q9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
        }
    }

    public final void R0(Drawable drawable) {
        if (drawable != null) {
            int[] E = E();
            boolean z9 = false;
            if (drawable instanceof org.telegram.ui.Components.np) {
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) drawable;
                float f10 = E[0];
                float f11 = E[1];
                float f12 = E[2];
                float f13 = E[3];
                float[] fArr = npVar.f36413f;
                float max = Math.max(0.0f, f10);
                fArr[1] = max;
                fArr[0] = max;
                float max2 = Math.max(0.0f, f11);
                fArr[3] = max2;
                fArr[2] = max2;
                float max3 = Math.max(0.0f, f12);
                fArr[5] = max3;
                fArr[4] = max3;
                float max4 = Math.max(0.0f, f13);
                fArr[7] = max4;
                fArr[6] = max4;
                if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
                    z9 = true;
                }
                npVar.f36412e = z9;
                npVar.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.w8)) {
                f0(drawable, null);
            } else if (drawable instanceof org.telegram.ui.Components.w8) {
                ((org.telegram.ui.Components.w8) drawable).f39872r = E[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof zg0)) {
                    if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
                        ((org.telegram.ui.Components.v5) drawable).B(E);
                    } else if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        f0(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            }
        }
    }

    public final void S(int i7, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i7 == 3) {
            str2 = this.f21196h0;
            drawable = this.f21200j0;
        } else if (i7 == 2) {
            str2 = this.D0;
            drawable = this.C0;
        } else if (i7 == 1) {
            str2 = this.Y;
            drawable = this.f21178a0;
        } else {
            str2 = this.Q;
            drawable = this.S;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) gc.D().f22652t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof zg0) {
            ((zg0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.v5) {
            ((org.telegram.ui.Components.v5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof zg0) {
                zg0 zg0Var = (zg0) drawable;
                boolean p10 = gc.D().p(str2);
                if (!gc.D().J(str2, true) && p10) {
                    zg0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.v5) {
                org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) drawable;
                if (v5Var.f38875n0) {
                    boolean p11 = gc.D().p(str2);
                    if (!gc.D().J(str2, true)) {
                        if (p11) {
                            v5Var.u();
                        }
                    } else if (p11) {
                        v5Var.stop();
                    }
                } else if (v5Var.f38883t0.isEmpty()) {
                    v5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p12 = gc.D().p(str2);
                if (!gc.D().J(str2, false) && p12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    g0.A2(arrayList);
                }
            }
        }
        if (i7 == 3) {
            this.f21196h0 = null;
            this.f21200j0 = null;
            this.f21202k0 = null;
        } else if (i7 == 2) {
            this.D0 = null;
            this.C0 = null;
            this.E0 = null;
        } else if (i7 == 1) {
            this.f21178a0 = null;
            this.Y = null;
            this.f21181b0 = null;
        } else {
            this.S = null;
            this.Q = null;
            this.T = null;
        }
    }

    public final void T(boolean z9) {
        this.f21227w0 = z9;
    }

    public final void U(boolean z9) {
        this.f21220t0 = z9;
    }

    public final void V(boolean z9) {
        this.R0 = false;
    }

    public final void W(int i7) {
        this.f21230x0 = i7;
        zg0 B = B();
        if (B != null) {
            B.K(i7);
        }
    }

    public final void X(int i7) {
        this.f21233y0 = i7;
        if (B() != null) {
            B().L = i7;
            return;
        }
        this.C1 = i7;
        if (m() != null) {
            m().f38891y0 = 0;
        }
    }

    public final boolean Y() {
        nc ncVar = this.E;
        if (ncVar != null) {
            if (ncVar.f24175a != null || ncVar.f24177c != null || ncVar.f24178e != null || ncVar.f24180g != null) {
                this.E = null;
                Drawable drawable = ncVar.f24180g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof zg0) && !(bitmapDrawable instanceof org.telegram.ui.Components.v5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        ncVar.f24180g = null;
                    }
                }
                u0(ncVar.f24178e, ncVar.f24179f, ncVar.f24175a, ncVar.f24176b, ncVar.f24177c, ncVar.d, ncVar.f24180g, ncVar.h, ncVar.f24183k, ncVar.f24182j, ncVar.f24181i);
                ncVar.f24175a = null;
                ncVar.f24177c = null;
                ncVar.f24178e = null;
                ncVar.f24180g = null;
                this.E = ncVar;
                zg0 B = B();
                if (B != null) {
                    B.E = this.f21218s0;
                }
                if (B != null && this.f21222u0) {
                    if (!B.z() || this.D == 0) {
                        B.start();
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z(Object obj) {
        this.F = obj;
        invalidate();
    }

    public final void a(di.u9 u9Var) {
        if (this.f21183c == null) {
            this.f21183c = new ArrayList();
        }
        this.f21183c.add(u9Var);
        if (this.f21231x1) {
            u9Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.f21209o1 = colorFilter;
    }

    public final void b() {
        gc D = gc.D();
        D.f22651s.c(new l7(D, this, this.f21226w, 3));
    }

    public final void b0(int i7) {
        this.f21219s1 = i7;
    }

    public final void c() {
        this.f21214r = false;
        gc.D().h(this, true);
        this.f21206n = true;
    }

    public final void c0(boolean z9) {
        this.A0 = z9;
    }

    public final void d(boolean z9, ic icVar) {
        if (!this.l1) {
            float f10 = this.f21197h1;
            if (f10 != 1.0f) {
                if (!z9) {
                    if (icVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = this.f21201j1;
                        long j10 = currentTimeMillis - j3;
                        if (j3 == 0) {
                            j10 = 16;
                        }
                        if (j10 > 30 && g0.f22564r > 60.0f) {
                            j10 = 30;
                        }
                        this.f21197h1 = (((float) j10) / this.f21219s1) + this.f21197h1;
                    } else {
                        this.f21197h1 = (16.0f / this.f21219s1) + f10;
                    }
                    if (this.f21197h1 > 1.0f) {
                        this.f21197h1 = 1.0f;
                        this.f21199i1 = 1.0f;
                        if (this.C0 != null) {
                            S(2, null);
                            this.E0 = null;
                        }
                    }
                }
                if (icVar != null) {
                    g0.h3(new a(this, 13));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(lc lcVar) {
        this.f21195g1 = lcVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == qs.f25039m4) {
            String str = (String) objArr[0];
            String str2 = this.f21196h0;
            if (str2 != null && str2.equals(str)) {
                this.f21196h0 = (String) objArr[1];
                hc hcVar = (hc) objArr[2];
                this.f21192f0 = hcVar;
                nc ncVar = this.E;
                if (ncVar != null) {
                    ncVar.f24178e = hcVar;
                }
            }
            String str3 = this.Q;
            if (str3 != null && str3.equals(str)) {
                this.Q = (String) objArr[1];
                hc hcVar2 = (hc) objArr[2];
                this.O = hcVar2;
                nc ncVar2 = this.E;
                if (ncVar2 != null) {
                    ncVar2.f24175a = hcVar2;
                }
            }
            String str4 = this.Y;
            if (str4 != null && str4.equals(str)) {
                this.Y = (String) objArr[1];
                hc hcVar3 = (hc) objArr[2];
                this.W = hcVar3;
                nc ncVar3 = this.E;
                if (ncVar3 != null) {
                    ncVar3.f24177c = hcVar3;
                }
            }
        } else if (i7 == qs.f25021j1) {
            Integer num = (Integer) objArr[0];
            if (this.f21229x < num.intValue()) {
                int intValue = num.intValue() | this.D;
                this.D = intValue;
                if (intValue != 0) {
                    zg0 B = B();
                    if (B != null && B.z()) {
                        B.stop();
                    }
                    org.telegram.ui.Components.v5 m10 = m();
                    if (m10 != null) {
                        m10.stop();
                    }
                }
            }
        } else if (i7 == qs.f25026k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.f21229x < num2.intValue() && (i11 = this.D) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.D = i12;
                if (i12 == 0) {
                    zg0 B2 = B();
                    if (B2 != null) {
                        B2.E = this.f21218s0;
                    }
                    if (this.f21222u0 && B2 != null && B2.z()) {
                        B2.start();
                    }
                    org.telegram.ui.Components.v5 m11 = m();
                    if (this.f21220t0 && m11 != null) {
                        m11.j();
                        invalidate();
                    }
                }
            }
        }
    }

    public final void e() {
        if (this.f21183c != null) {
            if (this.f21231x1) {
                for (int i7 = 0; i7 < this.f21183c.size(); i7++) {
                    ArrayList arrayList = ((di.u9) ((kc) this.f21183c.get(i7))).f9853a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((di.q9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
            this.f21183c.clear();
        }
    }

    public final ic e0(ic icVar, int i7) {
        zg0 zg0Var;
        ic icVar2 = icVar;
        if (icVar == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.f23155y = new RectF();
            icVar2 = obj;
        }
        icVar2.d = i7;
        icVar2.f23138f = m();
        icVar2.f23139g = B();
        boolean z9 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            icVar2.h[i10] = this.W0[i10];
        }
        icVar2.f23141j = this.f21200j0;
        icVar2.f23140i = this.f21202k0;
        icVar2.f23143l = this.S;
        icVar2.f23142k = this.T;
        icVar2.f23144m = this.f21178a0;
        icVar2.f23145n = this.f21181b0;
        icVar2.f23137e = this.f21184c0;
        icVar2.f23146o = this.m0;
        icVar2.f23154x = this.C0;
        icVar2.f23156z = this.f21209o1;
        icVar2.f23153w = this.B0;
        icVar2.f23147p = this.f21197h1;
        icVar2.f23148q = this.f21199i1;
        icVar2.f23149r = this.E0;
        org.telegram.ui.Components.v5 v5Var = icVar2.f23138f;
        if ((v5Var != null && !v5Var.s()) || ((zg0Var = icVar2.f23139g) != null && !zg0Var.u())) {
            z9 = true;
        }
        icVar2.f23134a = z9;
        icVar2.f23152u = this.K0;
        icVar2.v = this.L0;
        icVar2.f23151t = this.M0;
        icVar2.f23150s = this.N0;
        icVar2.f23135b = this.f21187d1;
        return icVar2;
    }

    public final void f() {
        for (int i7 = 0; i7 < 4; i7++) {
            S(i7, null);
        }
        gc.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.f21178a0) {
            this.f21181b0 = bitmapShader;
        } else if (drawable == this.m0) {
            this.f21184c0 = bitmapShader;
        } else if (drawable == this.f21200j0) {
            this.f21202k0 = bitmapShader;
        } else if (drawable == this.S) {
            this.T = bitmapShader;
            if (this.H != null && (drawable instanceof BitmapDrawable)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.I = new ComposeShader(this.H, this.T, PorterDuff.Mode.DST_IN);
                    return;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                int width = bitmapDrawable.getBitmap().getWidth();
                int height = bitmapDrawable.getBitmap().getHeight();
                Bitmap bitmap = this.J;
                if (bitmap == null || bitmap.getWidth() != width || this.J.getHeight() != height) {
                    Bitmap bitmap2 = this.J;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.J = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    this.L = new Canvas(this.J);
                    Bitmap bitmap3 = this.J;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.K = new BitmapShader(bitmap3, tileMode, tileMode);
                    if (this.M == null) {
                        Paint paint = new Paint();
                        this.M = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    }
                }
            }
        }
    }

    public final boolean g(Canvas canvas) {
        return h(canvas, null);
    }

    public final void g0(boolean z9) {
        if (this.F1 != z9) {
            this.F1 = z9;
            this.f21222u0 = !z9;
            zg0 B = B();
            if (B != null) {
                if (z9) {
                    B.stop();
                } else if (!B.f41003k0) {
                    B.start();
                }
            }
        }
    }

    public float getAlpha() {
        return this.f21187d1;
    }

    public final boolean h(android.graphics.Canvas r32, org.telegram.messenger.ic r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, org.telegram.messenger.ic):boolean");
    }

    public final void h0(int i7) {
        if (this.f21226w != i7) {
            this.f21226w = i7;
            if (this.f21231x1 && K()) {
                gc D = gc.D();
                D.f22651s.c(new l7(D, this, this.f21226w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, ic icVar, int i7) {
        if (icVar != null) {
            if (bitmapDrawable instanceof zg0) {
                zg0 zg0Var = (zg0) bitmapDrawable;
                float f10 = icVar.f23152u;
                float f11 = icVar.v;
                float f12 = icVar.f23151t;
                float f13 = icVar.f23150s;
                ColorFilter colorFilter = icVar.f23156z;
                int i10 = icVar.d;
                Paint[] paintArr = zg0Var.f41002j0;
                RectF[] rectFArr = zg0Var.f41001i0;
                if (rectFArr[i10] == null) {
                    rectFArr[i10] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i10] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i10].setAlpha(i7);
                paintArr[i10].setColorFilter(colorFilter);
                rectFArr[i10].set(f10, f11, f10 + f12, f13 + f11);
                zg0Var.q(canvas, null, true, 0L, i10);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
                org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) bitmapDrawable;
                float f14 = icVar.f23152u;
                float f15 = icVar.v;
                float f16 = icVar.f23151t;
                float f17 = icVar.f23150s;
                ColorFilter colorFilter2 = icVar.f23156z;
                int i11 = icVar.d;
                Paint[] paintArr2 = v5Var.f38878q0;
                RectF[] rectFArr2 = v5Var.f38877p0;
                if (rectFArr2[i11] == null) {
                    rectFArr2[i11] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i11] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i11].setAlpha(i7);
                paintArr2[i11].setColorFilter(colorFilter2);
                rectFArr2[i11].set(f14, f15, f16 + f14, f17 + f15);
                v5Var.l(canvas, true, 0L, i11);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    if (icVar.A == null) {
                        icVar.A = new Paint(1);
                    }
                    icVar.A.setAlpha(i7);
                    icVar.A.setColorFilter(icVar.f23156z);
                    canvas.save();
                    canvas.translate(icVar.f23152u, icVar.v);
                    canvas.scale(icVar.f23151t / bitmap.getWidth(), icVar.f23150s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, icVar.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i7);
        if (bitmapDrawable instanceof zg0) {
            ((zg0) bitmapDrawable).q(canvas, null, false, this.f21217s, 0);
        } else if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
            ((org.telegram.ui.Components.v5) bitmapDrawable).l(canvas, false, this.f21217s, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.f21188e;
        if (view == null) {
            return;
        }
        if (this.J0) {
            view.invalidate();
            return;
        }
        float f10 = this.K0;
        float f11 = this.L0;
        view.invalidate((int) f10, (int) f11, (int) (f10 + this.M0), (int) (f11 + this.N0));
    }

    public final void j(android.graphics.Canvas r42, android.graphics.drawable.Drawable r43, int r44, android.graphics.BitmapShader r45, int r46, int r47, int r48, org.telegram.messenger.ic r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, org.telegram.messenger.ic):void");
    }

    public final void j0(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j0(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public final void k(Canvas canvas, Drawable drawable, int i7, BitmapShader bitmapShader, int i10, int i11, ic icVar) {
        if (this.f21190e1 == 0) {
            float f10 = this.f21221t1;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.f21221t1 = f11;
                if (f11 < 0.0f) {
                    this.f21221t1 = 0.0f;
                }
                invalidate();
            }
        }
        int i12 = this.f21190e1;
        if (i12 != 0) {
            this.f21221t1 = 1.0f;
            this.f21223u1 = i12;
        }
        float f12 = this.f21221t1;
        if (f12 != 0.0f && f12 != 1.0f) {
            j(canvas, drawable, i7, bitmapShader, i10, i11, i12, icVar);
            j(canvas, drawable, (int) (i7 * this.f21221t1), bitmapShader, i10, i11, this.f21223u1, icVar);
            return;
        }
        j(canvas, drawable, i7, bitmapShader, i10, i11, i12, icVar);
    }

    public final void k0() {
        this.f21214r = false;
    }

    public final org.telegram.ui.Components.i5 l() {
        Drawable drawable = this.f21200j0;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            return (org.telegram.ui.Components.i5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.i5) {
            return (org.telegram.ui.Components.i5) drawable2;
        }
        Drawable drawable3 = this.f21178a0;
        if (drawable3 instanceof org.telegram.ui.Components.i5) {
            return (org.telegram.ui.Components.i5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.i5) {
            return (org.telegram.ui.Components.i5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z9) {
        this.S0 = z9;
    }

    public final org.telegram.ui.Components.v5 m() {
        Drawable drawable = this.f21200j0;
        if (drawable instanceof org.telegram.ui.Components.v5) {
            return (org.telegram.ui.Components.v5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.v5) {
            return (org.telegram.ui.Components.v5) drawable2;
        }
        Drawable drawable3 = this.f21178a0;
        if (drawable3 instanceof org.telegram.ui.Components.v5) {
            return (org.telegram.ui.Components.v5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.v5) {
            return (org.telegram.ui.Components.v5) drawable4;
        }
        return null;
    }

    public final void m0(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.H == null || this.G != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.H = new BitmapShader(bitmap, tileMode, tileMode);
                R0(this.S);
            }
            this.X0 = true;
        } else {
            this.H = null;
            this.I = null;
            this.K = null;
            this.L = null;
            Bitmap bitmap2 = this.J;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.J = null;
            }
        }
        this.G = bitmap;
    }

    public final Bitmap n() {
        zg0 B = B();
        if (B != null && B.u()) {
            if (B.Q != null) {
                return B.Q;
            }
            if (B.R == null) {
                return null;
            }
            return B.R;
        }
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.f21200j0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.S;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.f21178a0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.m0;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public final void n0(int i7, long j3, Object obj, String str, String str2, String str3, hc hcVar, hc hcVar2) {
        r0(hcVar, str, hcVar2, str2, null, j3, str3, obj, i7);
    }

    public final int o() {
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null) {
            int i7 = this.U;
            if (i7 % 360 != 0 && i7 % 360 != 180) {
                return m10.getIntrinsicWidth();
            }
            return m10.getIntrinsicHeight();
        }
        zg0 B = B();
        if (B != null) {
            return B.f40992c;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.m0;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i10 = this.U;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n10.getWidth();
        }
        return n10.getHeight();
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j3) {
        r0(hc.g(str), str2, null, null, drawable, j3, str3, null, 1);
    }

    public final org.telegram.messenger.jc p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():org.telegram.messenger.jc");
    }

    public final void p0(hc hcVar, String str, Drawable drawable, long j3, String str2, Object obj, int i7) {
        r0(hcVar, str, null, null, drawable, j3, str2, obj, i7);
    }

    public final int q() {
        org.telegram.ui.Components.v5 m10 = m();
        if (m10 != null) {
            int i7 = this.U;
            if (i7 % 360 != 0 && i7 % 360 != 180) {
                return m10.getIntrinsicHeight();
            }
            return m10.getIntrinsicWidth();
        }
        zg0 B = B();
        if (B != null) {
            return B.f40990b;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.m0;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i10 = this.U;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n10.getHeight();
        }
        return n10.getWidth();
    }

    public final void q0(hc hcVar, String str, Drawable drawable, String str2, Object obj, int i7) {
        r0(hcVar, str, null, null, drawable, 0L, str2, obj, i7);
    }

    public final float r() {
        return (this.M0 / 2.0f) + this.K0;
    }

    public final void r0(hc hcVar, String str, hc hcVar2, String str2, Drawable drawable, long j3, String str3, Object obj, int i7) {
        u0(null, null, hcVar, str, hcVar2, str2, drawable, j3, str3, obj, i7);
    }

    public final float s() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void s0(hc hcVar, String str, hc hcVar2, String str2, Drawable drawable, Object obj, int i7) {
        u0(null, null, hcVar, str, hcVar2, str2, drawable, 0L, null, obj, i7);
    }

    public void setAlpha(float f10) {
        this.f21187d1 = f10;
    }

    public final Drawable t() {
        Drawable drawable = this.f21200j0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.f21178a0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(hc hcVar, String str, hc hcVar2, String str2, String str3, Object obj, int i7) {
        r0(hcVar, str, hcVar2, str2, null, 0L, str3, obj, i7);
    }

    public final jc u() {
        String str;
        String str2;
        Drawable drawable = this.f21200j0;
        jc jcVar = 0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
            str = this.f21196h0;
        } else {
            Drawable drawable2 = this.S;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
                str2 = this.Q;
            } else {
                drawable2 = this.f21178a0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.v5) && !(drawable instanceof zg0)) {
                    str2 = this.Y;
                } else {
                    drawable = this.m0;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                }
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        }
        if (drawable != null) {
            jcVar = new Object();
            jcVar.d = drawable;
            jcVar.f23533a = str;
            jcVar.f23536e = 0;
            if (str != null) {
                gc.D().H(jcVar.f23533a);
            }
        }
        return jcVar;
    }

    public final void u0(org.telegram.messenger.hc r20, java.lang.String r21, org.telegram.messenger.hc r22, java.lang.String r23, org.telegram.messenger.hc r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.u0(org.telegram.messenger.hc, java.lang.String, org.telegram.messenger.hc, java.lang.String, org.telegram.messenger.hc, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
    }

    public final float v() {
        return this.N0;
    }

    public final void v0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = null;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        }
        w0(bitmapDrawable);
    }

    public final float w() {
        return this.M0;
    }

    public final void w0(Drawable drawable) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        gc.D().h(this, true);
        if (this.A0) {
            if (this.S != null) {
                S(1, null);
                S(2, null);
                S(3, null);
                this.E0 = this.T;
                this.C0 = this.S;
                this.D0 = this.Q;
                this.B0 = true;
            } else if (this.f21178a0 != null) {
                S(0, null);
                S(2, null);
                S(3, null);
                this.E0 = this.f21181b0;
                this.C0 = this.f21178a0;
                this.D0 = this.Y;
                this.B0 = true;
            } else if (this.m0 != null) {
                S(0, null);
                S(1, null);
                S(2, null);
                S(3, null);
                this.E0 = this.f21184c0;
                this.C0 = this.m0;
                this.B0 = true;
                this.D0 = null;
            } else {
                for (int i7 = 0; i7 < 4; i7++) {
                    S(i7, null);
                }
                this.E0 = null;
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
        }
        Drawable drawable2 = this.m0;
        if (drawable2 instanceof li0) {
            jb0 jb0Var = (jb0) ((li0) drawable2);
            z5.q(jb0Var.f34948r.I1).v(jb0Var);
            jb0Var.f34947n = null;
            jb0Var.f34948r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.i5) {
            org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) drawable;
            if (this.f21231x1) {
                i5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) drawable;
            View view = this.f21188e;
            if (v5Var.f38880r0 == null) {
                v5Var.f38880r0 = new WeakReference(view);
            }
            if (this.f21231x1) {
                v5Var.e(this);
            }
            if (!this.f21224v0 && !v5Var.f38875n0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!v5Var.f38875n0) {
                v5Var.f38885v0 = z9;
            }
            if (this.f21220t0 && this.D == 0) {
                v5Var.j();
            }
            boolean z12 = this.f21227w0;
            v5Var.D = z12;
            if (z12) {
                v5Var.x(false);
            }
        } else if (drawable instanceof zg0) {
            zg0 zg0Var = (zg0) drawable;
            if (this.f21231x1) {
                zg0Var.I0.add(this);
            }
            zg0Var.E = this.f21218s0;
            if (this.f21222u0 && (!zg0Var.z() || this.D == 0)) {
                zg0Var.start();
            }
            zg0Var.J(true);
        }
        this.f21184c0 = null;
        this.f21181b0 = null;
        this.Z0.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f21192f0 = null;
        this.f21194g0 = null;
        Drawable drawable3 = this.f21200j0;
        if (drawable3 instanceof org.telegram.ui.Components.v5) {
            ((org.telegram.ui.Components.v5) drawable3).v(this);
        }
        this.f21200j0 = null;
        this.f21196h0 = null;
        this.f21202k0 = null;
        this.O = null;
        this.P = null;
        this.S = null;
        this.Q = null;
        this.T = null;
        this.I = null;
        this.K = null;
        this.L = null;
        Bitmap bitmap = this.J;
        if (bitmap != null) {
            bitmap.recycle();
            this.J = null;
        }
        this.W = null;
        this.X = null;
        this.Y = null;
        this.I0 = false;
        this.f21207n0 = null;
        this.f21212q0 = 0L;
        this.f21215r0 = 0;
        this.f21197h1 = 1.0f;
        this.f21199i1 = 1.0f;
        nc ncVar = this.E;
        if (ncVar != null) {
            ncVar.f24175a = null;
            ncVar.f24177c = null;
            ncVar.f24178e = null;
            ncVar.f24180g = null;
        }
        lc lcVar = this.f21195g1;
        if (lcVar != null) {
            if (this.f21178a0 == null && this.m0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            lcVar.f0(this, z10, true, false);
        }
        invalidate();
        if (this.U0 && this.A0 && this.C0 != null) {
            this.f21197h1 = 0.0f;
            this.f21201j1 = System.currentTimeMillis();
            if (this.f21178a0 == null && this.m0 == null) {
                z11 = false;
            }
            this.f21205m1 = z11;
        }
    }

    public final float x() {
        return this.K0;
    }

    public boolean x0(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.x0(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public final float y() {
        return this.K0 + this.M0;
    }

    public final void y0(float f10, float f11, float f12, float f13) {
        this.K0 = f10;
        this.L0 = f11;
        this.M0 = f12;
        this.N0 = f13;
    }

    public final float z() {
        return this.L0;
    }

    public final void z0(Rect rect) {
        if (rect != null) {
            this.K0 = rect.left;
            this.L0 = rect.top;
            this.M0 = rect.width();
            this.N0 = rect.height();
        }
    }
}
