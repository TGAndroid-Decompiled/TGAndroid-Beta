package d5;

import j$.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
public final class i implements WebMessagePayloadBoundaryInterface {
    public final byte[] f8576a;

    public i(byte[] bArr) {
        this.f8576a = bArr;
    }

    @Override
    public final byte[] getAsArrayBuffer() {
        byte[] bArr = this.f8576a;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override
    public final String getAsString() {
        throw new IllegalStateException("Expected 0, but type is 1");
    }

    @Override
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override
    public final int getType() {
        return 1;
    }
}
