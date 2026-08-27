package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class r extends z5.a {
    public static final Parcelable.Creator<r> CREATOR = new f4.e(14);

    public final String f6779a;

    public final String f6780b;

    public final int f6781c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f6779a = str;
        this.f6780b = str2;
        this.f6781c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f6779a);
        r8.l(parcel, 3, this.f6780b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f6781c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        r8.r(parcel, iQ);
    }
}
