package ce;

import za.y;
public final class j implements c {
    public final int f4244a;
    public final Object f4245b;

    public j(Object obj, int i10) {
        this.f4244a = i10;
        this.f4245b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4244a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4245b).f13684a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4245b).f48834c.set((za.m) obj);
                return gd.i.f9617a;
        }
    }
}
