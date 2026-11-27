package defpackage;
public final class ti6 {
    public short a;

    public final void a(byte b) {
        boolean z;
        int i = 128;
        do {
            short s = this.a;
            boolean z2 = false;
            if ((32768 & s) == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & i) == 0) {
                z2 = true;
            }
            short s2 = (short) (s << 1);
            if (z ^ z2) {
                this.a = (short) (s2 ^ 32773);
            } else {
                this.a = s2;
            }
            i >>>= 1;
        } while (i != 0);
    }
}
