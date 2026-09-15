package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f3996a;
    public final long f3997b;
    public final boolean f3998c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f3996a = Math.max(j3, 0L);
        this.f3997b = Math.max(j10, 0L);
        this.f3998c = z10;
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
        if (this.f3996a == jVar.f3996a && this.f3997b == jVar.f3997b && this.f3998c == jVar.f3998c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3996a), Long.valueOf(this.f3997b), Boolean.valueOf(this.f3998c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f3996a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f3997b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f3998c ? 1 : 0);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
