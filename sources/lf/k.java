package lf;
public final class k {
    public short f14235a;

    public final void a(byte b10) {
        boolean z10;
        int i10 = 128;
        do {
            short s10 = this.f14235a;
            boolean z11 = false;
            if ((32768 & s10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & i10) == 0) {
                z11 = true;
            }
            if (z10 ^ z11) {
                this.f14235a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.f14235a = (short) (s10 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
