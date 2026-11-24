package defpackage;

import android.util.Log;
public final class kfd implements Runnable {
    public final byte a;
    public final zfd b;

    public kfd(zfd zfdVar, byte b) {
        this.a = b;
        this.b = zfdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zfd zfdVar = this.b;
        switch (b) {
            case 0:
                ce6 ce6Var = zfd.i;
                Log.i(ce6Var.a, ce6Var.d("transfer with type = %d has timed out", Integer.valueOf(zfdVar.e)));
                zfdVar.b(101);
                return;
            default:
                x59 x59Var = new x59(zfdVar, (byte) 29);
                l8a l8aVar = zfdVar.f;
                ite.h(l8aVar);
                l8aVar.a(x59Var);
                return;
        }
    }
}
