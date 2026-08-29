package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends a6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f13542a;
    public final b f13543b;

    public p(int i10, b bVar) {
        this.f13542a = i10;
        this.f13543b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13542a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13543b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
