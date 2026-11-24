package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vvd extends b4 {
    public static final Parcelable.Creator<vvd> CREATOR = new urd((byte) 12);
    public final int a;
    public final boolean b;

    public vvd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.s(parcel, r);
    }
}
