package org.telegram.messenger;
public final class ht implements id.c {
    public final bt f24529a;

    public ht(bt btVar) {
        this.f24529a = btVar;
    }

    @Override
    public final id.h getContext() {
        return id.i.f16251a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof gd.f;
        bt btVar = this.f24529a;
        if (z10) {
            btVar.a(null, ((gd.f) obj).f13505a);
        } else {
            btVar.a(obj, null);
        }
    }
}
