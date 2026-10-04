package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4387a;
    public final float f4388b;
    public final float f4389c;

    public w(float f7, float f10, float f11) {
        this.f4387a = f7;
        this.f4388b = f10;
        this.f4389c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4387a == wVar.f4387a && this.f4388b == wVar.f4388b && this.f4389c == wVar.f4389c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4387a), Float.valueOf(this.f4388b), Float.valueOf(this.f4389c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4387a);
        g0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4388b);
        g0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4389c);
        g0.r(parcel, q6);
    }
}
