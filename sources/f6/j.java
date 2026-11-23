package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11396a;
    public final long f11397b;
    public final boolean f11398c;
    public final boolean d;
    public static final j6.b f11395e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f11396a = Math.max(j3, 0L);
        this.f11397b = Math.max(j10, 0L);
        this.f11398c = z10;
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
        if (this.f11396a == jVar.f11396a && this.f11397b == jVar.f11397b && this.f11398c == jVar.f11398c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11396a), Long.valueOf(this.f11397b), Boolean.valueOf(this.f11398c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f11396a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f11397b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11398c ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }
}
