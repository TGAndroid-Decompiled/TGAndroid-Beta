package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends a6.a {
    public static final Parcelable.Creator<v0> CREATOR = new p0(6);
    public final int f13569a;
    public final int f13570b;

    public v0(int i10, int i11) {
        this.f13569a = i10;
        this.f13570b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13569a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13570b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
