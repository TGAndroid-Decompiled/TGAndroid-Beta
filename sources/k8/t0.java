package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends a6.a {
    public static final Parcelable.Creator<t0> CREATOR = new p0(4);
    public final int f13561a;

    public t0(int i10) {
        this.f13561a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13561a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
