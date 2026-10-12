package de;

import za.z;
public final class j implements c {
    public final int f8330a;
    public final Object f8331b;

    public j(Object obj, int i10) {
        this.f8330a = i10;
        this.f8331b = obj;
    }

    @Override
    public final Object b(Object obj, ld.c cVar) {
        switch (this.f8330a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f8331b).f14929a = obj;
                throw new ee.a(this);
            default:
                ((z) this.f8331b).f54532c.set((za.n) obj);
                return hd.i.f11090a;
        }
    }
}
