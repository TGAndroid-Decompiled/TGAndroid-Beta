package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qg7 extends b4 {
    public static final Parcelable.Creator<qg7> CREATOR = new d3d((byte) 5);
    public final int a;
    public final boolean b;

    public qg7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.s(parcel, r);
    }
}
