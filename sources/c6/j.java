package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class j extends o6.a {
    public final long f4319a;
    public final long f4320b;
    public final boolean f4321c;
    public final boolean d;
    public static final g6.b f4318e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f4319a = Math.max(j3, 0L);
        this.f4320b = Math.max(j10, 0L);
        this.f4321c = z10;
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
        if (this.f4319a == jVar.f4319a && this.f4320b == jVar.f4320b && this.f4321c == jVar.f4321c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4319a), Long.valueOf(this.f4320b), Boolean.valueOf(this.f4321c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4319a);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f4320b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4321c ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
