package defpackage;
public final class ufc implements Runnable {
    public final byte a;
    public final k7b b;
    public final p93 c;

    public ufc(k7b k7bVar, p93 p93Var, byte b) {
        this.a = b;
        this.b = k7bVar;
        this.c = p93Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                k7b k7bVar = this.b;
                p93 p93Var = this.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((vfc) k7bVar.c)).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1015, new aa3(U, p93Var, (byte) 22));
                return;
            default:
                k7b k7bVar2 = this.b;
                p93 p93Var2 = this.c;
                synchronized (p93Var2) {
                }
                String str2 = gcc.a;
                s64 s64Var = ((n64) ((vfc) k7bVar2.c)).a;
                ea3 ea3Var2 = s64Var.s;
                uj R = ea3Var2.R((vz6) ea3Var2.d.e);
                ea3Var2.V(R, 1020, new ht2(R, p93Var2, (byte) 17));
                s64Var.S = null;
                return;
        }
    }
}
