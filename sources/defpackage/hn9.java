package defpackage;
public final class hn9 implements Runnable {
    public final byte a;
    public final un9 b;
    public final qn9 c;

    public hn9(un9 un9Var, qn9 qn9Var, Exception exc) {
        this.a = (byte) 1;
        this.b = un9Var;
        this.c = qn9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                un9 un9Var = this.b;
                qn9 qn9Var = this.c;
                ((mib) un9Var.e).c(qn9Var.a);
                return;
            case 1:
                un9 un9Var2 = this.b;
                qn9 qn9Var2 = this.c;
                rn9 rn9Var = un9Var2.e;
                long j = qn9Var2.a;
                mib mibVar = (mib) rn9Var;
                synchronized (mibVar) {
                    mibVar.c(j);
                }
                return;
            default:
                un9 un9Var3 = this.b;
                qn9 qn9Var3 = this.c;
                ((mib) un9Var3.e).c(qn9Var3.a);
                return;
        }
    }

    public hn9(un9 un9Var, qn9 qn9Var, int i, byte b) {
        this.a = b;
        this.b = un9Var;
        this.c = qn9Var;
    }
}
