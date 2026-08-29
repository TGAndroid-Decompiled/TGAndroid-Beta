package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class t6 extends a6.a {
    public static final Parcelable.Creator<t6> CREATOR = new t5(1);
    public final int f11197a;
    public final float f11198b;
    public final int f11199c;

    public t6(int i10, int i11, float f9, int i12) {
        if (i10 == 1) {
            this.f11197a = i11;
            this.f11198b = f9;
            this.f11199c = i12;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(1);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f11197a);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeFloat(this.f11198b);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f11199c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
