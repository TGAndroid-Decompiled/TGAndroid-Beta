package defpackage;
public final class wb1 implements pcc {
    public final byte a;
    public final hbb b;

    public wb1(hbb hbbVar, byte b) {
        this.a = b;
        this.b = hbbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        hbb hbbVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                hbbVar.setPeriod(num.intValue());
                pcc pccVar = hbbVar.B1;
                if (pccVar != null) {
                    pccVar.a(num);
                    return;
                }
                return;
            default:
                pcc pccVar2 = hbbVar.C1;
                if (pccVar2 != null) {
                    pccVar2.a(num);
                    return;
                }
                return;
        }
    }
}
