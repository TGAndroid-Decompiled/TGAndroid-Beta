package defpackage;
public final class od4 implements Runnable {
    public final byte a;
    public final qd4 b;
    public final int[] c;

    public od4(qd4 qd4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = qd4Var;
        this.c = iArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        qd4 qd4Var = this.b;
        switch (b) {
            case 0:
                qd4Var.q.add(Integer.valueOf(iArr[0]));
                return;
            default:
                qd4Var.q.remove(Integer.valueOf(iArr[0]));
                return;
        }
    }
}
