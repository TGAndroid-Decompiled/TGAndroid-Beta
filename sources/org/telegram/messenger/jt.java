package org.telegram.messenger;
public final class jt implements id.c {
    public final ct f24912a;

    public jt(ct ctVar) {
        this.f24912a = ctVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f16254a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        ct ctVar = this.f24912a;
        if (z10) {
            ctVar.a(null, ((gd.f) obj).f13508a);
        } else {
            ctVar.a(obj, null);
        }
    }
}
