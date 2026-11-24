package defpackage;
public final class da4 implements Runnable {
    public final byte a;
    public final int[] b;
    public final int c;

    public da4(int[] iArr, int i) {
        this.a = (byte) 0;
        this.c = i;
        this.b = iArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                ia4.i.d(i, iArr[0], 0, false);
                return;
            case 1:
                gm.c3(new da4((byte) 2, i, iArr));
                return;
            default:
                int i2 = iArr[0];
                if (i2 != 0) {
                    ia4.a(ia4.i.d(i, i2, 0, false));
                    return;
                }
                return;
        }
    }

    public da4(byte b, int i, int[] iArr) {
        this.a = b;
        this.b = iArr;
        this.c = i;
    }
}
