package defpackage;
public final class ob4 implements Runnable {
    public final byte a;
    public final qb4 b;
    public final int[] c;

    public ob4(qb4 qb4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = qb4Var;
        this.c = iArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        qb4 qb4Var = this.b;
        switch (b) {
            case 0:
                qb4Var.q.add(Integer.valueOf(iArr[0]));
                return;
            default:
                qb4Var.q.remove(Integer.valueOf(iArr[0]));
                return;
        }
    }
}
