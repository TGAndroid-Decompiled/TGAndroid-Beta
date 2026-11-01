package org.telegram.messenger;

import java.util.ArrayList;
public final class i7 implements Runnable {
    public final int f16236a;
    public final m7 f16237b;
    public final n7 f16238c;

    public i7(m7 m7Var, n7 n7Var, int i10) {
        this.f16236a = i10;
        this.f16237b = m7Var;
        this.f16238c = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f16236a) {
            case 0:
                m7 m7Var = this.f16237b;
                n7 n7Var = this.f16238c;
                if (m7Var.f17073m != null) {
                    f8.d("FileLoadOperation " + m7Var.f17082r + " removing stream listener " + n7Var);
                    m7Var.f17073m.remove(n7Var);
                    return;
                }
                return;
            default:
                m7 m7Var2 = this.f16237b;
                n7 n7Var2 = this.f16238c;
                if (m7Var2.f17073m == null) {
                    m7Var2.f17073m = new ArrayList();
                }
                if (n7Var2 != null && !m7Var2.f17073m.contains(n7Var2)) {
                    m7Var2.f17073m.add(n7Var2);
                }
                if (!m7Var2.f17073m.isEmpty()) {
                    Utilities.d.a(m7Var2.f17057f1);
                }
                if (n7Var2 != null && m7Var2.Y != 1 && m7Var2.Y != 0) {
                    n7Var2.a();
                    return;
                }
                return;
        }
    }
}
