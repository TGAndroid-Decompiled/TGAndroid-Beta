package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f13512a;

    public h(int i10) {
        this.f13512a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13512a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
