package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class j extends o6.a {
    public final long f3888a;
    public final long f3889b;
    public final boolean f3890c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f3888a = Math.max(j10, 0L);
        this.f3889b = Math.max(j11, 0L);
        this.f3890c = z10;
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
        if (this.f3888a == jVar.f3888a && this.f3889b == jVar.f3889b && this.f3890c == jVar.f3890c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3888a), Long.valueOf(this.f3889b), Boolean.valueOf(this.f3890c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f3888a);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.f3889b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f3890c ? 1 : 0);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.r(parcel, q6);
    }
}
