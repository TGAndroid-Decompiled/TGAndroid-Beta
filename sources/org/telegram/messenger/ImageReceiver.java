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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.vb0;
public class ImageReceiver implements fs, org.telegram.ui.Components.v5 {
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
    public xi.e E1;
    public lc F;
    public BitmapShader F0;
    public fi.a4 F1;
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
    public fc O;
    public float O0;
    public fc P;
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
    public fc X;
    public String Y;
    public String Z;
    public Integer Z0;
    public List f22647a;
    public int f22648a0;
    public boolean f22650b;
    public Drawable f22651b0;
    public ArrayList f22653c;
    public BitmapShader f22654c0;
    public BitmapShader f22656d0;
    public View f22658e;
    public int f22659e0;
    public int f22661f;
    public int f22662f0;
    public int f22663f1;
    public fc f22664g0;
    public boolean f22665g1;
    public Object h;
    public String f22666h0;
    public jc f22667h1;
    public String f22668i0;
    public float f22669i1;
    public int f22670j0;
    public Drawable f22672k0;
    public long f22673k1;
    public BitmapShader f22674l0;
    public boolean f22675m1;
    public boolean f22676n;
    public Drawable f22677n0;
    public boolean n1;
    public String f22678o0;
    public boolean f22680p0;
    public ColorFilter f22681p1;
    public int f22682q0;
    public boolean f22683q1;
    public boolean f22684r;
    public long f22685r0;
    public long f22686r1;
    public long f22687s;
    public int f22688s0;
    public long f22689s1;
    public float f22693u1;
    public int f22695v1;
    public boolean f22697w0;
    public String f22698w1;
    public int f22699x;
    public boolean f22700x0;
    public boolean f22702y;
    public boolean f22704y1;
    public boolean f22706z1;
    public int f22696w = 1;
    public boolean m0 = true;
    public boolean f22690t0 = true;
    public boolean f22692u0 = true;
    public boolean f22694v0 = true;
    public int f22703y0 = 1;
    public int f22705z0 = -1;
    public final RectF Q0 = new RectF();
    public boolean R0 = true;
    public boolean W0 = true;
    public final int[] X0 = new int[4];
    public boolean Y0 = true;
    public final RectF f22652b1 = new RectF();
    public final Matrix f22655c1 = new Matrix();
    public final Path f22657d1 = new Path();
    public float f22660e1 = 1.0f;
    public float f22671j1 = 1.0f;
    public byte l1 = 1;
    public float f22679o1 = 0.05f;
    public int f22691t1 = 150;
    public final ArrayList f22701x1 = new ArrayList();
    public boolean A1 = false;
    public boolean C1 = true;
    public final Paint f22649a1 = new Paint(3);
    public int d = j10.f24798t0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        H1 = new PorterDuffColorFilter(-2236963, mode);
        I1 = new PorterDuffColorFilter(-4473925, mode);
        J1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.f22658e = view;
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

    public final oh0 B() {
        Drawable drawable = this.f22672k0;
        if (drawable instanceof oh0) {
            return (oh0) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof oh0) {
            return (oh0) drawable2;
        }
        Drawable drawable3 = this.f22651b0;
        if (drawable3 instanceof oh0) {
            return (oh0) drawable3;
        }
        Drawable drawable4 = this.f22677n0;
        if (drawable4 instanceof oh0) {
            return (oh0) drawable4;
        }
        return null;
    }

    public final void B0(int i7) {
        this.N0 = i7;
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

    public final void E0(int i7) {
        this.f22699x = i7;
        if (this.f22704y1) {
            this.E = ks.e().f25279p & (~this.f22699x);
        }
    }

    public final Drawable F() {
        return this.f22677n0;
    }

    public final void F0(long j3, long j10) {
        this.f22686r1 = j3;
        this.f22689s1 = j10;
        Drawable drawable = this.f22672k0;
        if (drawable instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable).C(j3, j10);
        }
    }

    public final int G(int i7) {
        if (i7 == 1) {
            return this.f22648a0;
        }
        if (i7 == 3) {
            return this.f22670j0;
        }
        return this.S;
    }

    public final void G0(int i7, int i10, boolean z10) {
        while (i7 < 0) {
            i7 += 360;
        }
        while (i7 > 360) {
            i7 -= 360;
        }
        this.f22659e0 = i7;
        this.V = i7;
        this.f22662f0 = i10;
        this.W = i10;
        this.f22665g1 = z10;
    }

