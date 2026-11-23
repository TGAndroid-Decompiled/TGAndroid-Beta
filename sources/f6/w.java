package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11466a;
    public final float f11467b;
    public final float f11468c;

    public w(float f10, float f11, float f12) {
        this.f11466a = f10;
        this.f11467b = f11;
        this.f11468c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11466a == wVar.f11466a && this.f11467b == wVar.f11467b && this.f11468c == wVar.f11468c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11466a), Float.valueOf(this.f11467b), Float.valueOf(this.f11468c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11466a);
        cc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11467b);
        cc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11468c);
        cc.s(parcel, r10);
    }
}
