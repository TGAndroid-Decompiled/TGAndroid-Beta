package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f3995a;
    public final long f3996b;
    public final boolean f3997c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f3995a = Math.max(j3, 0L);
        this.f3996b = Math.max(j10, 0L);
        this.f3997c = z10;
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
        if (this.f3995a == jVar.f3995a && this.f3996b == jVar.f3996b && this.f3997c == jVar.f3997c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3995a), Long.valueOf(this.f3996b), Boolean.valueOf(this.f3997c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f3995a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f3996b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f3997c ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
