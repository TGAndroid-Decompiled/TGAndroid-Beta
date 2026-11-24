package defpackage;

import java.lang.ref.WeakReference;
public final class jj0 extends t40 {
    public final WeakReference a;

    public jj0(lj0 lj0Var) {
        this.a = new WeakReference(lj0Var);
    }

    @Override
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && !((lj0) weakReference.get()).m && ((lj0) weakReference.get()).l) {
            lj0 lj0Var = (lj0) weakReference.get();
            pi0 pi0Var = new pi0(i, charSequence);
            hh7 hh7Var = lj0Var.q;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.q = hh7Var;
            }
            lj0.f(hh7Var, pi0Var);
        }
    }

    @Override
    public final void b(fj0 fj0Var) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && ((lj0) weakReference.get()).l) {
            int i = -1;
            if (fj0Var.b == -1) {
                gj0 gj0Var = fj0Var.a;
                int c = ((lj0) weakReference.get()).c();
                if ((c & 32767) != 0 && !wmd.b(c)) {
                    i = 2;
                }
                fj0Var = new fj0(gj0Var, i);
            }
            lj0 lj0Var = (lj0) weakReference.get();
            hh7 hh7Var = lj0Var.p;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.p = hh7Var;
            }
            lj0.f(hh7Var, fj0Var);
        }
    }
}
