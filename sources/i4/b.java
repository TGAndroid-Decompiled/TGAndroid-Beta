package i4;

import j3.g1;
import j3.t0;
public abstract class b implements b4.b {
    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
