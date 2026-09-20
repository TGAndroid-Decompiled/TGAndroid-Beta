package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f4002a;
    public final long f4003b;
    public final boolean f4004c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f4002a = Math.max(j3, 0L);
        this.f4003b = Math.max(j10, 0L);
        this.f4004c = z10;
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
        if (this.f4002a == jVar.f4002a && this.f4003b == jVar.f4003b && this.f4004c == jVar.f4004c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4002a), Long.valueOf(this.f4003b), Boolean.valueOf(this.f4004c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f4002a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f4003b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4004c ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
