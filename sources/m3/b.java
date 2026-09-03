package m3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import l4.j;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public final float f13736a;
    public final float f13737b;

    public b(float f10, float f11) {
        h5.a.e("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f13736a = f10;
        this.f13737b = f11;
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
            if (this.f13736a == bVar.f13736a && this.f13737b == bVar.f13737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f13737b).hashCode() + ((Float.valueOf(this.f13736a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f13736a + ", longitude=" + this.f13737b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f13736a);
        parcel.writeFloat(this.f13737b);
    }

    public b(Parcel parcel) {
        this.f13736a = parcel.readFloat();
        this.f13737b = parcel.readFloat();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
