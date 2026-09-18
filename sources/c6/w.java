package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4062a;
    public final float f4063b;
    public final float f4064c;

    public w(float f7, float f10, float f11) {
        this.f4062a = f7;
        this.f4063b = f10;
        this.f4064c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4062a == wVar.f4062a && this.f4063b == wVar.f4063b && this.f4064c == wVar.f4064c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4062a), Float.valueOf(this.f4063b), Float.valueOf(this.f4064c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4062a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4063b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4064c);
        w7.f0.r(parcel, q6);
    }
}
