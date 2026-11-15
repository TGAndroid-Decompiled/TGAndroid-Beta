package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11085a;
    public final long f11086b;
    public final boolean f11087c;
    public final boolean d;
    public static final j6.b f11084e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f11085a = Math.max(j3, 0L);
        this.f11086b = Math.max(j10, 0L);
        this.f11087c = z10;
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
        if (this.f11085a == jVar.f11085a && this.f11086b == jVar.f11086b && this.f11087c == jVar.f11087c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11085a), Long.valueOf(this.f11086b), Boolean.valueOf(this.f11087c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f11085a);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f11086b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f11087c ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.s(parcel, r10);
    }
}
