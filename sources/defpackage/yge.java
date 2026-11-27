package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class yge extends c4 {
    public static final Parcelable.Creator<yge> CREATOR = new ime((byte) 1);
    public final int a;
    public final boolean b;

    public yge(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.s(parcel, r);
    }
}
