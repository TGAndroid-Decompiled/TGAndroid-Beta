package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new f8.o(29);
    public int f9918a;
    public String f9919b;
    public String f9920c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f9918a;
        g5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 2, this.f9919b);
        g5.l(parcel, 3, this.f9920c);
        g5.r(parcel, q10);
    }
}
