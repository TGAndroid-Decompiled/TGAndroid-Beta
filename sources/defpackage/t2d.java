package defpackage;
public final class t2d implements pcc {
    public final byte a;
    public final Object b;

    public t2d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        byte b;
        byte b2 = this.a;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                v2d v2dVar = (v2d) obj2;
                if (((sx5) obj) == sx5.d && ((b = v2dVar.s) == 2 || b == 3)) {
                    v2dVar.s = (byte) 1;
                }
                v2dVar.h.run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((of3) obj2).l0(true);
                return;
        }
    }
}
