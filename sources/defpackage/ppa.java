package defpackage;
public final class ppa implements Runnable {
    public final byte a;
    public final wsa b;
    public final long c;

    public ppa(wsa wsaVar, long j, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.Y1(j);
                return;
            case 1:
                wsaVar.Y1(j);
                return;
            case 2:
                npa npaVar = wsaVar.s3;
                wsaVar.z2(1, true, null);
                if (j > 0) {
                    gm.r(npaVar);
                    gm.c3(npaVar);
                    return;
                }
                return;
            case 3:
                wsaVar.Y1(j);
                return;
            case 4:
                wsaVar.Y1(j);
                return;
            case 5:
                wsaVar.U1(j);
                return;
            case 6:
                dxa dxaVar = new dxa(wsaVar.getContext(), wsaVar.J0, this.c, 10, null, new e6a(wsaVar, new boolean[]{false}, (byte) 21), 0L);
                dxaVar.setOnDismissListener(new qqa(wsaVar, (byte) 0));
                dxaVar.show();
                return;
            case 7:
                wsaVar.Y1(j);
                return;
            case 8:
                wsaVar.U1(j);
                return;
            case 9:
                wsaVar.Y1(j);
                return;
            case 10:
                wsaVar.U1(j);
                return;
            case 11:
                wsaVar.Y1(j);
                return;
            default:
                wsaVar.U1(j);
                return;
        }
    }
}
