package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.w;
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new g(1);
    public final long f8247a;
    public final long f8248b;

    public k(long j10, long j11) {
        this.f8247a = j10;
        this.f8248b = j11;
    }

    public static long a(long j10, w wVar) {
        long r6 = wVar.r();
        if ((128 & r6) != 0) {
            return 8589934591L & ((((r6 & 1) << 32) | wVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8247a);
        parcel.writeLong(this.f8248b);
    }
}
