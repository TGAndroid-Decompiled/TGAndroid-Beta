package defpackage;

import java.lang.ref.WeakReference;
public final class mm7 implements jm7 {
    public final nm7 a;
    public final WeakReference b;
    public final int c;

    public mm7(nm7 nm7Var, jm7 jm7Var) {
        this.a = nm7Var;
        this.b = new WeakReference(jm7Var);
        this.c = System.identityHashCode(jm7Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jm7 jm7Var = (jm7) this.b.get();
        if (jm7Var != null) {
            jm7Var.didReceivedNotification(i, i2, objArr);
        } else {
            this.a.n(this, i);
        }
    }

    public final boolean equals(Object obj) {
        jm7 jm7Var;
        if (this != obj) {
            if ((obj instanceof mm7) && (jm7Var = (jm7) this.b.get()) != null && jm7Var == ((mm7) obj).b.get()) {
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
