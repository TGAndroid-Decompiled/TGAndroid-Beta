package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f11500a;
    public final float f11501b;
    public final float f11502c;

    public w(float f10, float f11, float f12) {
        this.f11500a = f10;
        this.f11501b = f11;
        this.f11502c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11500a == wVar.f11500a && this.f11501b == wVar.f11501b && this.f11502c == wVar.f11502c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11500a), Float.valueOf(this.f11501b), Float.valueOf(this.f11502c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.f11500a);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.f11501b);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.f11502c);
        bc.s(parcel, r10);
    }
}
