package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class j extends r6.a {
    public final long f11402a;
    public final long f11403b;
    public final boolean f11404c;
    public final boolean d;
    public static final j6.b f11401e = new j6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f11402a = Math.max(j3, 0L);
        this.f11403b = Math.max(j10, 0L);
        this.f11404c = z10;
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
        if (this.f11402a == jVar.f11402a && this.f11403b == jVar.f11403b && this.f11404c == jVar.f11404c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11402a), Long.valueOf(this.f11403b), Boolean.valueOf(this.f11404c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11402a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11403b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11404c ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
