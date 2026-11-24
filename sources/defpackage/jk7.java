package defpackage;

import java.lang.ref.WeakReference;
public final class jk7 implements gk7 {
    public final kk7 a;
    public final WeakReference b;
    public final int c;

    public jk7(kk7 kk7Var, gk7 gk7Var) {
        this.a = kk7Var;
        this.b = new WeakReference(gk7Var);
        this.c = System.identityHashCode(gk7Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gk7 gk7Var = (gk7) this.b.get();
        if (gk7Var != null) {
            gk7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        gk7 gk7Var;
        if (this != obj) {
            if ((obj instanceof jk7) && (gk7Var = (gk7) this.b.get()) != null && gk7Var == ((jk7) obj).b.get()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }
}
