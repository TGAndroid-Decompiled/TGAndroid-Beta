package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class w extends y5.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f17483a;
    public final float f17484b;
    public final float f17485c;

    public w(float f10, float f11, float f12) {
        this.f17483a = f10;
        this.f17484b = f11;
        this.f17485c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f17483a == wVar.f17483a && this.f17484b == wVar.f17484b && this.f17485c == wVar.f17485c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17483a), Float.valueOf(this.f17484b), Float.valueOf(this.f17485c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeFloat(this.f17483a);
        p8.s(parcel, 3, 4);
        parcel.writeFloat(this.f17484b);
        p8.s(parcel, 4, 4);
        parcel.writeFloat(this.f17485c);
        p8.r(parcel, q10);
    }
}
