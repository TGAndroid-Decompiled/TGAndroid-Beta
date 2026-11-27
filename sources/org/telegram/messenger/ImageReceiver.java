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
public class ImageReceiver implements fn7, em {
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
    public u8a E1;
    public qn5 F;
    public BitmapShader F0;
    public hv8 F1;
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
    public jn5 O;
    public float O0;
    public jn5 P;
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
    public jn5 X;
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
    public jn5 g0;
    public boolean g1;
    public Object h;
    public String h0;
    public on5 h1;
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
    public int d = yac.t0;

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
        if (this.T == null && this.k0 == null && !(this.n0 instanceof idc)) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        lm m = m();
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
            this.E = jn7.e().p & (~this.x);
            boolean z = this.y;
            int i = jn7.j1;
            if (!z) {
                u8a u8aVar = this.E1;
                if (u8aVar != null) {
                    u8aVar.a();
                    this.E1 = null;
                }
                u8a u8aVar2 = (u8a) new ou0(jn7.e(), this).b;
                u8aVar2.b(jn7.p4);
                u8aVar2.b(i);
                u8aVar2.b(jn7.k1);
                this.E1 = u8aVar2;
            }
            if (O()) {
                return true;
            }
            b29 y = y();
            if (y != null) {
                y.J0.add(this);
                y.F = this.t0;
                if (this.v0 && (!y.u() || this.E == 0)) {
                    y.start();
                }
            }
            lm m = m();
            if (m != null) {
                m.e(this);
                if (this.u0 && this.E == 0) {
                    m.j();
                    invalidate();
                }
            }
            wl l = l();
            if (l != null) {
                l.a(this);
            }
            if (jn7.e().g()) {
                didReceivedNotification(i, this.d, 512);
            }
            Drawable drawable = this.n0;
            if (drawable instanceof zx) {
                ((zx) drawable).c(this);
            }
            if (this.c != null) {
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    ((nn5) this.c.get(i2)).a(this);
                }
            }
        }
        return false;
    }

    public final void J(Drawable drawable) {
        if (drawable == this.k0 && this.i0 != null) {
            in5.z().M(this.i0);
            this.i0 = null;
        } else if (drawable == this.T && this.R != null) {
            in5.z().M(this.R);
            this.R = null;
        } else if (drawable == this.b0 && this.Z != null) {
            in5.z().M(this.Z);
            this.Z = null;
        }
        Y(this.g0, this.h0, this.P, this.Q, this.X, this.Y, this.b0, this.r0, this.o0, this.h, this.s0);
    }

    public final void K() {
        u8a u8aVar;
        if (this.y1) {
            this.y1 = false;
            jn5 jn5Var = this.P;
            if (jn5Var != null || this.g0 != null || this.X != null || this.n0 != null) {
                qn5 qn5Var = this.F;
                qn5 qn5Var2 = qn5Var;
                if (qn5Var == null) {
                    ?? obj = new Object();
                    this.F = obj;
                    qn5Var2 = obj;
                }
                qn5Var2.e = this.g0;
                qn5Var2.f = this.h0;
                qn5Var2.a = jn5Var;
                qn5Var2.b = this.Q;
                qn5Var2.c = this.X;
                qn5Var2.d = this.Y;
                qn5Var2.g = this.n0;
                qn5Var2.h = this.r0;
                qn5Var2.k = this.o0;
                qn5Var2.i = this.s0;
                qn5Var2.j = this.h;
            }
            if (!this.y && (u8aVar = this.E1) != null) {
                u8aVar.a();
                this.E1 = null;
            }
            Drawable drawable = this.n0;
            if (drawable instanceof zx) {
                ((zx) drawable).b(this);
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
            wl l = l();
            if (l != null) {
                l.n(this);
            }
            lm m = m();
            if (m != null) {
                m.v(this);
            }
            b29 y = y();
            if (y != null) {
                y.A(this);
            }
            if (this.c != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    ArrayList arrayList = ((qcb) ((nn5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((mcb) arrayList.get(i2)).b(false);
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
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (str3 = (String) in5.z().t.get(str2)) != null)) {
            str2 = str3;
        }
        if (drawable instanceof b29) {
            ((b29) drawable).A(this);
        }
        if (drawable instanceof lm) {
            ((lm) drawable).v(this);
        }
        if (drawable instanceof wl) {
            ((wl) drawable).n(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof b29) {
                b29 b29Var = (b29) drawable;
                boolean l = in5.z().l(str2);
                if (!in5.z().F(str2, true) && l) {
                    b29Var.x(false);
                }
            } else if (drawable instanceof lm) {
                lm lmVar = (lm) drawable;
                if (lmVar.o0) {
                    boolean l2 = in5.z().l(str2);
                    if (!in5.z().F(str2, true)) {
                        if (l2) {
                            lmVar.u();
                        }
                    } else if (l2) {
                        lmVar.stop();
                    }
                } else if (lmVar.u0.isEmpty()) {
                    lmVar.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean l3 = in5.z().l(str2);
                if (!in5.z().F(str2, false) && l3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    hl.x2(arrayList);
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
        b29 y = y();
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
        qn5 qn5Var = this.F;
        if (qn5Var != null) {
            if (qn5Var.a != null || qn5Var.c != null || qn5Var.e != null || qn5Var.g != null) {
                this.F = null;
                Drawable drawable = qn5Var.g;
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (!(bitmapDrawable instanceof b29) && !(bitmapDrawable instanceof lm) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                        qn5Var.g = null;
                    }
                }
                Y(qn5Var.e, qn5Var.f, qn5Var.a, qn5Var.b, qn5Var.c, qn5Var.d, qn5Var.g, qn5Var.h, qn5Var.k, qn5Var.j, qn5Var.i);
                qn5Var.a = null;
                qn5Var.c = null;
                qn5Var.e = null;
                qn5Var.g = null;
                this.F = qn5Var;
                b29 y = y();
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

    public final ln5 Q(ln5 ln5Var, int i) {
        b29 b29Var;
        ln5 ln5Var2 = ln5Var;
        if (ln5Var == null) {
            ?? obj = new Object();
            obj.h = new int[4];
            obj.y = new RectF();
            ln5Var2 = obj;
        }
        ln5Var2.d = i;
        ln5Var2.f = m();
        ln5Var2.g = y();
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            ln5Var2.h[i2] = this.X0[i2];
        }
        ln5Var2.j = this.k0;
        ln5Var2.i = this.l0;
        ln5Var2.l = this.T;
        ln5Var2.k = this.U;
        ln5Var2.m = this.b0;
        ln5Var2.n = this.c0;
        ln5Var2.e = this.d0;
        ln5Var2.o = this.n0;
        ln5Var2.x = this.D0;
        ln5Var2.z = this.p1;
        ln5Var2.w = this.C0;
        ln5Var2.p = this.i1;
        ln5Var2.q = this.j1;
        ln5Var2.r = this.F0;
        lm lmVar = ln5Var2.f;
        if ((lmVar != null && !lmVar.s()) || ((b29Var = ln5Var2.g) != null && !b29Var.p())) {
            z = true;
        }
        ln5Var2.a = z;
        ln5Var2.u = this.L0;
        ln5Var2.v = this.M0;
        ln5Var2.t = this.N0;
        ln5Var2.s = this.O0;
        ln5Var2.b = this.e1;
        return ln5Var2;
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
            b29 y = y();
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
                in5 z = in5.z();
                z.s.c(new sb4(z, this, this.w, (byte) 3));
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

    public final void X(int i, long j, jn5 jn5Var, jn5 jn5Var2, Object obj, String str, String str2, String str3) {
        Z(jn5Var, str, jn5Var2, str2, null, j, str3, obj, i);
    }

    public final void Y(defpackage.jn5 r20, java.lang.String r21, defpackage.jn5 r22, java.lang.String r23, defpackage.jn5 r24, java.lang.String r25, android.graphics.drawable.Drawable r26, long r27, java.lang.String r29, java.lang.Object r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.Y(jn5, java.lang.String, jn5, java.lang.String, jn5, java.lang.String, android.graphics.drawable.Drawable, long, java.lang.String, java.lang.Object, int):void");
    }

    public final void Z(jn5 jn5Var, String str, jn5 jn5Var2, String str2, Drawable drawable, long j, String str3, Object obj, int i) {
        Y(null, null, jn5Var, str, jn5Var2, str2, drawable, j, str3, obj, i);
    }

    public final void a(qcb qcbVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(qcbVar);
        if (this.y1) {
            qcbVar.a(this);
        }
    }

    public final void a0(jn5 jn5Var, String str, jn5 jn5Var2, String str2, Drawable drawable, Object obj, int i) {
        Y(null, null, jn5Var, str, jn5Var2, str2, drawable, 0L, null, obj, i);
    }

    public final void b() {
        in5 z = in5.z();
        z.s.c(new sb4(z, this, this.w, (byte) 3));
    }

    public final void b0(jn5 jn5Var, String str, jn5 jn5Var2, String str2, String str3, Object obj, int i) {
        Z(jn5Var, str, jn5Var2, str2, null, 0L, str3, obj, i);
    }

    public final void c() {
        this.r = false;
        in5.z().d(this, true);
        this.n = true;
    }

    public final void c0(jn5 jn5Var, String str, Drawable drawable, long j, String str2, Object obj, int i) {
        Z(jn5Var, str, null, null, drawable, j, str2, obj, i);
    }

    public final void d(boolean z, ln5 ln5Var) {
        float f;
        if (!this.m1) {
            float f2 = this.i1;
            if (f2 != 1.0f) {
                if (!z) {
                    if (ln5Var != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = this.k1;
                        long j2 = currentTimeMillis - j;
                        if (j == 0) {
                            j2 = 16;
                        }
                        if (j2 > 30 && hl.r > 60.0f) {
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
                if (ln5Var != null) {
                    hl.c3(new ea5(this, (byte) 12));
                } else {
                    invalidate();
                }
            }
        }
    }

    public final void d0(jn5 jn5Var, String str, Drawable drawable, String str2, Object obj, int i) {
        Z(jn5Var, str, null, null, drawable, 0L, str2, obj, i);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == jn7.p4) {
            String str = (String) objArr[0];
            String str2 = this.i0;
            if (str2 != null && str2.equals(str)) {
                this.i0 = (String) objArr[1];
                jn5 jn5Var = (jn5) objArr[2];
                this.g0 = jn5Var;
                qn5 qn5Var = this.F;
                if (qn5Var != null) {
                    qn5Var.e = jn5Var;
                }
            }
            String str3 = this.R;
            if (str3 != null && str3.equals(str)) {
                this.R = (String) objArr[1];
                jn5 jn5Var2 = (jn5) objArr[2];
                this.P = jn5Var2;
                qn5 qn5Var2 = this.F;
                if (qn5Var2 != null) {
                    qn5Var2.a = jn5Var2;
                }
            }
            String str4 = this.Z;
            if (str4 != null && str4.equals(str)) {
                this.Z = (String) objArr[1];
                jn5 jn5Var3 = (jn5) objArr[2];
                this.X = jn5Var3;
                qn5 qn5Var3 = this.F;
                if (qn5Var3 != null) {
                    qn5Var3.c = jn5Var3;
                }
            }
        } else if (i == jn7.j1) {
            Integer num = (Integer) objArr[0];
            if (this.x < num.intValue()) {
                int intValue = this.E | num.intValue();
                this.E = intValue;
                if (intValue != 0) {
                    b29 y = y();
                    if (y != null && y.u()) {
                        y.stop();
                    }
                    lm m = m();
                    if (m != null) {
                        m.stop();
                    }
                }
            }
        } else if (i == jn7.k1) {
            Integer num2 = (Integer) objArr[0];
            if (this.x < num2.intValue() && (i3 = this.E) != 0) {
                int i4 = i3 & (~num2.intValue());
                this.E = i4;
                if (i4 == 0) {
                    b29 y2 = y();
                    if (y2 != null) {
                        y2.F = this.t0;
                    }
                    if (this.v0 && y2 != null && y2.u()) {
                        y2.start();
                    }
                    lm m2 = m();
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
                    ArrayList arrayList = ((qcb) ((nn5) this.c.get(i))).a;
                    if (arrayList != null) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((mcb) arrayList.get(i2)).b(false);
                        }
                    }
                }
            }
            this.c.clear();
        }
    }

    public final void e0(String str, String str2, Drawable drawable, String str3, long j) {
        Z(jn5.g(str), str2, null, null, drawable, j, str3, null, 1);
    }

    public final void f() {
        for (int i = 0; i < 4; i++) {
            L(i, null);
        }
        in5.z().d(this, true);
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
        in5.z().d(this, true);
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
        if (drawable2 instanceof c69) {
            iu7 iu7Var = (iu7) ((c69) drawable2);
            lq3.q(iu7Var.r.K1).v(iu7Var);
            iu7Var.n = null;
            iu7Var.r = null;
        }
        if (drawable instanceof wl) {
            wl wlVar = (wl) drawable;
            if (this.y1) {
                wlVar.a(this);
            }
        } else if (drawable instanceof lm) {
            lm lmVar = (lm) drawable;
            View view = this.e;
            if (lmVar.s0 == null) {
                lmVar.s0 = new WeakReference(view);
            }
            if (this.y1) {
                lmVar.e(this);
            }
            if (!this.w0 && !lmVar.o0) {
                z = false;
            } else {
                z = true;
            }
            if (!lmVar.o0) {
                lmVar.w0 = z;
            }
            if (this.u0 && this.E == 0) {
                lmVar.j();
            }
            boolean z4 = this.x0;
            lmVar.E = z4;
            if (z4) {
                lmVar.x(false);
            }
        } else if (drawable instanceof b29) {
            b29 b29Var = (b29) drawable;
            if (this.y1) {
                b29Var.J0.add(this);
            }
            b29Var.F = this.t0;
            if (this.v0 && (!b29Var.u() || this.E == 0)) {
                b29Var.start();
            }
            b29Var.E(true);
        }
        this.d0 = null;
        this.c0 = null;
        this.a1.setShader(null);
        u0(drawable);
        y0(drawable);
        this.g0 = null;
        this.h0 = null;
        Drawable drawable3 = this.k0;
        if (drawable3 instanceof lm) {
            ((lm) drawable3).v(this);
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
        qn5 qn5Var = this.F;
        if (qn5Var != null) {
            qn5Var.a = null;
            qn5Var.c = null;
            qn5Var.e = null;
            qn5Var.g = null;
        }
        on5 on5Var = this.h1;
        if (on5Var != null) {
            if (this.b0 == null && this.n0 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            on5Var.v(this, z2, true, false);
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

    public final boolean h(android.graphics.Canvas r32, defpackage.ln5 r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h(android.graphics.Canvas, ln5):boolean");
    }

    public boolean h0(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.h0(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public final void i(Canvas canvas, BitmapDrawable bitmapDrawable, ln5 ln5Var, int i) {
        if (ln5Var != null) {
            if (bitmapDrawable instanceof b29) {
                b29 b29Var = (b29) bitmapDrawable;
                float f = ln5Var.u;
                float f2 = ln5Var.v;
                float f3 = ln5Var.t;
                float f4 = ln5Var.s;
                ColorFilter colorFilter = ln5Var.z;
                int i2 = ln5Var.d;
                Paint[] paintArr = b29Var.k0;
                RectF[] rectFArr = b29Var.j0;
                if (rectFArr[i2] == null) {
                    rectFArr[i2] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i2] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i2].setAlpha(i);
                paintArr[i2].setColorFilter(colorFilter);
                rectFArr[i2].set(f, f2, f + f3, f4 + f2);
                b29Var.l(canvas, null, true, 0L, i2);
                return;
            } else if (bitmapDrawable instanceof lm) {
                lm lmVar = (lm) bitmapDrawable;
                float f5 = ln5Var.u;
                float f6 = ln5Var.v;
                float f7 = ln5Var.t;
                float f8 = ln5Var.s;
                ColorFilter colorFilter2 = ln5Var.z;
                int i3 = ln5Var.d;
                Paint[] paintArr2 = lmVar.r0;
                RectF[] rectFArr2 = lmVar.q0;
                if (rectFArr2[i3] == null) {
                    rectFArr2[i3] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i3] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i3].setAlpha(i);
                paintArr2[i3].setColorFilter(colorFilter2);
                rectFArr2[i3].set(f5, f6, f7 + f5, f8 + f6);
                lmVar.l(canvas, true, 0L, i3);
                return;
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    Paint paint3 = ln5Var.A;
                    if (paint3 == null) {
                        paint3 = new Paint(1);
                        ln5Var.A = paint3;
                    }
                    paint3.setAlpha(i);
                    ln5Var.A.setColorFilter(ln5Var.z);
                    canvas.save();
                    canvas.translate(ln5Var.u, ln5Var.v);
                    canvas.scale(ln5Var.t / bitmap.getWidth(), ln5Var.s / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, ln5Var.A);
                    canvas.restore();
                    return;
                }
                return;
            }
        }
        bitmapDrawable.setAlpha(i);
        if (bitmapDrawable instanceof b29) {
            ((b29) bitmapDrawable).l(canvas, null, false, this.s, 0);
        } else if (bitmapDrawable instanceof lm) {
            ((lm) bitmapDrawable).l(canvas, false, this.s, 0);
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

    public final void j(android.graphics.Canvas r40, android.graphics.drawable.Drawable r41, int r42, android.graphics.BitmapShader r43, int r44, int r45, int r46, defpackage.ln5 r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.j(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, ln5):void");
    }

    public final void j0(Rect rect) {
        if (rect != null) {
            this.L0 = rect.left;
            this.M0 = rect.top;
            this.N0 = rect.width();
            this.O0 = rect.height();
        }
    }

    public final void k(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, ln5 ln5Var) {
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
            j(canvas, drawable, i, bitmapShader, i2, i3, i4, ln5Var);
            j(canvas, drawable, (int) (i * this.u1), bitmapShader, i2, i3, this.v1, ln5Var);
            return;
        }
        j(canvas, drawable, i, bitmapShader, i2, i3, i4, ln5Var);
    }

    public final void k0(RectF rectF) {
        if (rectF != null) {
            this.L0 = rectF.left;
            this.M0 = rectF.top;
            this.N0 = rectF.width();
            this.O0 = rectF.height();
        }
    }

    public final wl l() {
        Drawable drawable = this.k0;
        if (drawable instanceof wl) {
            return (wl) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof wl) {
            return (wl) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof wl) {
            return (wl) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof wl) {
            return (wl) drawable4;
        }
        return null;
    }

    public final void l0(int i) {
        this.N0 = i;
    }

    public final lm m() {
        Drawable drawable = this.k0;
        if (drawable instanceof lm) {
            return (lm) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof lm) {
            return (lm) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof lm) {
            return (lm) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof lm) {
            return (lm) drawable4;
        }
        return null;
    }

    public final void m0(int i) {
        this.x = i;
        if (this.y1) {
            this.E = jn7.e().p & (~this.x);
        }
    }

    public final Bitmap n() {
        b29 y = y();
        if (y != null && y.p()) {
            if (y.R != null) {
                return y.R;
            }
            if (y.S == null) {
                return null;
            }
            return y.S;
        }
        lm m = m();
        if (m != null && m.s()) {
            return m.m();
        }
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof lm) && !(drawable instanceof b29)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.T;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof lm) && !(drawable instanceof b29)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.b0;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof lm) && !(drawable instanceof b29)) {
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
        if (drawable instanceof lm) {
            ((lm) drawable).C(j, j2);
        }
    }

    public final int o() {
        lm m = m();
        if (m != null) {
            int i = this.V;
            if (i % 360 != 0 && i % 360 != 180) {
                return m.getIntrinsicWidth();
            }
            return m.getIntrinsicHeight();
        }
        b29 y = y();
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

    public final defpackage.mn5 p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.p():mn5");
    }

    public final void p0(View view) {
        this.e = view;
        lm m = m();
        if (m != null && this.y1) {
            View view2 = this.e;
            if (m.s0 == null) {
                m.s0 = new WeakReference(view2);
            }
        }
    }

    public final int q() {
        lm m = m();
        if (m != null) {
            int i = this.V;
            if (i % 360 != 0 && i % 360 != 180) {
                return m.getIntrinsicHeight();
            }
            return m.getIntrinsicWidth();
        }
        b29 y = y();
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

    public final mn5 u() {
        String str;
        Drawable drawable = this.k0;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof lm) && !(drawable instanceof b29)) {
            str = this.i0;
        } else {
            Drawable drawable2 = this.T;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof lm) && !(drawable instanceof b29)) {
                str = this.R;
            } else {
                drawable2 = this.b0;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof lm) && !(drawable instanceof b29)) {
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
            in5.z().D(obj.a);
        }
        return obj;
    }

    public final void u0(Drawable drawable) {
        zx zxVar;
        Drawable drawable2 = this.n0;
        if (drawable != drawable2) {
            if (drawable2 instanceof zx) {
                if (!drawable2.equals(drawable)) {
                    zxVar = (zx) this.n0;
                } else {
                    return;
                }
            } else {
                zxVar = null;
            }
            this.n0 = drawable;
            if (this.y1 && (drawable instanceof zx)) {
                ((zx) drawable).c(this);
            }
            if (this.y1 && zxVar != null) {
                zxVar.b(this);
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
                hv8 hv8Var = this.F1;
                if (hv8Var != null) {
                    hv8Var.run();
                }
            }
        }
    }

    public final float w() {
        return this.L0 + this.N0;
    }

    public final void w0(boolean z) {
        lm m = m();
        if (m != null) {
            boolean z2 = this.w0;
            if (!m.o0) {
                m.w0 = z2;
            }
            m.start();
            return;
        }
        b29 y = y();
        if (y != null && !y.l0) {
            y.C(z);
        }
    }

    public final float x() {
        return this.M0 + this.O0;
    }

    public final void x0() {
        lm m = m();
        if (m != null) {
            m.stop();
            return;
        }
        b29 y = y();
        if (y != null) {
            y.stop();
        }
    }

    public final b29 y() {
        Drawable drawable = this.k0;
        if (drawable instanceof b29) {
            return (b29) drawable;
        }
        Drawable drawable2 = this.T;
        if (drawable2 instanceof b29) {
            return (b29) drawable2;
        }
        Drawable drawable3 = this.b0;
        if (drawable3 instanceof b29) {
            return (b29) drawable3;
        }
        Drawable drawable4 = this.n0;
        if (drawable4 instanceof b29) {
            return (b29) drawable4;
        }
        return null;
    }

    public final void y0(Drawable drawable) {
        if (drawable != null) {
            int[] z = z();
            boolean z2 = false;
            if (drawable instanceof jj2) {
                jj2 jj2Var = (jj2) drawable;
                float f = z[0];
                float f2 = z[1];
                float f3 = z[2];
                float f4 = z[3];
                float[] fArr = jj2Var.f;
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
                jj2Var.e = z2;
                jj2Var.a();
            } else if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof rb0)) {
                R(drawable, null);
            } else if (drawable instanceof rb0) {
                ((rb0) drawable).r = z[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof b29)) {
                    if (bitmapDrawable instanceof lm) {
                        ((lm) drawable).B(z);
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
