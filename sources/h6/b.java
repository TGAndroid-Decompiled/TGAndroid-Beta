package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int f13577a;
    public final int f13578b;
    public final int f13579c;

    public b(int i7, int i10, int i11) {
        this.f13577a = i7;
        this.f13578b = i10;
        this.f13579c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f13577a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f13578b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f13579c);
        yb.s(parcel, r10);
    }
}
