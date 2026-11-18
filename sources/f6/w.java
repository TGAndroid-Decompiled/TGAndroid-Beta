package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11474a;
    public final float f11475b;
    public final float f11476c;

    public w(float f10, float f11, float f12) {
        this.f11474a = f10;
        this.f11475b = f11;
        this.f11476c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11474a == wVar.f11474a && this.f11475b == wVar.f11475b && this.f11476c == wVar.f11476c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11474a), Float.valueOf(this.f11475b), Float.valueOf(this.f11476c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11474a);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11475b);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11476c);
        bc.s(parcel, r10);
    }
}
