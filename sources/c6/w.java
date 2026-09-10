package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4476a;
    public final float f4477b;
    public final float f4478c;

    public w(float f7, float f10, float f11) {
        this.f4476a = f7;
        this.f4477b = f10;
        this.f4478c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4476a == wVar.f4476a && this.f4477b == wVar.f4477b && this.f4478c == wVar.f4478c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4476a), Float.valueOf(this.f4477b), Float.valueOf(this.f4478c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4476a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4477b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4478c);
        w7.e0.r(parcel, q6);
    }
}
