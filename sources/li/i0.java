package li;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.y20;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.k71;
import org.telegram.ui.mk;
import org.telegram.ui.re;
public final class i0 implements Runnable {
    public final int f12085a;
    public final x0 f12086b;
    public final long f12087c;

    public i0(x0 x0Var, long j10, int i10) {
        this.f12085a = i10;
        this.f12086b = x0Var;
        this.f12087c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        mk mkVar;
        k71 k71Var;
        switch (this.f12085a) {
            case 0:
                x0 x0Var = this.f12086b;
                long j12 = this.f12087c;
                if (x0Var.Z == 6) {
                    x0Var.H = j12;
                    x0Var.N = 0L;
                    x0Var.J = 0L;
                    x0Var.K = j12;
                    x0Var.w(2);
                    x0Var.f12316l.X(x0Var.T, x0Var.H * 1000, x0Var.f12322r);
                    return;
                }
                return;
            default:
                x0 x0Var2 = this.f12086b;
                long j13 = this.f12087c;
                if (x0Var2.Z == 4) {
                    x0Var2.N = j13;
                    long min = Math.min(x0Var2.f12321q, j13);
                    x0Var2.H = min;
                    x0Var2.J = 0L;
                    x0Var2.K = min;
                    x0Var2.f12309b.setSurfaceTextureListener(null);
                    x0Var2.f12309b.setTransform(x0Var2.h);
                    i2.i0 a2 = new i2.n(x0Var2.f12307a).a();
                    x0Var2.V = a2;
                    a2.z1(x0Var2.f12309b);
                    x0Var2.V.s0(b2.p0.b(Uri.fromFile(x0Var2.U)));
                    x0Var2.V.k(0);
                    x0Var2.V.S(1.0f);
                    x0Var2.V.o0(x0Var2.Y);
                    x0Var2.V.a();
                    x0Var2.V.Z0(5, x0Var2.J);
                    x0Var2.f12317m.b("preview player prepared: durationMs=" + x0Var2.H + ", trim=" + x0Var2.J + ".." + x0Var2.K);
                    x0Var2.w(5);
                    k2.m0 m0Var = x0Var2.d;
                    long j14 = x0Var2.H;
                    long j15 = x0Var2.J;
                    long j16 = x0Var2.K;
                    ((d50) m0Var.f10701a).f25404w.setProgress(((float) j14) / 60000.0f);
                    d50 d50Var = (d50) m0Var.f10701a;
                    d50Var.f25388i0 = false;
                    d50Var.H.setAlpha(0.0f);
                    d50 d50Var2 = (d50) m0Var.f10701a;
                    if (d50Var2.U == null) {
                        x0 x0Var3 = d50Var2.O;
                        if (x0Var3 == null) {
                            file = null;
                        } else {
                            x0.u();
                            file = x0Var3.U;
                        }
                        if (file != null) {
                            d50 d50Var3 = (d50) m0Var.f10701a;
                            d50Var3.T = d50Var3.s(file, j14, null);
                            d50 d50Var4 = (d50) m0Var.f10701a;
                            y20 y20Var = d50Var4.T;
                            if (j15 > 0) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            y20Var.f19526a = j10;
                            if (j16 < j14) {
                                j11 = j16;
                            } else {
                                j11 = -1;
                            }
                            y20Var.f19528b = j11;
                            at.f(d50Var4.f25384f).k(162, Integer.valueOf(((d50) m0Var.f10701a).h), ((d50) m0Var.f10701a).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j14);
                            float f7 = ((float) j15) / max;
                            float f10 = ((float) j16) / max;
                            i50 i50Var = ((d50) m0Var.f10701a).f27283b;
                            if (i50Var != null && (mkVar = ((re) i50Var).f41066b.Z) != null && (k71Var = mkVar.f23708f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                                k71Var.f27759b = max2;
                                k71Var.f27760c = Math.max(max2, Math.min(1.0f, f10));
                                k71Var.invalidate();
                            }
                        }
                    }
                    x0Var2.r();
                    return;
                }
                return;
        }
    }
}
