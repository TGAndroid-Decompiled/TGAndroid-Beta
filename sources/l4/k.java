package l4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.w;
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new j(0);
    public final long f11443a;
    public final long f11444b;

    public k(long j10, long j11) {
        this.f11443a = j10;
        this.f11444b = j11;
    }

    public static long a(long j10, w wVar) {
        long u10 = wVar.u();
        if ((128 & u10) != 0) {
            return 8589934591L & ((((u10 & 1) << 32) | wVar.v()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f11443a);
        sb.append(", playbackPositionUs= ");
        return android.support.v4.media.a.q(sb, this.f11444b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11443a);
        parcel.writeLong(this.f11444b);
    }
}
