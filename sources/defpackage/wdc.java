package defpackage;
public final class wdc implements Runnable {
    public final byte a = 0;
    public final xab b;
    public final long c;
    public final int d;

    public wdc(xab xabVar, int i, long j) {
        this.b = xabVar;
        this.d = i;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        xab xabVar = this.b;
        switch (b) {
            case 0:
                String str = hac.a;
                xa3 xa3Var = ((c74) ((ydc) xabVar.c)).a.s;
                tk R = xa3Var.R((rz6) xa3Var.d.e);
                xa3Var.V(R, 1018, new ua3(R, i, j));
                return;
            default:
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) ((ydc) xabVar.c)).a.s;
                tk R2 = xa3Var2.R((rz6) xa3Var2.d.e);
                xa3Var2.V(R2, 1021, new ua3(R2, j, i));
                return;
        }
    }

    public wdc(xab xabVar, long j, int i) {
        this.b = xabVar;
        this.c = j;
        this.d = i;
    }
}