    public final boolean H() {
        return this.R0;
    }

    public final void H0(View view) {
        this.f22658e = view;
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null && this.f22704y1) {
            View view2 = this.f22658e;
            if (m10.f34098s0 == null) {
                m10.f34098s0 = new WeakReference(view2);
            }
        }
    }

    public final boolean I() {
        if (this.T == null && this.f22651b0 == null && this.f22677n0 == null && this.f22672k0 == null) {
            return false;
        }
        return true;
    }

    public final void I0(int i7) {
        this.f22663f1 = i7;
    }

    public final boolean J() {
        if (this.T == null && this.f22672k0 == null) {
            return false;
        }
        return true;
    }

    public final void J0(int i7) {
        L0(new int[]{i7, i7, i7, i7});
    }

    public final boolean K() {
        if (this.T == null && this.f22672k0 == null && this.f22651b0 == null && this.f22677n0 == null && this.R == null && this.f22668i0 == null) {
            return false;
        }
        return true;
    }

    public final void K0(int i7, int i10, int i11, int i12) {
        L0(new int[]{i7, i10, i11, i12});
    }

    public final boolean L() {
        if (this.T == null && this.f22672k0 == null && !(this.f22677n0 instanceof t51)) {
            return false;
        }
        return true;
    }

    public void L0(int[] iArr) {
        int i7 = iArr[0];
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
            if (i7 != i12) {
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
            Drawable drawable2 = this.f22672k0;
            if (drawable2 != null && this.f22674l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f22651b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.f22677n0;
            if (drawable4 != null) {
                R0(drawable4);
            }
        }
    }

    public final boolean M() {
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null && m10.f34078c0) {
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
            Drawable drawable2 = this.f22672k0;
            if (drawable2 != null && this.f22674l0 == null) {
                R0(drawable2);
            }
            Drawable drawable3 = this.f22651b0;
            if (drawable3 != null) {
                R0(drawable3);
            }
            Drawable drawable4 = this.f22677n0;
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
        org.telegram.ui.Components.w6 w6Var;
        Drawable drawable2 = this.f22677n0;
        if (drawable != drawable2) {
            if (drawable2 instanceof org.telegram.ui.Components.w6) {
                if (!drawable2.equals(drawable)) {
                    w6Var = (org.telegram.ui.Components.w6) this.f22677n0;
                } else {
                    return;
                }
            } else {
                w6Var = null;
            }
            this.f22677n0 = drawable;
            if (this.f22704y1 && (drawable instanceof org.telegram.ui.Components.w6)) {
                ((org.telegram.ui.Components.w6) drawable).c(this);
            }
            if (this.f22704y1 && w6Var != null) {
                w6Var.b(this);
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
                fi.a4 a4Var = this.F1;
                if (a4Var != null) {
                    a4Var.run();
                }
            }
        }
    }

    public final boolean P() {
        if (!this.f22704y1) {
            this.f22704y1 = true;
            this.E = ks.e().f25279p & (~this.f22699x);
            boolean z10 = this.f22702y;
            int i7 = ks.f25163j1;
            if (!z10) {
                xi.e eVar = this.E1;
                if (eVar != null) {
                    eVar.b();
                    this.E1 = null;
                }
                xi.e eVar2 = (xi.e) new js(ks.e(), this).f24947b;
                eVar2.c(ks.f25197p4);
                eVar2.c(i7);
                eVar2.c(ks.f25168k1);
                this.E1 = eVar2;
            }
            if (Y()) {
                return true;
            }
            oh0 B = B();
            if (B != null) {
                B.J0.add(this);
                B.F = this.f22690t0;
            }
            if (B != null && this.f22694v0 && (!B.z() || this.E == 0)) {
                B.start();
            }
            org.telegram.ui.Components.c6 m10 = m();
            if (m10 != null) {
                m10.e(this);
            }
            if (m10 != null && this.f22692u0 && this.E == 0) {
                m10.j();
                invalidate();
            }
            org.telegram.ui.Components.p5 l10 = l();
            if (l10 != null) {
                l10.b(this);
            }
            if (ks.e().g()) {
                didReceivedNotification(i7, this.d, 512);
            }
            Drawable drawable = this.f22677n0;
            if (drawable instanceof org.telegram.ui.Components.w6) {
                ((org.telegram.ui.Components.w6) drawable).c(this);
            }
            if (this.f22653c != null) {
                for (int i10 = 0; i10 < this.f22653c.size(); i10++) {
                    ((ic) this.f22653c.get(i10)).a(this);
                }
            }
        }
        return false;
    }

    public final void P0(boolean z10) {
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null) {
            boolean z11 = this.f22697w0;
            if (!m10.f34092o0) {
                m10.f34103w0 = z11;
            }
            m10.start();
            return;
        }
        oh0 B = B();
        if (B != null && !B.f38226l0) {
            B.H(z10);
        }
    }

    public final void Q(Drawable drawable) {
        if (drawable == this.f22672k0 && this.f22668i0 != null) {
            ec.D().Q(this.f22668i0);
            this.f22668i0 = null;
        } else if (drawable == this.T && this.R != null) {
            ec.D().Q(this.R);
            this.R = null;
        } else if (drawable == this.f22651b0 && this.Z != null) {
            ec.D().Q(this.Z);
            this.Z = null;
        }
        u0(this.f22664g0, this.f22666h0, this.P, this.Q, this.X, this.Y, this.f22651b0, this.f22685r0, this.f22678o0, this.h, this.f22688s0);
    }

    public final void Q0() {
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null) {
            m10.stop();
            return;
        }
        oh0 B = B();
        if (B != null) {
            B.stop();
        }
    }

    public final void R() {
        xi.e eVar;
        if (this.f22704y1) {
            this.f22704y1 = false;
            fc fcVar = this.P;
            if (fcVar != null || this.f22664g0 != null || this.X != null || this.f22677n0 != null) {
                if (this.F == null) {
                    this.F = new Object();
                }
                lc lcVar = this.F;
                lcVar.f25386e = this.f22664g0;
                lcVar.f25387f = this.f22666h0;
                lcVar.f25383a = fcVar;
                lcVar.f25384b = this.Q;
                lcVar.f25385c = this.X;
                lcVar.d = this.Y;
                lcVar.f25388g = this.f22677n0;
                lcVar.h = this.f22685r0;
                lcVar.f25391k = this.f22678o0;
                lcVar.f25389i = this.f22688s0;
                lcVar.f25390j = this.h;
            }
            if (!this.f22702y && (eVar = this.E1) != null) {
                eVar.b();
                this.E1 = null;
            }
            Drawable drawable = this.f22677n0;
            if (drawable instanceof org.telegram.ui.Components.w6) {
                ((org.telegram.ui.Components.w6) drawable).b(this);
            }
            if (this.f22677n0 != null) {
                N0(null);
                this.f22656d0 = null;
            }
            f();
            this.f22649a1.setShader(null);
            if (this.f22663f1 == 0) {
                this.f22693u1 = 0.0f;
            }
            org.telegram.ui.Components.p5 l10 = l();
            if (l10 != null) {
                l10.o(this);
            }
            org.telegram.ui.Components.c6 m10 = m();
            if (m10 != null) {
                m10.v(this);
            }
            oh0 B = B();
            if (B != null) {
                B.F(this);
            }
            if (this.f22653c != null) {
                for (int i7 = 0; i7 < this.f22653c.size(); i7++) {
                    ArrayList arrayList = ((fi.k9) ((ic) this.f22653c.get(i7))).f12240a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((fi.g9) arrayList.get(i10)).b(false);
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
            if (drawable instanceof org.telegram.ui.Components.eq) {
                org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) drawable;
                float f10 = E[0];
                float f11 = E[1];
                float f12 = E[2];
                float f13 = E[3];
                float[] fArr = eqVar.f34966f;
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
                eqVar.f34965e = z10;
                eqVar.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.b9)) {
                f0(drawable, null);
            } else if (drawable instanceof org.telegram.ui.Components.b9) {
                ((org.telegram.ui.Components.b9) drawable).f33811r = E[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof oh0)) {
                    if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                        ((org.telegram.ui.Components.c6) drawable).B(E);
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
            str2 = this.f22668i0;
            drawable = this.f22672k0;
        } else if (i7 == 2) {
            str2 = this.E0;
            drawable = this.D0;
        } else if (i7 == 1) {
            str2 = this.Z;
            drawable = this.f22651b0;
        } else {
            str2 = this.R;
            drawable = this.T;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) ec.D().f23721t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof oh0) {
            ((oh0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).o(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof oh0) {
                oh0 oh0Var = (oh0) drawable;
                boolean p10 = ec.D().p(str2);
                if (!ec.D().J(str2, true) && p10) {
                    oh0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.c6) {
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
                if (c6Var.f34092o0) {
                    boolean p11 = ec.D().p(str2);
                    if (!ec.D().J(str2, true)) {
                        if (p11) {
                            c6Var.u();
                        }
                    } else if (p11) {
                        c6Var.stop();
                    }
                } else if (c6Var.f34100u0.isEmpty()) {
                    c6Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean p12 = ec.D().p(str2);
                if (!ec.D().J(str2, false) && p12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    g0.A2(arrayList);
                }
            }
        }
        if (i7 == 3) {
            this.f22668i0 = null;
            this.f22672k0 = null;
            this.f22674l0 = null;
        } else if (i7 == 2) {
            this.E0 = null;
            this.D0 = null;
            this.F0 = null;
        } else if (i7 == 1) {
            this.f22651b0 = null;
            this.Z = null;
            this.f22654c0 = null;
        } else {
            this.T = null;
            this.R = null;
            this.U = null;
        }
    }

    public final void T(boolean z10) {
        this.f22700x0 = z10;
    }

    public final void U(boolean z10) {
        this.f22692u0 = z10;
    }

    public final void V(boolean z10) {
        this.S0 = false;
    }

    public final void W(int i7) {
        this.f22703y0 = i7;
        oh0 B = B();
        if (B != null) {
            B.K(i7);
        }
    }

    public final void X(int i7) {
        this.f22705z0 = i7;
        if (B() != null) {
            B().M = i7;
            return;
        }
        this.D1 = i7;
        if (m() != null) {
            m().f34108z0 = 0;
        }
    }

    public final boolean Y() {
        lc lcVar = this.F;
        if (lcVar != null) {
            if (lcVar.f25383a != null || lcVar.f25385c != null || lcVar.f25386e != null || lcVar.f25388g != null) {
                this.F = null;
                Drawable drawable = lcVar.f25388g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof oh0) && !(bitmapDrawable instanceof org.telegram.ui.Components.c6) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        lcVar.f25388g = null;
                    }
                }
                u0(lcVar.f25386e, lcVar.f25387f, lcVar.f25383a, lcVar.f25384b, lcVar.f25385c, lcVar.d, lcVar.f25388g, lcVar.h, lcVar.f25391k, lcVar.f25390j, lcVar.f25389i);
                lcVar.f25383a = null;
                lcVar.f25385c = null;
                lcVar.f25386e = null;
                lcVar.f25388g = null;
                this.F = lcVar;
                oh0 B = B();
                if (B != null) {
                    B.F = this.f22690t0;
                }
                if (B != null && this.f22694v0) {
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

    public final void a(fi.k9 k9Var) {
        if (this.f22653c == null) {
            this.f22653c = new ArrayList();
        }
        this.f22653c.add(k9Var);
        if (this.f22704y1) {
            k9Var.a(this);
        }
    }

    public final void a0(ColorFilter colorFilter) {
        this.f22681p1 = colorFilter;
    }

    public final void b() {
        ec D = ec.D();
        D.f23720s.c(new l7(D, this, this.f22696w, 3));
    }

    public final void b0(int i7) {
        this.f22691t1 = i7;
    }

    public final void c() {
        this.f22684r = false;
        ec.D().h(this, true);
        this.f22676n = true;
    }

    public final void c0(boolean z10) {
        this.B0 = z10;
    }

    public final void d(boolean z10, gc gcVar) {
        if (!this.f22675m1) {
            float f10 = this.f22669i1;
            if (f10 != 1.0f) {
                if (!z10) {
                    if (gcVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = this.f22673k1;
                        long j10 = currentTimeMillis - j3;
                        if (j3 == 0) {
                            j10 = 16;
                        }
                        if (j10 > 30 && g0.f24147r > 60.0f) {
                            j10 = 30;
                        }
                        this.f22669i1 = (((float) j10) / this.f22691t1) + this.f22669i1;
                    } else {
                        this.f22669i1 = (16.0f / this.f22691t1) + f10;
                    }
                    if (this.f22669i1 > 1.0f) {
                        this.f22669i1 = 1.0f;
                        this.f22671j1 = 1.0f;
                        if (this.D0 != null) {
                            S(2, null);
                            this.F0 = null;
                        }
                    }
                }
                if (gcVar != null) {
                    g0.g3(new a(this, 13));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(jc jcVar) {
        this.f22667h1 = jcVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == ks.f25197p4) {
            String str = (String) objArr[0];
            String str2 = this.f22668i0;
            if (str2 != null && str2.equals(str)) {
                this.f22668i0 = (String) objArr[1];
                fc fcVar = (fc) objArr[2];
                this.f22664g0 = fcVar;
                lc lcVar = this.F;
                if (lcVar != null) {
                    lcVar.f25386e = fcVar;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                fc fcVar2 = (fc) objArr[2];
                this.P = fcVar2;
                lc lcVar2 = this.F;
                if (lcVar2 != null) {
                    lcVar2.f25383a = fcVar2;
                }
            }
            String str4 = this.Z;
            if (str4 != null && str4.equals(str)) {
                this.Z = (String) objArr[1];
                fc fcVar3 = (fc) objArr[2];
                this.X = fcVar3;
                lc lcVar3 = this.F;
                if (lcVar3 != null) {
                    lcVar3.f25385c = fcVar3;
                }
            }
        } else if (i7 == ks.f25163j1) {
            Integer num = (Integer) objArr[0];
            if (this.f22699x < num.intValue()) {
                int intValue = num.intValue() | this.E;
                this.E = intValue;
                if (intValue != 0) {
                    oh0 B = B();
                    if (B != null && B.z()) {
                        B.stop();
                    }
                    org.telegram.ui.Components.c6 m10 = m();
                    if (m10 != null) {
                        m10.stop();
                    }
                }
            }
        } else if (i7 == ks.f25168k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.f22699x < num2.intValue() && (i11 = this.E) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.E = i12;
                if (i12 == 0) {
                    oh0 B2 = B();
                    if (B2 != null) {
                        B2.F = this.f22690t0;
                    }
                    if (this.f22694v0 && B2 != null && B2.z()) {
                        B2.start();
                    }
                    org.telegram.ui.Components.c6 m11 = m();
                    if (this.f22692u0 && m11 != null) {
                        m11.j();
                        invalidate();
                    }
                }
            }
        }
    }

    public final void e() {
        if (this.f22653c != null) {
            if (this.f22704y1) {
                for (int i7 = 0; i7 < this.f22653c.size(); i7++) {
                    ArrayList arrayList = ((fi.k9) ((ic) this.f22653c.get(i7))).f12240a;
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((fi.g9) arrayList.get(i10)).b(false);
                        }
                    }
                }
            }
            this.f22653c.clear();
        }
    }

    public final gc e0(gc gcVar, int i7) {
        oh0 oh0Var;
        gc gcVar2 = gcVar;
        if (gcVar == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.f24239y = new RectF();
            gcVar2 = obj;
        }
        gcVar2.d = i7;
        gcVar2.f24222f = m();
        gcVar2.f24223g = B();
        boolean z10 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            gcVar2.h[i10] = this.X0[i10];
        }
        gcVar2.f24225j = this.f22672k0;
        gcVar2.f24224i = this.f22674l0;
        gcVar2.f24227l = this.T;
        gcVar2.f24226k = this.U;
        gcVar2.f24228m = this.f22651b0;
        gcVar2.f24229n = this.f22654c0;
        gcVar2.f24221e = this.f22656d0;
        gcVar2.f24230o = this.f22677n0;
        gcVar2.f24238x = this.D0;
        gcVar2.f24240z = this.f22681p1;
        gcVar2.f24237w = this.C0;
        gcVar2.f24231p = this.f22669i1;
        gcVar2.f24232q = this.f22671j1;
        gcVar2.f24233r = this.F0;
        org.telegram.ui.Components.c6 c6Var = gcVar2.f24222f;
        if ((c6Var != null && !c6Var.s()) || ((oh0Var = gcVar2.f24223g) != null && !oh0Var.u())) {
            z10 = true;
        }
        gcVar2.f24218a = z10;
        gcVar2.f24236u = this.L0;
        gcVar2.v = this.M0;
        gcVar2.f24235t = this.N0;
        gcVar2.f24234s = this.O0;
        gcVar2.f24219b = this.f22660e1;
        return gcVar2;
    }

    public final void f() {
        for (int i7 = 0; i7 < 4; i7++) {
            S(i7, null);
        }
        ec.D().h(this, true);
    }

    public final void f0(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.f22651b0) {
            this.f22654c0 = bitmapShader;
        } else if (drawable == this.f22677n0) {
            this.f22656d0 = bitmapShader;
        } else if (drawable == this.f22672k0) {
            this.f22674l0 = bitmapShader;
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
            this.f22694v0 = !z10;
            oh0 B = B();
            if (B != null) {
                if (z10) {
                    B.stop();
                } else if (!B.f38226l0) {
                    B.start();
                }
            }
        }
    }

    public float getAlpha() {
        return this.f22660e1;
    }

    public final boolean h(android.graphics.Canvas r32, org.telegram.messenger.gc r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, org.telegram.messenger.gc):boolean");
    }

    public final void h0(int i7) {
        if (this.f22696w != i7) {
            this.f22696w = i7;
            if (this.f22704y1 && K()) {
                ec D = ec.D();
                D.f23720s.c(new l7(D, this, this.f22696w, 3));
            }
        }
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, gc gcVar, int i7) {
        if (gcVar != null) {
            if (bitmapDrawable instanceof oh0) {
                oh0 oh0Var = (oh0) bitmapDrawable;
                float f10 = gcVar.f24236u;
                float f11 = gcVar.v;
                float f12 = gcVar.f24235t;
                float f13 = gcVar.f24234s;
                ColorFilter colorFilter = gcVar.f24240z;
                int i10 = gcVar.d;
                Paint[] paintArr = oh0Var.f38225k0;
                RectF[] rectFArr = oh0Var.f38224j0;
                if (rectFArr[i10] == null) {
                    rectFArr[i10] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i10] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i10].setAlpha(i7);
                paintArr[i10].setColorFilter(colorFilter);
                rectFArr[i10].set(f10, f11, f10 + f12, f13 + f11);
                oh0Var.q(canvas, null, true, 0L, i10);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) bitmapDrawable;
                float f14 = gcVar.f24236u;
                float f15 = gcVar.v;
                float f16 = gcVar.f24235t;
                float f17 = gcVar.f24234s;
                ColorFilter colorFilter2 = gcVar.f24240z;
                int i11 = gcVar.d;
                Paint[] paintArr2 = c6Var.f34096r0;
                RectF[] rectFArr2 = c6Var.f34094q0;
                if (rectFArr2[i11] == null) {
                    rectFArr2[i11] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i11] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i11].setAlpha(i7);
                paintArr2[i11].setColorFilter(colorFilter2);
                rectFArr2[i11].set(f14, f15, f16 + f14, f17 + f15);
                c6Var.l(canvas, true, 0L, i11);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    if (gcVar.A == null) {
                        gcVar.A = new Paint(1);
                    }
                    gcVar.A.setAlpha(i7);
                    gcVar.A.setColorFilter(gcVar.f24240z);
                    canvas.save();
                    canvas.translate(gcVar.f24236u, gcVar.v);
                    canvas.scale(gcVar.f24235t / bitmap.getWidth(), gcVar.f24234s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, gcVar.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i7);
        if (bitmapDrawable instanceof oh0) {
            ((oh0) bitmapDrawable).q(canvas, null, false, this.f22687s, 0);
        } else if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) bitmapDrawable).l(canvas, false, this.f22687s, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    public final void i0(TLObject tLObject, Drawable drawable, Object obj) {
        j0(tLObject, drawable, obj, false, 0, false);
    }

    public void invalidate() {
        View view = this.f22658e;
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

    public final void j(android.graphics.Canvas r42, android.graphics.drawable.Drawable r43, int r44, android.graphics.BitmapShader r45, int r46, int r47, int r48, org.telegram.messenger.gc r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, org.telegram.messenger.gc):void");
    }

    public final void j0(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j0(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public final void k(Canvas canvas, Drawable drawable, int i7, BitmapShader bitmapShader, int i10, int i11, gc gcVar) {
        if (this.f22663f1 == 0) {
            float f10 = this.f22693u1;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.f22693u1 = f11;
                if (f11 < 0.0f) {
                    this.f22693u1 = 0.0f;
                }
                invalidate();
            }
        }
        int i12 = this.f22663f1;
        if (i12 != 0) {
            this.f22693u1 = 1.0f;
            this.f22695v1 = i12;
        }
        float f12 = this.f22693u1;
        if (f12 != 0.0f && f12 != 1.0f) {
            j(canvas, drawable, i7, bitmapShader, i10, i11, i12, gcVar);
            j(canvas, drawable, (int) (i7 * this.f22693u1), bitmapShader, i10, i11, this.f22695v1, gcVar);
            return;
        }
        j(canvas, drawable, i7, bitmapShader, i10, i11, i12, gcVar);
    }

    public final void k0() {
        this.f22684r = false;
    }

    public final org.telegram.ui.Components.p5 l() {
        Drawable drawable = this.f22672k0;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable2;
        }
        Drawable drawable3 = this.f22651b0;
        if (drawable3 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable3;
        }
        Drawable drawable4 = this.f22677n0;
        if (drawable4 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable4;
        }
        return null;
    }

    public final void l0(boolean z10) {
        this.T0 = z10;
    }

    public final org.telegram.ui.Components.c6 m() {
        Drawable drawable = this.f22672k0;
        if (drawable instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable2;
        }
        Drawable drawable3 = this.f22651b0;
        if (drawable3 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable3;
        }
        Drawable drawable4 = this.f22677n0;
        if (drawable4 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable4;
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
        oh0 B = B();
        if (B != null && B.u()) {
            if (B.R != null) {
                return B.R;
            }
            if (B.S == null) {
                return null;
            }
            return B.S;
        }
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null && m10.s()) {
            return m10.m();
        }
        Drawable drawable = this.f22672k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.f22651b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.f22677n0;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public final void n0(int i7, long j3, Object obj, String str, String str2, String str3, fc fcVar, fc fcVar2) {
        r0(fcVar, str, fcVar2, str2, null, j3, str3, obj, i7);
    }

    public final int o() {
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null) {
            int i7 = this.V;
            if (i7 % 360 != 0 && i7 % 360 != 180) {
                return m10.getIntrinsicWidth();
            }
            return m10.getIntrinsicHeight();
        }
        oh0 B = B();
        if (B != null) {
            return B.f38214c;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.f22677n0;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i10 = this.V;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n10.getWidth();
        }
        return n10.getHeight();
    }

    public final void o0(String str, String str2, Drawable drawable, String str3, long j3) {
        r0(fc.g(str), str2, null, null, drawable, j3, str3, null, 1);
    }

    public final org.telegram.messenger.hc p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():org.telegram.messenger.hc");
    }

    public final void p0(fc fcVar, String str, Drawable drawable, long j3, String str2, Object obj, int i7) {
        r0(fcVar, str, null, null, drawable, j3, str2, obj, i7);
    }

    public final int q() {
        org.telegram.ui.Components.c6 m10 = m();
        if (m10 != null) {
            int i7 = this.V;
            if (i7 % 360 != 0 && i7 % 360 != 180) {
                return m10.getIntrinsicHeight();
            }
            return m10.getIntrinsicWidth();
        }
        oh0 B = B();
        if (B != null) {
            return B.f38212b;
        }
        Bitmap n10 = n();
        if (n10 == null) {
            Drawable drawable = this.f22677n0;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i10 = this.V;
        if (i10 % 360 != 0 && i10 % 360 != 180) {
            return n10.getHeight();
        }
        return n10.getWidth();
    }

    public final void q0(fc fcVar, String str, Drawable drawable, String str2, Object obj, int i7) {
        r0(fcVar, str, null, null, drawable, 0L, str2, obj, i7);
    }

    public final float r() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void r0(fc fcVar, String str, fc fcVar2, String str2, Drawable drawable, long j3, String str3, Object obj, int i7) {
        u0(null, null, fcVar, str, fcVar2, str2, drawable, j3, str3, obj, i7);
    }

    public final float s() {
        return (this.O0 / 2.0f) + this.M0;
    }

    public final void s0(fc fcVar, String str, fc fcVar2, String str2, Drawable drawable, Object obj, int i7) {
        u0(null, null, fcVar, str, fcVar2, str2, drawable, 0L, null, obj, i7);
    }

    public void setAlpha(float f10) {
        this.f22660e1 = f10;
    }

    public final Drawable t() {
        Drawable drawable = this.f22672k0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.f22651b0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.f22677n0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0(fc fcVar, String str, fc fcVar2, String str2, String str3, Object obj, int i7) {
        r0(fcVar, str, fcVar2, str2, null, 0L, str3, obj, i7);
    }

    public final hc u() {
        String str;
        String str2;
        Drawable drawable = this.f22672k0;
        hc hcVar = 0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
            str = this.f22668i0;
        } else {
            Drawable drawable2 = this.T;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
                str2 = this.R;
            } else {
                drawable2 = this.f22651b0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof oh0)) {
                    str2 = this.Z;
                } else {
                    drawable = this.f22677n0;
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
            hcVar = new Object();
            hcVar.d = drawable;
            hcVar.f24449a = str;
            hcVar.f24452e = 0;
            if (str != null) {
                ec.D().H(hcVar.f24449a);
            }
        }
        return hcVar;
    }

    public final void u0(org.telegram.messenger.fc r20, java.lang.String r21, org.telegram.messenger.fc r22, java.lang.String r23, org.telegram.messenger.fc r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.u0(org.telegram.messenger.fc, java.lang.String, org.telegram.messenger.fc, java.lang.String, org.telegram.messenger.fc, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
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
        ec.D().h(this, true);
        if (this.B0) {
            if (this.T != null) {
                S(1, null);
                S(2, null);
                S(3, null);
                this.F0 = this.U;
                this.D0 = this.T;
                this.E0 = this.R;
                this.C0 = true;
            } else if (this.f22651b0 != null) {
                S(0, null);
                S(2, null);
                S(3, null);
                this.F0 = this.f22654c0;
                this.D0 = this.f22651b0;
                this.E0 = this.Z;
                this.C0 = true;
            } else if (this.f22677n0 != null) {
                S(0, null);
                S(1, null);
                S(2, null);
                S(3, null);
                this.F0 = this.f22656d0;
                this.D0 = this.f22677n0;
                this.C0 = true;
                this.E0 = null;
            } else {
                for (int i7 = 0; i7 < 4; i7++) {
                    S(i7, null);
                }
                this.F0 = null;
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                S(i10, null);
            }
        }
        Drawable drawable2 = this.f22677n0;
        if (drawable2 instanceof bj0) {
            vb0 vb0Var = (vb0) ((bj0) drawable2);
            a6.q(vb0Var.f40768r.K1).v(vb0Var);
            vb0Var.f40767n = null;
            vb0Var.f40768r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.p5) {
            org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) drawable;
            if (this.f22704y1) {
                p5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
            View view = this.f22658e;
            if (c6Var.f34098s0 == null) {
                c6Var.f34098s0 = new WeakReference(view);
            }
            if (this.f22704y1) {
                c6Var.e(this);
            }
            if (!this.f22697w0 && !c6Var.f34092o0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!c6Var.f34092o0) {
                c6Var.f34103w0 = z10;
            }
            if (this.f22692u0 && this.E == 0) {
                c6Var.j();
            }
            boolean z13 = this.f22700x0;
            c6Var.E = z13;
            if (z13) {
                c6Var.x(false);
            }
        } else if (drawable instanceof oh0) {
            oh0 oh0Var = (oh0) drawable;
            if (this.f22704y1) {
                oh0Var.J0.add(this);
            }
            oh0Var.F = this.f22690t0;
            if (this.f22694v0 && (!oh0Var.z() || this.E == 0)) {
                oh0Var.start();
            }
            oh0Var.J(true);
        }
        this.f22656d0 = null;
        this.f22654c0 = null;
        this.f22649a1.setShader(null);
        N0(drawable);
        R0(drawable);
        this.f22664g0 = null;
        this.f22666h0 = null;
        Drawable drawable3 = this.f22672k0;
        if (drawable3 instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable3).v(this);
        }
        this.f22672k0 = null;
        this.f22668i0 = null;
        this.f22674l0 = null;
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
        this.f22678o0 = null;
        this.f22685r0 = 0L;
        this.f22688s0 = 0;
        this.f22669i1 = 1.0f;
        this.f22671j1 = 1.0f;
        lc lcVar = this.F;
        if (lcVar != null) {
            lcVar.f25383a = null;
            lcVar.f25385c = null;
            lcVar.f25386e = null;
            lcVar.f25388g = null;
        }
        jc jcVar = this.f22667h1;
        if (jcVar != null) {
            if (this.f22651b0 == null && this.f22677n0 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            jcVar.m0(this, z11, true, false);
        }
        invalidate();
        if (this.V0 && this.B0 && this.D0 != null) {
            this.f22669i1 = 0.0f;
            this.f22673k1 = System.currentTimeMillis();
            if (this.f22651b0 == null && this.f22677n0 == null) {
                z12 = false;
            }
            this.n1 = z12;
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
