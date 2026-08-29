package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends a6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f19342a;
    public final float f19343b;
    public final float f19344c;

    public w(float f9, float f10, float f11) {
        this.f19342a = f9;
        this.f19343b = f10;
        this.f19344c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f19342a == wVar.f19342a && this.f19343b == wVar.f19343b && this.f19344c == wVar.f19344c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19342a), Float.valueOf(this.f19343b), Float.valueOf(this.f19344c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeFloat(this.f19342a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeFloat(this.f19343b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeFloat(this.f19344c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
