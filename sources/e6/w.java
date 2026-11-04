package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f9783a;
    public final float f9784b;
    public final float f9785c;

    public w(float f10, float f11, float f12) {
        this.f9783a = f10;
        this.f9784b = f11;
        this.f9785c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f9783a == wVar.f9783a && this.f9784b == wVar.f9784b && this.f9785c == wVar.f9785c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9783a), Float.valueOf(this.f9784b), Float.valueOf(this.f9785c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeFloat(this.f9783a);
        j8.a.r(parcel, 3, 4);
        parcel.writeFloat(this.f9784b);
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(this.f9785c);
        j8.a.t(parcel, s6);
    }
}
