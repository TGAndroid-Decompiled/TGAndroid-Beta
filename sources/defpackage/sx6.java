package defpackage;

import android.os.RemoteException;
public final class sx6 implements Runnable {
    public final byte a;
    public final yx6 b;

    public sx6(yx6 yx6Var, byte b) {
        this.a = b;
        this.b = yx6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yx6 yx6Var = this.b;
        switch (b) {
            case 0:
                yx6Var.getClass();
                return;
            case 1:
                synchronized (yx6Var.a) {
                    if (!yx6Var.v) {
                        final daa R0 = yx6Var.t.R0();
                        if (!yx6Var.c.hasMessages(1)) {
                            daa daaVar = yx6Var.s.c;
                            cg8 cg8Var = R0.a;
                            int i = cg8Var.b;
                            cg8 cg8Var2 = daaVar.a;
                            if (i == cg8Var2.b && cg8Var.e == cg8Var2.e && cg8Var.h == cg8Var2.h && cg8Var.i == cg8Var2.i) {
                                rx6 rx6Var = yx6Var.g.b;
                                po5 L = rx6Var.L();
                                for (int i2 = 0; i2 < L.size(); i2++) {
                                    final xw6 xw6Var = (xw6) L.get(i2);
                                    rx6Var.D0();
                                    us2 us2Var = (us2) ((qs) rx6Var.c).get(xw6Var);
                                    final boolean a0 = rx6Var.a0(xw6Var, 16);
                                    final boolean a02 = rx6Var.a0(xw6Var, 17);
                                    yx6Var.c(xw6Var, new xx6() {
                                        @Override
                                        public final void b(ww6 ww6Var, int i3) {
                                            ww6Var.i(i3, daa.this, a0, a02, xw6Var.c);
                                        }
                                    });
                                }
                                try {
                                    yx6Var.h.l.i(0, R0, true, true, 0);
                                } catch (RemoteException e) {
                                    efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                                }
                            }
                        }
                        yx6Var.r();
                        return;
                    }
                    return;
                }
            default:
                yx6Var.r();
                return;
        }
    }
}
