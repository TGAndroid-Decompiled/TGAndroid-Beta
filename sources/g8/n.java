package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new f4.e(16);

    public int f6764a;

    public String f6765b;

    public String f6766c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f6764a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 2, this.f6765b);
        r8.l(parcel, 3, this.f6766c);
        r8.r(parcel, iQ);
    }
}
