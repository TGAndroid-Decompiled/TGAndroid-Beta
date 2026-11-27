package defpackage;
public final class ld4 implements Runnable {
    public final byte a;
    public final nd4 b;
    public final int[] c;

    public ld4(nd4 nd4Var, int[] iArr, byte b) {
        this.a = b;
        this.b = nd4Var;
        this.c = iArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int[] iArr = this.c;
        nd4 nd4Var = this.b;
        switch (b) {
            case 0:
                nd4Var.q.add(Integer.valueOf(iArr[0]));
                return;
            default:
                nd4Var.q.remove(Integer.valueOf(iArr[0]));
                return;
        }
    }
}
