package f4;

import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;
public final class e implements z3.b {
    public static final Parcelable.Creator<e> CREATOR = new c.c(26);
    public final float f5585a;
    public final int f5586b;

    public e(float f10, int i9) {
        this.f5585a = f10;
        this.f5586b = i9;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f5585a == eVar.f5585a && this.f5586b == eVar.f5586b) {
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
        return ((Float.valueOf(this.f5585a).hashCode() + 527) * 31) + this.f5586b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f5585a + ", svcTemporalLayerCount=" + this.f5586b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f5585a);
        parcel.writeInt(this.f5586b);
    }

    public e(Parcel parcel) {
        this.f5585a = parcel.readFloat();
        this.f5586b = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
