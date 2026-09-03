package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class r extends c6.a {
    public static final Parcelable.Creator<r> CREATOR = new f8.o(27);
    public final String f9284a;
    public final String f9285b;
    public final int f9286c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f9284a = str;
        this.f9285b = str2;
        this.f9286c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9284a);
        f5.l(parcel, 3, this.f9285b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f9286c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
