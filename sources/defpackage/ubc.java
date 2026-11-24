package defpackage;
public final class ubc implements Runnable {
    public final byte a = 0;
    public final v8b b;
    public final long c;
    public final int d;

    public ubc(v8b v8bVar, int i, long j) {
        this.b = v8bVar;
        this.d = i;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                String str = g8c.a;
                l93 l93Var = ((t54) ((xbc) v8bVar.c)).a.s;
                tj R = l93Var.R((rx6) l93Var.d.e);
                l93Var.V(R, 1018, new i93(R, i, j));
                return;
            default:
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) ((xbc) v8bVar.c)).a.s;
                tj R2 = l93Var2.R((rx6) l93Var2.d.e);
                l93Var2.V(R2, 1021, new i93(R2, j, i));
                return;
        }
    }

    public ubc(v8b v8bVar, long j, int i) {
        this.b = v8bVar;
        this.c = j;
        this.d = i;
    }
}
