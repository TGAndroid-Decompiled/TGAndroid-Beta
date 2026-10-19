package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4918a;
    public final float f4919b;
    public final float f4920c;

    public w(float f7, float f10, float f11) {
        this.f4918a = f7;
        this.f4919b = f10;
        this.f4920c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4918a == wVar.f4918a && this.f4919b == wVar.f4919b && this.f4920c == wVar.f4920c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4918a), Float.valueOf(this.f4919b), Float.valueOf(this.f4920c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4918a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4919b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4920c);
        w7.f0.r(parcel, q6);
    }
}
