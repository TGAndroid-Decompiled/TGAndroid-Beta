package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mj2 extends b4 {
    public static final Parcelable.Creator<mj2> CREATOR = new f41((byte) 8);
    public final boolean a;

    public mj2(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.s(parcel, r);
    }
}
