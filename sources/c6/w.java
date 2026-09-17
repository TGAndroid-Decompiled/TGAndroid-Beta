package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4607a;
    public final float f4608b;
    public final float f4609c;

    public w(float f7, float f10, float f11) {
        this.f4607a = f7;
        this.f4608b = f10;
        this.f4609c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4607a == wVar.f4607a && this.f4608b == wVar.f4608b && this.f4609c == wVar.f4609c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4607a), Float.valueOf(this.f4608b), Float.valueOf(this.f4609c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4607a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4608b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4609c);
        w7.e0.r(parcel, q6);
    }
}
