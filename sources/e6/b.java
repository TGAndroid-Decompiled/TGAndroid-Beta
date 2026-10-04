package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f8648a;
    public final int f8649b;
    public final int f8650c;

    public b(int i10, int i11, int i12) {
        this.f8648a = i10;
        this.f8649b = i11;
        this.f8650c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f8648a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f8649b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f8650c);
        g0.r(parcel, q6);
    }
}
