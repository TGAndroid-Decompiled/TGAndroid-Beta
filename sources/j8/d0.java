package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d0 extends z5.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);

    public final int f12767a;

    public final String f12768b;

    public d0(int i10, String str) {
        this.f12767a = i10;
        this.f12768b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12767a);
        r8.l(parcel, 3, this.f12768b);
        r8.r(parcel, iQ);
    }
}
