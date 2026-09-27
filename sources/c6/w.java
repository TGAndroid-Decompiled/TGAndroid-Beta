package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4056a;
    public final float f4057b;
    public final float f4058c;

    public w(float f7, float f10, float f11) {
        this.f4056a = f7;
        this.f4057b = f10;
        this.f4058c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4056a == wVar.f4056a && this.f4057b == wVar.f4057b && this.f4058c == wVar.f4058c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4056a), Float.valueOf(this.f4057b), Float.valueOf(this.f4058c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4056a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4057b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4058c);
        w7.f0.r(parcel, q6);
    }
}
