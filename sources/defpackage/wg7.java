package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wg7 extends c4 {
    public static final Parcelable.Creator<wg7> CREATOR = new mx6((byte) 29);
    public final boolean a;
    public final int b;

    public wg7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
