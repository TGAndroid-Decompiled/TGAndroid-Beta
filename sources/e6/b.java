package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8639a;
    public final int f8640b;
    public final int f8641c;

    public b(int i10, int i11, int i12) {
        this.f8639a = i10;
        this.f8640b = i11;
        this.f8641c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f8639a);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f8640b);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f8641c);
        c0.r(parcel, q6);
    }
}
