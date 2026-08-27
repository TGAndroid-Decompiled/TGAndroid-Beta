package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new h5.h(12);

    public long f8609a;

    public long f8610b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        long j10 = this.f8609a;
        r8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f8610b;
        r8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        r8.r(parcel, iQ);
    }
}
