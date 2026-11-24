package defpackage;

import java.util.ArrayList;
public final class tj3 implements Runnable {
    public final byte a;
    public final uj3 b;

    public tj3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.c = false;
                uj3Var.b.run();
                ArrayList arrayList = uj3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - uj3Var.f > 3600000) {
                    arrayList.clear();
                    uj3Var.e = false;
                    uj3Var.g = null;
                    uj3Var.a();
                    return;
                }
                return;
            default:
                uj3Var.i = false;
                return;
        }
    }
}
