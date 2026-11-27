package defpackage;

import java.lang.ref.WeakReference;
public final class kj0 extends v40 {
    public final WeakReference a;

    public kj0(mj0 mj0Var) {
        this.a = new WeakReference(mj0Var);
    }

    @Override
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && !((mj0) weakReference.get()).m && ((mj0) weakReference.get()).l) {
            mj0 mj0Var = (mj0) weakReference.get();
            qi0 qi0Var = new qi0(i, charSequence);
            rj7 rj7Var = mj0Var.q;
            if (rj7Var == null) {
                rj7Var = new rj7();
                mj0Var.q = rj7Var;
            }
            mj0.f(rj7Var, qi0Var);
        }
    }

    @Override
    public final void b(gj0 gj0Var) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null && ((mj0) weakReference.get()).l) {
            int i = -1;
            if (gj0Var.b == -1) {
                hj0 hj0Var = gj0Var.a;
                int c = ((mj0) weakReference.get()).c();
                if ((c & 32767) != 0 && !nrd.b(c)) {
                    i = 2;
                }
                gj0Var = new gj0(hj0Var, i);
            }
            mj0 mj0Var = (mj0) weakReference.get();
            rj7 rj7Var = mj0Var.p;
            if (rj7Var == null) {
                rj7Var = new rj7();
                mj0Var.p = rj7Var;
            }
            mj0.f(rj7Var, gj0Var);
        }
    }
}
