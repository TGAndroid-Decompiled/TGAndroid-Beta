package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4059a;
    public final float f4060b;
    public final float f4061c;

    public w(float f7, float f10, float f11) {
        this.f4059a = f7;
        this.f4060b = f10;
        this.f4061c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4059a == wVar.f4059a && this.f4060b == wVar.f4060b && this.f4061c == wVar.f4061c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4059a), Float.valueOf(this.f4060b), Float.valueOf(this.f4061c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4059a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4060b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4061c);
        w7.e0.r(parcel, q6);
    }
}
