package org.telegram.messenger;
public final class ft implements fd.c {
    public final zs f22553a;

    public ft(zs zsVar) {
        this.f22553a = zsVar;
    }

    @Override
    public final fd.h getContext() {
        return fd.i.f11567a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof dd.f;
        zs zsVar = this.f22553a;
        if (z10) {
            zsVar.a(null, ((dd.f) obj).f8792a);
        } else {
            zsVar.a(obj, null);
        }
    }
}
