package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class dr5 extends c4 {
    public static final Parcelable.Creator<dr5> CREATOR = new t4f((byte) 8);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        int i2 = this.c;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.s(parcel, r);
    }
}
