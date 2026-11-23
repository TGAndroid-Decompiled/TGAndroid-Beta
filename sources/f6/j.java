package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11397a;
    public final long f11398b;
    public final boolean f11399c;
    public final boolean d;
    public static final j6.b f11396e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f11397a = Math.max(j3, 0L);
        this.f11398b = Math.max(j10, 0L);
        this.f11399c = z10;
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
        if (this.f11397a == jVar.f11397a && this.f11398b == jVar.f11398b && this.f11399c == jVar.f11399c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11397a), Long.valueOf(this.f11398b), Boolean.valueOf(this.f11399c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f11397a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f11398b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11399c ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }
}
