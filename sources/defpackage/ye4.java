package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ye4 extends hf4 {
    public final ze4 F;

    public ye4(ze4 ze4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = ze4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        af4 af4Var = this.F.d;
        af4Var.U1.remove(tL_exportedChatlistInvite);
        af4Var.c1();
        af4Var.d1(true);
    }

    @Override
    public final void c() {
        fu5 G = fu5.G(this.F.d.c, null, this);
        G.b(2131232108, ob6.M0(2131751727, null), new Runnable(this) {
            public final ye4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ye4 ye4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ye4Var.d();
                        return;
                    default:
                        ye4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232325, ob6.M0(2131750433, null), new Runnable(this) {
            public final ye4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ye4 ye4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ye4Var.d();
                        return;
                    default:
                        ye4Var.a();
                        return;
                }
            }
        }, false);
        G.b(2131232113, ob6.M0(2131751499, null), new Runnable(this) {
            public final ye4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                ye4 ye4Var = this.b;
                switch (b) {
                    case 0:
                        String str = ye4Var.y;
                        if (str != null && hl.g(str)) {
                            new d31(ye4Var.F.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        ye4Var.d();
                        return;
                    default:
                        ye4Var.a();
                        return;
                }
            }
        }, true);
        if (ob6.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
