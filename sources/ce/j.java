package ce;

import za.y;
public final class j implements c {
    public final int f4247a;
    public final Object f4248b;

    public j(Object obj, int i10) {
        this.f4247a = i10;
        this.f4248b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4247a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4248b).f13842a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4248b).f49095c.set((za.m) obj);
                return gd.i.f9620a;
        }
    }
}
