package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.y;
import f8.r;
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new r(19);
    public final long f7107a;
    public final long f7108b;

    public j(long j10, long j11) {
        this.f7107a = j10;
        this.f7108b = j11;
    }

    public static long a(long j10, y yVar) {
        long r10 = yVar.r();
        if ((128 & r10) != 0) {
            return 8589934591L & ((((r10 & 1) << 32) | yVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f7107a);
        parcel.writeLong(this.f7108b);
    }
}
