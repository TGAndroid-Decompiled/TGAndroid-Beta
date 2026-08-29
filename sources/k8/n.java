package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f13533a;
    public final int f13534b;

    public n(int i10, int i11) {
        this.f13533a = i10;
        this.f13534b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13533a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13534b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
