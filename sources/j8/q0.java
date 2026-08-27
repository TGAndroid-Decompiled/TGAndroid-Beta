package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class q0 extends z5.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);

    public final int f12824a;

    public final String f12825b;

    public q0(int i10, String str) {
        this.f12824a = i10;
        this.f12825b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12824a);
        r8.l(parcel, 3, this.f12825b);
        r8.r(parcel, iQ);
    }
}
