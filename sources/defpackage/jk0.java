package defpackage;

import java.lang.ref.WeakReference;
public final class jk0 extends t50 {
    public final WeakReference a;

    public jk0(lk0 lk0Var) {
        this.a = new WeakReference(lk0Var);
    }

    @Override
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && !((lk0) weakReference.get()).m && ((lk0) weakReference.get()).l) {
            lk0 lk0Var = (lk0) weakReference.get();
            pj0 pj0Var = new pj0(i, charSequence);
            kj7 kj7Var = lk0Var.q;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.q = kj7Var;
            }
            lk0.f(kj7Var, pj0Var);
        }
    }

    @Override
    public final void b(fk0 fk0Var) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && ((lk0) weakReference.get()).l) {
            int i = -1;
            if (fk0Var.b == -1) {
                gk0 gk0Var = fk0Var.a;
                int c = ((lk0) weakReference.get()).c();
                if ((c & 32767) != 0 && !zod.b(c)) {
                    i = 2;
                }
                fk0Var = new fk0(gk0Var, i);
            }
            lk0 lk0Var = (lk0) weakReference.get();
            kj7 kj7Var = lk0Var.p;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.p = kj7Var;
            }
            lk0.f(kj7Var, fk0Var);
        }
    }
}
