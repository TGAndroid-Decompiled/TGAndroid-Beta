package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ye0 extends c4 {
    public static final Parcelable.Creator<ye0> CREATOR = new ime((byte) 27);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.s(parcel, r);
    }
}
