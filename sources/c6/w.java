package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4920a;
    public final float f4921b;
    public final float f4922c;

    public w(float f7, float f10, float f11) {
        this.f4920a = f7;
        this.f4921b = f10;
        this.f4922c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4920a == wVar.f4920a && this.f4921b == wVar.f4921b && this.f4922c == wVar.f4922c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4920a), Float.valueOf(this.f4921b), Float.valueOf(this.f4922c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4920a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4921b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4922c);
        w7.f0.r(parcel, q6);
    }
}
