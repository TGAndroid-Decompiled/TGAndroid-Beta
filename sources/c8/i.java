package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new o(8);

    public int f2540a;

    public String f2541b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f2540a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f2541b);
        r8.r(parcel, iQ);
    }
}
