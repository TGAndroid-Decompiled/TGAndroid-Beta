package ce;

import za.y;
public final class j implements c {
    public final int f4242a;
    public final Object f4243b;

    public j(Object obj, int i10) {
        this.f4242a = i10;
        this.f4243b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4242a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4243b).f13686a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4243b).f48841c.set((za.m) obj);
                return gd.i.f9616a;
        }
    }
}
