package f4;

import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;

public final class f implements z3.b {
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    public final float f5881a;

    public final int f5882b;

    public f(float f10, int i10) {
        this.f5881a = f10;
        this.f5882b = i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f5881a == fVar.f5881a && this.f5882b == fVar.f5882b) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f5881a).hashCode() + 527) * 31) + this.f5882b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f5881a + ", svcTemporalLayerCount=" + this.f5882b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f5881a);
        parcel.writeInt(this.f5882b);
    }

    public f(Parcel parcel) {
        this.f5881a = parcel.readFloat();
        this.f5882b = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
