package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 extends a6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f13477a;
    public final n0 f13478b;

    public c0(int i10, n0 n0Var) {
        this.f13477a = i10;
        this.f13478b = n0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13477a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13478b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
