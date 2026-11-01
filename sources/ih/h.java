package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a30;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.d00;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.kj;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.up;
public final class h extends Drawable implements z5, kn0 {
    public final boolean D;
    public String E;
    public String F;
    public boolean G;
    public kj H;
    public double I;
    public int J;
    public final ln0 K;
    public float L;
    public float M;
    public d00 N;
    public up O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final fe.b f8539a;
    public int f8540a0;
    public final ImageReceiver f8541b;
    public int f8542b0;
    public final int f8543c;
    public final ViewGroup d;
    public final int f8545d0;
    public String e;
    public int f8546e0;
    public String f8547f;
    public int f8548f0;
    public int f8549g0;
    public String h;
    public rz0 f8550n;
    public rz0 f8551r;
    public rz0 f8552s;
    public rz0 f8553w;
    public final RadialProgress2 f8555y;
    public final Paint f8554x = new Paint(1);
    public int Z = 0;
    public int f8544c0 = 255;

    public h(int i10, ViewGroup viewGroup, p6 p6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f8541b = imageReceiver;
        imageReceiver.J0(i0.L(6.0f));
        this.f8543c = i10;
        this.D = z10;
        this.f8555y = new RadialProgress2(viewGroup, p6Var);
        this.d = viewGroup;
        ln0 ln0Var = new ln0(viewGroup);
        this.K = ln0Var;
        ln0Var.h = this;
        this.f8539a = new fe.b(viewGroup, ee.a.f6489a, 180L);
        this.f8545d0 = b6.q(i10).k();
    }

    @Override
    public final void D(boolean z10) {
        e();
    }

    @Override
    public final void N(String str) {
        e();
    }

