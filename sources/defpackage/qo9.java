package defpackage;
public final class qo9 implements Runnable {
    public final byte a;
    public final int[] b;
    public final Runnable c;

    public qo9(int[] iArr, Runnable runnable, byte b) {
        this.a = b;
        this.b = iArr;
        this.c = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                gm.c3(new qo9(iArr, runnable, (byte) 1));
                return;
            default:
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0 && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
