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
public final class ag8 extends Drawable implements cr3, zw9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public k47 I;
    public double J;
    public int K;
    public final ax9 L;
    public float M;
    public float N;
    public meb O;
    public bk2 P;
    public Drawable Q;
    public bd4 R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final fn0 a;
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
    public uib n;
    public uib r;
    public uib s;
    public uib w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = 255;

    public ag8(int i, ViewGroup viewGroup, ylb ylbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(gm.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, ylbVar);
        this.d = viewGroup;
        ax9 ax9Var = new ax9(viewGroup);
        this.L = ax9Var;
        ax9Var.h = this;
        this.a = new fn0(180L, viewGroup, uo.a);
        this.e0 = er3.q(i).k();
    }

    @Override
    public final void A(boolean z) {
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
        uib uibVar = this.n;
        if (uibVar != null) {
            if (z) {
                i2 = cmb.vc;
            } else {
                i2 = cmb.te;
            }
            uibVar.m(cmb.w0(null, i2, false));
        }
        this.x.setColor(1711276032);
        uib uibVar2 = this.w;
        if (uibVar2 != null) {
            uibVar2.m(-1);
        }
        meb mebVar = this.O;
        if (mebVar != null) {
            if (z) {
                i = cmb.Fc;
            } else {
                i = cmb.gf;
            }
            mebVar.m = i;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(cmb.bf, cmb.cf, cmb.df, cmb.ef);
            return;
        }
        ax9 ax9Var = this.L;
        if (z) {
            int w0 = cmb.w0(null, cmb.mc, false);
            int w02 = cmb.w0(null, cmb.nc, false);
            int i3 = cmb.pc;
            ax9Var.f(w0, w02, cmb.w0(null, i3, false), cmb.w0(null, i3, false), cmb.w0(null, cmb.oc, false));
            radialProgress2.g(cmb.Dc, cmb.Ec, cmb.Fb, cmb.Gb);
            return;
        }
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        int w03 = cmb.w0(null, cmb.ke, false);
        int w04 = cmb.w0(null, cmb.le, false);
        int i4 = cmb.ne;
        ax9Var.f(w03, w04, cmb.w0(null, i4, false), cmb.w0(null, i4, false), cmb.w0(null, cmb.me, false));
    }

    public final void c() {
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
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
        int L = width - gm.L(f);
        if (this.a0 != L || z) {
            this.a0 = L;
            String str = this.e;
            if (str != null) {
                uib uibVar = this.n;
                if (uibVar == null) {
                    uibVar = new uib(str, 15.0f, gm.o());
                    this.n = uibVar;
                }
                uibVar.p(TextUtils.ellipsize(this.e, uibVar.a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                uib uibVar2 = this.r;
                if (uibVar2 == null) {
                    uibVar2 = new uib(str2, 14.0f, null);
                    this.r = uibVar2;
                }
                uibVar2.p(TextUtils.ellipsize(this.f, uibVar2.a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                uib uibVar3 = this.s;
                if (uibVar3 == null) {
                    uibVar3 = new uib(str3, 12.0f, null);
                    this.s = uibVar3;
                }
                uibVar3.p(TextUtils.ellipsize(this.h, uibVar3.a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new uib(gm.g0(this.K, true, false), 12.0f, null);
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
                    int z2 = (int) aq1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - d53.k.getInterpolation(imageReceiver.i1)) * gm.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(z2, interpolation, intrinsicWidth + z2, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.p(bounds.centerX() - gm.L(22.0f), bounds.centerY() - gm.L(22.0f), gm.L(22.0f) + bounds.centerX(), gm.L(22.0f) + bounds.centerY());
                if (this.H && this.w != null) {
                    canvas.drawRoundRect(gm.L(6.0f) + bounds.left, gm.L(6.0f) + bounds.top, bounds.left + this.w.c + gm.L(18.0f), gm.L(23.0f) + bounds.top, gm.L(8.5f), gm.L(8.5f), this.x);
                    this.w.e(canvas, gm.L(12.0f) + bounds.left, gm.L(15.0f) + bounds.top);
                }
            } else {
                int i4 = bounds.left;
                boolean z3 = this.E;
                if (z3) {
                    L = 0;
                } else {
                    L = gm.L(8.0f);
                }
                int i5 = i4 + L;
                int i6 = bounds.top;
                if (z3) {
                    L2 = 0;
                } else {
                    L2 = gm.L(3.0f);
                }
                int i7 = i6 + L2;
                if (!this.Y) {
                    i2 = gm.L(3.0f);
                }
                uib uibVar = this.n;
                if (uibVar != null) {
                    uibVar.e(canvas, gm.L(56.0f) + i5, gm.L(15.0f) + i7 + i2);
                }
                if (this.Y) {
                    float f = this.a.e;
                    if (this.r != null && f < 1.0f) {
                        canvas.save();
                        float f2 = 1.0f - f;
                        int i8 = i7 + i2;
                        canvas.scale(f2, f2, gm.L(56.0f) + i5, gm.L(35.0f) + i8);
                        this.r.a.setAlpha((int) (f2 * 255.0f));
                        this.r.e(canvas, gm.L(56.0f) + i5, gm.L(35.0f) + i8);
                        canvas.restore();
                    }
                    if (f > 0.0f) {
                        ax9 ax9Var = this.L;
                        ax9Var.t = f;
                        ax9Var.h(wi8.B(56.0f, i5, bounds.right), gm.L(30.0f));
                        canvas.save();
                        float L3 = gm.L(45.0f) + i5;
                        this.M = L3;
                        float L4 = gm.L(21.0f) + i7 + i2;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        ax9Var.b(canvas);
                        canvas.restore();
                    }
                }
                uib uibVar2 = this.s;
                if (uibVar2 != null) {
                    float L5 = gm.L(56.0f) + i5;
                    int i9 = i2 + i7;
                    if (this.Y) {
                        i = 20;
                    } else {
                        i = 2;
                    }
                    uibVar2.e(canvas, L5, gm.L(i + 34) + i9);
                }
                int L6 = gm.L(2.0f) + i5;
                this.b0 = L6;
                int L7 = gm.L(5.0f) + i7;
                this.c0 = L7;
                radialProgress2.p(L6, L7, gm.L(44.0f) + gm.L(2.0f) + i5, gm.L(44.0f) + gm.L(5.0f) + i7);
            }
            if (!this.Z) {
                k47 k47Var = this.I;
                if (k47Var != null && k47Var.n4()) {
                    if (fn5.z().t(this.G) == null) {
                        radialProgress2.o(true, 1.0f);
                        if (this.Y) {
                            n(6, true);
                        } else {
                            m(6);
                        }
                    }
                } else {
                    bd4 bd4Var = this.R;
                    if (bd4Var != null && bd4Var.g) {
                        if (this.Y) {
                            n(3, true);
                        } else {
                            m(3);
                        }
                    } else if (this.Y) {
                        if (bd4Var != null && bd4Var.f) {
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
                bd4 bd4Var = this.R;
                if (bd4Var != null && bd4Var.f) {
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
            return gm.L(63.0f);
        }
        if (this.X) {
            return gm.L(56.0f);
        }
        int i3 = this.V;
        if (i3 == 0) {
            return gm.L(100.0f);
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
            k47 k47Var = MediaController.w().v0;
            k47Var.b0 = f;
            k47Var.i0 = (int) (k47Var.L0() * f);
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
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
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
            int L = gm.L(36.0f);
            int L2 = gm.L(27.0f);
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
                bd4 bd4Var = this.R;
                if (bd4Var != null) {
                    TLRPC.Document document = bd4Var.b;
                    int i4 = bd4Var.a;
                    if (bd4Var.g) {
                        bc4.G(i4).f(document);
                        bd4Var.a();
                    } else if (!bd4Var.f) {
                        bc4.G(i4).X(document, bd4Var.d, 2, 0);
                        bd4Var.a();
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
        bd4 bd4Var = this.R;
        if (bd4Var != null) {
            bd4Var.a();
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

    public final void o(defpackage.k47 r26, org.telegram.tgnet.TLRPC.MessageMedia r27, defpackage.k47 r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag8.o(k47, org.telegram.tgnet.TLRPC$MessageMedia, k47, int, java.lang.String, boolean):void");
    }

    public final void p(boolean z) {
        int i;
        if (this.Y && this.I != null) {
            k47 k47Var = MediaController.w().v0;
            boolean j = j();
            this.a.a(j, z);
            if (k47Var != null && j) {
                i = k47Var.i0;
                ax9 ax9Var = this.L;
                if (!ax9Var.e) {
                    ax9Var.g(k47Var.b0);
                    ax9Var.q = k47Var.g0;
                }
                ax9Var.i(k47Var);
            } else {
                i = 0;
            }
            if (this.h0 != i) {
                this.h0 = i;
                this.h = gm.k0(i, (int) this.J);
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
