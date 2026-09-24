package ce;

import za.a0;
public final class j implements c {
    public final int f4239a;
    public final Object f4240b;

    public j(Object obj, int i10) {
        this.f4239a = i10;
        this.f4240b = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        switch (this.f4239a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f4240b).f13892a = obj;
                throw new de.a(this);
            default:
                ((a0) this.f4240b).f49006c.set((za.o) obj);
                return gd.i.f9602a;
        }
    }
}
