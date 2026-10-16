package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4550a;
    public final float f4551b;
    public final float f4552c;

    public w(float f7, float f10, float f11) {
        this.f4550a = f7;
        this.f4551b = f10;
        this.f4552c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4550a == wVar.f4550a && this.f4551b == wVar.f4551b && this.f4552c == wVar.f4552c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4550a), Float.valueOf(this.f4551b), Float.valueOf(this.f4552c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4550a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4551b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4552c);
        w7.f0.r(parcel, q6);
    }
}
