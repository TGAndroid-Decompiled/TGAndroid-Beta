package defpackage;

import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
public final class evc implements WebMessagePayloadBoundaryInterface {
    public final byte[] a;

    public evc(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final byte[] getAsArrayBuffer() {
        return this.a;
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
