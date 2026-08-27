package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.z;

public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new f4.e(9);

    public final long f6385a;

    public final long f6386b;

    public j(long j10, long j11) {
        this.f6385a = j10;
        this.f6386b = j11;
    }

    public static long a(long j10, z zVar) {
        long jR = zVar.r();
        if ((128 & jR) != 0) {
            return 8589934591L & ((((jR & 1) << 32) | zVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6385a);
        parcel.writeLong(this.f6386b);
    }
}
