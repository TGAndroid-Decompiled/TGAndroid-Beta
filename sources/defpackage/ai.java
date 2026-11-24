package defpackage;
public final class ai implements ee {
    public final byte a;
    public final qac b;
    public final boolean[] c;

    public ai(byte b, qac qacVar, boolean[] zArr) {
        this.a = b;
        this.b = qacVar;
        this.c = zArr;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(Boolean.valueOf(zArr[0]));
                return;
            default:
                qacVar.a(Boolean.TRUE);
                zArr[0] = true;
                heVar.dismiss();
                return;
        }
    }
}
