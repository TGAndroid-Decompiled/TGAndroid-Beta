package defpackage;

import android.content.Context;
public final class xbd implements Runnable {
    public final byte a;
    public final tcd b;

    public xbd(tcd tcdVar, byte b) {
        this.a = b;
        this.b = tcdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tcd tcdVar = this.b;
        switch (b) {
            case 0:
                xab xabVar = tcdVar.e;
                gw6 gw6Var = (gw6) xabVar.c;
                if (gw6Var == null) {
                    gw6Var = gw6.d((Context) xabVar.b);
                    xabVar.c = gw6Var;
                }
                gw6Var.h(tcdVar);
                return;
            default:
                tcdVar.n();
                return;
        }
    }
}
