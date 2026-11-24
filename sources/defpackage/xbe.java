package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xbe extends b4 {
    public static final Parcelable.Creator<xbe> CREATOR = new t0e((byte) 15);
    public final String a;
    public final String b;
    public final long c;

    public xbe(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        mve.s(parcel, r);
    }
}
