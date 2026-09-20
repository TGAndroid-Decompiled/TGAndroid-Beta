package ce;

import za.y;
public final class j implements c {
    public final int f4248a;
    public final Object f4249b;

    public j(Object obj, int i10) {
        this.f4248a = i10;
        this.f4249b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4248a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4249b).f13881a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4249b).f49141c.set((za.m) obj);
                return gd.i.f9621a;
        }
    }
}
