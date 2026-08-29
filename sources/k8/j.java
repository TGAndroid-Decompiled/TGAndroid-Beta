package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f13515a;
    public final boolean f13516b;
    public final boolean f13517c;
    public final boolean d;
    public final boolean f13518e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f13515a = i10;
        this.f13516b = z10;
        this.f13517c = z11;
        this.d = z12;
        this.f13518e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f13515a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13516b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13517c ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f13518e ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
