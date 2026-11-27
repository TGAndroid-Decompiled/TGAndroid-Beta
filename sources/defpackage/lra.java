package defpackage;
public final class lra implements Runnable {
    public final byte a;
    public final wua b;
    public final long c;

    public lra(wua wuaVar, long j, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.Z1(j);
                return;
            case 1:
                wuaVar.Z1(j);
                return;
            case 2:
                jra jraVar = wuaVar.s3;
                wuaVar.A2(1, true, null);
                if (j > 0) {
                    hl.r(jraVar);
                    hl.c3(jraVar);
                    return;
                }
                return;
            case 3:
                wuaVar.Z1(j);
                return;
            case 4:
                wuaVar.Z1(j);
                return;
            case 5:
                dza dzaVar = new dza(wuaVar.getContext(), wuaVar.J0, this.c, 10, null, new kba(wuaVar, new boolean[]{false}, (byte) 17), 0L);
                dzaVar.setOnDismissListener(new rsa(wuaVar, (byte) 0));
                dzaVar.show();
                return;
            case 6:
                wuaVar.V1(j);
                return;
            case 7:
                wuaVar.Z1(j);
                return;
            case 8:
                wuaVar.V1(j);
                return;
            case 9:
                wuaVar.Z1(j);
                return;
            case 10:
                wuaVar.V1(j);
                return;
            case 11:
                wuaVar.Z1(j);
                return;
            default:
                wuaVar.V1(j);
                return;
        }
    }
}
