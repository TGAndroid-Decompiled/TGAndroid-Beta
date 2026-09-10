package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f7287a;
    public final int f7288b;
    public final int f7289c;

    public b(int i10, int i11, int i12) {
        this.f7287a = i10;
        this.f7288b = i11;
        this.f7289c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f7287a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f7288b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f7289c);
        e0.r(parcel, q6);
    }
}