    public final void a() {
        this.f8541b.P();
        this.f8555y.e();
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        rz0 rz0Var = this.f8550n;
        if (rz0Var != null) {
            if (z10) {
                i11 = t6.f21230tc;
            } else {
                i11 = t6.f21194re;
            }
            rz0Var.n(t6.x0(null, i11, false));
        }
        this.f8554x.setColor(1711276032);
        rz0 rz0Var2 = this.f8553w;
        if (rz0Var2 != null) {
            rz0Var2.n(-1);
        }
        d00 d00Var = this.N;
        if (d00Var != null) {
            if (z10) {
                i10 = t6.Dc;
            } else {
                i10 = t6.f20956ef;
            }
            d00Var.f15270m = i10;
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f8555y;
        if (!z11 && !this.W) {
            radialProgress2.g(t6.Ze, t6.f20881af, t6.bf, t6.f20920cf);
            return;
        }
        ln0 ln0Var = this.K;
        if (z10) {
            int x02 = t6.x0(null, t6.f21065kc, false);
            int x03 = t6.x0(null, t6.f21083lc, false);
            int i12 = t6.f21122nc;
            ln0Var.g(x02, x03, t6.x0(null, i12, false), t6.x0(null, i12, false), t6.x0(null, t6.f21102mc, false));
            radialProgress2.g(t6.Bc, t6.Cc, t6.Db, t6.Eb);
            return;
        }
        radialProgress2.g(t6.We, t6.Xe, t6.f21027id, t6.f21046jd);
        int x04 = t6.x0(null, t6.f21028ie, false);
        int x05 = t6.x0(null, t6.f21047je, false);
        int i13 = t6.f21085le;
        ln0Var.g(x04, x05, t6.x0(null, i13, false), t6.x0(null, i13, false), t6.x0(null, t6.f21067ke, false));
    }

    @Override
    public final void c(float f7) {
        if (j()) {
            MediaController.B().i0(MediaController.B().f14483u0, f7);
            p(true);
        }
    }

    @Override
    public final void d(float f7) {
        if (j()) {
            kj kjVar = MediaController.B().f14483u0;
            kjVar.f16652b0 = f7;
            kjVar.f16675g0 = (int) (kjVar.L0() * f7);
            p(true);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f8544c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f8555y;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f8541b;
                imageReceiver.setAlpha(this.f8544c0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int B = (int) c3.i0.B(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                    int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - gr.f26527k.getInterpolation(imageReceiver.f14385h1)) * i0.L(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f14385h1 * 5.0f) * 255.0f));
                    this.P.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
                    this.P.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - i0.L(22.0f), bounds.centerY() - i0.L(22.0f), i0.L(22.0f) + bounds.centerX(), i0.L(22.0f) + bounds.centerY());
                if (this.G && this.f8553w != null) {
                    canvas.drawRoundRect(i0.L(6.0f) + bounds.left, i0.L(6.0f) + bounds.top, bounds.left + this.f8553w.f30126c + i0.L(18.0f), i0.L(23.0f) + bounds.top, i0.L(8.5f), i0.L(8.5f), this.f8554x);
                    this.f8553w.e(canvas, i0.L(12.0f) + bounds.left, i0.L(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z11 = this.D;
                if (z11) {
                    L = 0;
                } else {
                    L = i0.L(8.0f);
                }
                int i14 = i13 + L;
                int i15 = bounds.top;
                if (z11) {
                    L2 = 0;
                } else {
                    L2 = i0.L(3.0f);
                }
                int i16 = i15 + L2;
                if (!this.X) {
                    i11 = i0.L(3.0f);
                }
                rz0 rz0Var = this.f8550n;
                if (rz0Var != null) {
                    rz0Var.e(canvas, i0.L(56.0f) + i14, i0.L(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f8539a.e;
                    if (this.f8551r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, i0.L(56.0f) + i14, i0.L(35.0f) + i17);
                        this.f8551r.f30124a.setAlpha((int) (f10 * 255.0f));
                        this.f8551r.e(canvas, i0.L(56.0f) + i14, i0.L(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        ln0 ln0Var = this.K;
                        ln0Var.f28226t = f7;
                        ln0Var.i(a30.w(56.0f, i14, bounds.right), i0.L(30.0f));
                        canvas.save();
                        float L3 = i0.L(45.0f) + i14;
                        this.L = L3;
                        float L4 = i0.L(21.0f) + i16 + i11;
                        this.M = L4;
                        canvas.translate(L3, L4);
                        ln0Var.b(canvas);
                        canvas.restore();
                    }
                }
                rz0 rz0Var2 = this.f8552s;
                if (rz0Var2 != null) {
                    float L5 = i0.L(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    rz0Var2.e(canvas, L5, i0.L(i10 + 34) + i18);
                }
                int L6 = i0.L(2.0f) + i14;
                this.f8540a0 = L6;
                int L7 = i0.L(5.0f) + i16;
                this.f8542b0 = L7;
                radialProgress2.r(L6, L7, i0.L(44.0f) + i0.L(2.0f) + i14, i0.L(44.0f) + i0.L(5.0f) + i16);
            }
            if (!this.Y) {
                kj kjVar = this.H;
                if (kjVar != null && kjVar.o4()) {
                    if (ic.D().x(this.F) == null) {
                        radialProgress2.p(true, 1.0f);
                        if (this.X) {
                            m(6, true);
                        } else {
                            l(6);
                        }
                    }
                } else {
                    a aVar = this.Q;
                    if (aVar != null && aVar.f8520g) {
                        if (this.X) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f8519f) {
                            i12 = 4;
                        }
                        m(i12, true);
                    } else {
                        l(g());
                    }
                }
                if (this.X) {
                    l(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        float f7;
        int width = getBounds().width();
        if (this.D) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int L = width - i0.L(f7);
        if (this.Z != L || z10) {
            this.Z = L;
            String str = this.e;
            if (str != null) {
                if (this.f8550n == null) {
                    this.f8550n = new rz0(str, 15.0f, i0.o());
                }
                rz0 rz0Var = this.f8550n;
                rz0Var.q(TextUtils.ellipsize(this.e, rz0Var.f30124a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f8547f;
            if (str2 != null) {
                if (this.f8551r == null) {
                    this.f8551r = new rz0(str2, 14.0f, null);
                }
                rz0 rz0Var2 = this.f8551r;
                rz0Var2.q(TextUtils.ellipsize(this.f8547f, rz0Var2.f30124a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f8552s == null) {
                    this.f8552s = new rz0(str3, 12.0f, null);
                }
                rz0 rz0Var3 = this.f8552s;
                rz0Var3.q(TextUtils.ellipsize(this.h, rz0Var3.f30124a, L, TextUtils.TruncateAt.END));
            }
            if (this.G && this.f8553w == null) {
                this.f8553w = new rz0(i0.g0(this.J, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f8539a.f7022f) {
            return !MediaController.B().H();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f8519f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final int getAlpha() {
        return this.f8544c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f8545d0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        int i11;
        if (this.X) {
            return i0.L(63.0f);
        }
        if (this.W) {
            return i0.L(56.0f);
        }
        int i12 = this.U;
        if (i12 == 0) {
            return i0.L(100.0f);
        }
        int round = Math.round((i10 / i12) * this.V);
        if (this.D) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f8555y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            m(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            l(i10);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        if (this.X && MediaController.B().I(this.H) && MediaController.B().f14483u0 != null && MediaController.B().f14483u0.f16691k0 == this.D) {
            return true;
        }
        return false;
    }

    public final boolean k(float f7, float f10, int i10) {
        if (!this.X || this.f8548f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int L = i0.L(36.0f);
            int L2 = i0.L(27.0f);
            int i11 = this.f8540a0 + L2;
            if (f7 >= i11 && f7 <= i11 + L) {
                int i12 = this.f8542b0 + L2;
                if (f10 >= i12 && f10 <= i12 + L) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z10 = this.R;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f8517b;
                    int i13 = aVar.f8516a;
                    if (aVar.f8520g) {
                        b8.G(i13).f(document);
                        aVar.a();
                    } else if (!aVar.f8519f) {
                        b8.G(i13).X(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.R = false;
                return true;
            } else if (i10 == 3) {
                this.R = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i10) {
        if (this.f8546e0 != i10) {
            this.f8546e0 = i10;
            this.f8555y.setIcon(i10, true, true);
        }
    }

    public final void m(int i10, boolean z10) {
        if (this.f8548f0 != i10) {
            this.f8548f0 = i10;
            this.f8555y.k(i10, true, z10);
        }
    }

    public final void n(org.telegram.messenger.kj r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.kj r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: ih.h.n(org.telegram.messenger.kj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.kj, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f8555y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            m(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            l(i10);
        }
        this.d.invalidate();
    }

    public final void p(boolean z10) {
        int i10;
        if (this.X && this.H != null) {
            kj kjVar = MediaController.B().f14483u0;
            boolean j10 = j();
            this.f8539a.a(j10, z10);
            if (kjVar != null && j10) {
                i10 = kjVar.f16675g0;
                ln0 ln0Var = this.K;
                if (!ln0Var.e) {
                    ln0Var.h(kjVar.f16652b0);
                    ln0Var.f28223q = kjVar.f16665e0;
                }
                ln0Var.j(kjVar);
            } else {
                i10 = 0;
            }
            if (this.f8549g0 != i10) {
                this.f8549g0 = i10;
                this.h = i0.k0(i10, (int) this.I);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f8544c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
