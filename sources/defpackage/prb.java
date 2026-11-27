package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class prb extends c4 {
    public static final Parcelable.Creator<prb> CREATOR = new ime((byte) 23);
    public long a;
    public long b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        long j = this.a;
        bye.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeLong(j2);
        bye.s(parcel, r);
    }
}
