package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f4489a;
    public final long f4490b;
    public final boolean f4491c;
    public final boolean d;
    public static final g6.b e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f4489a = Math.max(j10, 0L);
        this.f4490b = Math.max(j11, 0L);
        this.f4491c = z10;
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
        if (this.f4489a == jVar.f4489a && this.f4490b == jVar.f4490b && this.f4491c == jVar.f4491c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4489a), Long.valueOf(this.f4490b), Boolean.valueOf(this.f4491c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f4489a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f4490b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4491c ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
