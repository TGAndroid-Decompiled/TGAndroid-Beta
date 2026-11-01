package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final int f13031a;
    public final boolean f13032b;

    public h(int i10, boolean z10) {
        this.f13031a = i10;
        this.f13032b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f13031a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13032b ? 1 : 0);
        h0.r(parcel, q6);
    }
}
