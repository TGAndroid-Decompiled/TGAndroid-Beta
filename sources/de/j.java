package de;

import za.a0;
public final class j implements c {
    public final int f8333a;
    public final Object f8334b;

    public j(Object obj, int i10) {
        this.f8333a = i10;
        this.f8334b = obj;
    }

    @Override
    public final Object b(Object obj, ld.c cVar) {
        switch (this.f8333a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f8334b).f15184a = obj;
                throw new ee.a(this);
            default:
                ((a0) this.f8334b).f54234c.set((za.n) obj);
                return hd.i.f11092a;
        }
    }
}
