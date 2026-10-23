package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4923a;
    public final float f4924b;
    public final float f4925c;

    public w(float f7, float f10, float f11) {
        this.f4923a = f7;
        this.f4924b = f10;
        this.f4925c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4923a == wVar.f4923a && this.f4924b == wVar.f4924b && this.f4925c == wVar.f4925c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4923a), Float.valueOf(this.f4924b), Float.valueOf(this.f4925c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4923a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4924b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4925c);
        w7.f0.r(parcel, q6);
    }
}
