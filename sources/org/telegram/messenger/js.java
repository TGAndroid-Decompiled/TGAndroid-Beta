package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class js implements gs {
    public final ls f24909a;
    public final WeakReference f24910b;
    public final int f24911c;

    public js(ls lsVar, gs gsVar) {
        this.f24909a = lsVar;
        this.f24910b = new WeakReference(gsVar);
        this.f24911c = System.identityHashCode(gsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gs gsVar = (gs) this.f24910b.get();
        if (gsVar != null) {
            gsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24909a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        gs gsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof js) && (gsVar = (gs) this.f24910b.get()) != null && gsVar == ((js) obj).f24910b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24911c;
    }
}
