package org.telegram.messenger;

import java.lang.ref.WeakReference;
public final class xs implements us {
    public final zs f19288a;
    public final WeakReference f19289b;
    public final int f19290c;

    public xs(zs zsVar, us usVar) {
        this.f19288a = zsVar;
        this.f19289b = new WeakReference(usVar);
        this.f19290c = System.identityHashCode(usVar);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        us usVar = (us) this.f19289b.get();
        if (usVar != null) {
            usVar.didReceivedNotification(i10, i11, objArr);
        } else {
            this.f19288a.n(this, i10);
        }
    }

    public final boolean equals(Object obj) {
        us usVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xs) && (usVar = (us) this.f19289b.get()) != null && usVar == ((xs) obj).f19289b.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19290c;
    }
}
