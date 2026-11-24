package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class l7d extends b4 {
    public static final Parcelable.Creator<l7d> CREATOR = new t4d((byte) 20);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public l7d(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
