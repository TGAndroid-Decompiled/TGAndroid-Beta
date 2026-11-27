package defpackage;
public final class sva implements pcc {
    public final byte a = 1;
    public final jxa b;
    public final int c;
    public final pcc d;
    public final boolean[] e;
    public final pcc f;

    public sva(jxa jxaVar, int i, pcc pccVar, boolean[] zArr, pcc pccVar2) {
        this.b = jxaVar;
        this.c = i;
        this.d = pccVar;
        this.e = zArr;
        this.f = pccVar2;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = "failed";
        pcc pccVar = this.f;
        boolean[] zArr = this.e;
        pcc pccVar2 = this.d;
        int i = this.c;
        jxa jxaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    jxaVar.P();
                }
                if (pccVar2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    pccVar2.a(str);
                }
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (i > 0) {
                    jxaVar.P();
                }
                if (pccVar2 != null) {
                    pccVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (pccVar != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    pccVar.a(str);
                    return;
                }
                return;
        }
    }

    public sva(jxa jxaVar, boolean[] zArr, int i, pcc pccVar, pcc pccVar2) {
        this.b = jxaVar;
        this.e = zArr;
        this.c = i;
        this.d = pccVar;
        this.f = pccVar2;
    }
}
