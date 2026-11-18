package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class is implements fs {
    public final ks f24713a;
    public final WeakReference f24714b;
    public final int f24715c;

    public is(ks ksVar, fs fsVar) {
        this.f24713a = ksVar;
        this.f24714b = new WeakReference(fsVar);
        this.f24715c = System.identityHashCode(fsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fs fsVar = (fs) this.f24714b.get();
        if (fsVar != null) {
            fsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24713a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        fs fsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is) && (fsVar = (fs) this.f24714b.get()) != null && fsVar == ((is) obj).f24714b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24715c;
    }
}
