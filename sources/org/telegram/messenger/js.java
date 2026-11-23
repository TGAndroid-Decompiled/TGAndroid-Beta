package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class js implements gs {
    public final ls f24873a;
    public final WeakReference f24874b;
    public final int f24875c;

    public js(ls lsVar, gs gsVar) {
        this.f24873a = lsVar;
        this.f24874b = new WeakReference(gsVar);
        this.f24875c = System.identityHashCode(gsVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gs gsVar = (gs) this.f24874b.get();
        if (gsVar != null) {
            gsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24873a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        gs gsVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof js) && (gsVar = (gs) this.f24874b.get()) != null && gsVar == ((js) obj).f24874b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24875c;
    }
}
