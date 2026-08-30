package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new f8.o(25);
    public int f9283a;
    public String f9284b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f9283a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f9284b);
        f5.r(parcel, q10);
    }
}
