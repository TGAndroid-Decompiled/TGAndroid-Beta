package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class er6 extends b4 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final dc6 e = new dc6("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<er6> CREATOR = new igd((byte) 1);

    public er6(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er6)) {
            return false;
        }
        er6 er6Var = (er6) obj;
        if (this.a == er6Var.a && this.b == er6Var.b && this.c == er6Var.c && this.d == er6Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.s(parcel, r);
    }
}
