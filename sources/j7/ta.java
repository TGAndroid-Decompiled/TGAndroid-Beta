package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ta extends a6.a {
    public static final Parcelable.Creator<ta> CREATOR = new t5(2);
    public final String f11204a;
    public final float f11205b;
    public final String f11206c;
    public final int d;

    public ta(float f9, int i10, String str, String str2) {
        this.f11204a = str;
        this.f11205b = f9;
        this.f11206c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f11204a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeFloat(this.f11205b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f11206c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
