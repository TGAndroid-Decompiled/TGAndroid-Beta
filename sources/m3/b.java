package m3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import l4.j;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public final float f13463a;
    public final float f13464b;

    public b(float f10, float f11) {
        h5.a.e("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f13463a = f10;
        this.f13464b = f11;
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
            if (this.f13463a == bVar.f13463a && this.f13464b == bVar.f13464b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f13464b).hashCode() + ((Float.valueOf(this.f13463a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f13463a + ", longitude=" + this.f13464b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f13463a);
        parcel.writeFloat(this.f13464b);
    }

    public b(Parcel parcel) {
        this.f13463a = parcel.readFloat();
        this.f13464b = parcel.readFloat();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
