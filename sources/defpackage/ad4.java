package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ad4 extends jd4 {
    public final bd4 F;

    public ad4(bd4 bd4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = bd4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        cd4 cd4Var = this.F.d;
        cd4Var.U1.remove(tL_exportedChatlistInvite);
        cd4Var.b1();
        cd4Var.c1(true);
    }

    @Override
    public final void c() {
        cs5 G = cs5.G(this.F.d.c, null, this);
        G.b(2131232108, k96.M0(2131751750, null), new Runnable(this) {
            public final ad4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ad4 ad4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ad4Var.d();
                        return;
                    default:
                        ad4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232325, k96.M0(2131750456, null), new Runnable(this) {
            public final ad4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ad4 ad4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ad4Var.d();
                        return;
                    default:
                        ad4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232113, k96.M0(2131751522, null), new Runnable(this) {
            public final ad4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ad4 ad4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ad4Var.d();
                        return;
                    default:
                        ad4Var.a();
                        return;
                }
            }
        }, true);
        if (k96.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
