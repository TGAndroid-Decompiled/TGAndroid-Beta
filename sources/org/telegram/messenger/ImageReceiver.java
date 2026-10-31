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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.pj0;
public class ImageReceiver implements us, org.telegram.ui.Components.l5 {
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
    public xa.n D1;
    public oc E;
    public BitmapShader E0;
    public th.b3 E1;
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
    public ic N;
    public float N0;
    public ic O;
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
    public ic W;
    public String X;
    public String Y;
    public Integer Y0;
    public int Z;
    public List f14365a;
    public Drawable f14366a0;
    public boolean f14368b;
    public BitmapShader f14369b0;
    public ArrayList f14371c;
    public BitmapShader f14372c0;
    public int f14374d0;
    public View e;
    public int f14376e0;
    public int f14377e1;
    public int f14378f;
    public ic f14379f0;
    public boolean f14380f1;
    public String f14381g0;
    public mc f14382g1;
    public Object h;
    public String f14383h0;
    public float f14384h1;
    public int f14385i0;
    public Drawable f14387j0;
    public long f14388j1;
    public BitmapShader f14389k0;
    public boolean l1;
    public Drawable m0;
    public boolean f14392m1;
    public boolean f14393n;
    public String f14394n0;
    public boolean f14396o0;
    public ColorFilter f14397o1;
    public int f14398p0;
    public boolean f14399p1;
    public long f14400q0;
    public long f14401q1;
    public boolean f14402r;
    public int f14403r0;
    public long f14404r1;
    public long f14405s;
    public float f14409t1;
    public int f14411u1;
    public boolean f14412v0;
    public String f14413v1;
    public boolean f14415w0;
    public int f14417x;
    public boolean f14419x1;
    public boolean f14420y;
    public boolean f14422y1;
    public boolean f14423z0;
    public int f14414w = 1;
    public boolean f14391l0 = true;
    public boolean f14406s0 = true;
    public boolean f14408t0 = true;
    public boolean f14410u0 = true;
    public int f14418x0 = 1;
    public int f14421y0 = -1;
    public final RectF P0 = new RectF();
    public boolean Q0 = true;
    public boolean V0 = true;
    public final int[] W0 = new int[4];
    public boolean X0 = true;
    public final RectF f14367a1 = new RectF();
    public final Matrix f14370b1 = new Matrix();
    public final Path f14373c1 = new Path();
    public float f14375d1 = 1.0f;
    public float f14386i1 = 1.0f;
    public byte f14390k1 = 1;
    public float f14395n1 = 0.05f;
    public int f14407s1 = 150;
    public final ArrayList f14416w1 = new ArrayList();
    public boolean f14424z1 = false;
    public boolean B1 = true;
    public final Paint Z0 = new Paint(3);
    public int d = d20.f15147s0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        G1 = new PorterDuffColorFilter(-2236963, mode);
        H1 = new PorterDuffColorFilter(-4473925, mode);
        I1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.e = view;
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

    public final bi0 B() {
        Drawable drawable = this.f14387j0;
        if (drawable instanceof bi0) {
            return (bi0) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof bi0) {
            return (bi0) drawable2;
        }
        Drawable drawable3 = this.f14366a0;
        if (drawable3 instanceof bi0) {
            return (bi0) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof bi0) {
            return (bi0) drawable4;
        }
        return null;
    }

    public final void B0(int i10) {
        this.M0 = i10;
    }

    public final int C() {
        return this.U;
    }

    public final void C0(float f7) {
        this.K0 = f7;
    }

    public final int[] D() {
        return this.W0;
    }

    public final void D0(float f7) {
        this.L0 = f7;
    }

    public final int[] E() {
        if (!this.V0) {
            return null;
        }
        return this.W0;
    }

    public final void E0(int i10) {
        this.f14417x = i10;
        if (this.f14419x1) {
            this.D = zs.e().f19749p & (~this.f14417x);
        }
    }

    public final Drawable F() {
        return this.m0;
    }

