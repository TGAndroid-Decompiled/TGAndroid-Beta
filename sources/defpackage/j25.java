package defpackage;
public final class j25 implements icc {
    public final byte a;
    public final icc b;

    public j25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a((c35) obj, (String) obj2);
                return;
            default:
                iccVar.a((Long) obj, (Boolean) obj2);
                return;
        }
    }
}
