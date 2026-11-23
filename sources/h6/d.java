package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String f13935a;
    public final int f13936b;
    public final String f13937c;

    public d(String str, int i7, String str2) {
        this.f13935a = str;
        this.f13936b = i7;
        this.f13937c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f13935a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f13936b);
        bc.l(parcel, 4, this.f13937c);
        bc.s(parcel, r10);
    }
}
