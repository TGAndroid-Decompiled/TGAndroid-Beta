package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends a6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f13483a;
    public final String f13484b;

    public d0(int i10, String str) {
        this.f13483a = i10;
        this.f13484b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13483a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13484b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