    public final void F0(long j10, long j11) {
        this.f14401q1 = j10;
        this.f14404r1 = j11;
        Drawable drawable = this.f14387j0;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).C(j10, j11);
        }
    }

    public final int G(int i10) {
        if (i10 == 1) {
            return this.Z;
        }
        if (i10 == 3) {
            return this.f14385i0;
        }
        return this.R;
    }

    public final void G0(int i10, int i11, boolean z10) {
        while (i10 < 0) {
            i10 += 360;
        }
        while (i10 > 360) {
            i10 -= 360;
        }
        this.f14374d0 = i10;
        this.U = i10;
        this.f14376e0 = i11;
        this.V = i11;
        this.f14380f1 = z10;
    }

    public final boolean H() {
        return this.Q0;
    }

    public final void H0(View view) {
        this.e = view;
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null && this.f14419x1) {
            View view2 = this.e;
            if (m10.f30147r0 == null) {
                m10.f30147r0 = new WeakReference(view2);
            }
        }
    }

    public final boolean I() {
        if (this.S == null && this.f14366a0 == null && this.m0 == null && this.f14387j0 == null) {
            return false;
        }
        return true;
    }

    public final void I0(int i10) {
        this.f14377e1 = i10;
    }

    public final boolean J() {
        if (this.S == null && this.f14387j0 == null) {
            return false;
        }
        return true;
    }

    public final void J0(int i10) {
        L0(new int[]{i10, i10, i10, i10});
    }

    public final boolean K() {
        if (this.S == null && this.f14387j0 == null && this.f14366a0 == null && this.m0 == null && this.Q == null && this.f14383h0 == null) {
            return false;
        }
        return true;
    }

    public final void K0(int i10, int i11, int i12, int i13) {
        L0(new int[]{i10, i11, i12, i13});
    }

    public final boolean L() {
        if (this.S == null && this.f14387j0 == null && !(this.m0 instanceof g61)) {
            return false;
        }
        return true;
    }

    public void L0(int[] iArr) {
        int i10 = iArr[0];
        this.X0 = true;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.W0;
            if (i11 >= iArr2.length) {
                break;
            }
            int i12 = iArr2[i11];
            int i13 = iArr[i11];
            if (i12 != i13) {
                z10 = true;
            }
            if (i10 != i13) {
                this.X0 = false;
            }
            iArr2[i11] = i13;
            i11++;
        }
        if (z10) {
            Drawable drawable = this.S;
            if (drawable != null && this.T == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.f14387j0;
            if (drawable2 != null && this.f14389k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f14366a0;
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
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null && m10.f30128b0) {
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
            Drawable drawable2 = this.f14387j0;
            if (drawable2 != null && this.f14389k0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f14366a0;
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
        org.telegram.ui.Components.n6 n6Var;
        Drawable drawable2 = this.m0;
        if (drawable != drawable2) {
            if (drawable2 instanceof org.telegram.ui.Components.n6) {
                if (!drawable2.equals(drawable)) {
                    n6Var = (org.telegram.ui.Components.n6) this.m0;
                } else {
                    return;
                }
            } else {
                n6Var = null;
            }
            this.m0 = drawable;
            if (this.f14419x1 && (drawable instanceof org.telegram.ui.Components.n6)) {
                ((org.telegram.ui.Components.n6) drawable).c(this);
            }
            if (this.f14419x1 && n6Var != null) {
                n6Var.b(this);
            }
        }
    }

    public final boolean O(float f7, float f10) {
        float f11 = this.K0;
        if (f7 >= f11 && f7 <= f11 + this.M0) {
            float f12 = this.L0;
            if (f10 >= f12 && f10 <= f12 + this.N0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0(boolean z10, boolean z11) {
        if (this.Q0 != z10) {
            this.Q0 = z10;
            if (z11) {
                invalidate();
                th.b3 b3Var = this.E1;
                if (b3Var != null) {
                    b3Var.run();
                }
            }
        }
    }

    public final boolean P() {
        if (!this.f14419x1) {
            this.f14419x1 = true;
            this.D = zs.e().f19749p & (~this.f14417x);
            boolean z10 = this.f14420y;
            int i10 = zs.f19633j1;
            if (!z10) {
                xa.n nVar = this.D1;
                if (nVar != null) {
                    nVar.a();
                    this.D1 = null;
                }
                xa.n nVar2 = (xa.n) new ys(zs.e(), this).f19431b;
                nVar2.e(zs.f19651m4);
                nVar2.e(i10);
                nVar2.e(zs.f19639k1);
                this.D1 = nVar2;
            }
            if (Y()) {
                return true;
            }
            bi0 B = B();
            if (B != null) {
                B.I0.add(this);
                B.E = this.f14406s0;
            }
            if (B != null && this.f14410u0 && (!B.z() || this.D == 0)) {
                B.start();
            }
            org.telegram.ui.Components.s5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.f14408t0 && this.D == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.f5 l4 = l();
            if (l4 != null) {
                l4.b(this);
            }
            if (zs.e().g()) {
                didReceivedNotification(i10, this.d, 512);
            }
            Drawable drawable = this.m0;
            if (drawable instanceof org.telegram.ui.Components.n6) {
                ((org.telegram.ui.Components.n6) drawable).c(this);
            }
            if (this.f14371c != null) {
                for (int i11 = 0; i11 < this.f14371c.size(); i11++) {
                    ((lc) this.f14371c.get(i11)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z10) {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            boolean z11 = this.f14412v0;
            if (!m10.f30142n0) {
                m10.f30152v0 = z11;
            }
            m10.start();
            return;
        }
        bi0 B = B();
        if (B != null && !B.f24765k0) {
            B.H(z10);
        }
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.f14387j0 && this.f14383h0 != null) {
            hc.D().Q(this.f14383h0);
            this.f14383h0 = null;
        } else if (drawable == this.S && this.Q != null) {
            hc.D().Q(this.Q);
            this.Q = null;
        } else if (drawable == this.f14366a0 && this.Y != null) {
            hc.D().Q(this.Y);
            this.Y = null;
        }
        u0(this.f14379f0, this.f14381g0, this.O, this.P, this.W, this.X, this.f14366a0, this.f14400q0, this.f14394n0, this.h, this.f14403r0);
    }

    public final void Q0() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        bi0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        xa.n nVar;
        if (this.f14419x1) {
            this.f14419x1 = false;
            ic icVar = this.O;
            if (icVar != null || this.f14379f0 != null || this.W != null || this.m0 != null) {
                if (this.E == null) {
                    this.E = new Object();
                }
                oc ocVar = this.E;
                ocVar.e = this.f14379f0;
                ocVar.f17254f = this.f14381g0;
                ocVar.f17251a = icVar;
                ocVar.f17252b = this.P;
                ocVar.f17253c = this.W;
                ocVar.d = this.X;
                ocVar.f17255g = this.m0;
                ocVar.h = this.f14400q0;
                ocVar.f17258k = this.f14394n0;
                ocVar.f17256i = this.f14403r0;
                ocVar.f17257j = this.h;
            }
            if (!this.f14420y && (nVar = this.D1) != null) {
                nVar.a();
                this.D1 = null;
            }
            Drawable drawable = this.m0;
            if (drawable instanceof org.telegram.ui.Components.n6) {
                ((org.telegram.ui.Components.n6) drawable).b(this);
            }
            if (this.m0 != null) {
                N0(null);
                this.f14372c0 = null;
            }
            f();
            this.Z0.setShader(null);
            if (this.f14377e1 == 0) {
                this.f14409t1 = 0.0f;
            }
            org.telegram.ui.Components.f5 l4 = l();
            if (l4 != null) {
                l4.o(this);
            }
            org.telegram.ui.Components.s5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            bi0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.f14371c != null) {
                for (int i10 = 0; i10 < this.f14371c.size(); i10++) {
                    ArrayList arrayList = ((th.t7) ((lc) this.f14371c.get(i10))).f49497a;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((th.p7) arrayList.get(i11)).b(false);
                        }
                    }
                }
            }
        }
    }

    public final void R0(Drawable drawable) {
        if (drawable != null) {
            int[] E = E();
            boolean z10 = false;
            if (drawable instanceof org.telegram.ui.Components.up) {
                org.telegram.ui.Components.up upVar = (org.telegram.ui.Components.up) drawable;
                float f7 = E[0];
                float f10 = E[1];
                float f11 = E[2];
                float f12 = E[3];
                float[] fArr = upVar.f31010f;
                float max = Math.max(0.0f, f7);
                fArr[1] = max;
                fArr[0] = max;
                float max2 = Math.max(0.0f, f10);
                fArr[3] = max2;
                fArr[2] = max2;
                float max3 = Math.max(0.0f, f11);
                fArr[5] = max3;
                fArr[4] = max3;
                float max4 = Math.max(0.0f, f12);
                fArr[7] = max4;
                fArr[6] = max4;
                if (f7 > 0.0f || f10 > 0.0f || f11 > 0.0f || f12 > 0.0f) {
                    z10 = true;
                }
                upVar.e = z10;
                upVar.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.r8)) {
                f0(drawable, null);
            } else if (drawable instanceof org.telegram.ui.Components.r8) {
                ((org.telegram.ui.Components.r8) drawable).f29873r = E[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof bi0)) {
                    if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                        ((org.telegram.ui.Components.s5) drawable).B(E);
                    } else if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        f0(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            }
        }
    }

    public final void S(int i10, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i10 == 3) {
            str2 = this.f14383h0;
            drawable = this.f14387j0;
        } else if (i10 == 2) {
            str2 = this.D0;
            drawable = this.C0;
        } else if (i10 == 1) {
            str2 = this.Y;
            drawable = this.f14366a0;
        } else {
            str2 = this.Q;
            drawable = this.S;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) hc.D().f15869t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof bi0) {
            ((bi0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof bi0) {
                bi0 bi0Var = (bi0) drawable;
                boolean p5 = hc.D().p(str2);
                if (!hc.D().J(str2, true) && p5) {
                    bi0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.s5) {
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable;
                if (s5Var.f30142n0) {
                    boolean p9 = hc.D().p(str2);
                    if (!hc.D().J(str2, true)) {
                        if (p9) {
                            s5Var.u();
                        }
                    } else if (p9) {
                        s5Var.stop();
                    }
                } else if (s5Var.f30150t0.isEmpty()) {
                    s5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p10 = hc.D().p(str2);
                if (!hc.D().J(str2, false) && p10) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    i0.A2(arrayList);
                }
            }
        }
        if (i10 == 3) {
            this.f14383h0 = null;
            this.f14387j0 = null;
            this.f14389k0 = null;
        } else if (i10 == 2) {
            this.D0 = null;
            this.C0 = null;
            this.E0 = null;
        } else if (i10 == 1) {
            this.f14366a0 = null;
            this.Y = null;
            this.f14369b0 = null;
        } else {
            this.S = null;
            this.Q = null;
            this.T = null;
        }
    }

    public final void T(boolean z10) {
        this.f14415w0 = z10;
    }

    public final void U(boolean z10) {
        this.f14408t0 = z10;
    }

    public final void V(boolean z10) {
        this.R0 = false;
    }

    public final void W(int i10) {
        this.f14418x0 = i10;
        bi0 B = B();
        if (B != null) {
            B.K(i10);
        }
    }

    public final void X(int i10) {
        this.f14421y0 = i10;
        if (B() != null) {
            B().L = i10;
            return;
        }
        this.C1 = i10;
        if (m() != null) {
            m().f30158y0 = 0;
        }
    }

    public final boolean Y() {
        oc ocVar = this.E;
        if (ocVar != null) {
            if (ocVar.f17251a != null || ocVar.f17253c != null || ocVar.e != null || ocVar.f17255g != null) {
                this.E = null;
                Drawable drawable = ocVar.f17255g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof bi0) && !(bitmapDrawable instanceof org.telegram.ui.Components.s5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        ocVar.f17255g = null;
                    }
                }
                u0(ocVar.e, ocVar.f17254f, ocVar.f17251a, ocVar.f17252b, ocVar.f17253c, ocVar.d, ocVar.f17255g, ocVar.h, ocVar.f17258k, ocVar.f17257j, ocVar.f17256i);
                ocVar.f17251a = null;
                ocVar.f17253c = null;
                ocVar.e = null;
                ocVar.f17255g = null;
                this.E = ocVar;
                bi0 B = B();
                if (B != null) {
                    B.E = this.f14406s0;
                }
                if (B != null && this.f14410u0) {
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

    public final void a(th.t7 t7Var) {
        if (this.f14371c == null) {
            this.f14371c = new ArrayList();
        }
        this.f14371c.add(t7Var);
        if (this.f14419x1) {
            t7Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.f14397o1 = colorFilter;
    }

    public final void b() {
        hc D = hc.D();
        D.f15868s.c(new o7(D, this, this.f14414w, 3));
    }

    public final void b0(int i10) {
        this.f14407s1 = i10;
    }

    public final void c() {
        this.f14402r = false;
        hc.D().h(this, true);
        this.f14393n = true;
    }

    public final void c0(boolean z10) {
        this.A0 = z10;
    }

    public final void d(boolean z10, jc jcVar) {
        if (!this.l1) {
            float f7 = this.f14384h1;
            if (f7 != 1.0f) {
                if (!z10) {
                    if (jcVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j10 = this.f14388j1;
                        long j11 = currentTimeMillis - j10;
                        if (j10 == 0) {
                            j11 = 16;
                        }
                        if (j11 > 30 && i0.f16027r > 60.0f) {
                            j11 = 30;
                        }
                        this.f14384h1 = (((float) j11) / this.f14407s1) + this.f14384h1;
                    } else {
                        this.f14384h1 = (16.0f / this.f14407s1) + f7;
                    }
                    if (this.f14384h1 > 1.0f) {
                        this.f14384h1 = 1.0f;
                        this.f14386i1 = 1.0f;
                        if (this.C0 != null) {
                            S(2, null);
                            this.E0 = null;
                        }
                    }
                }
                if (jcVar != null) {
                    i0.g3(new a(this, 12));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(mc mcVar) {
        this.f14382g1 = mcVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == zs.f19651m4) {
            String str = (String) objArr[0];
            String str2 = this.f14383h0;
            if (str2 != null && str2.equals(str)) {
                this.f14383h0 = (String) objArr[1];
                ic icVar = (ic) objArr[2];
                this.f14379f0 = icVar;
                oc ocVar = this.E;
                if (ocVar != null) {
                    ocVar.e = icVar;
                }
            }
            String str3 = this.Q;
            if (str3 != null && str3.equals(str)) {
                this.Q = (String) objArr[1];
                ic icVar2 = (ic) objArr[2];
                this.O = icVar2;
                oc ocVar2 = this.E;
                if (ocVar2 != null) {
                    ocVar2.f17251a = icVar2;
                }
            }
            String str4 = this.Y;
            if (str4 != null && str4.equals(str)) {
                this.Y = (String) objArr[1];
                ic icVar3 = (ic) objArr[2];
                this.W = icVar3;
                oc ocVar3 = this.E;
                if (ocVar3 != null) {
                    ocVar3.f17253c = icVar3;
                }
            }
        } else if (i10 == zs.f19633j1) {
            Integer num = (Integer) objArr[0];
            if (this.f14417x < num.intValue()) {
                int intValue = num.intValue() | this.D;
                this.D = intValue;
                if (intValue != 0) {
                    bi0 B = B();
                    if (B != null && B.z()) {
                        B.stop();
                    }
                    org.telegram.ui.Components.s5 m10 = m();
                    if (m10 != null) {
                        m10.stop();
                    }
                }
            }
        } else if (i10 == zs.f19639k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.f14417x < num2.intValue() && (i12 = this.D) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.D = i13;
                if (i13 == 0) {
                    bi0 B2 = B();
                    if (B2 != null) {
                        B2.E = this.f14406s0;
                    }
                    if (this.f14410u0 && B2 != null && B2.z()) {
                        B2.start();
                    }
                    org.telegram.ui.Components.s5 m11 = m();
                    if (this.f14408t0 && m11 != null) {
                        m11.j();
                        invalidate();
                    }
                }
            }
        }
    }

    public final void e() {
        if (this.f14371c != null) {
            if (this.f14419x1) {
                for (int i10 = 0; i10 < this.f14371c.size(); i10++) {
                    ArrayList arrayList = ((th.t7) ((lc) this.f14371c.get(i10))).f49497a;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((th.p7) arrayList.get(i11)).b(false);
                        }
                    }
                }
            }
            this.f14371c.clear();
        }
    }

    public final jc e0(jc jcVar, int i10) {
        bi0 bi0Var;
        jc jcVar2 = jcVar;
        if (jcVar == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.f16262y = new RectF();
            jcVar2 = obj;
        }
        jcVar2.d = i10;
        jcVar2.f16245f = m();
        jcVar2.f16246g = B();
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            jcVar2.h[i11] = this.W0[i11];
        }
        jcVar2.f16248j = this.f14387j0;
        jcVar2.f16247i = this.f14389k0;
        jcVar2.f16250l = this.S;
        jcVar2.f16249k = this.T;
        jcVar2.f16251m = this.f14366a0;
        jcVar2.f16252n = this.f14369b0;
        jcVar2.e = this.f14372c0;
        jcVar2.f16253o = this.m0;
        jcVar2.f16261x = this.C0;
        jcVar2.f16263z = this.f14397o1;
        jcVar2.f16260w = this.B0;
        jcVar2.f16254p = this.f14384h1;
        jcVar2.f16255q = this.f14386i1;
        jcVar2.f16256r = this.E0;
        org.telegram.ui.Components.s5 s5Var = jcVar2.f16245f;
        if ((s5Var != null && !s5Var.s()) || ((bi0Var = jcVar2.f16246g) != null && !bi0Var.u())) {
            z10 = true;
        }
        jcVar2.f16242a = z10;
        jcVar2.f16259u = this.K0;
        jcVar2.v = this.L0;
        jcVar2.f16258t = this.M0;
        jcVar2.f16257s = this.N0;
        jcVar2.f16243b = this.f14375d1;
        return jcVar2;
    }

    public final void f() {
        for (int i10 = 0; i10 < 4; i10++) {
            S(i10, null);
        }
        hc.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.f14366a0) {
            this.f14369b0 = bitmapShader;
        } else if (drawable == this.m0) {
            this.f14372c0 = bitmapShader;
        } else if (drawable == this.f14387j0) {
            this.f14389k0 = bitmapShader;
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

    public final void g0(boolean z10) {
        if (this.F1 != z10) {
            this.F1 = z10;
            this.f14410u0 = !z10;
            bi0 B = B();
            if (B != null) {
                if (z10) {
                    B.stop();
                } else if (!B.f24765k0) {
                    B.start();
                }
            }
        }
    }

    public float getAlpha() {
        return this.f14375d1;
    }

    public final boolean h(android.graphics.Canvas r32, org.telegram.messenger.jc r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, org.telegram.messenger.jc):boolean");
    }

    public final void h0(int i10) {
        if (this.f14414w != i10) {
            this.f14414w = i10;
            if (this.f14419x1 && K()) {
                hc D = hc.D();
                D.f15868s.c(new o7(D, this, this.f14414w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, jc jcVar, int i10) {
        if (jcVar != null) {
            if (bitmapDrawable instanceof bi0) {
                bi0 bi0Var = (bi0) bitmapDrawable;
                float f7 = jcVar.f16259u;
                float f10 = jcVar.v;
                float f11 = jcVar.f16258t;
                float f12 = jcVar.f16257s;
                ColorFilter colorFilter = jcVar.f16263z;
                int i11 = jcVar.d;
                Paint[] paintArr = bi0Var.f24764j0;
                RectF[] rectFArr = bi0Var.f24763i0;
                if (rectFArr[i11] == null) {
                    rectFArr[i11] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i11] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i11].setAlpha(i10);
                paintArr[i11].setColorFilter(colorFilter);
                rectFArr[i11].set(f7, f10, f7 + f11, f12 + f10);
                bi0Var.q(canvas, null, true, 0L, i11);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) bitmapDrawable;
                float f13 = jcVar.f16259u;
                float f14 = jcVar.v;
                float f15 = jcVar.f16258t;
                float f16 = jcVar.f16257s;
                ColorFilter colorFilter2 = jcVar.f16263z;
                int i12 = jcVar.d;
                Paint[] paintArr2 = s5Var.f30145q0;
                RectF[] rectFArr2 = s5Var.f30144p0;
                if (rectFArr2[i12] == null) {
                    rectFArr2[i12] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i12] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i12].setAlpha(i10);
                paintArr2[i12].setColorFilter(colorFilter2);
                rectFArr2[i12].set(f13, f14, f15 + f13, f16 + f14);
                s5Var.l(canvas, true, 0L, i12);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    if (jcVar.A == null) {
                        jcVar.A = new Paint(1);
                    }
                    jcVar.A.setAlpha(i10);
                    jcVar.A.setColorFilter(jcVar.f16263z);
                    canvas.save();
                    canvas.translate(jcVar.f16259u, jcVar.v);
                    canvas.scale(jcVar.f16258t / bitmap.getWidth(), jcVar.f16257s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, jcVar.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i10);
        if (bitmapDrawable instanceof bi0) {
            ((bi0) bitmapDrawable).q(canvas, null, false, this.f14405s, 0);
        } else if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) bitmapDrawable).l(canvas, false, this.f14405s, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.e;
        if (view == null) {
            return;
        }
        if (this.J0) {
            view.invalidate();
            return;
        }
        float f7 = this.K0;
        float f10 = this.L0;
        view.invalidate((int) f7, (int) f10, (int) (f7 + this.M0), (int) (f10 + this.N0));
    }

    public final void j(android.graphics.Canvas r42, android.graphics.drawable.Drawable r43, int r44, android.graphics.BitmapShader r45, int r46, int r47, int r48, org.telegram.messenger.jc r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, org.telegram.messenger.jc):void");
    }

    public final void j0(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j0(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public final void k(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, jc jcVar) {
        if (this.f14377e1 == 0) {
            float f7 = this.f14409t1;
            if (f7 != 0.0f) {
                float f10 = f7 - 0.10666667f;
                this.f14409t1 = f10;
                if (f10 < 0.0f) {
                    this.f14409t1 = 0.0f;
                }
                invalidate();
            }
        }
        int i13 = this.f14377e1;
        if (i13 != 0) {
            this.f14409t1 = 1.0f;
            this.f14411u1 = i13;
        }
        float f11 = this.f14409t1;
        if (f11 != 0.0f && f11 != 1.0f) {
            j(canvas, drawable, i10, bitmapShader, i11, i12, i13, jcVar);
            j(canvas, drawable, (int) (i10 * this.f14409t1), bitmapShader, i11, i12, this.f14411u1, jcVar);
            return;
        }
        j(canvas, drawable, i10, bitmapShader, i11, i12, i13, jcVar);
    }

    public final void k0() {
        this.f14402r = false;
    }

    public final org.telegram.ui.Components.f5 l() {
        Drawable drawable = this.f14387j0;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable2;
        }
        Drawable drawable3 = this.f14366a0;
        if (drawable3 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.f5) {
            return (org.telegram.ui.Components.f5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z10) {
        this.S0 = z10;
    }

    public final org.telegram.ui.Components.s5 m() {
        Drawable drawable = this.f14387j0;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable2;
        }
        Drawable drawable3 = this.f14366a0;
        if (drawable3 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 instanceof org.telegram.ui.Components.s5) {
            return (org.telegram.ui.Components.s5) drawable4;
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
        bi0 B = B();
        if (B != null && B.u()) {
            if (B.Q != null) {
                return B.Q;
            }
            if (B.R == null) {
                return null;
            }
            return B.R;
        }
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.f14387j0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.S;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.f14366a0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.m0;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public final void n0(int i10, long j10, Object obj, String str, String str2, String str3, ic icVar, ic icVar2) {
        r0(icVar, str, icVar2, str2, null, j10, str3, obj, i10);
    }

    public final int o() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            int i10 = this.U;
            if (i10 % 360 != 0 && i10 % 360 != 180) {
                return m10.getIntrinsicWidth();
            }
            return m10.getIntrinsicHeight();
        }
        bi0 B = B();
        if (B != null) {
            return B.f24755c;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.m0;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i11 = this.U;
        if (i11 % 360 != 0 && i11 % 360 != 180) {
            return n10.getWidth();
        }
        return n10.getHeight();
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j10) {
        r0(ic.g(str), str2, null, null, drawable, j10, str3, null, 1);
    }

    public final org.telegram.messenger.kc p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():org.telegram.messenger.kc");
    }

    public final void p0(ic icVar, String str, Drawable drawable, long j10, String str2, Object obj, int i10) {
        r0(icVar, str, null, null, drawable, j10, str2, obj, i10);
    }

    public final int q() {
        org.telegram.ui.Components.s5 m10 = m();
        if (m10 != null) {
            int i10 = this.U;
            if (i10 % 360 != 0 && i10 % 360 != 180) {
                return m10.getIntrinsicHeight();
            }
            return m10.getIntrinsicWidth();
        }
        bi0 B = B();
        if (B != null) {
            return B.f24753b;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.m0;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i11 = this.U;
        if (i11 % 360 != 0 && i11 % 360 != 180) {
            return n10.getHeight();
        }
        return n10.getWidth();
    }

    public final void q0(ic icVar, String str, Drawable drawable, String str2, Object obj, int i10) {
        r0(icVar, str, null, null, drawable, 0L, str2, obj, i10);
    }

    public final float r() {
        return (this.M0 / 2.0f) + this.K0;
    }

    public final void r0(ic icVar, String str, ic icVar2, String str2, Drawable drawable, long j10, String str3, Object obj, int i10) {
        u0(null, null, icVar, str, icVar2, str2, drawable, j10, str3, obj, i10);
    }

    public final float s() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void s0(ic icVar, String str, ic icVar2, String str2, Drawable drawable, Object obj, int i10) {
        u0(null, null, icVar, str, icVar2, str2, drawable, 0L, null, obj, i10);
    }

    public void setAlpha(float f7) {
        this.f14375d1 = f7;
    }

    public final Drawable t() {
        Drawable drawable = this.f14387j0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.S;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.f14366a0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.m0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(ic icVar, String str, ic icVar2, String str2, String str3, Object obj, int i10) {
        r0(icVar, str, icVar2, str2, null, 0L, str3, obj, i10);
    }

    public final kc u() {
        String str;
        String str2;
        Drawable drawable = this.f14387j0;
        kc kcVar = 0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
            str = this.f14383h0;
        } else {
            Drawable drawable2 = this.S;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
                str2 = this.Q;
            } else {
                drawable2 = this.f14366a0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.s5) && !(drawable instanceof bi0)) {
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
            kcVar = new Object();
            kcVar.d = drawable;
            kcVar.f16562a = str;
            kcVar.e = 0;
            if (str != null) {
                hc.D().H(kcVar.f16562a);
            }
        }
        return kcVar;
    }

    public final void u0(org.telegram.messenger.ic r20, java.lang.String r21, org.telegram.messenger.ic r22, java.lang.String r23, org.telegram.messenger.ic r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.u0(org.telegram.messenger.ic, java.lang.String, org.telegram.messenger.ic, java.lang.String, org.telegram.messenger.ic, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
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
        boolean z10;
        boolean z11;
        boolean z12 = true;
        hc.D().h(this, true);
        if (this.A0) {
            if (this.S != null) {
                S(1, null);
                S(2, null);
                S(3, null);
                this.E0 = this.T;
                this.C0 = this.S;
                this.D0 = this.Q;
                this.B0 = true;
            } else if (this.f14366a0 != null) {
                S(0, null);
                S(2, null);
                S(3, null);
                this.E0 = this.f14369b0;
                this.C0 = this.f14366a0;
                this.D0 = this.Y;
                this.B0 = true;
            } else if (this.m0 != null) {
                S(0, null);
                S(1, null);
                S(2, null);
                S(3, null);
                this.E0 = this.f14372c0;
                this.C0 = this.m0;
                this.B0 = true;
                this.D0 = null;
            } else {
                for (int i10 = 0; i10 < 4; i10++) {
                    S(i10, null);
                }
                this.E0 = null;
            }
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                S(i11, null);
            }
        }
        Drawable drawable2 = this.m0;
        if (drawable2 instanceof pj0) {
            cc0 cc0Var = (cc0) ((pj0) drawable2);
            b6.q(cc0Var.f25049r.I1).v(cc0Var);
            cc0Var.f25048n = null;
            cc0Var.f25049r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.f5) {
            org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) drawable;
            if (this.f14419x1) {
                f5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) drawable;
            View view = this.e;
            if (s5Var.f30147r0 == null) {
                s5Var.f30147r0 = new WeakReference(view);
            }
            if (this.f14419x1) {
                s5Var.e(this);
            }
            if (!this.f14412v0 && !s5Var.f30142n0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!s5Var.f30142n0) {
                s5Var.f30152v0 = z10;
            }
            if (this.f14408t0 && this.D == 0) {
                s5Var.j();
            }
            boolean z13 = this.f14415w0;
            s5Var.D = z13;
            if (z13) {
                s5Var.x(false);
            }
        } else if (drawable instanceof bi0) {
            bi0 bi0Var = (bi0) drawable;
            if (this.f14419x1) {
                bi0Var.I0.add(this);
            }
            bi0Var.E = this.f14406s0;
            if (this.f14410u0 && (!bi0Var.z() || this.D == 0)) {
                bi0Var.start();
            }
            bi0Var.J(true);
        }
        this.f14372c0 = null;
        this.f14369b0 = null;
        this.Z0.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f14379f0 = null;
        this.f14381g0 = null;
        Drawable drawable3 = this.f14387j0;
        if (drawable3 instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable3).v(this);
        }
        this.f14387j0 = null;
        this.f14383h0 = null;
        this.f14389k0 = null;
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
        this.f14394n0 = null;
        this.f14400q0 = 0L;
        this.f14403r0 = 0;
        this.f14384h1 = 1.0f;
        this.f14386i1 = 1.0f;
        oc ocVar = this.E;
        if (ocVar != null) {
            ocVar.f17251a = null;
            ocVar.f17253c = null;
            ocVar.e = null;
            ocVar.f17255g = null;
        }
        mc mcVar = this.f14382g1;
        if (mcVar != null) {
            if (this.f14366a0 == null && this.m0 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            mcVar.o(this, z11, true, false);
        }
        invalidate();
        if (this.U0 && this.A0 && this.C0 != null) {
            this.f14384h1 = 0.0f;
            this.f14388j1 = System.currentTimeMillis();
            if (this.f14366a0 == null && this.m0 == null) {
                z12 = false;
            }
            this.f14392m1 = z12;
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

    public final void y0(float f7, float f10, float f11, float f12) {
        this.K0 = f7;
        this.L0 = f10;
        this.M0 = f11;
        this.N0 = f12;
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
