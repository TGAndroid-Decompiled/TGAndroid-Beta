package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4437a;
    public final float f4438b;
    public final float f4439c;

    public w(float f7, float f10, float f11) {
        this.f4437a = f7;
        this.f4438b = f10;
        this.f4439c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4437a == wVar.f4437a && this.f4438b == wVar.f4438b && this.f4439c == wVar.f4439c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4437a), Float.valueOf(this.f4438b), Float.valueOf(this.f4439c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4437a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4438b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4439c);
        w7.d0.r(parcel, q6);
    }
}
