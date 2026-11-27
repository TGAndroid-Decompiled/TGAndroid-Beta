package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ya4 implements Runnable {
    public final byte a;
    public final hb4 b;
    public final ib4 c;

    public ya4(hb4 hb4Var, ib4 ib4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = ib4Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hb4 hb4Var = this.b;
                ib4 ib4Var = this.c;
                ArrayList arrayList = hb4Var.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hb4Var.m = arrayList;
                }
                if (ib4Var != null && !arrayList.contains(ib4Var)) {
                    hb4Var.m.add(ib4Var);
                }
                if (!hb4Var.m.isEmpty()) {
                    Utilities.d.a(hb4Var.f1);
                }
                if (ib4Var != null && hb4Var.Y != 1 && hb4Var.Y != 0) {
                    ib4Var.a();
                    return;
                }
                return;
            default:
                hb4 hb4Var2 = this.b;
                ib4 ib4Var2 = this.c;
                if (hb4Var2.m != null) {
                    cc4.d("FileLoadOperation " + hb4Var2.r + " removing stream listener " + ib4Var2);
                    hb4Var2.m.remove(ib4Var2);
                    return;
                }
                return;
        }
    }
}
