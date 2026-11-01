package org.telegram.messenger;
public final class au implements cd.c {
    public final ut f14847a;

    public au(ut utVar) {
        this.f14847a = utVar;
    }

    @Override
    public final cd.h getContext() {
        return cd.i.f4123a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof ad.f;
        ut utVar = this.f14847a;
        if (z10) {
            utVar.a(null, ((ad.f) obj).f395a);
        } else {
            utVar.a(obj, null);
        }
    }
}
