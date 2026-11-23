package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11465a;
    public final float f11466b;
    public final float f11467c;

    public w(float f10, float f11, float f12) {
        this.f11465a = f10;
        this.f11466b = f11;
        this.f11467c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11465a == wVar.f11465a && this.f11466b == wVar.f11466b && this.f11467c == wVar.f11467c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11465a), Float.valueOf(this.f11466b), Float.valueOf(this.f11467c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11465a);
        cc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11466b);
        cc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11467c);
        cc.s(parcel, r10);
    }
}
