package n6;

import java.util.Arrays;
public final class m extends l {
    public final byte[] f20514c;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f20514c = bArr;
    }

    @Override
    public final byte[] m1() {
        return this.f20514c;
    }
}
