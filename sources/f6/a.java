package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final boolean f6003a;
    public final int f6004b;

    public a(int i10, boolean z4) {
        this.f6003a = z4;
        this.f6004b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f6003a ? 1 : 0);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f6004b);
        f5.r(parcel, q10);
    }
}
