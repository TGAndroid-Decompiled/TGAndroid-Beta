package defpackage;
public final class qeb {
    public final byte a;

    public qeb(byte b) {
        this.a = b;
    }

    public final int a(xeb xebVar, int i) {
        switch (this.a) {
            case 0:
            case 3:
            default:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
        }
    }

    public final int b(xeb xebVar, int i) {
        switch (this.a) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
            case 3:
            default:
                return 0;
            case 2:
                return i;
        }
    }

    public final int c(int i, int i2) {
        switch (this.a) {
            case 4:
                return i2;
            default:
                return i;
        }
    }
}
