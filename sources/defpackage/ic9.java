package defpackage;
public final class ic9 implements Runnable {
    public final byte a;
    public final nd9 b;
    public final q9c[] c;
    public final fu5 d;

    public ic9(nd9 nd9Var, q9c[] q9cVarArr, fu5 fu5Var, byte b) {
        this.a = b;
        this.b = nd9Var;
        this.c = q9cVarArr;
        this.d = fu5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fu5 fu5Var = this.d;
        q9c[] q9cVarArr = this.c;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = nd9Var.e;
                if (!ed9Var.l.isEmpty()) {
                    ed9Var.l.clear();
                    ed9Var.p();
                    q9c q9cVar = q9cVarArr[0];
                    if (q9cVar != null) {
                        q9cVar.g3.O(true);
                    }
                    fu5Var.t0 = true;
                    return;
                }
                return;
            case 1:
                ed9 ed9Var2 = nd9Var.e;
                if (!ed9Var2.k.isEmpty()) {
                    ed9Var2.k.clear();
                    ed9Var2.p();
                    q9c q9cVar2 = q9cVarArr[0];
                    if (q9cVar2 != null) {
                        q9cVar2.g3.O(true);
                    }
                    fu5Var.t0 = true;
                    return;
                }
                return;
            default:
                ed9 ed9Var3 = nd9Var.e;
                if (!ed9Var3.m.isEmpty()) {
                    ed9Var3.m.clear();
                    ed9Var3.p();
                    q9c q9cVar3 = q9cVarArr[0];
                    if (q9cVar3 != null) {
                        q9cVar3.g3.O(true);
                    }
                    fu5Var.t0 = true;
                    return;
                }
                return;
        }
    }
}
