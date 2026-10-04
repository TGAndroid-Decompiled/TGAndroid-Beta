package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class j extends o6.a {
    public final long f4318a;
    public final long f4319b;
    public final boolean f4320c;
    public final boolean d;
    public static final g6.b f4317e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f4318a = Math.max(j3, 0L);
        this.f4319b = Math.max(j10, 0L);
        this.f4320c = z10;
        this.d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f4318a == jVar.f4318a && this.f4319b == jVar.f4319b && this.f4320c == jVar.f4320c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4318a), Long.valueOf(this.f4319b), Boolean.valueOf(this.f4320c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4318a);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f4319b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4320c ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
