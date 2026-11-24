package defpackage;

import java.util.ArrayList;
public final class tr7 implements Runnable {
    public final byte a;
    public final vr7 b;

    public tr7(vr7 vr7Var, byte b) {
        this.a = b;
        this.b = vr7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vr7 vr7Var = this.b;
        switch (b) {
            case 0:
                vr7Var.invalidate();
                vr7Var.b();
                return;
            default:
                ArrayList arrayList = vr7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((oy8) obj).x(true);
                }
                arrayList.clear();
                return;
        }
    }
}
