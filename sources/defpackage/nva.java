package defpackage;
public final class nva implements icc {
    public final byte a = 0;
    public final boolean[] b;
    public final icc c;
    public final pcc d;

    public nva(pcc pccVar, boolean[] zArr, icc iccVar) {
        this.d = pccVar;
        this.b = zArr;
        this.c = iccVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "failed";
        pcc pccVar = this.d;
        icc iccVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                iccVar.a(str, l);
                return;
            default:
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                iccVar.a(str, l);
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public nva(boolean[] zArr, icc iccVar, pcc pccVar) {
        this.b = zArr;
        this.c = iccVar;
        this.d = pccVar;
    }
}
