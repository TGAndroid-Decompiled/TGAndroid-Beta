package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends a6.a {
    public static final Parcelable.Creator<r0> CREATOR = new p0(2);
    public final int f13552a;
    public final String f13553b;

    public r0(int i10, String str) {
        this.f13552a = i10;
        this.f13553b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13552a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13553b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
