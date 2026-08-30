package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f13862a;
    public final boolean f13863b;

    public u(int i10, boolean z4) {
        this.f13862a = i10;
        this.f13863b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13862a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13863b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
