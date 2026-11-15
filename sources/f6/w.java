package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11154a;
    public final float f11155b;
    public final float f11156c;

    public w(float f10, float f11, float f12) {
        this.f11154a = f10;
        this.f11155b = f11;
        this.f11156c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11154a == wVar.f11154a && this.f11155b == wVar.f11155b && this.f11156c == wVar.f11156c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11154a), Float.valueOf(this.f11155b), Float.valueOf(this.f11156c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeFloat(this.f11154a);
        yb.q(parcel, 3, 4);
        parcel.writeFloat(this.f11155b);
        yb.q(parcel, 4, 4);
        parcel.writeFloat(this.f11156c);
        yb.s(parcel, r10);
    }
}
