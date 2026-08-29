package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends a6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f13558a;
    public final boolean f13559b;
    public final boolean f13560c;

    public t(int i10, boolean z10, boolean z11) {
        this.f13558a = i10;
        this.f13559b = z10;
        this.f13560c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13558a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13559b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f13560c ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
