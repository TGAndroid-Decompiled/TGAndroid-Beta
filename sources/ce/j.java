package ce;

import za.y;
public final class j implements c {
    public final int f4587a;
    public final Object f4588b;

    public j(Object obj, int i10) {
        this.f4587a = i10;
        this.f4588b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4587a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4588b).f15114a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4588b).f53162c.set((za.m) obj);
                return gd.i.f10452a;
        }
    }
}
