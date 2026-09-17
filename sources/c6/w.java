package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4580a;
    public final float f4581b;
    public final float f4582c;

    public w(float f7, float f10, float f11) {
        this.f4580a = f7;
        this.f4581b = f10;
        this.f4582c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4580a == wVar.f4580a && this.f4581b == wVar.f4581b && this.f4582c == wVar.f4582c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4580a), Float.valueOf(this.f4581b), Float.valueOf(this.f4582c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4580a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4581b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4582c);
        w7.e0.r(parcel, q6);
    }
}
