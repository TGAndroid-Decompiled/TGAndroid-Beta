package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class w9e extends b4 {
    public static final Parcelable.Creator<w9e> CREATOR = new qyd((byte) 15);
    public final String a;
    public final String b;
    public final long c;

    public w9e(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        jte.s(parcel, r);
    }
}
