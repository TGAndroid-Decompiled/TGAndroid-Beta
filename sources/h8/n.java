package h8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new g8.b(15);
    public int f7911a;
    public String f7912b;
    public String f7913c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.f7911a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7912b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7913c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
