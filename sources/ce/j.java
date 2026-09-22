package ce;

import za.y;
public final class j implements c {
    public final int f4246a;
    public final Object f4247b;

    public j(Object obj, int i10) {
        this.f4246a = i10;
        this.f4247b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4246a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4247b).f13894a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4247b).f49161c.set((za.m) obj);
                return gd.i.f9621a;
        }
    }
}
