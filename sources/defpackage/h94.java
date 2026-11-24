package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h94 implements Runnable {
    public final byte a;
    public final l94 b;
    public final m94 c;

    public h94(l94 l94Var, m94 m94Var, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = m94Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                l94 l94Var = this.b;
                m94 m94Var = this.c;
                if (l94Var.m != null) {
                    fa4.d("FileLoadOperation " + l94Var.r + " removing stream listener " + m94Var);
                    l94Var.m.remove(m94Var);
                    return;
                }
                return;
            default:
                l94 l94Var2 = this.b;
                m94 m94Var2 = this.c;
                ArrayList arrayList = l94Var2.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    l94Var2.m = arrayList;
                }
                if (m94Var2 != null && !arrayList.contains(m94Var2)) {
                    l94Var2.m.add(m94Var2);
                }
                if (!l94Var2.m.isEmpty()) {
                    Utilities.d.a(l94Var2.f1);
                }
                if (m94Var2 != null && l94Var2.Y != 1 && l94Var2.Y != 0) {
                    m94Var2.a();
                    return;
                }
                return;
        }
    }
}
