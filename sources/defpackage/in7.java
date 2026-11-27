package defpackage;

import java.lang.ref.WeakReference;
public final class in7 implements fn7 {
    public final jn7 a;
    public final WeakReference b;
    public final int c;

    public in7(jn7 jn7Var, fn7 fn7Var) {
        this.a = jn7Var;
        this.b = new WeakReference(fn7Var);
        this.c = System.identityHashCode(fn7Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fn7 fn7Var = (fn7) this.b.get();
        if (fn7Var != null) {
            fn7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        fn7 fn7Var;
        if (this != obj) {
            if ((obj instanceof in7) && (fn7Var = (fn7) this.b.get()) != null && fn7Var == ((in7) obj).b.get()) {
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
