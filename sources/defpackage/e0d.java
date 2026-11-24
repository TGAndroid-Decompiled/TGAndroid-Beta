package defpackage;
public final class e0d implements qac {
    public final byte a;
    public final Object b;

    public e0d(Object obj, byte b) {
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
                g0d g0dVar = (g0d) obj2;
                if (((nx5) obj) == nx5.d && ((b = g0dVar.s) == 2 || b == 3)) {
                    g0dVar.s = (byte) 1;
                }
                g0dVar.h.run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((hg3) obj2).l0(true);
                return;
        }
    }
}
