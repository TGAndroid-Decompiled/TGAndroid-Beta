package defpackage;

import android.util.Log;
public final class bid implements Runnable {
    public final byte a;
    public final pid b;

    public bid(pid pidVar, byte b) {
        this.a = b;
        this.b = pidVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pid pidVar = this.b;
        switch (b) {
            case 0:
                he6 he6Var = pid.i;
                Log.i(he6Var.a, he6Var.d("transfer with type = %d has timed out", Integer.valueOf(pidVar.e)));
                pidVar.b(101);
                return;
            default:
                ve9 ve9Var = new ve9(pidVar, (byte) 26);
                baa baaVar = pidVar.f;
                xve.h(baaVar);
                baaVar.a(ve9Var);
                return;
        }
    }
}
