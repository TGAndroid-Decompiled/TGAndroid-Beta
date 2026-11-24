package defpackage;
public final class ya9 implements Runnable {
    public final byte a;
    public final zb9 b;
    public final q7c[] c;
    public final bu5 d;

    public ya9(zb9 zb9Var, q7c[] q7cVarArr, bu5 bu5Var, byte b) {
        this.a = b;
        this.b = zb9Var;
        this.c = q7cVarArr;
        this.d = bu5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bu5 bu5Var = this.d;
        q7c[] q7cVarArr = this.c;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                qb9 qb9Var = zb9Var.d;
                if (!qb9Var.l.isEmpty()) {
                    qb9Var.l.clear();
                    qb9Var.m();
                    q7c q7cVar = q7cVarArr[0];
                    if (q7cVar != null) {
                        q7cVar.g3.O(true);
                    }
                    bu5Var.q0 = true;
                    return;
                }
                return;
            case 1:
                qb9 qb9Var2 = zb9Var.d;
                if (!qb9Var2.k.isEmpty()) {
                    qb9Var2.k.clear();
                    qb9Var2.m();
                    q7c q7cVar2 = q7cVarArr[0];
                    if (q7cVar2 != null) {
                        q7cVar2.g3.O(true);
                    }
                    bu5Var.q0 = true;
                    return;
                }
                return;
            default:
                qb9 qb9Var3 = zb9Var.d;
                if (!qb9Var3.j.isEmpty()) {
                    qb9Var3.j.clear();
                    qb9Var3.m();
                    q7c q7cVar3 = q7cVarArr[0];
                    if (q7cVar3 != null) {
                        q7cVar3.g3.O(true);
                    }
                    bu5Var.q0 = true;
                    return;
                }
                return;
        }
    }
}
