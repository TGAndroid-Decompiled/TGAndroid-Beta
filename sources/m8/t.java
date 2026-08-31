package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f13572a;
    public final boolean f13573b;
    public final boolean f13574c;

    public t(int i10, boolean z4, boolean z10) {
        this.f13572a = i10;
        this.f13573b = z4;
        this.f13574c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13572a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13573b ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f13574c ? 1 : 0);
        g5.r(parcel, q10);
    }
}
