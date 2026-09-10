package ce;

import za.z;
public final class j implements c {
    public final int f4661a;
    public final Object f4662b;

    public j(Object obj, int i10) {
        this.f4661a = i10;
        this.f4662b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4661a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4662b).f12576a = obj;
                throw new de.a(this);
            default:
                ((z) this.f4662b).f47963c.set((za.m) obj);
                return gd.i.f8748a;
        }
    }
}
