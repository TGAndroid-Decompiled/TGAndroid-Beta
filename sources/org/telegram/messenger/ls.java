package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class ls implements is {
    public final ns f24873a;
    public final WeakReference f24874b;
    public final int f24875c;

    public ls(ns nsVar, is isVar) {
        this.f24873a = nsVar;
        this.f24874b = new WeakReference(isVar);
        this.f24875c = System.identityHashCode(isVar);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        is isVar = (is) this.f24874b.get();
        if (isVar != null) {
            isVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.f24873a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        is isVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ls) && (isVar = (is) this.f24874b.get()) != null && isVar == ((ls) obj).f24874b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24875c;
    }
}
