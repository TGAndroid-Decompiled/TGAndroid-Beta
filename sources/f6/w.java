package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11471a;
    public final float f11472b;
    public final float f11473c;

    public w(float f10, float f11, float f12) {
        this.f11471a = f10;
        this.f11472b = f11;
        this.f11473c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11471a == wVar.f11471a && this.f11472b == wVar.f11472b && this.f11473c == wVar.f11473c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11471a), Float.valueOf(this.f11472b), Float.valueOf(this.f11473c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11471a);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11472b);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11473c);
        bc.s(parcel, r10);
    }
}
