package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qpb extends b4 {
    public static final Parcelable.Creator<qpb> CREATOR = new sje((byte) 23);
    public long a;
    public long b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        long j = this.a;
        mve.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeLong(j2);
        mve.s(parcel, r);
    }
}
