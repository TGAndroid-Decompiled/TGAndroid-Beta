package defpackage;
public final class wb1 implements pcc {
    public final byte a;
    public final ibb b;

    public wb1(ibb ibbVar, byte b) {
        this.a = b;
        this.b = ibbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ibb ibbVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                ibbVar.setPeriod(num.intValue());
                pcc pccVar = ibbVar.B1;
                if (pccVar != null) {
                    pccVar.a(num);
                    return;
                }
                return;
            default:
                pcc pccVar2 = ibbVar.C1;
                if (pccVar2 != null) {
                    pccVar2.a(num);
                    return;
                }
                return;
        }
    }
}
