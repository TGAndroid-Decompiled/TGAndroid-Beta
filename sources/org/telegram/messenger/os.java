package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class os implements ls {
    public final qs f24382a;
    public final WeakReference f24383b;
    public final int f24384c;

    public os(qs qsVar, ls lsVar) {
        this.f24382a = qsVar;
        this.f24383b = new WeakReference(lsVar);
        this.f24384c = System.identityHashCode(lsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ls lsVar = (ls) this.f24383b.get();
        if (lsVar != null) {
            lsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24382a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        ls lsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof os) && (lsVar = (ls) this.f24383b.get()) != null && lsVar == ((os) obj).f24383b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24384c;
    }
}
