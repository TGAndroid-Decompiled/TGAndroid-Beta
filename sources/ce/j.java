package ce;

import za.y;
public final class j implements c {
    public final int f4808a;
    public final Object f4809b;

    public j(Object obj, int i10) {
        this.f4808a = i10;
        this.f4809b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4808a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4809b).f15079a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4809b).f51521c.set((za.m) obj);
                return gd.i.f10616a;
        }
    }
}
