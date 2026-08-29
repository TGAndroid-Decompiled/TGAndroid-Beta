package h8;

import android.os.Parcel;
import android.os.Parcelable;
public final class k extends a6.a {
    public static final Parcelable.Creator<k> CREATOR = new g8.b(11);
    public int f7906a;
    public String f7907b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.f7906a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7907b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
