package defpackage;

import java.lang.ref.WeakReference;
public final class a5e extends WeakReference {
    public final int a;

    public a5e(Exception exc) {
        super(exc, null);
        this.a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == a5e.class) {
            if (this == obj) {
                return true;
            }
            a5e a5eVar = (a5e) obj;
            if (this.a == a5eVar.a && get() == a5eVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
