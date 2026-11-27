package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mee extends c4 {
    public static final Parcelable.Creator<mee> CREATOR = new g3e((byte) 15);
    public final String a;
    public final String b;
    public final long c;

    public mee(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        bye.s(parcel, r);
    }
}
