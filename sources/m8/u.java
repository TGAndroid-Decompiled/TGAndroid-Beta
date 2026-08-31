package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f13578a;
    public final boolean f13579b;

    public u(int i10, boolean z4) {
        this.f13578a = i10;
        this.f13579b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13578a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13579b ? 1 : 0);
        g5.r(parcel, q10);
    }
}
