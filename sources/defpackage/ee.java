package defpackage;
public final class ee implements fd {
    public final byte a;
    public final pcc b;
    public final boolean[] c;

    public ee(byte b, pcc pccVar, boolean[] zArr) {
        this.a = b;
        this.b = pccVar;
        this.c = zArr;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(Boolean.valueOf(zArr[0]));
                return;
            default:
                pccVar.a(Boolean.TRUE);
                zArr[0] = true;
                idVar.dismiss();
                return;
        }
    }
}
