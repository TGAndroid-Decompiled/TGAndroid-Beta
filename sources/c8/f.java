package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new o(3);

    public int f2530a;

    public String f2531b;

    public String f2532c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f2530a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f2531b);
        r8.l(parcel, 4, this.f2532c);
        r8.l(parcel, 5, this.d);
        r8.r(parcel, iQ);
    }
}
