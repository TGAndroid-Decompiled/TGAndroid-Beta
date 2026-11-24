package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class af4 extends kf4 {
    public final bf4 F;

    public af4(bf4 bf4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = bf4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        cf4 cf4Var = this.F.d;
        cf4Var.U1.remove(tL_exportedChatlistInvite);
        cf4Var.b1();
        cf4Var.c1(true);
    }

    @Override
    public final void c() {
        bu5 G = bu5.G(this.F.d.c, null, this);
        G.b(2131232109, jb6.M0(2131751699, null), new Runnable(this) {
            public final af4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                af4 af4Var = this.b;
                switch (b) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        af4Var.d();
                        return;
                    default:
                        af4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232326, jb6.M0(2131750405, null), new Runnable(this) {
            public final af4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                af4 af4Var = this.b;
                switch (b) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        af4Var.d();
                        return;
                    default:
                        af4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232114, jb6.M0(2131751471, null), new Runnable(this) {
            public final af4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                af4 af4Var = this.b;
                switch (b) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        af4Var.d();
                        return;
                    default:
                        af4Var.a();
                        return;
                }
            }
        }, true);
        if (jb6.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
