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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.x41;
public class ImageReceiver implements cs, org.telegram.ui.Components.m5 {
    public static final PorterDuffColorFilter H1;
    public static final PorterDuffColorFilter I1;
    public static final float[] J1;
    public boolean A0;
    public boolean B0;
    public boolean B1;
    public boolean C0;
    public Drawable D0;
    public int D1;
    public int E;
    public String E0;
    public za.p E1;
    public gc F;
    public BitmapShader F0;
    public ei.k4 F1;
    public Object G;
    public boolean G0;
    public boolean G1;
    public Bitmap H;
    public boolean H0;
    public BitmapShader I;
    public TLRPC.Document I0;
    public ComposeShader J;
    public boolean J0;
    public Bitmap K;
    public boolean K0;
    public BitmapShader L;
    public float L0;
    public Canvas M;
    public float M0;
    public Paint N;
    public float N0;
    public ac O;
    public float O0;
    public ac P;
    public float P0;
    public String Q;
    public String R;
    public int S;
    public boolean S0;
    public Drawable T;
    public boolean T0;
    public BitmapShader U;
    public boolean U0;
    public int V;
    public boolean V0;
    public int W;
    public ac X;
    public String Y;
    public String Z;
    public Integer Z0;
    public List f21227a;
    public int f21228a0;
    public boolean f21230b;
    public Drawable f21231b0;
    public ArrayList f21233c;
    public BitmapShader f21234c0;
    public BitmapShader f21236d0;
    public View f21238e;
    public int f21239e0;
    public int f21241f;
    public int f21242f0;
    public int f21243f1;
    public ac f21244g0;
    public boolean f21245g1;
    public Object h;
    public String f21246h0;
    public ec f21247h1;
    public String f21248i0;
    public float f21249i1;
    public int f21250j0;
    public Drawable f21252k0;
    public long k1;
    public BitmapShader f21253l0;
    public boolean m1;
    public boolean f21255n;
    public Drawable f21256n0;
    public boolean f21257n1;
    public String f21258o0;
    public boolean f21260p0;
    public ColorFilter f21261p1;
    public int f21262q0;
    public boolean f21263q1;
    public boolean f21264r;
    public long f21265r0;
    public long f21266r1;
    public long f21267s;
    public int f21268s0;
    public long f21269s1;
    public float f21273u1;
    public int f21275v1;
    public boolean f21277w0;
    public String f21278w1;
    public int f21279x;
    public boolean f21280x0;
    public boolean f21282y;
    public boolean f21284y1;
    public boolean f21286z1;
    public int f21276w = 1;
    public boolean m0 = true;
    public boolean f21270t0 = true;
    public boolean f21272u0 = true;
    public boolean f21274v0 = true;
    public int f21283y0 = 1;
    public int f21285z0 = -1;
    public final RectF Q0 = new RectF();
    public boolean R0 = true;
    public boolean W0 = true;
    public final int[] X0 = new int[4];
    public boolean Y0 = true;
    public final RectF f21232b1 = new RectF();
    public final Matrix f21235c1 = new Matrix();
    public final Path f21237d1 = new Path();
    public float f21240e1 = 1.0f;
    public float f21251j1 = 1.0f;
    public byte f21254l1 = 1;
    public float f21259o1 = 0.05f;
    public int f21271t1 = 150;
    public final ArrayList f21281x1 = new ArrayList();
    public boolean A1 = false;
    public boolean C1 = true;
    public final Paint f21229a1 = new Paint(3);
    public int d = h10.f22829t0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        H1 = new PorterDuffColorFilter(-2236963, mode);
        I1 = new PorterDuffColorFilter(-4473925, mode);
        J1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.f21238e = view;
    }

    public final float A() {
        return this.M0 + this.O0;
    }

    public final void A0(RectF rectF) {
        if (rectF != null) {
            this.L0 = rectF.left;
            this.M0 = rectF.top;
            this.N0 = rectF.width();
            this.O0 = rectF.height();
        }
    }

    public final ch0 B() {
        Drawable drawable = this.f21252k0;
        if (drawable instanceof ch0) {
            return (ch0) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof ch0) {
            return (ch0) drawable2;
        }
        Drawable drawable3 = this.f21231b0;
        if (drawable3 instanceof ch0) {
            return (ch0) drawable3;
        }
        Drawable drawable4 = this.f21256n0;
        if (drawable4 instanceof ch0) {
            return (ch0) drawable4;
        }
        return null;
    }

    public final void B0(int i3) {
        this.N0 = i3;
    }

    public final int C() {
        return this.V;
    }

    public final void C0(float f10) {
        this.L0 = f10;
    }

    public final int[] D() {
        return this.X0;
    }

    public final void D0(float f10) {
        this.M0 = f10;
    }

    public final int[] E() {
        if (!this.W0) {
            return null;
        }
        return this.X0;
    }

    public final void E0(int i3) {
        this.f21279x = i3;
        if (this.f21284y1) {
            this.E = hs.e().f23366p & (~this.f21279x);
        }
    }

    public final Drawable F() {
        return this.f21256n0;
    }

    public final void F0(long j10, long j11) {
        this.f21266r1 = j10;
        this.f21269s1 = j11;
        Drawable drawable = this.f21252k0;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).C(j10, j11);
        }
    }

    public final int G(int i3) {
        if (i3 == 1) {
            return this.f21228a0;
        }
        if (i3 == 3) {
            return this.f21250j0;
        }
        return this.S;
    }

    public final void G0(int i3, int i10, boolean z10) {
        while (i3 < 0) {
            i3 += 360;
        }
        while (i3 > 360) {
            i3 -= 360;
        }
        this.f21239e0 = i3;
        this.V = i3;
        this.f21242f0 = i10;
        this.W = i10;
        this.f21245g1 = z10;
    }

    public final boolean H() {
        return this.R0;
    }

    public final void H0(View view) {
        this.f21238e = view;
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null && this.f21284y1) {
            View view2 = this.f21238e;
            if (m10.f38277s0 == null) {
                m10.f38277s0 = new WeakReference(view2);
            }
        }
    }

    public final boolean I() {
        if (this.T == null && this.f21231b0 == null && this.f21256n0 == null && this.f21252k0 == null) {
            return false;
        }
        return true;
    }

    public final void I0(int i3) {
        this.f21243f1 = i3;
    }

    public final boolean J() {
        if (this.T == null && this.f21252k0 == null) {
            return false;
        }
        return true;
    }

    public final void J0(int i3) {
        L0(new int[]{i3, i3, i3, i3});
    }

    public final boolean K() {
        if (this.T == null && this.f21252k0 == null && this.f21231b0 == null && this.f21256n0 == null && this.R == null && this.f21248i0 == null) {
            return false;
        }
        return true;
    }

    public final void K0(int i3, int i10, int i11, int i12) {
        L0(new int[]{i3, i10, i11, i12});
    }

    public final boolean L() {
        if (this.T == null && this.f21252k0 == null && !(this.f21256n0 instanceof x41)) {
            return false;
        }
        return true;
    }

    public void L0(int[] iArr) {
        int i3 = iArr[0];
        this.Y0 = true;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.X0;
            if (i10 >= iArr2.length) {
                break;
            }
            int i11 = iArr2[i10];
            int i12 = iArr[i10];
            if (i11 != i12) {
                z10 = true;
            }
            if (i3 != i12) {
                this.Y0 = false;
            }
            iArr2[i10] = i12;
            i10++;
        }
        if (z10) {
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.f21252k0;
            if (drawable2 != null && this.f21253l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f21231b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.f21256n0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean M() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null && m10.f38257c0) {
            return true;
        }
        return false;
    }

    public final void M0() {
        if (!this.W0) {
            this.W0 = true;
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                R0(drawable);
            }
            Drawable drawable2 = this.f21252k0;
            if (drawable2 != null && this.f21253l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f21231b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.f21256n0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean N() {
        if (this.B0 && this.D0 != null && !this.C0) {
            return true;
        }
        return false;
    }

    public final void N0(Drawable drawable) {
        org.telegram.ui.Components.p6 p6Var;
        Drawable drawable2 = this.f21256n0;
        if (drawable != drawable2) {
            if (drawable2 instanceof org.telegram.ui.Components.p6) {
                if (!drawable2.equals(drawable)) {
                    p6Var = (org.telegram.ui.Components.p6) this.f21256n0;
                } else {
                    return;
                }
            } else {
                p6Var = null;
            }
            this.f21256n0 = drawable;
            if (this.f21284y1 && (drawable instanceof org.telegram.ui.Components.p6)) {
                ((org.telegram.ui.Components.p6) drawable).c(this);
            }
            if (this.f21284y1 && p6Var != null) {
                p6Var.b(this);
            }
        }
    }

    public final boolean O(float f10, float f11) {
        float f12 = this.L0;
        if (f10 >= f12 && f10 <= f12 + this.N0) {
            float f13 = this.M0;
            if (f11 >= f13 && f11 <= f13 + this.O0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0(boolean z10, boolean z11) {
        if (this.R0 != z10) {
            this.R0 = z10;
            if (z11) {
                invalidate();
                ei.k4 k4Var = this.F1;
                if (k4Var != null) {
                    k4Var.run();
                }
            }
        }
    }

    public final boolean P() {
        if (!this.f21284y1) {
            this.f21284y1 = true;
            this.E = hs.e().f23366p & (~this.f21279x);
            boolean z10 = this.f21282y;
            int i3 = hs.f23249j1;
            if (!z10) {
                za.p pVar = this.E1;
                if (pVar != null) {
                    pVar.a();
                    this.E1 = null;
                }
                za.p pVar2 = (za.p) new gs(hs.e(), this).f22762b;
                pVar2.b(hs.f23267m4);
                pVar2.b(i3);
                pVar2.b(hs.k1);
                this.E1 = pVar2;
            }
            if (Y()) {
                return true;
            }
            ch0 B = B();
            if (B != null) {
                B.J0.add(this);
                B.F = this.f21270t0;
            }
            if (B != null && this.f21274v0 && (!B.z() || this.E == 0)) {
                B.start();
            }
            org.telegram.ui.Components.t5 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.f21272u0 && this.E == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.g5 l10 = l();
            if (l10 != null) {
                l10.b(this);
            }
            if (hs.e().g()) {
                didReceivedNotification(i3, this.d, 512);
            }
            Drawable drawable = this.f21256n0;
            if (drawable instanceof org.telegram.ui.Components.p6) {
                ((org.telegram.ui.Components.p6) drawable).c(this);
            }
            if (this.f21233c != null) {
                for (int i10 = 0; i10 < this.f21233c.size(); i10++) {
                    ((dc) this.f21233c.get(i10)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z10) {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            boolean z11 = this.f21277w0;
            if (!m10.f38271o0) {
                m10.f38282w0 = z11;
            }
            m10.start();
            return;
        }
        ch0 B = B();
        if (B != null && !B.f32734l0) {
            B.H(z10);
        }
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.f21252k0 && this.f21248i0 != null) {
            zb.D().Q(this.f21248i0);
            this.f21248i0 = null;
        } else if (drawable == this.T && this.R != null) {
            zb.D().Q(this.R);
            this.R = null;
        } else if (drawable == this.f21231b0 && this.Z != null) {
            zb.D().Q(this.Z);
            this.Z = null;
        }
        u0(this.f21244g0, this.f21246h0, this.P, this.Q, this.X, this.Y, this.f21231b0, this.f21265r0, this.f21258o0, this.h, this.f21268s0);
    }

    public final void Q0() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        ch0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        za.p pVar;
        if (this.f21284y1) {
            this.f21284y1 = false;
            ac acVar = this.P;
            if (acVar != null || this.f21244g0 != null || this.X != null || this.f21256n0 != null) {
                if (this.F == null) {
                    this.F = new Object();
                }
                gc gcVar = this.F;
                gcVar.f22698e = this.f21244g0;
                gcVar.f22699f = this.f21246h0;
                gcVar.f22695a = acVar;
                gcVar.f22696b = this.Q;
                gcVar.f22697c = this.X;
                gcVar.d = this.Y;
                gcVar.f22700g = this.f21256n0;
                gcVar.h = this.f21265r0;
                gcVar.f22703k = this.f21258o0;
                gcVar.f22701i = this.f21268s0;
                gcVar.f22702j = this.h;
            }
            if (!this.f21282y && (pVar = this.E1) != null) {
                pVar.a();
                this.E1 = null;
            }
            Drawable drawable = this.f21256n0;
            if (drawable instanceof org.telegram.ui.Components.p6) {
                ((org.telegram.ui.Components.p6) drawable).b(this);
            }
            if (this.f21256n0 != null) {
                N0(null);
                this.f21236d0 = null;
            }
            f();
            this.f21229a1.setShader(null);
            if (this.f21243f1 == 0) {
                this.f21273u1 = 0.0f;
            }
            org.telegram.ui.Components.g5 l10 = l();
            if (l10 != null) {
                l10.o(this);
            }
            org.telegram.ui.Components.t5 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            ch0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.f21233c != null) {
                for (int i3 = 0; i3 < this.f21233c.size(); i3++) {
                    ArrayList arrayList = ((ei.w9) ((dc) this.f21233c.get(i3))).f11193a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((ei.s9) arrayList.get(i10)).b(false);
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
            if (drawable instanceof org.telegram.ui.Components.np) {
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) drawable;
                float f10 = E[0];
                float f11 = E[1];
                float f12 = E[2];
                float f13 = E[3];
                float[] fArr = npVar.f36602f;
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
                    z10 = true;
                }
                npVar.f36601e = z10;
                npVar.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.u8)) {
                f0(drawable, null);
            } else if (drawable instanceof org.telegram.ui.Components.u8) {
                ((org.telegram.ui.Components.u8) drawable).f38693r = E[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof ch0)) {
                    if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                        ((org.telegram.ui.Components.t5) drawable).B(E);
                    } else if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        f0(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            }
        }
    }

    public final void S(int i3, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i3 == 3) {
            str2 = this.f21248i0;
            drawable = this.f21252k0;
        } else if (i3 == 2) {
            str2 = this.E0;
            drawable = this.D0;
        } else if (i3 == 1) {
            str2 = this.Z;
            drawable = this.f21231b0;
        } else {
            str2 = this.R;
            drawable = this.T;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) zb.D().f26774t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof ch0) {
            ((ch0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof ch0) {
                ch0 ch0Var = (ch0) drawable;
                boolean p10 = zb.D().p(str2);
                if (!zb.D().J(str2, true) && p10) {
                    ch0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.t5) {
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable;
                if (t5Var.f38271o0) {
                    boolean p11 = zb.D().p(str2);
                    if (!zb.D().J(str2, true)) {
                        if (p11) {
                            t5Var.u();
                        }
                    } else if (p11) {
                        t5Var.stop();
                    }
                } else if (t5Var.f38279u0.isEmpty()) {
                    t5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p12 = zb.D().p(str2);
                if (!zb.D().J(str2, false) && p12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    g0.A2(arrayList);
                }
            }
        }
        if (i3 == 3) {
            this.f21248i0 = null;
            this.f21252k0 = null;
            this.f21253l0 = null;
        } else if (i3 == 2) {
            this.E0 = null;
            this.D0 = null;
            this.F0 = null;
        } else if (i3 == 1) {
            this.f21231b0 = null;
            this.Z = null;
            this.f21234c0 = null;
        } else {
            this.T = null;
            this.R = null;
            this.U = null;
        }
    }

    public final void T(boolean z10) {
        this.f21280x0 = z10;
    }

    public final void U(boolean z10) {
        this.f21272u0 = z10;
    }

    public final void V(boolean z10) {
        this.S0 = false;
    }

    public final void W(int i3) {
        this.f21283y0 = i3;
        ch0 B = B();
        if (B != null) {
            B.K(i3);
        }
    }

    public final void X(int i3) {
        this.f21285z0 = i3;
        if (B() != null) {
            B().M = i3;
            return;
        }
        this.D1 = i3;
        if (m() != null) {
            m().f38287z0 = 0;
        }
    }

    public final boolean Y() {
        gc gcVar = this.F;
        if (gcVar != null) {
            if (gcVar.f22695a != null || gcVar.f22697c != null || gcVar.f22698e != null || gcVar.f22700g != null) {
                this.F = null;
                Drawable drawable = gcVar.f22700g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof ch0) && !(bitmapDrawable instanceof org.telegram.ui.Components.t5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        gcVar.f22700g = null;
                    }
                }
                u0(gcVar.f22698e, gcVar.f22699f, gcVar.f22695a, gcVar.f22696b, gcVar.f22697c, gcVar.d, gcVar.f22700g, gcVar.h, gcVar.f22703k, gcVar.f22702j, gcVar.f22701i);
                gcVar.f22695a = null;
                gcVar.f22697c = null;
                gcVar.f22698e = null;
                gcVar.f22700g = null;
                this.F = gcVar;
                ch0 B = B();
                if (B != null) {
                    B.F = this.f21270t0;
                }
                if (B != null && this.f21274v0) {
                    if (!B.z() || this.E == 0) {
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
        this.G = obj;
        invalidate();
    }

    public final void a(ei.w9 w9Var) {
        if (this.f21233c == null) {
            this.f21233c = new ArrayList();
        }
        this.f21233c.add(w9Var);
        if (this.f21284y1) {
            w9Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.f21261p1 = colorFilter;
    }

    public final void b() {
        zb D = zb.D();
        D.f26773s.c(new k7(D, this, this.f21276w, 3));
    }

    public final void b0(int i3) {
        this.f21271t1 = i3;
    }

    public final void c() {
        this.f21264r = false;
        zb.D().h(this, true);
        this.f21255n = true;
    }

    public final void c0(boolean z10) {
        this.B0 = z10;
    }

    public final void d(boolean z10, bc bcVar) {
        if (!this.m1) {
            float f10 = this.f21249i1;
            if (f10 != 1.0f) {
                if (!z10) {
                    if (bcVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j10 = this.k1;
                        long j11 = currentTimeMillis - j10;
                        if (j10 == 0) {
                            j11 = 16;
                        }
                        if (j11 > 30 && g0.f22609r > 60.0f) {
                            j11 = 30;
                        }
                        this.f21249i1 = (((float) j11) / this.f21271t1) + this.f21249i1;
                    } else {
                        this.f21249i1 = (16.0f / this.f21271t1) + f10;
                    }
                    if (this.f21249i1 > 1.0f) {
                        this.f21249i1 = 1.0f;
                        this.f21251j1 = 1.0f;
                        if (this.D0 != null) {
                            S(2, null);
                            this.F0 = null;
                        }
                    }
                }
                if (bcVar != null) {
                    g0.h3(new a(this, 12));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(ec ecVar) {
        this.f21247h1 = ecVar;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == hs.f23267m4) {
            String str = (String) objArr[0];
            String str2 = this.f21248i0;
            if (str2 != null && str2.equals(str)) {
                this.f21248i0 = (String) objArr[1];
                ac acVar = (ac) objArr[2];
                this.f21244g0 = acVar;
                gc gcVar = this.F;
                if (gcVar != null) {
                    gcVar.f22698e = acVar;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                ac acVar2 = (ac) objArr[2];
                this.P = acVar2;
                gc gcVar2 = this.F;
                if (gcVar2 != null) {
                    gcVar2.f22695a = acVar2;
                }
            }
            String str4 = this.Z;
            if (str4 != null && str4.equals(str)) {
                this.Z = (String) objArr[1];
                ac acVar3 = (ac) objArr[2];
                this.X = acVar3;
                gc gcVar3 = this.F;
                if (gcVar3 != null) {
                    gcVar3.f22697c = acVar3;
                }
            }
        } else if (i3 == hs.f23249j1) {
            Integer num = (Integer) objArr[0];
            if (this.f21279x < num.intValue()) {
                int intValue = num.intValue() | this.E;
                this.E = intValue;
                if (intValue != 0) {
                    ch0 B = B();
                    if (B != null && B.z()) {
                        B.stop();
                    }
                    org.telegram.ui.Components.t5 m10 = m();
                    if (m10 != null) {
                        m10.stop();
                    }
                }
            }
        } else if (i3 == hs.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.f21279x < num2.intValue() && (i11 = this.E) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.E = i12;
                if (i12 == 0) {
                    ch0 B2 = B();
                    if (B2 != null) {
                        B2.F = this.f21270t0;
                    }
                    if (this.f21274v0 && B2 != null && B2.z()) {
                        B2.start();
                    }
                    org.telegram.ui.Components.t5 m11 = m();
                    if (this.f21272u0 && m11 != null) {
                        m11.j();
                        invalidate();
                    }
                }
            }
        }
    }

    public final void e() {
        if (this.f21233c != null) {
            if (this.f21284y1) {
                for (int i3 = 0; i3 < this.f21233c.size(); i3++) {
                    ArrayList arrayList = ((ei.w9) ((dc) this.f21233c.get(i3))).f11193a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((ei.s9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
            this.f21233c.clear();
        }
    }

    public final bc e0(bc bcVar, int i3) {
        ch0 ch0Var;
        bc bcVar2 = bcVar;
        if (bcVar == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.f21782y = new RectF();
            bcVar2 = obj;
        }
        bcVar2.d = i3;
        bcVar2.f21765f = m();
        bcVar2.f21766g = B();
        boolean z10 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            bcVar2.h[i10] = this.X0[i10];
        }
        bcVar2.f21768j = this.f21252k0;
        bcVar2.f21767i = this.f21253l0;
        bcVar2.f21770l = this.T;
        bcVar2.f21769k = this.U;
        bcVar2.f21771m = this.f21231b0;
        bcVar2.f21772n = this.f21234c0;
        bcVar2.f21764e = this.f21236d0;
        bcVar2.f21773o = this.f21256n0;
        bcVar2.f21781x = this.D0;
        bcVar2.f21783z = this.f21261p1;
        bcVar2.f21780w = this.C0;
        bcVar2.f21774p = this.f21249i1;
        bcVar2.f21775q = this.f21251j1;
        bcVar2.f21776r = this.F0;
        org.telegram.ui.Components.t5 t5Var = bcVar2.f21765f;
        if ((t5Var != null && !t5Var.s()) || ((ch0Var = bcVar2.f21766g) != null && !ch0Var.u())) {
            z10 = true;
        }
        bcVar2.f21761a = z10;
        bcVar2.f21779u = this.L0;
        bcVar2.v = this.M0;
        bcVar2.f21778t = this.N0;
        bcVar2.f21777s = this.O0;
        bcVar2.f21762b = this.f21240e1;
        return bcVar2;
    }

    public final void f() {
        for (int i3 = 0; i3 < 4; i3++) {
            S(i3, null);
        }
        zb.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.f21231b0) {
            this.f21234c0 = bitmapShader;
        } else if (drawable == this.f21256n0) {
            this.f21236d0 = bitmapShader;
        } else if (drawable == this.f21252k0) {
            this.f21253l0 = bitmapShader;
        } else if (drawable == this.T) {
            this.U = bitmapShader;
            if (this.I != null && (drawable instanceof BitmapDrawable)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.J = new ComposeShader(this.I, this.U, PorterDuff.Mode.DST_IN);
                    return;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                int width = bitmapDrawable.getBitmap().getWidth();
                int height = bitmapDrawable.getBitmap().getHeight();
                Bitmap bitmap = this.K;
                if (bitmap == null || bitmap.getWidth() != width || this.K.getHeight() != height) {
                    Bitmap bitmap2 = this.K;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.K = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    this.M = new Canvas(this.K);
                    Bitmap bitmap3 = this.K;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.L = new BitmapShader(bitmap3, tileMode, tileMode);
                    if (this.N == null) {
                        Paint paint = new Paint();
                        this.N = paint;
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
        if (this.G1 != z10) {
            this.G1 = z10;
            this.f21274v0 = !z10;
            ch0 B = B();
            if (B != null) {
                if (z10) {
                    B.stop();
                } else if (!B.f32734l0) {
                    B.start();
                }
            }
        }
    }

    public float getAlpha() {
        return this.f21240e1;
    }

    public final boolean h(android.graphics.Canvas r32, org.telegram.messenger.bc r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, org.telegram.messenger.bc):boolean");
    }

    public final void h0(int i3) {
        if (this.f21276w != i3) {
            this.f21276w = i3;
            if (this.f21284y1 && K()) {
                zb D = zb.D();
                D.f26773s.c(new k7(D, this, this.f21276w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, bc bcVar, int i3) {
        if (bcVar != null) {
            if (bitmapDrawable instanceof ch0) {
                ch0 ch0Var = (ch0) bitmapDrawable;
                float f10 = bcVar.f21779u;
                float f11 = bcVar.v;
                float f12 = bcVar.f21778t;
                float f13 = bcVar.f21777s;
                ColorFilter colorFilter = bcVar.f21783z;
                int i10 = bcVar.d;
                Paint[] paintArr = ch0Var.f32733k0;
                RectF[] rectFArr = ch0Var.f32732j0;
                if (rectFArr[i10] == null) {
                    rectFArr[i10] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i10] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i10].setAlpha(i3);
                paintArr[i10].setColorFilter(colorFilter);
                rectFArr[i10].set(f10, f11, f10 + f12, f13 + f11);
                ch0Var.q(canvas, null, true, 0L, i10);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
                float f14 = bcVar.f21779u;
                float f15 = bcVar.v;
                float f16 = bcVar.f21778t;
                float f17 = bcVar.f21777s;
                ColorFilter colorFilter2 = bcVar.f21783z;
                int i11 = bcVar.d;
                Paint[] paintArr2 = t5Var.f38275r0;
                RectF[] rectFArr2 = t5Var.f38273q0;
                if (rectFArr2[i11] == null) {
                    rectFArr2[i11] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i11] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i11].setAlpha(i3);
                paintArr2[i11].setColorFilter(colorFilter2);
                rectFArr2[i11].set(f14, f15, f16 + f14, f17 + f15);
                t5Var.l(canvas, true, 0L, i11);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    if (bcVar.A == null) {
                        bcVar.A = new Paint(1);
                    }
                    bcVar.A.setAlpha(i3);
                    bcVar.A.setColorFilter(bcVar.f21783z);
                    canvas.save();
                    canvas.translate(bcVar.f21779u, bcVar.v);
                    canvas.scale(bcVar.f21778t / bitmap.getWidth(), bcVar.f21777s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, bcVar.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i3);
        if (bitmapDrawable instanceof ch0) {
            ((ch0) bitmapDrawable).q(canvas, null, false, this.f21267s, 0);
        } else if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) bitmapDrawable).l(canvas, false, this.f21267s, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.f21238e;
        if (view == null) {
            return;
        }
        if (this.K0) {
            view.invalidate();
            return;
        }
        float f10 = this.L0;
        float f11 = this.M0;
        view.invalidate((int) f10, (int) f11, (int) (f10 + this.N0), (int) (f11 + this.O0));
    }

    public final void j(android.graphics.Canvas r42, android.graphics.drawable.Drawable r43, int r44, android.graphics.BitmapShader r45, int r46, int r47, int r48, org.telegram.messenger.bc r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, org.telegram.messenger.bc):void");
    }

    public final void j0(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j0(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public final void k(Canvas canvas, Drawable drawable, int i3, BitmapShader bitmapShader, int i10, int i11, bc bcVar) {
        if (this.f21243f1 == 0) {
            float f10 = this.f21273u1;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.f21273u1 = f11;
                if (f11 < 0.0f) {
                    this.f21273u1 = 0.0f;
                }
                invalidate();
            }
        }
        int i12 = this.f21243f1;
        if (i12 != 0) {
            this.f21273u1 = 1.0f;
            this.f21275v1 = i12;
        }
        float f12 = this.f21273u1;
        if (f12 != 0.0f && f12 != 1.0f) {
            j(canvas, drawable, i3, bitmapShader, i10, i11, i12, bcVar);
            j(canvas, drawable, (int) (i3 * this.f21273u1), bitmapShader, i10, i11, this.f21275v1, bcVar);
            return;
        }
        j(canvas, drawable, i3, bitmapShader, i10, i11, i12, bcVar);
    }

    public final void k0() {
        this.f21264r = false;
    }

    public final org.telegram.ui.Components.g5 l() {
        Drawable drawable = this.f21252k0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable2;
        }
        Drawable drawable3 = this.f21231b0;
        if (drawable3 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable3;
        }
        Drawable drawable4 = this.f21256n0;
        if (drawable4 instanceof org.telegram.ui.Components.g5) {
            return (org.telegram.ui.Components.g5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z10) {
        this.T0 = z10;
    }

    public final org.telegram.ui.Components.t5 m() {
        Drawable drawable = this.f21252k0;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable2;
        }
        Drawable drawable3 = this.f21231b0;
        if (drawable3 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable3;
        }
        Drawable drawable4 = this.f21256n0;
        if (drawable4 instanceof org.telegram.ui.Components.t5) {
            return (org.telegram.ui.Components.t5) drawable4;
        }
        return null;
    }

    public final void m0(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.I == null || this.H != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.I = new BitmapShader(bitmap, tileMode, tileMode);
                R0(this.T);
            }
            this.Y0 = true;
        } else {
            this.I = null;
            this.J = null;
            this.L = null;
            this.M = null;
            Bitmap bitmap2 = this.K;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.K = null;
            }
        }
        this.H = bitmap;
    }

    public final Bitmap n() {
        ch0 B = B();
        if (B != null && B.u()) {
            if (B.R != null) {
                return B.R;
            }
            if (B.S == null) {
                return null;
            }
            return B.S;
        }
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.f21252k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.f21231b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.f21256n0;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public final void n0(int i3, long j10, Object obj, String str, String str2, String str3, ac acVar, ac acVar2) {
        r0(acVar, str, acVar2, str2, null, j10, str3, obj, i3);
    }

    public final int o() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            int i3 = this.V;
            if (i3 % 360 != 0 && i3 % 360 != 180) {
                return m10.getIntrinsicWidth();
            }
            return m10.getIntrinsicHeight();
        }
        ch0 B = B();
        if (B != null) {
            return B.f32722c;
        }
        Bitmap n4 = n();
        if (n4 == null) {
            Drawable drawable = this.f21256n0;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i10 = this.V;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n4.getWidth();
        }
        return n4.getHeight();
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j10) {
        r0(ac.g(str), str2, null, null, drawable, j10, str3, null, 1);
    }

    public final org.telegram.messenger.cc p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():org.telegram.messenger.cc");
    }

    public final void p0(ac acVar, String str, Drawable drawable, long j10, String str2, Object obj, int i3) {
        r0(acVar, str, null, null, drawable, j10, str2, obj, i3);
    }

    public final int q() {
        org.telegram.ui.Components.t5 m10 = m();
        if (m10 != null) {
            int i3 = this.V;
            if (i3 % 360 != 0 && i3 % 360 != 180) {
                return m10.getIntrinsicHeight();
            }
            return m10.getIntrinsicWidth();
        }
        ch0 B = B();
        if (B != null) {
            return B.f32720b;
        }
        Bitmap n4 = n();
        if (n4 == null) {
            Drawable drawable = this.f21256n0;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i10 = this.V;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n4.getHeight();
        }
        return n4.getWidth();
    }

    public final void q0(ac acVar, String str, Drawable drawable, String str2, Object obj, int i3) {
        r0(acVar, str, null, null, drawable, 0L, str2, obj, i3);
    }

    public final float r() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void r0(ac acVar, String str, ac acVar2, String str2, Drawable drawable, long j10, String str3, Object obj, int i3) {
        u0(null, null, acVar, str, acVar2, str2, drawable, j10, str3, obj, i3);
    }

    public final float s() {
        return (this.O0 / 2.0f) + this.M0;
    }

    public final void s0(ac acVar, String str, ac acVar2, String str2, Drawable drawable, Object obj, int i3) {
        u0(null, null, acVar, str, acVar2, str2, drawable, 0L, null, obj, i3);
    }

    public void setAlpha(float f10) {
        this.f21240e1 = f10;
    }

    public final Drawable t() {
        Drawable drawable = this.f21252k0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.f21231b0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.f21256n0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(ac acVar, String str, ac acVar2, String str2, String str3, Object obj, int i3) {
        r0(acVar, str, acVar2, str2, null, 0L, str3, obj, i3);
    }

    public final cc u() {
        String str;
        String str2;
        Drawable drawable = this.f21252k0;
        cc ccVar = 0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
            str = this.f21248i0;
        } else {
            Drawable drawable2 = this.T;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
                str2 = this.R;
            } else {
                drawable2 = this.f21231b0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.t5) && !(drawable instanceof ch0)) {
                    str2 = this.Z;
                } else {
                    drawable = this.f21256n0;
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
            ccVar = new Object();
            ccVar.d = drawable;
            ccVar.f22005a = str;
            ccVar.f22008e = 0;
            if (str != null) {
                zb.D().H(ccVar.f22005a);
            }
        }
        return ccVar;
    }

    public final void u0(org.telegram.messenger.ac r20, java.lang.String r21, org.telegram.messenger.ac r22, java.lang.String r23, org.telegram.messenger.ac r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.u0(org.telegram.messenger.ac, java.lang.String, org.telegram.messenger.ac, java.lang.String, org.telegram.messenger.ac, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
    }

    public final float v() {
        return this.O0;
    }

    public final void v0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = null;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        }
        w0(bitmapDrawable);
    }

    public final float w() {
        return this.N0;
    }

    public final void w0(Drawable drawable) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        zb.D().h(this, true);
        if (this.B0) {
            if (this.T != null) {
                S(1, null);
                S(2, null);
                S(3, null);
                this.F0 = this.U;
                this.D0 = this.T;
                this.E0 = this.R;
                this.C0 = true;
            } else if (this.f21231b0 != null) {
                S(0, null);
                S(2, null);
                S(3, null);
                this.F0 = this.f21234c0;
                this.D0 = this.f21231b0;
                this.E0 = this.Z;
                this.C0 = true;
            } else if (this.f21256n0 != null) {
                S(0, null);
                S(1, null);
                S(2, null);
                S(3, null);
                this.F0 = this.f21236d0;
                this.D0 = this.f21256n0;
                this.C0 = true;
                this.E0 = null;
            } else {
                for (int i3 = 0; i3 < 4; i3++) {
                    S(i3, null);
                }
                this.F0 = null;
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
        }
        Drawable drawable2 = this.f21256n0;
        if (drawable2 instanceof oi0) {
            eb0 eb0Var = (eb0) ((oi0) drawable2);
            z5.q(eb0Var.f33340r.I1).v(eb0Var);
            eb0Var.f33339n = null;
            eb0Var.f33340r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.g5) {
            org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) drawable;
            if (this.f21284y1) {
                g5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) drawable;
            View view = this.f21238e;
            if (t5Var.f38277s0 == null) {
                t5Var.f38277s0 = new WeakReference(view);
            }
            if (this.f21284y1) {
                t5Var.e(this);
            }
            if (!this.f21277w0 && !t5Var.f38271o0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!t5Var.f38271o0) {
                t5Var.f38282w0 = z10;
            }
            if (this.f21272u0 && this.E == 0) {
                t5Var.j();
            }
            boolean z13 = this.f21280x0;
            t5Var.E = z13;
            if (z13) {
                t5Var.x(false);
            }
        } else if (drawable instanceof ch0) {
            ch0 ch0Var = (ch0) drawable;
            if (this.f21284y1) {
                ch0Var.J0.add(this);
            }
            ch0Var.F = this.f21270t0;
            if (this.f21274v0 && (!ch0Var.z() || this.E == 0)) {
                ch0Var.start();
            }
            ch0Var.J(true);
        }
        this.f21236d0 = null;
        this.f21234c0 = null;
        this.f21229a1.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f21244g0 = null;
        this.f21246h0 = null;
        Drawable drawable3 = this.f21252k0;
        if (drawable3 instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable3).v(this);
        }
        this.f21252k0 = null;
        this.f21248i0 = null;
        this.f21253l0 = null;
        this.P = null;
        this.Q = null;
        this.T = null;
        this.R = null;
        this.U = null;
        this.J = null;
        this.L = null;
        this.M = null;
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.J0 = false;
        this.f21258o0 = null;
        this.f21265r0 = 0L;
        this.f21268s0 = 0;
        this.f21249i1 = 1.0f;
        this.f21251j1 = 1.0f;
        gc gcVar = this.F;
        if (gcVar != null) {
            gcVar.f22695a = null;
            gcVar.f22697c = null;
            gcVar.f22698e = null;
            gcVar.f22700g = null;
        }
        ec ecVar = this.f21247h1;
        if (ecVar != null) {
            if (this.f21231b0 == null && this.f21256n0 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            ecVar.l0(this, z11, true, false);
        }
        invalidate();
        if (this.V0 && this.B0 && this.D0 != null) {
            this.f21249i1 = 0.0f;
            this.k1 = System.currentTimeMillis();
            if (this.f21231b0 == null && this.f21256n0 == null) {
                z12 = false;
            }
            this.f21257n1 = z12;
        }
    }

    public final float x() {
        return this.L0;
    }

    public boolean x0(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.x0(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public final float y() {
        return this.L0 + this.N0;
    }

    public final void y0(float f10, float f11, float f12, float f13) {
        this.L0 = f10;
        this.M0 = f11;
        this.N0 = f12;
        this.O0 = f13;
    }

    public final float z() {
        return this.M0;
    }

    public final void z0(Rect rect) {
        if (rect != null) {
            this.L0 = rect.left;
            this.M0 = rect.top;
            this.N0 = rect.width();
            this.O0 = rect.height();
        }
    }
}
