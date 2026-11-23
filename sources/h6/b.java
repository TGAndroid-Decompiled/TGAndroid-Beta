package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int f13884a;
    public final int f13885b;
    public final int f13886c;

    public b(int i7, int i10, int i11) {
        this.f13884a = i7;
        this.f13885b = i10;
        this.f13886c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f13884a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f13885b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f13886c);
        cc.s(parcel, r10);
    }
}
