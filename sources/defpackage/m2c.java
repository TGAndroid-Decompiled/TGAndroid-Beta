package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class m2c extends c4 {
    public static final Parcelable.Creator<m2c> CREATOR = new m9d((byte) 25);
    public int a;
    public String b;
    public String c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
