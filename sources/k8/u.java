package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class u extends a6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f13562a;
    public final boolean f13563b;

    public u(int i10, boolean z10) {
        this.f13562a = i10;
        this.f13563b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13562a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13563b ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
