package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new f4.e(12);

    public int f6759a;

    public String f6760b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f6759a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f6760b);
        r8.r(parcel, iQ);
    }
}
