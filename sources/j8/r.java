package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new f8.o(27);
    public final String f9933a;
    public final String f9934b;
    public final int f9935c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f9933a = str;
        this.f9934b = str2;
        this.f9935c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f9933a);
        g5.l(parcel, 3, this.f9934b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f9935c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g5.r(parcel, q10);
    }
}
