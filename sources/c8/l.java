package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class l extends z5.a {
    public static final Parcelable.Creator<l> CREATOR = new o(9);

    public String f2546a;

    public String f2547b;

    public int f2548c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f2546a);
        r8.l(parcel, 3, this.f2547b);
        int i11 = this.f2548c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.r(parcel, iQ);
    }
}
