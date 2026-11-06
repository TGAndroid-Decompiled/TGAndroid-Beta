package n6;

import java.util.Arrays;
public final class m extends l {
    public final byte[] f20511c;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f20511c = bArr;
    }

    @Override
    public final byte[] M0() {
        return this.f20511c;
    }
}
