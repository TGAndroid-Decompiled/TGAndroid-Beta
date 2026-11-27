package defpackage;

import java.util.ArrayList;
public final class mo6 implements Runnable {
    public final byte a;
    public final no6 b;

    public mo6(no6 no6Var, byte b) {
        this.a = b;
        this.b = no6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        no6 no6Var = this.b;
        switch (b) {
            case 0:
                no6Var.d();
                hl.c3(new mo6(no6Var, (byte) 1));
                return;
            default:
                no6Var.X = false;
                ArrayList arrayList = no6Var.Y;
                no6Var.Y = null;
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
