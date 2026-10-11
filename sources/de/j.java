package de;

import za.z;
public final class j implements c {
    public final int f8332a;
    public final Object f8333b;

    public j(Object obj, int i10) {
        this.f8332a = i10;
        this.f8333b = obj;
    }

    @Override
    public final Object b(Object obj, ld.c cVar) {
        switch (this.f8332a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f8333b).f15219a = obj;
                throw new ee.a(this);
            default:
                ((z) this.f8333b).f54421c.set((za.n) obj);
                return hd.i.f11091a;
        }
    }
}
