package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f3027a;
    public final String f3028b;

    public t(int i7, String str) {
        this.f3027a = i7;
        this.f3028b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3027a);
        cc.l(parcel, 3, this.f3028b);
        cc.s(parcel, r10);
    }
}
