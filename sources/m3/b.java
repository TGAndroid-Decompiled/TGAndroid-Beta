package m3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import l4.j;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public final float f13752a;
    public final float f13753b;

    public b(float f10, float f11) {
        h5.a.e("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f13752a = f10;
        this.f13753b = f11;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f13752a == bVar.f13752a && this.f13753b == bVar.f13753b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f13753b).hashCode() + ((Float.valueOf(this.f13752a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f13752a + ", longitude=" + this.f13753b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f13752a);
        parcel.writeFloat(this.f13753b);
    }

    public b(Parcel parcel) {
        this.f13752a = parcel.readFloat();
        this.f13753b = parcel.readFloat();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
