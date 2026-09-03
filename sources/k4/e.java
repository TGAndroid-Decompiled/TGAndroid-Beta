package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
public final class e implements e4.b {
    public static final Parcelable.Creator<e> CREATOR = new t(15);
    public final float f9727a;
    public final int f9728b;

    public e(float f10, int i10) {
        this.f9727a = f10;
        this.f9728b = i10;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final byte[] d() {
        return null;
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
            if (this.f9727a == eVar.f9727a && this.f9728b == eVar.f9728b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9727a).hashCode() + 527) * 31) + this.f9728b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f9727a + ", svcTemporalLayerCount=" + this.f9728b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f9727a);
        parcel.writeInt(this.f9728b);
    }

    public e(Parcel parcel) {
        this.f9727a = parcel.readFloat();
        this.f9728b = parcel.readInt();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
