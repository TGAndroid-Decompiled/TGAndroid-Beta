package defpackage;
public final class db9 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final pcc c;

    public db9(jxa jxaVar, boolean[] zArr, pcc pccVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = pccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && pccVar != null) {
                    zArr[0] = true;
                    pccVar.a(Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                if (!zArr[0] && pccVar != null) {
                    zArr[0] = true;
                    pccVar.a(Boolean.TRUE);
                }
                hl.d3(new pg6((byte) 19), 220L);
                return;
            default:
                if (!zArr[0] && pccVar != null) {
                    pccVar.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public db9(byte b, pcc pccVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = pccVar;
    }
}
