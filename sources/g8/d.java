package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new f4.e(22);

    public String f6722a;

    public String f6723b;

    public int f6724c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f6722a);
        r8.l(parcel, 3, this.f6723b);
        int i11 = this.f6724c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.r(parcel, iQ);
    }
}
