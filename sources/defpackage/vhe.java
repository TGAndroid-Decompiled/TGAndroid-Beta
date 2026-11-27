package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vhe extends c4 {
    public static final Parcelable.Creator<vhe> CREATOR = new g3e((byte) 27);
    public final int a;
    public final int b;

    public vhe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
