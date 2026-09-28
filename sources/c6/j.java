package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f3993a;
    public final long f3994b;
    public final boolean f3995c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f3993a = Math.max(j3, 0L);
        this.f3994b = Math.max(j10, 0L);
        this.f3995c = z10;
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
        if (this.f3993a == jVar.f3993a && this.f3994b == jVar.f3994b && this.f3995c == jVar.f3995c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3993a), Long.valueOf(this.f3994b), Boolean.valueOf(this.f3995c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f3993a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f3994b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f3995c ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
