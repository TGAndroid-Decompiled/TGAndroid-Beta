package defpackage;

import java.util.Arrays;
public final class dse extends wme {
    public final byte[] c;

    public dse(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override
    public final byte[] T() {
        return this.c;
    }
}
