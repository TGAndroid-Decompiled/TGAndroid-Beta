package defpackage;
public final class c0c implements Runnable {
    public final byte a;
    public final n0c b;

    public c0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override
    public final void run() {
        x46 x46Var;
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                n0cVar.P = null;
                n0cVar.j();
                return;
            default:
                long j = n0cVar.b;
                if (!n0cVar.d && n0cVar.y > 0.0f && (x46Var = (x46) n0cVar.r.getLayoutManager()) != null && x46Var.M0() >= n0cVar.s.c.size() - 3) {
                    if (n0cVar.i()) {
                        n0cVar.j();
                        return;
                    }
                    qyb qybVar = uc7.s1(n0cVar.a).g4;
                    long j2 = -j;
                    if (!qybVar.e(j2)) {
                        qybVar.o(j2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
