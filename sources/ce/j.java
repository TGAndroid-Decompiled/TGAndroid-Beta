package ce;

import za.y;
public final class j implements c {
    public final int f4241a;
    public final Object f4242b;

    public j(Object obj, int i10) {
        this.f4241a = i10;
        this.f4242b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4241a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4242b).f13909a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4242b).f49157c.set((za.m) obj);
                return gd.i.f9608a;
        }
    }
}
