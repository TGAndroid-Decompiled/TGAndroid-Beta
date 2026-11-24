package defpackage;

import android.os.RemoteException;
public final class nx6 implements Runnable {
    public final byte a;
    public final tx6 b;

    public nx6(tx6 tx6Var, byte b) {
        this.a = b;
        this.b = tx6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tx6 tx6Var = this.b;
        switch (b) {
            case 0:
                tx6Var.getClass();
                return;
            case 1:
                synchronized (tx6Var.a) {
                    if (!tx6Var.v) {
                        final n8a R0 = tx6Var.t.R0();
                        if (!tx6Var.c.hasMessages(1)) {
                            n8a n8aVar = tx6Var.s.c;
                            qe8 qe8Var = R0.a;
                            int i = qe8Var.b;
                            qe8 qe8Var2 = n8aVar.a;
                            if (i == qe8Var2.b && qe8Var.e == qe8Var2.e && qe8Var.h == qe8Var2.h && qe8Var.i == qe8Var2.i) {
                                mx6 mx6Var = tx6Var.g.b;
                                mo5 M = mx6Var.M();
                                for (int i2 = 0; i2 < M.size(); i2++) {
                                    final sw6 sw6Var = (sw6) M.get(i2);
                                    mx6Var.C0();
                                    mt2 mt2Var = (mt2) ((qt) mx6Var.c).get(sw6Var);
                                    final boolean Z = mx6Var.Z(sw6Var, 16);
                                    final boolean Z2 = mx6Var.Z(sw6Var, 17);
                                    tx6Var.c(sw6Var, new sx6() {
                                        @Override
                                        public final void d(rw6 rw6Var, int i3) {
                                            rw6Var.i(i3, n8a.this, Z, Z2, sw6Var.c);
                                        }
                                    });
                                }
                                try {
                                    tx6Var.h.l.i(0, R0, true, true, 0);
                                } catch (RemoteException e) {
                                    ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                                }
                            }
                        }
                        tx6Var.r();
                        return;
                    }
                    return;
                }
            default:
                tx6Var.r();
                return;
        }
    }
}
