package defpackage;
public final class ah implements ed {
    public final byte a;
    public final p8c b;
    public final boolean[] c;

    public ah(byte b, p8c p8cVar, boolean[] zArr) {
        this.a = b;
        this.b = p8cVar;
        this.c = zArr;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(Boolean.valueOf(zArr[0]));
                return;
            default:
                p8cVar.a(Boolean.TRUE);
                zArr[0] = true;
                hdVar.dismiss();
                return;
        }
    }
}
