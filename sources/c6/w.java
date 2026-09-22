package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4061a;
    public final float f4062b;
    public final float f4063c;

    public w(float f7, float f10, float f11) {
        this.f4061a = f7;
        this.f4062b = f10;
        this.f4063c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4061a == wVar.f4061a && this.f4062b == wVar.f4062b && this.f4063c == wVar.f4063c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4061a), Float.valueOf(this.f4062b), Float.valueOf(this.f4063c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4061a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4062b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4063c);
        w7.f0.r(parcel, q6);
    }
}
