package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8641a;
    public final int f8642b;
    public final int f8643c;

    public b(int i10, int i11, int i12) {
        this.f8641a = i10;
        this.f8642b = i11;
        this.f8643c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f8641a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f8642b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f8643c);
        d0.r(parcel, q6);
    }
}
