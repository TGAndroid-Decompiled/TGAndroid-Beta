package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends a6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f13567a;
    public final String f13568b;

    public v(int i10, String str) {
        this.f13567a = i10;
        this.f13568b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13567a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13568b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
