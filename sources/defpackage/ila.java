package defpackage;
public final class ila {
    public int a;
    public int b;
    public int[] c = null;
    public byte d = 1;
    public kac e;

    public final int a() {
        int[] iArr = this.c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.b;
    }

    public final int b() {
        int[] iArr = this.c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.a;
    }
}
