package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends a6.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0(0);
    public final int f13540a;
    public final f f13541b;

    public o0(int i10, f fVar) {
        this.f13540a = i10;
        this.f13541b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13540a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13541b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
