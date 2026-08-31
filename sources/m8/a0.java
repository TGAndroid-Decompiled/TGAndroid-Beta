package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f13481a;
    public final String f13482b;

    public a0(int i10, String str) {
        this.f13481a = i10;
        this.f13482b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13481a);
        g5.l(parcel, 3, this.f13482b);
        g5.r(parcel, q10);
    }
}
