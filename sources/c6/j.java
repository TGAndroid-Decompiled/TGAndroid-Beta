package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends o6.a {
    public final long f4367a;
    public final long f4368b;
    public final boolean f4369c;
    public final boolean d;
    public static final g6.b f4366e = new g6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j3, long j10, boolean z10, boolean z11) {
        this.f4367a = Math.max(j3, 0L);
        this.f4368b = Math.max(j10, 0L);
        this.f4369c = z10;
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
        if (this.f4367a == jVar.f4367a && this.f4368b == jVar.f4368b && this.f4369c == jVar.f4369c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4367a), Long.valueOf(this.f4368b), Boolean.valueOf(this.f4369c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 8);
        parcel.writeLong(this.f4367a);
        w7.c0.s(parcel, 3, 8);
        parcel.writeLong(this.f4368b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f4369c ? 1 : 0);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
