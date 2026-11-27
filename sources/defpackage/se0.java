package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class se0 extends c4 {
    public static final Parcelable.Creator<se0> CREATOR = new g3e((byte) 9);
    public int a;
    public String b;
    public String c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
