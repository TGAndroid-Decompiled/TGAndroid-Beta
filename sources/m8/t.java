package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f13840a;
    public final boolean f13841b;
    public final boolean f13842c;

    public t(int i10, boolean z4, boolean z10) {
        this.f13840a = i10;
        this.f13841b = z4;
        this.f13842c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13840a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13841b ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f13842c ? 1 : 0);
        f5.r(parcel, q10);
    }
}
