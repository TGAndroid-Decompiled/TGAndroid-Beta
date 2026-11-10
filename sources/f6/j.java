package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11276a;
    public final long f11277b;
    public final boolean f11278c;
    public final boolean d;
    public static final j6.b f11275e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z9, boolean z10) {
        this.f11276a = Math.max(j3, 0L);
        this.f11277b = Math.max(j10, 0L);
        this.f11278c = z9;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11276a == jVar.f11276a && this.f11277b == jVar.f11277b && this.f11278c == jVar.f11278c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11276a), Long.valueOf(this.f11277b), Boolean.valueOf(this.f11278c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f11276a);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f11277b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11278c ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.s(parcel, r10);
    }
}
