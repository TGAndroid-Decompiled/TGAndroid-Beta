package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class d0 extends c6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f13793a;
    public final String f13794b;

    public d0(int i10, String str) {
        this.f13793a = i10;
        this.f13794b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13793a);
        f5.l(parcel, 3, this.f13794b);
        f5.r(parcel, q10);
    }
}
