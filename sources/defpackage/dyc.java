package defpackage;
public final class dyc implements p8c {
    public final byte a;
    public final Object b;

    public dyc(Object obj, byte b) {
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
                fyc fycVar = (fyc) obj2;
                if (((nv5) obj) == nv5.d && ((b = fycVar.s) == 2 || b == 3)) {
                    fycVar.s = (byte) 1;
                }
                fycVar.h.run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((ue3) obj2).m0(true);
                return;
        }
    }
}
