package org.telegram.messenger;

import java.util.ArrayList;
public final class i7 implements Runnable {
    public final int f16083a;
    public final m7 f16084b;
    public final n7 f16085c;

    public i7(m7 m7Var, n7 n7Var, int i10) {
        this.f16083a = i10;
        this.f16084b = m7Var;
        this.f16085c = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                m7 m7Var = this.f16084b;
                n7 n7Var = this.f16085c;
                if (m7Var.f16903m != null) {
                    f8.d("FileLoadOperation " + m7Var.f16912r + " removing stream listener " + n7Var);
                    m7Var.f16903m.remove(n7Var);
                    return;
                }
                return;
            default:
                m7 m7Var2 = this.f16084b;
                n7 n7Var2 = this.f16085c;
                if (m7Var2.f16903m == null) {
                    m7Var2.f16903m = new ArrayList();
                }
                if (n7Var2 != null && !m7Var2.f16903m.contains(n7Var2)) {
                    m7Var2.f16903m.add(n7Var2);
                }
                if (!m7Var2.f16903m.isEmpty()) {
                    Utilities.d.a(m7Var2.f16887f1);
                }
                if (n7Var2 != null && m7Var2.Y != 1 && m7Var2.Y != 0) {
                    n7Var2.a();
                    return;
                }
                return;
        }
    }
}
