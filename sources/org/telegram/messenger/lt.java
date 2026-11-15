package org.telegram.messenger;
public final class lt implements id.c {
    public final et f24876a;

    public lt(et etVar) {
        this.f24876a = etVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f15913a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        et etVar = this.f24876a;
        if (z10) {
            etVar.a(null, ((gd.f) obj).f13164a);
        } else {
            etVar.a(obj, null);
        }
    }
}
