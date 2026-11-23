package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class is implements fs {
    public final ks f24836a;
    public final WeakReference f24837b;
    public final int f24838c;

    public is(ks ksVar, fs fsVar) {
        this.f24836a = ksVar;
        this.f24837b = new WeakReference(fsVar);
        this.f24838c = System.identityHashCode(fsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fs fsVar = (fs) this.f24837b.get();
        if (fsVar != null) {
            fsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24836a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        fs fsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is) && (fsVar = (fs) this.f24837b.get()) != null && fsVar == ((is) obj).f24837b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24838c;
    }
}
