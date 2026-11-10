package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class os implements ls {
    public final qs f24386a;
    public final WeakReference f24387b;
    public final int f24388c;

    public os(qs qsVar, ls lsVar) {
        this.f24386a = qsVar;
        this.f24387b = new WeakReference(lsVar);
        this.f24388c = System.identityHashCode(lsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ls lsVar = (ls) this.f24387b.get();
        if (lsVar != null) {
            lsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24386a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        ls lsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof os) && (lsVar = (ls) this.f24387b.get()) != null && lsVar == ((os) obj).f24387b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24388c;
    }
}
