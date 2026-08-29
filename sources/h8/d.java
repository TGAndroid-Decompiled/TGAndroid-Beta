package h8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new g8.b(21);
    public String f7869a;
    public String f7870b;
    public int f7871c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7869a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7870b);
        int i11 = this.f7871c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
