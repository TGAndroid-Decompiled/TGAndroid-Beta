package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends a6.a {
    public static final Parcelable.Creator<s0> CREATOR = new p0(3);
    public final int f13556a;
    public final m f13557b;

    public s0(int i10, m mVar) {
        this.f13556a = i10;
        this.f13557b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13556a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13557b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
