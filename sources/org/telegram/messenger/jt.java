package org.telegram.messenger;
public final class jt implements id.c {
    public final ct f24876a;

    public jt(ct ctVar) {
        this.f24876a = ctVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f16220a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        ct ctVar = this.f24876a;
        if (z10) {
            ctVar.a(null, ((gd.f) obj).f13471a);
        } else {
            ctVar.a(obj, null);
        }
    }
}
