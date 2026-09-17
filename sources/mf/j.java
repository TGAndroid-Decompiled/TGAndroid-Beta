package mf;
public final class j {
    public short f16221a;

    public final void a(byte b10) {
        boolean z10;
        int i10 = 128;
        do {
            short s10 = this.f16221a;
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
                this.f16221a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.f16221a = (short) (s10 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
