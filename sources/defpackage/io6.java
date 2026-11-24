package defpackage;

import java.util.ArrayList;
public final class io6 implements Runnable {
    public final byte a;
    public final jo6 b;

    public io6(jo6 jo6Var, byte b) {
        this.a = b;
        this.b = jo6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jo6 jo6Var = this.b;
        switch (b) {
            case 0:
                jo6Var.d();
                gm.c3(new io6(jo6Var, (byte) 1));
                return;
            default:
                jo6Var.X = false;
                ArrayList arrayList = jo6Var.Y;
                jo6Var.Y = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Runnable) arrayList.get(i)).run();
                    }
                    return;
                }
                return;
        }
    }
}
