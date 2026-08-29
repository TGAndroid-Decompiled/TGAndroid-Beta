package h8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r extends a6.a {
    public static final Parcelable.Creator<r> CREATOR = new g8.b(13);
    public final String f7926a;
    public final String f7927b;
    public final int f7928c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f7926a = str;
        this.f7927b = str2;
        this.f7928c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7926a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7927b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f7928c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
