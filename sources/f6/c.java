package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.g5;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new e(19);
    public final int f6114a;
    public final boolean f6115b;

    public c(int i10, boolean z4) {
        this.f6114a = i10;
        this.f6115b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f6114a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f6115b ? 1 : 0);
        g5.r(parcel, q10);
    }
}
