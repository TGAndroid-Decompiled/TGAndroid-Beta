package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class is implements fs {
    public final ks f24710a;
    public final WeakReference f24711b;
    public final int f24712c;

    public is(ks ksVar, fs fsVar) {
        this.f24710a = ksVar;
        this.f24711b = new WeakReference(fsVar);
        this.f24712c = System.identityHashCode(fsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fs fsVar = (fs) this.f24711b.get();
        if (fsVar != null) {
            fsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24710a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        fs fsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is) && (fsVar = (fs) this.f24711b.get()) != null && fsVar == ((is) obj).f24711b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24712c;
    }
}
