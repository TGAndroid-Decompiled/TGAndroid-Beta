package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8642a;
    public final int f8643b;
    public final int f8644c;

    public b(int i10, int i11, int i12) {
        this.f8642a = i10;
        this.f8643b = i11;
        this.f8644c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f8642a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f8643b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f8644c);
        d0.r(parcel, q6);
    }
}
