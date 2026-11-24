package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class yd8 extends Drawable implements sp3, wu9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public k27 I;
    public double J;
    public int K;
    public final xu9 L;
    public float M;
    public float N;
    public kcb O;
    public ni2 P;
    public Drawable Q;
    public bb4 R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final fm0 a;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final ViewGroup d;
    public String e;
    public final int e0;
    public String f;
    public int f0;
    public byte g0;
    public String h;
    public int h0;
    public tgb n;
    public tgb r;
    public tgb s;
    public tgb w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = 255;

    public yd8(int i, ViewGroup viewGroup, wjb wjbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, wjbVar);
        this.d = viewGroup;
        xu9 xu9Var = new xu9(viewGroup);
        this.L = xu9Var;
        xu9Var.h = this;
        this.a = new fm0(180L, viewGroup, tn.a);
        this.e0 = up3.q(i).k();
    }

    @Override
    public final void B(boolean z) {
        c();
    }

    @Override
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.b.I();
        this.y.e();
    }

    public final void b(boolean z) {
        int i;
        int i2;
        tgb tgbVar = this.n;
        if (tgbVar != null) {
            if (z) {
                i2 = bkb.vc;
            } else {
                i2 = bkb.te;
            }
            tgbVar.m(bkb.w0(null, i2, false));
        }
        this.x.setColor(1711276032);
        tgb tgbVar2 = this.w;
        if (tgbVar2 != null) {
            tgbVar2.m(-1);
        }
        kcb kcbVar = this.O;
        if (kcbVar != null) {
            if (z) {
                i = bkb.Fc;
            } else {
                i = bkb.gf;
            }
            kcbVar.m = i;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            return;
        }
        xu9 xu9Var = this.L;
        if (z) {
            int w0 = bkb.w0(null, bkb.mc, false);
            int w02 = bkb.w0(null, bkb.nc, false);
            int i3 = bkb.pc;
            xu9Var.f(w0, w02, bkb.w0(null, i3, false), bkb.w0(null, i3, false), bkb.w0(null, bkb.oc, false));
            radialProgress2.g(bkb.Dc, bkb.Ec, bkb.Fb, bkb.Gb);
            return;
        }
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        int w03 = bkb.w0(null, bkb.ke, false);
        int w04 = bkb.w0(null, bkb.le, false);
        int i4 = bkb.ne;
        xu9Var.f(w03, w04, bkb.w0(null, i4, false), bkb.w0(null, i4, false), bkb.w0(null, bkb.me, false));
    }

    public final void c() {
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z) {
        float f;
        int width = getBounds().width();
        if (this.E) {
            f = 64.0f;
        } else {
            f = 72.0f;
        }
        int L = width - gl.L(f);
        if (this.a0 != L || z) {
            this.a0 = L;
            String str = this.e;
            if (str != null) {
                tgb tgbVar = this.n;
                if (tgbVar == null) {
                    tgbVar = new tgb(str, 15.0f, gl.o());
                    this.n = tgbVar;
                }
                tgbVar.p(TextUtils.ellipsize(this.e, tgbVar.a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                tgb tgbVar2 = this.r;
                if (tgbVar2 == null) {
                    tgbVar2 = new tgb(str2, 14.0f, null);
                    this.r = tgbVar2;
                }
                tgbVar2.p(TextUtils.ellipsize(this.f, tgbVar2.a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                tgb tgbVar3 = this.s;
                if (tgbVar3 == null) {
                    tgbVar3 = new tgb(str3, 12.0f, null);
                    this.s = tgbVar3;
                }
                tgbVar3.p(TextUtils.ellipsize(this.h, tgbVar3.a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new tgb(gl.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.d0 != 0 && !bounds.isEmpty()) {
            int i2 = 0;
            d(false);
            boolean z = this.X;
            int i3 = 2;
            RadialProgress2 radialProgress2 = this.y;
            if (!z && !this.Y) {
                ImageReceiver imageReceiver = this.b;
                imageReceiver.setAlpha(this.d0 / 255.0f);
                imageReceiver.j0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int z2 = (int) oo1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - s33.k.getInterpolation(imageReceiver.i1)) * gl.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(z2, interpolation, intrinsicWidth + z2, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.p(bounds.centerX() - gl.L(22.0f), bounds.centerY() - gl.L(22.0f), gl.L(22.0f) + bounds.centerX(), gl.L(22.0f) + bounds.centerY());
                if (this.H && this.w != null) {
                    canvas.drawRoundRect(gl.L(6.0f) + bounds.left, gl.L(6.0f) + bounds.top, bounds.left + this.w.c + gl.L(18.0f), gl.L(23.0f) + bounds.top, gl.L(8.5f), gl.L(8.5f), this.x);
                    this.w.e(canvas, gl.L(12.0f) + bounds.left, gl.L(15.0f) + bounds.top);
                }
            } else {
                int i4 = bounds.left;
                boolean z3 = this.E;
                if (z3) {
                    L = 0;
                } else {
                    L = gl.L(8.0f);
                }
                int i5 = i4 + L;
                int i6 = bounds.top;
                if (z3) {
                    L2 = 0;
                } else {
                    L2 = gl.L(3.0f);
                }
                int i7 = i6 + L2;
                if (!this.Y) {
                    i2 = gl.L(3.0f);
                }
                tgb tgbVar = this.n;
                if (tgbVar != null) {
                    tgbVar.e(canvas, gl.L(56.0f) + i5, gl.L(15.0f) + i7 + i2);
                }
                if (this.Y) {
                    float f = this.a.e;
                    if (this.r != null && f < 1.0f) {
                        canvas.save();
                        float f2 = 1.0f - f;
                        int i8 = i7 + i2;
                        canvas.scale(f2, f2, gl.L(56.0f) + i5, gl.L(35.0f) + i8);
                        this.r.a.setAlpha((int) (f2 * 255.0f));
                        this.r.e(canvas, gl.L(56.0f) + i5, gl.L(35.0f) + i8);
                        canvas.restore();
                    }
                    if (f > 0.0f) {
                        xu9 xu9Var = this.L;
                        xu9Var.t = f;
                        xu9Var.h(ug8.B(56.0f, i5, bounds.right), gl.L(30.0f));
                        canvas.save();
                        float L3 = gl.L(45.0f) + i5;
                        this.M = L3;
                        float L4 = gl.L(21.0f) + i7 + i2;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        xu9Var.b(canvas);
                        canvas.restore();
                    }
                }
                tgb tgbVar2 = this.s;
                if (tgbVar2 != null) {
                    float L5 = gl.L(56.0f) + i5;
                    int i9 = i2 + i7;
                    if (this.Y) {
                        i = 20;
                    } else {
                        i = 2;
                    }
                    tgbVar2.e(canvas, L5, gl.L(i + 34) + i9);
                }
                int L6 = gl.L(2.0f) + i5;
                this.b0 = L6;
                int L7 = gl.L(5.0f) + i7;
                this.c0 = L7;
                radialProgress2.p(L6, L7, gl.L(44.0f) + gl.L(2.0f) + i5, gl.L(44.0f) + gl.L(5.0f) + i7);
            }
            if (!this.Z) {
                k27 k27Var = this.I;
                if (k27Var != null && k27Var.n4()) {
                    if (fl5.z().t(this.G) == null) {
                        radialProgress2.o(true, 1.0f);
                        if (this.Y) {
                            n(6, true);
                        } else {
                            m(6);
                        }
                    }
                } else {
                    bb4 bb4Var = this.R;
                    if (bb4Var != null && bb4Var.g) {
                        if (this.Y) {
                            n(3, true);
                        } else {
                            m(3);
                        }
                    } else if (this.Y) {
                        if (bb4Var != null && bb4Var.f) {
                            i3 = 4;
                        }
                        n(i3, true);
                    } else {
                        m(e());
                    }
                }
                if (this.Y) {
                    m(e());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final int e() {
        boolean z = this.Y;
        if (z && this.a.f) {
            return !MediaController.w().C();
        }
        if (!this.H && !z) {
            if (this.X) {
                bb4 bb4Var = this.R;
                if (bb4Var != null && bb4Var.f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final void f(float f) {
        if (j()) {
            MediaController.w().h0(MediaController.w().v0, f);
            p(true);
        }
    }

    public final int g(int i) {
        int i2;
        if (this.Y) {
            return gl.L(63.0f);
        }
        if (this.X) {
            return gl.L(56.0f);
        }
        int i3 = this.V;
        if (i3 == 0) {
            return gl.L(100.0f);
        }
        int round = Math.round((i / i3) * this.W);
        if (this.E) {
            i2 = (i << 2) / 5;
        } else {
            i2 = (i * 5) / 4;
        }
        return Math.min(round, i2);
    }

    @Override
    public final int getAlpha() {
        return this.d0;
    }

    @Override
    public final int getObserverTag() {
        return this.e0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void h(float f) {
        if (j()) {
            k27 k27Var = MediaController.w().v0;
            k27Var.b0 = f;
            k27Var.i0 = (int) (k27Var.L0() * f);
            p(true);
        }
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.y.o(true, min);
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        int i = 3;
        int i2 = (min > 1.0f ? 1 : (min == 1.0f ? 0 : -1));
        if (this.Y) {
            if (i2 >= 0) {
                i = 4;
            }
            n(i, true);
        } else {
            if (i2 >= 0) {
                i = e();
            }
            m(i);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        if (this.Y && MediaController.w().D(this.I) && MediaController.w().v0 != null && MediaController.w().v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f, float f2, int i) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i == 0) {
            int L = gl.L(36.0f);
            int L2 = gl.L(27.0f);
            int i2 = this.b0 + L2;
            if (f >= i2 && f <= i2 + L) {
                int i3 = this.c0 + L2;
                if (f2 >= i3 && f2 <= i3 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z = this.S;
        if (z) {
            if (i == 1) {
                bb4 bb4Var = this.R;
                if (bb4Var != null) {
                    TLRPC.Document document = bb4Var.b;
                    int i4 = bb4Var.a;
                    if (bb4Var.g) {
                        ba4.G(i4).f(document);
                        bb4Var.a();
                    } else if (!bb4Var.f) {
                        ba4.G(i4).X(document, bb4Var.d, 2, 0);
                        bb4Var.a();
                    }
                    c();
                }
                this.S = false;
                return true;
            } else if (i == 3) {
                this.S = false;
                return true;
            }
        }
        return z;
    }

    @Override
    public final void l(long j, long j2) {
        float min;
        if (j2 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.y.o(true, min);
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        int i = 3;
        int i2 = (min > 1.0f ? 1 : (min == 1.0f ? 0 : -1));
        if (this.Y) {
            if (i2 >= 0) {
                i = 4;
            }
            n(i, true);
        } else {
            if (i2 >= 0) {
                i = e();
            }
            m(i);
        }
        this.d.invalidate();
    }

    public final void m(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            this.y.setIcon(i, true, true);
        }
    }

    public final void n(int i, boolean z) {
        if (this.g0 != i) {
            this.g0 = i;
            this.y.k(i, true, z);
        }
    }

    public final void o(defpackage.k27 r26, org.telegram.tgnet.TLRPC.MessageMedia r27, defpackage.k27 r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd8.o(k27, org.telegram.tgnet.TLRPC$MessageMedia, k27, int, java.lang.String, boolean):void");
    }

    public final void p(boolean z) {
        int i;
        if (this.Y && this.I != null) {
            k27 k27Var = MediaController.w().v0;
            boolean j = j();
            this.a.a(j, z);
            if (k27Var != null && j) {
                i = k27Var.i0;
                xu9 xu9Var = this.L;
                if (!xu9Var.e) {
                    xu9Var.g(k27Var.b0);
                    xu9Var.q = k27Var.g0;
                }
                xu9Var.i(k27Var);
            } else {
                i = 0;
            }
            if (this.h0 != i) {
                this.h0 = i;
                this.h = gl.k0(i, (int) this.J);
                d(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.d0 = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
