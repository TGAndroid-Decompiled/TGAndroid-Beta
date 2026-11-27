package defpackage;

import java.util.ArrayList;
public final class lk3 implements Runnable {
    public final byte a;
    public final mk3 b;

    public lk3(mk3 mk3Var, byte b) {
        this.a = b;
        this.b = mk3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mk3 mk3Var = this.b;
        switch (b) {
            case 0:
                mk3Var.c = false;
                mk3Var.b.run();
                ArrayList arrayList = mk3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - mk3Var.f > 3600000) {
                    arrayList.clear();
                    mk3Var.e = false;
                    mk3Var.g = null;
                    mk3Var.a();
                    return;
                }
                return;
            default:
                mk3Var.i = false;
                return;
        }
    }
}
