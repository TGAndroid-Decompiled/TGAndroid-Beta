package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int f13921a;
    public final int f13922b;
    public final int f13923c;

    public b(int i7, int i10, int i11) {
        this.f13921a = i7;
        this.f13922b = i10;
        this.f13923c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f13921a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f13922b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f13923c);
        bc.s(parcel, r10);
    }
}
