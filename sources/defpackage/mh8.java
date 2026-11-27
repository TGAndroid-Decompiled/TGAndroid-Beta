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
public final class mh8 extends Drawable implements jq3, qy9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public r47 I;
    public double J;
    public int K;
    public final ry9 L;
    public float M;
    public float N;
    public ggb O;
    public jj2 P;
    public Drawable Q;
    public yc4 R;
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
    public pkb n;
    public pkb r;
    public pkb s;
    public pkb w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = 255;

    public mh8(int i, ViewGroup viewGroup, vnb vnbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, vnbVar);
        this.d = viewGroup;
        ry9 ry9Var = new ry9(viewGroup);
        this.L = ry9Var;
        ry9Var.h = this;
        this.a = new fm0(180L, viewGroup, un.a);
        this.e0 = lq3.q(i).k();
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
        pkb pkbVar = this.n;
        if (pkbVar != null) {
            if (z) {
                i2 = aob.wc;
            } else {
                i2 = aob.ue;
            }
            pkbVar.m(aob.w0(null, i2, false));
        }
        this.x.setColor(1711276032);
        pkb pkbVar2 = this.w;
        if (pkbVar2 != null) {
            pkbVar2.m(-1);
        }
        ggb ggbVar = this.O;
        if (ggbVar != null) {
            if (z) {
                i = aob.Gc;
            } else {
                i = aob.hf;
            }
            ggbVar.m = i;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
            return;
        }
        ry9 ry9Var = this.L;
        if (z) {
            int w0 = aob.w0(null, aob.nc, false);
            int w02 = aob.w0(null, aob.oc, false);
            int i3 = aob.qc;
            ry9Var.f(w0, w02, aob.w0(null, i3, false), aob.w0(null, i3, false), aob.w0(null, aob.pc, false));
            radialProgress2.g(aob.Ec, aob.Fc, aob.Gb, aob.Hb);
            return;
        }
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        int w03 = aob.w0(null, aob.le, false);
        int w04 = aob.w0(null, aob.me, false);
        int i4 = aob.oe;
        ry9Var.f(w03, w04, aob.w0(null, i4, false), aob.w0(null, i4, false), aob.w0(null, aob.ne, false));
    }

    public final void c() {
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
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
        int L = width - hl.L(f);
        if (this.a0 != L || z) {
            this.a0 = L;
            String str = this.e;
            if (str != null) {
                pkb pkbVar = this.n;
                if (pkbVar == null) {
                    pkbVar = new pkb(str, 15.0f, hl.o());
                    this.n = pkbVar;
                }
                pkbVar.p(TextUtils.ellipsize(this.e, pkbVar.a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                pkb pkbVar2 = this.r;
                if (pkbVar2 == null) {
                    pkbVar2 = new pkb(str2, 14.0f, null);
                    this.r = pkbVar2;
                }
                pkbVar2.p(TextUtils.ellipsize(this.f, pkbVar2.a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                pkb pkbVar3 = this.s;
                if (pkbVar3 == null) {
                    pkbVar3 = new pkb(str3, 12.0f, null);
                    this.s = pkbVar3;
                }
                pkbVar3.p(TextUtils.ellipsize(this.h, pkbVar3.a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new pkb(hl.g0(this.K, true, false), 12.0f, null);
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
                    int z2 = (int) bp1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - k43.k.getInterpolation(imageReceiver.i1)) * hl.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(z2, interpolation, intrinsicWidth + z2, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.p(bounds.centerX() - hl.L(22.0f), bounds.centerY() - hl.L(22.0f), hl.L(22.0f) + bounds.centerX(), hl.L(22.0f) + bounds.centerY());
                if (this.H && this.w != null) {
                    canvas.drawRoundRect(hl.L(6.0f) + bounds.left, hl.L(6.0f) + bounds.top, bounds.left + this.w.c + hl.L(18.0f), hl.L(23.0f) + bounds.top, hl.L(8.5f), hl.L(8.5f), this.x);
                    this.w.e(canvas, hl.L(12.0f) + bounds.left, hl.L(15.0f) + bounds.top);
                }
            } else {
                int i4 = bounds.left;
                boolean z3 = this.E;
                if (z3) {
                    L = 0;
                } else {
                    L = hl.L(8.0f);
                }
                int i5 = i4 + L;
                int i6 = bounds.top;
                if (z3) {
                    L2 = 0;
                } else {
                    L2 = hl.L(3.0f);
                }
                int i7 = i6 + L2;
                if (!this.Y) {
                    i2 = hl.L(3.0f);
                }
                pkb pkbVar = this.n;
                if (pkbVar != null) {
                    pkbVar.e(canvas, hl.L(56.0f) + i5, hl.L(15.0f) + i7 + i2);
                }
                if (this.Y) {
                    float f = this.a.e;
                    if (this.r != null && f < 1.0f) {
                        canvas.save();
                        float f2 = 1.0f - f;
                        int i8 = i7 + i2;
                        canvas.scale(f2, f2, hl.L(56.0f) + i5, hl.L(35.0f) + i8);
                        this.r.a.setAlpha((int) (f2 * 255.0f));
                        this.r.e(canvas, hl.L(56.0f) + i5, hl.L(35.0f) + i8);
                        canvas.restore();
                    }
                    if (f > 0.0f) {
                        ry9 ry9Var = this.L;
                        ry9Var.t = f;
                        ry9Var.h(ik8.B(56.0f, i5, bounds.right), hl.L(30.0f));
                        canvas.save();
                        float L3 = hl.L(45.0f) + i5;
                        this.M = L3;
                        float L4 = hl.L(21.0f) + i7 + i2;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        ry9Var.b(canvas);
                        canvas.restore();
                    }
                }
                pkb pkbVar2 = this.s;
                if (pkbVar2 != null) {
                    float L5 = hl.L(56.0f) + i5;
                    int i9 = i2 + i7;
                    if (this.Y) {
                        i = 20;
                    } else {
                        i = 2;
                    }
                    pkbVar2.e(canvas, L5, hl.L(i + 34) + i9);
                }
                int L6 = hl.L(2.0f) + i5;
                this.b0 = L6;
                int L7 = hl.L(5.0f) + i7;
                this.c0 = L7;
                radialProgress2.p(L6, L7, hl.L(44.0f) + hl.L(2.0f) + i5, hl.L(44.0f) + hl.L(5.0f) + i7);
            }
            if (!this.Z) {
                r47 r47Var = this.I;
                if (r47Var != null && r47Var.n4()) {
                    if (in5.z().t(this.G) == null) {
                        radialProgress2.o(true, 1.0f);
                        if (this.Y) {
                            n(6, true);
                        } else {
                            m(6);
                        }
                    }
                } else {
                    yc4 yc4Var = this.R;
                    if (yc4Var != null && yc4Var.g) {
                        if (this.Y) {
                            n(3, true);
                        } else {
                            m(3);
                        }
                    } else if (this.Y) {
                        if (yc4Var != null && yc4Var.f) {
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
            return !MediaController.z().G();
        }
        if (!this.H && !z) {
            if (this.X) {
                yc4 yc4Var = this.R;
                if (yc4Var != null && yc4Var.f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    public final int f(int i) {
        int i2;
        if (this.Y) {
            return hl.L(63.0f);
        }
        if (this.X) {
            return hl.L(56.0f);
        }
        int i3 = this.V;
        if (i3 == 0) {
            return hl.L(100.0f);
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
    public final void g(float f) {
        if (j()) {
            MediaController.z().k0(MediaController.z().v0, f);
            p(true);
        }
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
            r47 r47Var = MediaController.z().v0;
            r47Var.b0 = f;
            r47Var.i0 = (int) (r47Var.L0() * f);
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
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
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
        if (this.Y && MediaController.z().H(this.I) && MediaController.z().v0 != null && MediaController.z().v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f, float f2, int i) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i == 0) {
            int L = hl.L(36.0f);
            int L2 = hl.L(27.0f);
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
                yc4 yc4Var = this.R;
                if (yc4Var != null) {
                    TLRPC.Document document = yc4Var.b;
                    int i4 = yc4Var.a;
                    if (yc4Var.g) {
                        xb4.G(i4).f(document);
                        yc4Var.a();
                    } else if (!yc4Var.f) {
                        xb4.G(i4).X(document, yc4Var.d, 2, 0);
                        yc4Var.a();
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
        yc4 yc4Var = this.R;
        if (yc4Var != null) {
            yc4Var.a();
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

    public final void o(defpackage.r47 r26, org.telegram.tgnet.TLRPC.MessageMedia r27, defpackage.r47 r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.o(r47, org.telegram.tgnet.TLRPC$MessageMedia, r47, int, java.lang.String, boolean):void");
    }

    public final void p(boolean z) {
        int i;
        if (this.Y && this.I != null) {
            r47 r47Var = MediaController.z().v0;
            boolean j = j();
            this.a.a(j, z);
            if (r47Var != null && j) {
                i = r47Var.i0;
                ry9 ry9Var = this.L;
                if (!ry9Var.e) {
                    ry9Var.g(r47Var.b0);
                    ry9Var.q = r47Var.g0;
                }
                ry9Var.i(r47Var);
            } else {
                i = 0;
            }
            if (this.h0 != i) {
                this.h0 = i;
                this.h = hl.k0(i, (int) this.J);
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
