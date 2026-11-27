package defpackage;
public final class tfc implements Runnable {
    public final byte a = 0;
    public final k7b b;
    public final long c;
    public final int d;

    public tfc(k7b k7bVar, int i, long j) {
        this.b = k7bVar;
        this.d = i;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        k7b k7bVar = this.b;
        switch (b) {
            case 0:
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((vfc) k7bVar.c)).a.s;
                uj R = ea3Var.R((vz6) ea3Var.d.e);
                ea3Var.V(R, 1018, new aa3(R, i, j));
                return;
            default:
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) ((vfc) k7bVar.c)).a.s;
                uj R2 = ea3Var2.R((vz6) ea3Var2.d.e);
                ea3Var2.V(R2, 1021, new aa3(R2, j, i));
                return;
        }
    }

    public tfc(k7b k7bVar, long j, int i) {
        this.b = k7bVar;
        this.c = j;
        this.d = i;
    }
}
