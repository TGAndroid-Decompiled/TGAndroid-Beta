package ce;

import za.y;
public final class j implements c {
    public final int f4781a;
    public final Object f4782b;

    public j(Object obj, int i10) {
        this.f4781a = i10;
        this.f4782b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4781a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4782b).f15053a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4782b).f51490c.set((za.m) obj);
                return gd.i.f10588a;
        }
    }
}
