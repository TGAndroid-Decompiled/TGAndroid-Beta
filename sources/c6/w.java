package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4063a;
    public final float f4064b;
    public final float f4065c;

    public w(float f7, float f10, float f11) {
        this.f4063a = f7;
        this.f4064b = f10;
        this.f4065c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4063a == wVar.f4063a && this.f4064b == wVar.f4064b && this.f4065c == wVar.f4065c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4063a), Float.valueOf(this.f4064b), Float.valueOf(this.f4065c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4063a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4064b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4065c);
        w7.f0.r(parcel, q6);
    }
}
