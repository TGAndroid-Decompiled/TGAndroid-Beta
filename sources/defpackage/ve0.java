package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ve0 extends c4 {
    public static final Parcelable.Creator<ve0> CREATOR = new ime((byte) 21);
    public int a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
