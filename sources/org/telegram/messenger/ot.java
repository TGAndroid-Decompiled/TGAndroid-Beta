package org.telegram.messenger;
public final class ot implements id.c {
    public final ht f24389a;

    public ot(ht htVar) {
        this.f24389a = htVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f15458a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z9 = obj instanceof gd.f;
        ht htVar = this.f24389a;
        if (z9) {
            htVar.a(null, ((gd.f) obj).f13822a);
        } else {
            htVar.a(obj, null);
        }
    }
}
