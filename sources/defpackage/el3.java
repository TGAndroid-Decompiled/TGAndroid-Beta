package defpackage;

import java.util.ArrayList;
public final class el3 implements Runnable {
    public final byte a;
    public final fl3 b;

    public el3(fl3 fl3Var, byte b) {
        this.a = b;
        this.b = fl3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fl3 fl3Var = this.b;
        switch (b) {
            case 0:
                fl3Var.c = false;
                fl3Var.b.run();
                ArrayList arrayList = fl3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fl3Var.f > 3600000) {
                    arrayList.clear();
                    fl3Var.e = false;
                    fl3Var.g = null;
                    fl3Var.a();
                    return;
                }
                return;
            default:
                fl3Var.i = false;
                return;
        }
    }
}
