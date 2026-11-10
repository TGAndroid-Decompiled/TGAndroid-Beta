package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11345a;
    public final float f11346b;
    public final float f11347c;

    public w(float f10, float f11, float f12) {
        this.f11345a = f10;
        this.f11346b = f11;
        this.f11347c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11345a == wVar.f11345a && this.f11346b == wVar.f11346b && this.f11347c == wVar.f11347c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11345a), Float.valueOf(this.f11346b), Float.valueOf(this.f11347c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeFloat(this.f11345a);
        xb.q(parcel, 3, 4);
        parcel.writeFloat(this.f11346b);
        xb.q(parcel, 4, 4);
        parcel.writeFloat(this.f11347c);
        xb.s(parcel, r10);
    }
}
