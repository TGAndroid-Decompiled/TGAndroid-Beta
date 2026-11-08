package org.telegram.messenger;
public final class ot implements id.c {
    public final ht f24385a;

    public ot(ht htVar) {
        this.f24385a = htVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f15456a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z9 = obj instanceof gd.f;
        ht htVar = this.f24385a;
        if (z9) {
            htVar.a(null, ((gd.f) obj).f13820a);
        } else {
            htVar.a(obj, null);
        }
    }
}
