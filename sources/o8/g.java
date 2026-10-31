package o8;

import android.os.Parcel;
import android.os.Parcelable;
import m8.i;
import n6.u;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(21);
    public final int f14107a;
    public final u f14108b;

    public g(int i10, u uVar) {
        this.f14107a = i10;
        this.f14108b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f14107a);
        h0.k(parcel, 2, this.f14108b, i10);
        h0.r(parcel, q6);
    }
}
