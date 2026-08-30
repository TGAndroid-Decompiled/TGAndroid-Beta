package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new f8.o(29);
    public int f9288a;
    public String f9289b;
    public String f9290c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f9288a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 2, this.f9289b);
        f5.l(parcel, 3, this.f9290c);
        f5.r(parcel, q10);
    }
}
