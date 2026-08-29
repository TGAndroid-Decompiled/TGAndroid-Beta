package h4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;
public final class e implements b4.b {
    public static final Parcelable.Creator<e> CREATOR = new g8.b(8);
    public final float f7535a;
    public final int f7536b;

    public e(float f9, int i10) {
        this.f7535a = f9;
        this.f7536b = i10;
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
            if (this.f7535a == eVar.f7535a && this.f7536b == eVar.f7536b) {
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
        return ((Float.valueOf(this.f7535a).hashCode() + 527) * 31) + this.f7536b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f7535a + ", svcTemporalLayerCount=" + this.f7536b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f7535a);
        parcel.writeInt(this.f7536b);
    }

    public e(Parcel parcel) {
        this.f7535a = parcel.readFloat();
        this.f7536b = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
