package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11340a;
    public final float f11341b;
    public final float f11342c;

    public w(float f10, float f11, float f12) {
        this.f11340a = f10;
        this.f11341b = f11;
        this.f11342c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11340a == wVar.f11340a && this.f11341b == wVar.f11341b && this.f11342c == wVar.f11342c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11340a), Float.valueOf(this.f11341b), Float.valueOf(this.f11342c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeFloat(this.f11340a);
        xb.q(parcel, 3, 4);
        parcel.writeFloat(this.f11341b);
        xb.q(parcel, 4, 4);
        parcel.writeFloat(this.f11342c);
        xb.s(parcel, r10);
    }
}
