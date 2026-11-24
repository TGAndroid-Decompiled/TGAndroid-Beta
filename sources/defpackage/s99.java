package defpackage;
public final class s99 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final qac c;

    public s99(jva jvaVar, boolean[] zArr, qac qacVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = qacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && qacVar != null) {
                    zArr[0] = true;
                    qacVar.a(Boolean.TRUE);
                }
                gm.d3(new bo6((byte) 16), 220L);
                return;
            case 1:
                if (!zArr[0] && qacVar != null) {
                    zArr[0] = true;
                    qacVar.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (!zArr[0] && qacVar != null) {
                    qacVar.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public s99(byte b, qac qacVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = qacVar;
    }
}
