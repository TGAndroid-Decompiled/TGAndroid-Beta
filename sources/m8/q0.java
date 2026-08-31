package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class q0 extends c6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f13563a;
    public final String f13564b;

    public q0(int i10, String str) {
        this.f13563a = i10;
        this.f13564b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13563a);
        g5.l(parcel, 3, this.f13564b);
        g5.r(parcel, q10);
    }
}
