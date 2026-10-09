package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f4369a;
    public final long f4370b;
    public final boolean f4371c;
    public final boolean d;
    public static final g6.b f4368e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f4369a = Math.max(j3, 0L);
        this.f4370b = Math.max(j10, 0L);
        this.f4371c = z10;
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
        if (this.f4369a == jVar.f4369a && this.f4370b == jVar.f4370b && this.f4371c == jVar.f4371c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4369a), Long.valueOf(this.f4370b), Boolean.valueOf(this.f4371c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 8);
        parcel.writeLong(this.f4369a);
        w7.d0.s(parcel, 3, 8);
        parcel.writeLong(this.f4370b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4371c ? 1 : 0);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
