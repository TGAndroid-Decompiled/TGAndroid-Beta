package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ua extends a6.a {
    public static final Parcelable.Creator<ua> CREATOR = new t5(3);
    public final float f11221a;
    public final int f11222b;

    public ua(float f9, int i10) {
        this.f11221a = f9;
        this.f11222b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeFloat(this.f11221a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f11222b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
