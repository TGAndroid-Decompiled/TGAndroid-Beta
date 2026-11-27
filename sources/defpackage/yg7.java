package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class yg7 extends c4 {
    public static final Parcelable.Creator<yg7> CREATOR = new s5d((byte) 5);
    public final int a;
    public final boolean b;

    public yg7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.s(parcel, r);
    }
}
