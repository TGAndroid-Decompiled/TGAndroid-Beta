package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4547a;
    public final float f4548b;
    public final float f4549c;

    public w(float f7, float f10, float f11) {
        this.f4547a = f7;
        this.f4548b = f10;
        this.f4549c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4547a == wVar.f4547a && this.f4548b == wVar.f4548b && this.f4549c == wVar.f4549c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4547a), Float.valueOf(this.f4548b), Float.valueOf(this.f4549c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4547a);
        g0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4548b);
        g0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4549c);
        g0.r(parcel, q6);
    }
}
