package defpackage;
public final class w89 implements Runnable {
    public final byte a;
    public final z99 b;
    public final q5c[] c;
    public final cs5 d;

    public w89(z99 z99Var, q5c[] q5cVarArr, cs5 cs5Var, byte b) {
        this.a = b;
        this.b = z99Var;
        this.c = q5cVarArr;
        this.d = cs5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cs5 cs5Var = this.d;
        q5c[] q5cVarArr = this.c;
        z99 z99Var = this.b;
        switch (b) {
            case 0:
                q99 q99Var = z99Var.d;
                if (!q99Var.l.isEmpty()) {
                    q99Var.l.clear();
                    q99Var.m();
                    q5c q5cVar = q5cVarArr[0];
                    if (q5cVar != null) {
                        q5cVar.g3.O(true);
                    }
                    cs5Var.q0 = true;
                    return;
                }
                return;
            case 1:
                q99 q99Var2 = z99Var.d;
                if (!q99Var2.k.isEmpty()) {
                    q99Var2.k.clear();
                    q99Var2.m();
                    q5c q5cVar2 = q5cVarArr[0];
                    if (q5cVar2 != null) {
                        q5cVar2.g3.O(true);
                    }
                    cs5Var.q0 = true;
                    return;
                }
                return;
            default:
                q99 q99Var3 = z99Var.d;
                if (!q99Var3.j.isEmpty()) {
                    q99Var3.j.clear();
                    q99Var3.m();
                    q5c q5cVar3 = q5cVarArr[0];
                    if (q5cVar3 != null) {
                        q5cVar3.g3.O(true);
                    }
                    cs5Var.q0 = true;
                    return;
                }
                return;
        }
    }
}
