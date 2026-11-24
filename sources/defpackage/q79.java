package defpackage;
public final class q79 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final p8c c;

    public q79(gta gtaVar, boolean[] zArr, p8c p8cVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = p8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && p8cVar != null) {
                    zArr[0] = true;
                    p8cVar.a(Boolean.TRUE);
                }
                gl.d3(new am6((byte) 16), 220L);
                return;
            case 1:
                if (!zArr[0] && p8cVar != null) {
                    zArr[0] = true;
                    p8cVar.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (!zArr[0] && p8cVar != null) {
                    p8cVar.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public q79(byte b, p8c p8cVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = p8cVar;
    }
}
