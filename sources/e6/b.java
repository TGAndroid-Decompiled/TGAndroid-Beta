package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f7969a;
    public final int f7970b;
    public final int f7971c;

    public b(int i10, int i11, int i12) {
        this.f7969a = i10;
        this.f7970b = i11;
        this.f7971c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f7969a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f7970b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f7971c);
        f0.r(parcel, q6);
    }
}
