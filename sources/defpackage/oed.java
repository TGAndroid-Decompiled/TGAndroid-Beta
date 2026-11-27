package defpackage;

import android.content.Context;
public final class oed implements Runnable {
    public final byte a;
    public final kfd b;

    public oed(kfd kfdVar, byte b) {
        this.a = b;
        this.b = kfdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kfd kfdVar = this.b;
        switch (b) {
            case 0:
                k7b k7bVar = kfdVar.e;
                lw6 lw6Var = (lw6) k7bVar.c;
                if (lw6Var == null) {
                    lw6Var = lw6.d((Context) k7bVar.b);
                    k7bVar.c = lw6Var;
                }
                lw6Var.h(kfdVar);
                return;
            default:
                kfdVar.n();
                return;
        }
    }
}
