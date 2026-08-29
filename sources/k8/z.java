package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends a6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f13583a;
    public final m f13584b;

    public z(int i10, m mVar) {
        this.f13583a = i10;
        this.f13584b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13583a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13584b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
