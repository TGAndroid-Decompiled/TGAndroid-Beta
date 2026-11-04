package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class fs implements cs {
    public final hs f22550a;
    public final WeakReference f22551b;
    public final int f22552c;

    public fs(hs hsVar, cs csVar) {
        this.f22550a = hsVar;
        this.f22551b = new WeakReference(csVar);
        this.f22552c = System.identityHashCode(csVar);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        cs csVar = (cs) this.f22551b.get();
        if (csVar != null) {
            csVar.didReceivedNotification(i3, i10, objArr);
        } else {
            this.f22550a.n(this, i3);
        }
    }

    public final boolean equals(Object obj) {
        cs csVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fs) && (csVar = (cs) this.f22551b.get()) != null && csVar == ((fs) obj).f22551b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22552c;
    }
}
