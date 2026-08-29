package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g0 extends a6.a {
    public static final Parcelable.Creator<g0> CREATOR = new c(28);
    public final int f13509a;

    public g0(int i10) {
        this.f13509a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13509a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
