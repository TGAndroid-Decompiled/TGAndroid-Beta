package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11503a;
    public final float f11504b;
    public final float f11505c;

    public w(float f10, float f11, float f12) {
        this.f11503a = f10;
        this.f11504b = f11;
        this.f11505c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11503a == wVar.f11503a && this.f11504b == wVar.f11504b && this.f11505c == wVar.f11505c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11503a), Float.valueOf(this.f11504b), Float.valueOf(this.f11505c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11503a);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11504b);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11505c);
        bc.s(parcel, r10);
    }
}
