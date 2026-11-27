package defpackage;
public final class z94 implements Runnable {
    public final byte a;
    public final int[] b;
    public final int c;

    public z94(int[] iArr, int i) {
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
                ea4.j.i(i, iArr[0], 0, false);
                return;
            case 1:
                hl.c3(new z94((byte) 2, i, iArr));
                return;
            default:
                int i2 = iArr[0];
                if (i2 != 0) {
                    ea4.a(ea4.j.i(i, i2, 0, false));
                    return;
                }
                return;
        }
    }

    public z94(byte b, int i, int[] iArr) {
        this.a = b;
        this.b = iArr;
        this.c = i;
    }
}
