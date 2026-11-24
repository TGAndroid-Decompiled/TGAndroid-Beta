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
public class ImageReceiver implements gk7, dm {
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
    public wtc E1;
    public nl5 F;
    public BitmapShader F0;
    public yr8 F1;
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
    public gl5 O;
    public float O0;
    public gl5 P;
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
    public gl5 X;
    public String Y;
    public String Z;
    public Integer Z0;
    public List a;
    public int a0;
    public boolean b;
    public Drawable b0;
    public ArrayList c;
    public BitmapShader c0;
    public BitmapShader d0;
    public View e;
    public int e0;
    public int f;
    public int f0;
    public int f1;
    public gl5 g0;
    public boolean g1;
    public Object h;
    public String h0;
    public ll5 h1;
    public String i0;
    public float i1;
    public int j0;
    public Drawable k0;
    public long k1;
    public BitmapShader l0;
    public boolean m1;
    public boolean n;
    public Drawable n0;
    public boolean n1;
    public String o0;
    public boolean p0;
    public ColorFilter p1;
    public int q0;
    public boolean q1;
    public boolean r;
    public long r0;
    public long r1;
    public long s;
    public int s0;
    public long s1;
    public float u1;
    public int v1;
    public boolean w0;
    public String w1;
    public int x;
    public boolean x0;
    public boolean y;
    public boolean y1;
    public boolean z1;
    public byte w = 1;
    public boolean m0 = true;
    public boolean t0 = true;
    public boolean u0 = true;
    public boolean v0 = true;
    public byte y0 = 1;
    public int z0 = -1;
    public final RectF Q0 = new RectF();
    public boolean R0 = true;
    public boolean W0 = true;
    public final int[] X0 = new int[4];
    public boolean Y0 = true;
    public final RectF b1 = new RectF();
    public final Matrix c1 = new Matrix();
    public final Path d1 = new Path();
    public float e1 = 1.0f;
    public float j1 = 1.0f;
    public byte l1 = 1;
    public float o1 = 0.05f;
    public short t1 = 150;
    public final ArrayList x1 = new ArrayList();
    public boolean A1 = false;
    public boolean C1 = true;
    public final Paint a1 = new Paint(3);
    public int d = y6c.t0;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        H1 = new PorterDuffColorFilter(-2236963, mode);
        I1 = new PorterDuffColorFilter(-4473925, mode);
        J1 = new float[8];
    }

    public ImageReceiver(View view) {
        this.e = view;
    }

    public final int A(int i) {
        if (i == 1) {
            return this.a0;
        }
        if (i == 3) {
            return this.j0;
        }
        return this.S;
    }

    public final boolean B() {
        if (this.T == null && this.b0 == null && this.n0 == null && this.k0 == null) {
            return false;
        }
        return true;
    }

    public final boolean C() {
        if (this.T == null && this.k0 == null) {
            return false;
        }
        return true;
    }

    public final boolean D() {
        if (this.T == null && this.k0 == null && this.b0 == null && this.n0 == null && this.R == null && this.i0 == null) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        if (this.T == null && this.k0 == null && !(this.n0 instanceof i9c)) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        km m = m();
        if (m != null && m.c0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if (this.B0 && this.D0 != null && !this.C0) {
            return true;
        }
        return false;
    }

    public final boolean H(float f, float f2) {
        float f3 = this.L0;
        if (f >= f3 && f <= f3 + this.N0) {
            float f4 = this.M0;
            if (f2 >= f4 && f2 <= f4 + this.O0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean I() {
        if (!this.y1) {
            this.y1 = true;
            this.E = kk7.e().p & (~this.x);
            boolean z = this.y;
            int i = kk7.i1;
            if (!z) {
                wtc wtcVar = this.E1;
                if (wtcVar != null) {
                    wtcVar.a();
                    this.E1 = null;
                }
                wtc wtcVar2 = (wtc) new fu0(kk7.e(), this).b;
                wtcVar2.b(kk7.o4);
                wtcVar2.b(i);
                wtcVar2.b(kk7.j1);
                this.E1 = wtcVar2;
            }
            if (O()) {
                return true;
            }
            oy8 y = y();
            if (y != null) {
                y.J0.add(this);
                y.F = this.t0;
                if (this.v0 && (!y.u() || this.E == 0)) {
                    y.start();
                }
            }
            km m = m();
            if (m != null) {
                m.e(this);
                if (this.u0 && this.E == 0) {
                    m.j();
                    invalidate();
                }
            }
            vl l = l();
            if (l != null) {
                l.a(this);
            }
            if (kk7.e().g()) {
                didReceivedNotification(i, this.d, 512);
            }
            Drawable drawable = this.n0;
            if (drawable instanceof yx) {
                ((yx) drawable).c(this);
            }
            if (this.c != null) {
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    ((kl5) this.c.get(i2)).a(this);
                }
            }
        }
        return false;
    }

    public final void J(Drawable drawable) {
        if (drawable == this.k0 && this.i0 != null) {
            fl5.z().M(this.i0);
            this.i0 = null;
        } else if (drawable == this.T && this.R != null) {
            fl5.z().M(this.R);
            this.R = null;
        } else if (drawable == this.b0 && this.Z != null) {
            fl5.z().M(this.Z);
            this.Z = null;
        }
        Y(this.g0, this.h0, this.P, this.Q, this.X, this.Y, this.b0, this.r0, this.o0, this.h, this.s0);
    }

    public final void K() {
        wtc wtcVar;
        if (this.y1) {
            this.y1 = false;
            gl5 gl5Var = this.P;
            if (gl5Var != null || this.g0 != null || this.X != null || this.n0 != null) {
                nl5 nl5Var = this.F;
                nl5 nl5Var2 = nl5Var;
                if (nl5Var == null) {
                    ?? obj = new Object();
                    this.F = obj;
                    nl5Var2 = obj;
                }
                nl5Var2.e = this.g0;
                nl5Var2.f = this.h0;
                nl5Var2.a = gl5Var;
                nl5Var2.b = this.Q;
                nl5Var2.c = this.X;
                nl5Var2.d = this.Y;
                nl5Var2.g = this.n0;
                nl5Var2.h = this.r0;
                nl5Var2.k = this.o0;
                nl5Var2.i = this.s0;
                nl5Var2.j = this.h;
            }
            if (!this.y && (wtcVar = this.E1) != null) {
                wtcVar.a();
                this.E1 = null;
            }
            Drawable drawable = this.n0;
            if (drawable instanceof yx) {
                ((yx) drawable).b(this);
            }
            if (this.n0 != null) {
                u0(null);
                this.d0 = null;
            }
            f();
            this.a1.setShader(null);
            if (this.f1 == 0) {
                this.u1 = 0.0f;
            }
            vl l = l();
            if (l != null) {
                l.n(this);
            }
            km m = m();
            if (m != null) {
                m.v(this);
            }
            oy8 y = y();
            if (y != null) {
                y.A(this);
            }
            if (this.c != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    ArrayList arrayList = ((r8b) ((kl5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((n8b) arrayList.get(i2)).b(false);
                        }
                    }
                }
            }
        }
    }

    public final void L(int i, String str) {
        String str2;
        Drawable drawable;
        String str3;
        if (i == 3) {
            str2 = this.i0;
            drawable = this.k0;
        } else if (i == 2) {
            str2 = this.E0;
            drawable = this.D0;
        } else if (i == 1) {
            str2 = this.Z;
            drawable = this.b0;
        } else {
            str2 = this.R;
            drawable = this.T;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) fl5.z().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof oy8) {
            ((oy8) drawable).A(this);
        }
        if (drawable instanceof km) {
            ((km) drawable).v(this);
        }
        if (drawable instanceof vl) {
            ((vl) drawable).n(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof oy8) {
                oy8 oy8Var = (oy8) drawable;
                boolean l = fl5.z().l(str2);
                if (!fl5.z().F(str2, true) && l) {
                    oy8Var.x(false);
                }
            } else if (drawable instanceof km) {
                km kmVar = (km) drawable;
                if (kmVar.o0) {
                    boolean l2 = fl5.z().l(str2);
                    if (!fl5.z().F(str2, true)) {
                        if (l2) {
                            kmVar.u();
                        }
                    } else if (l2) {
                        kmVar.stop();
                    }
                } else if (kmVar.u0.isEmpty()) {
                    kmVar.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean l3 = fl5.z().l(str2);
                if (!fl5.z().F(str2, false) && l3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    gl.x2(arrayList);
                }
            }
        }
        if (i == 3) {
            this.i0 = null;
            this.k0 = null;
            this.l0 = null;
        } else if (i == 2) {
            this.E0 = null;
            this.D0 = null;
            this.F0 = null;
        } else if (i == 1) {
            this.b0 = null;
            this.Z = null;
            this.c0 = null;
        } else {
            this.T = null;
            this.R = null;
            this.U = null;
        }
    }

    public final void M(int i) {
        this.y0 = i;
        oy8 y = y();
        if (y != null) {
            y.F(i);
        }
    }

    public final void N(int i) {
        this.z0 = i;
        if (y() != null) {
            y().M = i;
            return;
        }
        this.D1 = i;
        if (m() != null) {
            m().z0 = 0;
        }
    }

    public final boolean O() {
        nl5 nl5Var = this.F;
        if (nl5Var != null) {
            if (nl5Var.a != null || nl5Var.c != null || nl5Var.e != null || nl5Var.g != null) {
                this.F = null;
                Drawable drawable = nl5Var.g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof oy8) && !(bitmapDrawable instanceof km) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        nl5Var.g = null;
                    }
                }
                Y(nl5Var.e, nl5Var.f, nl5Var.a, nl5Var.b, nl5Var.c, nl5Var.d, nl5Var.g, nl5Var.h, nl5Var.k, nl5Var.j, nl5Var.i);
                nl5Var.a = null;
                nl5Var.c = null;
                nl5Var.e = null;
                nl5Var.g = null;
                this.F = nl5Var;
                oy8 y = y();
                if (y != null) {
                    y.F = this.t0;
                    if (this.v0) {
                        if (!y.u() || this.E == 0) {
                            y.start();
                            return true;
                        }
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

    public final void P(Object obj) {
        this.G = obj;
        invalidate();
    }

    public final il5 Q(il5 il5Var, int i) {
        oy8 oy8Var;
        il5 il5Var2 = il5Var;
        if (il5Var == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.y = new RectF();
            il5Var2 = obj;
        }
        il5Var2.d = i;
        il5Var2.f = m();
        il5Var2.g = y();
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            il5Var2.h[i2] = this.X0[i2];
        }
        il5Var2.j = this.k0;
        il5Var2.i = this.l0;
        il5Var2.l = this.T;
        il5Var2.k = this.U;
        il5Var2.m = this.b0;
        il5Var2.n = this.c0;
        il5Var2.e = this.d0;
        il5Var2.o = this.n0;
        il5Var2.x = this.D0;
        il5Var2.z = this.p1;
        il5Var2.w = this.C0;
        il5Var2.p = this.i1;
        il5Var2.q = this.j1;
        il5Var2.r = this.F0;
        km kmVar = il5Var2.f;
        if ((kmVar != null && !kmVar.s()) || ((oy8Var = il5Var2.g) != null && !oy8Var.p())) {
            z = true;
        }
        il5Var2.a = z;
        il5Var2.u = this.L0;
        il5Var2.v = this.M0;
        il5Var2.t = this.N0;
        il5Var2.s = this.O0;
        il5Var2.b = this.e1;
        return il5Var2;
    }

    public final void R(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.b0) {
            this.c0 = bitmapShader;
        } else if (drawable == this.n0) {
            this.d0 = bitmapShader;
        } else if (drawable == this.k0) {
            this.l0 = bitmapShader;
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

    public final void S(boolean z) {
        if (this.G1 != z) {
            this.G1 = z;
            this.v0 = !z;
            oy8 y = y();
            if (y != null) {
                if (z) {
                    y.stop();
                } else if (!y.l0) {
                    y.start();
                }
            }
        }
    }

    public final void T(int i) {
        if (this.w != i) {
            this.w = i;
            if (this.y1 && D()) {
                fl5 z = fl5.z();
                z.s.c(new o94(z, this, this.w, (byte) 3));
            }
        }
    }

    public final void U(TLObject tLObject, Drawable drawable, Object obj) {
        V(tLObject, drawable, obj, false, 0, false);
    }

    public final void V(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.V(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public final void W(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.I == null || this.H != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.I = new BitmapShader(bitmap, tileMode, tileMode);
                y0(this.T);
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

    public final void X(int i, long j, gl5 gl5Var, gl5 gl5Var2, Object obj, String str, String str2, String str3) {
        Z(gl5Var, str, gl5Var2, str2, null, j, str3, obj, i);
    }

    public final void Y(defpackage.gl5 r20, java.lang.String r21, defpackage.gl5 r22, java.lang.String r23, defpackage.gl5 r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.Y(gl5, java.lang.String, gl5, java.lang.String, gl5, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
    }

    public final void Z(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, long j, String str3, Object obj, int i) {
        Y(null, null, gl5Var, str, gl5Var2, str2, drawable, j, str3, obj, i);
    }

    public final void a(r8b r8bVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(r8bVar);
        if (this.y1) {
            r8bVar.a(this);
        }
    }

    public final void a0(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, Object obj, int i) {
        Y(null, null, gl5Var, str, gl5Var2, str2, drawable, 0L, null, obj, i);
    }

    public final void b() {
        fl5 z = fl5.z();
        z.s.c(new o94(z, this, this.w, (byte) 3));
    }

    public final void b0(gl5 gl5Var, String str, gl5 gl5Var2, String str2, String str3, Object obj, int i) {
        Z(gl5Var, str, gl5Var2, str2, null, 0L, str3, obj, i);
    }

    public final void c() {
        this.r = false;
        fl5.z().d(this, true);
        this.n = true;
    }

    public final void c0(gl5 gl5Var, String str, Drawable drawable, long j, String str2, Object obj, int i) {
        Z(gl5Var, str, null, null, drawable, j, str2, obj, i);
    }

    public final void d(boolean z, il5 il5Var) {
        float f;
        if (!this.m1) {
            float f2 = this.i1;
            if (f2 != 1.0f) {
                if (!z) {
                    if (il5Var != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = this.k1;
                        long j2 = currentTimeMillis - j;
                        if (j == 0) {
                            j2 = 16;
                        }
                        if (j2 > 30 && gl.r > 60.0f) {
                            j2 = 30;
                        }
                        f = (((float) j2) / this.t1) + this.i1;
                        this.i1 = f;
                    } else {
                        f = f2 + (16.0f / this.t1);
                        this.i1 = f;
                    }
                    if (f > 1.0f) {
                        this.i1 = 1.0f;
                        this.j1 = 1.0f;
                        if (this.D0 != null) {
                            L(2, null);
                            this.F0 = null;
                        }
                    }
                }
                if (il5Var != null) {
                    gl.c3(new iu4(this, (byte) 27));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(gl5 gl5Var, String str, Drawable drawable, String str2, Object obj, int i) {
        Z(gl5Var, str, null, null, drawable, 0L, str2, obj, i);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == kk7.o4) {
            String str = (String) objArr[0];
            String str2 = this.i0;
            if (str2 != null && str2.equals(str)) {
                this.i0 = (String) objArr[1];
                gl5 gl5Var = (gl5) objArr[2];
                this.g0 = gl5Var;
                nl5 nl5Var = this.F;
                if (nl5Var != null) {
                    nl5Var.e = gl5Var;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                gl5 gl5Var2 = (gl5) objArr[2];
                this.P = gl5Var2;
                nl5 nl5Var2 = this.F;
                if (nl5Var2 != null) {
                    nl5Var2.a = gl5Var2;
                }
            }
            String str4 = this.Z;
            if (str4 != null && str4.equals(str)) {
                this.Z = (String) objArr[1];
                gl5 gl5Var3 = (gl5) objArr[2];
                this.X = gl5Var3;
                nl5 nl5Var3 = this.F;
                if (nl5Var3 != null) {
                    nl5Var3.c = gl5Var3;
                }
            }
        } else if (i == kk7.i1) {
            Integer num = (Integer) objArr[0];
            if (this.x < num.intValue()) {
                int intValue = this.E | num.intValue();
                this.E = intValue;
                if (intValue != 0) {
                    oy8 y = y();
                    if (y != null && y.u()) {
                        y.stop();
                    }
                    km m = m();
                    if (m != null) {
                        m.stop();
                    }
                }
            }
        } else if (i == kk7.j1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x < num2.intValue() && (i3 = this.E) != 0) {
                int i4 = i3 & (~num2.intValue());
                this.E = i4;
                if (i4 == 0) {
                    oy8 y2 = y();
                    if (y2 != null) {
                        y2.F = this.t0;
                    }
                    if (this.v0 && y2 != null && y2.u()) {
                        y2.start();
                    }
                    km m2 = m();
                    if (this.u0 && m2 != null) {
                        m2.j();
                        invalidate();
                    }
                }
            }
        }
    }

    public final void e() {
        if (this.c != null) {
            if (this.y1) {
                for (int i = 0; i < this.c.size(); i++) {
                    ArrayList arrayList = ((r8b) ((kl5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((n8b) arrayList.get(i2)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final void e0(String str, String str2, Drawable drawable, String str3, long j) {
        Z(gl5.g(str), str2, null, null, drawable, j, str3, null, 1);
    }

    public final void f() {
        for (int i = 0; i < 4; i++) {
            L(i, null);
        }
        fl5.z().d(this, true);
    }

    public final void f0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = null;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        }
        g0(bitmapDrawable);
    }

    public final boolean g(Canvas canvas) {
        return h(canvas, null);
    }

    public final void g0(Drawable drawable) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        fl5.z().d(this, true);
        if (this.B0) {
            if (this.T != null) {
                L(1, null);
                L(2, null);
                L(3, null);
                this.F0 = this.U;
                this.D0 = this.T;
                this.E0 = this.R;
                this.C0 = true;
            } else if (this.b0 != null) {
                L(0, null);
                L(2, null);
                L(3, null);
                this.F0 = this.c0;
                this.D0 = this.b0;
                this.E0 = this.Z;
                this.C0 = true;
            } else if (this.n0 != null) {
                L(0, null);
                L(1, null);
                L(2, null);
                L(3, null);
                this.F0 = this.d0;
                this.D0 = this.n0;
                this.C0 = true;
                this.E0 = null;
            } else {
                for (int i = 0; i < 4; i++) {
                    L(i, null);
                }
                this.F0 = null;
            }
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                L(i2, null);
            }
        }
        Drawable drawable2 = this.n0;
        if (drawable2 instanceof n29) {
            cr7 cr7Var = (cr7) ((n29) drawable2);
            up3.q(cr7Var.r.K1).v(cr7Var);
            cr7Var.n = null;
            cr7Var.r = null;
        }
        if (drawable instanceof vl) {
            vl vlVar = (vl) drawable;
            if (this.y1) {
                vlVar.a(this);
            }
        } else if (drawable instanceof km) {
            km kmVar = (km) drawable;
            View view = this.e;
            if (kmVar.s0 == null) {
                kmVar.s0 = new WeakReference(view);
            }
            if (this.y1) {
                kmVar.e(this);
            }
            if (!this.w0 && !kmVar.o0) {
                z = false;
            } else {
                z = true;
            }
            if (!kmVar.o0) {
                kmVar.w0 = z;
            }
            if (this.u0 && this.E == 0) {
                kmVar.j();
            }
            boolean z4 = this.x0;
            kmVar.E = z4;
            if (z4) {
                kmVar.x(false);
            }
        } else if (drawable instanceof oy8) {
            oy8 oy8Var = (oy8) drawable;
            if (this.y1) {
                oy8Var.J0.add(this);
            }
            oy8Var.F = this.t0;
            if (this.v0 && (!oy8Var.u() || this.E == 0)) {
                oy8Var.start();
            }
            oy8Var.E(true);
        }
        this.d0 = null;
        this.c0 = null;
        this.a1.setShader(null);
        u0(drawable);
        y0(drawable);
        this.g0 = null;
        this.h0 = null;
        Drawable drawable3 = this.k0;
        if (drawable3 instanceof km) {
            ((km) drawable3).v(this);
        }
        this.k0 = null;
        this.i0 = null;
        this.l0 = null;
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
        this.o0 = null;
        this.r0 = 0L;
        this.s0 = 0;
        this.i1 = 1.0f;
        this.j1 = 1.0f;
        nl5 nl5Var = this.F;
        if (nl5Var != null) {
            nl5Var.a = null;
            nl5Var.c = null;
            nl5Var.e = null;
            nl5Var.g = null;
        }
        ll5 ll5Var = this.h1;
        if (ll5Var != null) {
            if (this.b0 == null && this.n0 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            ll5Var.C(this, z2, true, false);
        }
        invalidate();
        if (this.V0 && this.B0 && this.D0 != null) {
            this.i1 = 0.0f;
            this.k1 = System.currentTimeMillis();
            if (this.b0 == null && this.n0 == null) {
                z3 = false;
            }
            this.n1 = z3;
        }
    }

    public float getAlpha() {
        return this.e1;
    }

    public final boolean h(android.graphics.Canvas r32, defpackage.il5 r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, il5):boolean");
    }

    public boolean h0(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h0(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, il5 il5Var, int i) {
        if (il5Var != null) {
            if (bitmapDrawable instanceof oy8) {
                oy8 oy8Var = (oy8) bitmapDrawable;
                float f = il5Var.u;
                float f2 = il5Var.v;
                float f3 = il5Var.t;
                float f4 = il5Var.s;
                ColorFilter colorFilter = il5Var.z;
                int i2 = il5Var.d;
                Paint[] paintArr = oy8Var.k0;
                RectF[] rectFArr = oy8Var.j0;
                if (rectFArr[i2] == null) {
                    rectFArr[i2] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i2] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i2].setAlpha(i);
                paintArr[i2].setColorFilter(colorFilter);
                rectFArr[i2].set(f, f2, f + f3, f4 + f2);
                oy8Var.l(canvas, null, true, 0L, i2);
                return;
            } else if (bitmapDrawable instanceof km) {
                km kmVar = (km) bitmapDrawable;
                float f5 = il5Var.u;
                float f6 = il5Var.v;
                float f7 = il5Var.t;
                float f8 = il5Var.s;
                ColorFilter colorFilter2 = il5Var.z;
                int i3 = il5Var.d;
                Paint[] paintArr2 = kmVar.r0;
                RectF[] rectFArr2 = kmVar.q0;
                if (rectFArr2[i3] == null) {
                    rectFArr2[i3] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i3] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i3].setAlpha(i);
                paintArr2[i3].setColorFilter(colorFilter2);
                rectFArr2[i3].set(f5, f6, f7 + f5, f8 + f6);
                kmVar.l(canvas, true, 0L, i3);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    Paint paint3 = il5Var.A;
                    if (paint3 == null) {
                        paint3 = new Paint(1);
                        il5Var.A = paint3;
                    }
                    paint3.setAlpha(i);
                    il5Var.A.setColorFilter(il5Var.z);
                    canvas.save();
                    canvas.translate(il5Var.u, il5Var.v);
                    canvas.scale(il5Var.t / bitmap.getWidth(), il5Var.s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, il5Var.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i);
        if (bitmapDrawable instanceof oy8) {
            ((oy8) bitmapDrawable).l(canvas, null, false, this.s, 0);
        } else if (bitmapDrawable instanceof km) {
            ((km) bitmapDrawable).l(canvas, false, this.s, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    public final void i0(float f, float f2, float f3, float f4) {
        this.L0 = f;
        this.M0 = f2;
        this.N0 = f3;
        this.O0 = f4;
    }

    public void invalidate() {
        View view = this.e;
        if (view == null) {
            return;
        }
        if (this.K0) {
            view.invalidate();
            return;
        }
        float f = this.L0;
        float f2 = this.M0;
        view.invalidate((int) f, (int) f2, (int) (f + this.N0), (int) (f2 + this.O0));
    }

    public final void j(android.graphics.Canvas r40, android.graphics.drawable.Drawable r41, int r42, android.graphics.BitmapShader r43, int r44, int r45, int r46, defpackage.il5 r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, il5):void");
    }

    public final void j0(Rect rect) {
        if (rect != null) {
            this.L0 = rect.left;
            this.M0 = rect.top;
            this.N0 = rect.width();
            this.O0 = rect.height();
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, il5 il5Var) {
        if (this.f1 == 0) {
            float f = this.u1;
            if (f != 0.0f) {
                float f2 = f - 0.10666667f;
                this.u1 = f2;
                if (f2 < 0.0f) {
                    this.u1 = 0.0f;
                }
                invalidate();
            }
        }
        int i4 = this.f1;
        if (i4 != 0) {
            this.u1 = 1.0f;
            this.v1 = i4;
        }
        float f3 = this.u1;
        if (f3 != 0.0f && f3 != 1.0f) {
            j(canvas, drawable, i, bitmapShader, i2, i3, i4, il5Var);
            j(canvas, drawable, (int) (i * this.u1), bitmapShader, i2, i3, this.v1, il5Var);
            return;
        }
        j(canvas, drawable, i, bitmapShader, i2, i3, i4, il5Var);
    }

    public final void k0(RectF rectF) {
        if (rectF != null) {
            this.L0 = rectF.left;
            this.M0 = rectF.top;
            this.N0 = rectF.width();
            this.O0 = rectF.height();
        }
    }

    public final vl l() {
        Drawable drawable = this.k0;
        if (drawable instanceof vl) {
            return (vl) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof vl) {
            return (vl) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof vl) {
            return (vl) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof vl) {
            return (vl) drawable4;
        }
        return null;
    }

    public final void l0(int i) {
        this.N0 = i;
    }

    public final km m() {
        Drawable drawable = this.k0;
        if (drawable instanceof km) {
            return (km) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof km) {
            return (km) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof km) {
            return (km) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof km) {
            return (km) drawable4;
        }
        return null;
    }

    public final void m0(int i) {
        this.x = i;
        if (this.y1) {
            this.E = kk7.e().p & (~this.x);
        }
    }

    public final Bitmap n() {
        oy8 y = y();
        if (y != null && y.p()) {
            if (y.R != null) {
                return y.R;
            }
            if (y.S == null) {
                return null;
            }
            return y.S;
        }
        km m = m();
        if (m != null && m.s()) {
            return m.m();
        }
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof km) && !(drawable instanceof oy8)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.n0;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public final void n0(long j, long j2) {
        this.r1 = j;
        this.s1 = j2;
        Drawable drawable = this.k0;
        if (drawable instanceof km) {
            ((km) drawable).C(j, j2);
        }
    }

    public final int o() {
        km m = m();
        if (m != null) {
            int i = this.V;
            if (i % 360 != 0 && i % 360 != 180) {
                return m.getIntrinsicWidth();
            }
            return m.getIntrinsicHeight();
        }
        oy8 y = y();
        if (y != null) {
            return y.c;
        }
        Bitmap n = n();
        if (n == null) {
            Drawable drawable = this.n0;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i2 = this.V;
        if (i2 % 360 != 0 && i2 % 360 != 180) {
            return n.getWidth();
        }
        return n.getHeight();
    }

    public final void o0(int i, int i2, boolean z) {
        while (i < 0) {
            i += 360;
        }
        while (i > 360) {
            i -= 360;
        }
        this.e0 = i;
        this.V = i;
        this.f0 = i2;
        this.W = i2;
        this.g1 = z;
    }

    public final defpackage.jl5 p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():jl5");
    }

    public final void p0(View view) {
        this.e = view;
        km m = m();
        if (m != null && this.y1) {
            View view2 = this.e;
            if (m.s0 == null) {
                m.s0 = new WeakReference(view2);
            }
        }
    }

    public final int q() {
        km m = m();
        if (m != null) {
            int i = this.V;
            if (i % 360 != 0 && i % 360 != 180) {
                return m.getIntrinsicHeight();
            }
            return m.getIntrinsicWidth();
        }
        oy8 y = y();
        if (y != null) {
            return y.b;
        }
        Bitmap n = n();
        if (n == null) {
            Drawable drawable = this.n0;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i2 = this.V;
        if (i2 % 360 != 0 && i2 % 360 != 180) {
            return n.getHeight();
        }
        return n.getWidth();
    }

    public final void q0(int i) {
        s0(new int[]{i, i, i, i});
    }

    public final float r() {
        return (this.N0 / 2.0f) + this.L0;
    }

    public final void r0(int i, int i2, int i3, int i4) {
        s0(new int[]{i, i2, i3, i4});
    }

    public final float s() {
        return (this.O0 / 2.0f) + this.M0;
    }

    public void s0(int[] iArr) {
        int i = iArr[0];
        this.Y0 = true;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr2 = this.X0;
            if (i2 >= iArr2.length) {
                break;
            }
            int i3 = iArr2[i2];
            int i4 = iArr[i2];
            if (i3 != i4) {
                z = true;
            }
            if (i != i4) {
                this.Y0 = false;
            }
            iArr2[i2] = i4;
            i2++;
        }
        if (z) {
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                y0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                y0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                y0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                y0(drawable4);
            }
        }
    }

    public void setAlpha(float f) {
        this.e1 = f;
    }

    public final Drawable t() {
        Drawable drawable = this.k0;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public final void t0() {
        if (!this.W0) {
            this.W0 = true;
            Drawable drawable = this.T;
            if (drawable != null && this.U == null) {
                y0(drawable);
            }
            Drawable drawable2 = this.k0;
            if (drawable2 != null && this.l0 == null) {
                y0(drawable2);
            }
            Drawable drawable3 = this.b0;
            if (drawable3 != null) {
                y0(drawable3);
            }
            Drawable drawable4 = this.n0;
            if (drawable4 != null) {
                y0(drawable4);
            }
        }
    }

    public final jl5 u() {
        String str;
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof km) && !(drawable instanceof oy8)) {
            str = this.i0;
        } else {
            Drawable drawable2 = this.T;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof km) && !(drawable instanceof oy8)) {
                str = this.R;
            } else {
                drawable2 = this.b0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof km) && !(drawable instanceof oy8)) {
                    str = this.Z;
                } else {
                    drawable = this.n0;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        str = null;
                        drawable = null;
                    }
                }
            }
            drawable = drawable2;
        }
        if (drawable == null) {
            return null;
        }
        ?? obj = new Object();
        obj.d = drawable;
        obj.a = str;
        obj.e = 0;
        if (str != null) {
            fl5.z().D(obj.a);
        }
        return obj;
    }

    public final void u0(Drawable drawable) {
        yx yxVar;
        Drawable drawable2 = this.n0;
        if (drawable != drawable2) {
            if (drawable2 instanceof yx) {
                if (!drawable2.equals(drawable)) {
                    yxVar = (yx) this.n0;
                } else {
                    return;
                }
            } else {
                yxVar = null;
            }
            this.n0 = drawable;
            if (this.y1 && (drawable instanceof yx)) {
                ((yx) drawable).c(this);
            }
            if (this.y1 && yxVar != null) {
                yxVar.b(this);
            }
        }
    }

    public final float v() {
        float width;
        float height;
        int i = this.V % 180;
        RectF rectF = this.Q0;
        if (i != 0) {
            width = rectF.height();
            height = rectF.width();
        } else {
            width = rectF.width();
            height = rectF.height();
        }
        return width / height;
    }

    public final void v0(boolean z, boolean z2) {
        if (this.R0 != z) {
            this.R0 = z;
            if (z2) {
                invalidate();
                yr8 yr8Var = this.F1;
                if (yr8Var != null) {
                    yr8Var.run();
                }
            }
        }
    }

    public final float w() {
        return this.L0 + this.N0;
    }

    public final void w0(boolean z) {
        km m = m();
        if (m != null) {
            boolean z2 = this.w0;
            if (!m.o0) {
                m.w0 = z2;
            }
            m.start();
            return;
        }
        oy8 y = y();
        if (y != null && !y.l0) {
            y.C(z);
        }
    }

    public final float x() {
        return this.M0 + this.O0;
    }

    public final void x0() {
        km m = m();
        if (m != null) {
            m.stop();
            return;
        }
        oy8 y = y();
        if (y != null) {
            y.stop();
        }
    }

    public final oy8 y() {
        Drawable drawable = this.k0;
        if (drawable instanceof oy8) {
            return (oy8) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof oy8) {
            return (oy8) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof oy8) {
            return (oy8) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof oy8) {
            return (oy8) drawable4;
        }
        return null;
    }

    public final void y0(Drawable drawable) {
        if (drawable != null) {
            int[] z = z();
            boolean z2 = false;
            if (drawable instanceof ni2) {
                ni2 ni2Var = (ni2) drawable;
                float f = z[0];
                float f2 = z[1];
                float f3 = z[2];
                float f4 = z[3];
                float[] fArr = ni2Var.f;
                float max = Math.max(0.0f, f);
                fArr[1] = max;
                fArr[0] = max;
                float max2 = Math.max(0.0f, f2);
                fArr[3] = max2;
                fArr[2] = max2;
                float max3 = Math.max(0.0f, f3);
                fArr[5] = max3;
                fArr[4] = max3;
                float max4 = Math.max(0.0f, f4);
                fArr[7] = max4;
                fArr[6] = max4;
                if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
                    z2 = true;
                }
                ni2Var.e = z2;
                ni2Var.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof pb0)) {
                R(drawable, null);
            } else if (drawable instanceof pb0) {
                ((pb0) drawable).r = z[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof oy8)) {
                    if (bitmapDrawable instanceof km) {
                        ((km) drawable).B(z);
                    } else if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        R(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            }
        }
    }

    public final int[] z() {
        if (!this.W0) {
            return null;
        }
        return this.X0;
    }
}
