package k6;

import java.util.Arrays;
public final class m extends l {
    public final byte[] f15030c;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f15030c = bArr;
    }

    @Override
    public final byte[] L0() {
        return this.f15030c;
    }
}
