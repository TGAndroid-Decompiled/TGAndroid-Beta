package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f3950a;
    public final float f3951b;
    public final float f3952c;

    public w(float f7, float f10, float f11) {
        this.f3950a = f7;
        this.f3951b = f10;
        this.f3952c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f3950a == wVar.f3950a && this.f3951b == wVar.f3951b && this.f3952c == wVar.f3952c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3950a), Float.valueOf(this.f3951b), Float.valueOf(this.f3952c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeFloat(this.f3950a);
        h0.s(parcel, 3, 4);
        parcel.writeFloat(this.f3951b);
        h0.s(parcel, 4, 4);
        parcel.writeFloat(this.f3952c);
        h0.r(parcel, q6);
    }
}
