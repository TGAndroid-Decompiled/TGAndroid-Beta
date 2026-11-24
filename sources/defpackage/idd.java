package defpackage;

import android.util.Log;
public final class idd implements Runnable {
    public final byte a;
    public final ydd b;

    public idd(ydd yddVar, byte b) {
        this.a = b;
        this.b = yddVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ydd yddVar = this.b;
        switch (b) {
            case 0:
                dc6 dc6Var = ydd.i;
                Log.i(dc6Var.a, dc6Var.d("transfer with type = %d has timed out", Integer.valueOf(yddVar.e)));
                yddVar.b(101);
                return;
            default:
                u39 u39Var = new u39(yddVar, (byte) 29);
                j6a j6aVar = yddVar.f;
                fre.h(j6aVar);
                j6aVar.a(u39Var);
                return;
        }
    }
}
