package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f4857a;
    public final long f4858b;
    public final boolean f4859c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f4857a = Math.max(j10, 0L);
        this.f4858b = Math.max(j11, 0L);
        this.f4859c = z10;
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
        if (this.f4857a == jVar.f4857a && this.f4858b == jVar.f4858b && this.f4859c == jVar.f4859c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4857a), Long.valueOf(this.f4858b), Boolean.valueOf(this.f4859c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f4857a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f4858b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4859c ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
