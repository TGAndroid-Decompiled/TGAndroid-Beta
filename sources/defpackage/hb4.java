package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hb4 implements Runnable {
    public final byte a;
    public final lb4 b;
    public final mb4 c;

    public hb4(lb4 lb4Var, mb4 mb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = mb4Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                lb4 lb4Var = this.b;
                mb4 mb4Var = this.c;
                if (lb4Var.m != null) {
                    fc4.d("FileLoadOperation " + lb4Var.r + " removing stream listener " + mb4Var);
                    lb4Var.m.remove(mb4Var);
                    return;
                }
                return;
            default:
                lb4 lb4Var2 = this.b;
                mb4 mb4Var2 = this.c;
                ArrayList arrayList = lb4Var2.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    lb4Var2.m = arrayList;
                }
                if (mb4Var2 != null && !arrayList.contains(mb4Var2)) {
                    lb4Var2.m.add(mb4Var2);
                }
                if (!lb4Var2.m.isEmpty()) {
                    Utilities.d.a(lb4Var2.f1);
                }
                if (mb4Var2 != null && lb4Var2.Y != 1 && lb4Var2.Y != 0) {
                    mb4Var2.a();
                    return;
                }
                return;
        }
    }
}
