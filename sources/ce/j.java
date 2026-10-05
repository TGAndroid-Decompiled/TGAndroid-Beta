package ce;

import za.y;
public final class j implements c {
    public final int f4588a;
    public final Object f4589b;

    public j(Object obj, int i10) {
        this.f4588a = i10;
        this.f4589b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4588a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4589b).f15116a = obj;
                throw new de.a(this);
            default:
                ((y) this.f4589b).f53189c.set((za.m) obj);
                return gd.i.f10453a;
        }
    }
}
