package defpackage;

import java.util.ArrayList;
public final class zu7 implements Runnable {
    public final byte a;
    public final bv7 b;

    public zu7(bv7 bv7Var, byte b) {
        this.a = b;
        this.b = bv7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bv7 bv7Var = this.b;
        switch (b) {
            case 0:
                bv7Var.invalidate();
                bv7Var.b();
                return;
            default:
                ArrayList arrayList = bv7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((b29) obj).x(true);
                }
                arrayList.clear();
                return;
        }
    }
}
