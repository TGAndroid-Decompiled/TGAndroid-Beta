package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class is implements fs {
    public final ks f24738a;
    public final WeakReference f24739b;
    public final int f24740c;

    public is(ks ksVar, fs fsVar) {
        this.f24738a = ksVar;
        this.f24739b = new WeakReference(fsVar);
        this.f24740c = System.identityHashCode(fsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fs fsVar = (fs) this.f24739b.get();
        if (fsVar != null) {
            fsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24738a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        fs fsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is) && (fsVar = (fs) this.f24739b.get()) != null && fsVar == ((is) obj).f24739b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24740c;
    }
}
