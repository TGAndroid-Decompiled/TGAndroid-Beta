package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends a6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f13465a;
    public final String f13466b;

    public a0(int i10, String str) {
        this.f13465a = i10;
        this.f13466b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13465a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13466b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
