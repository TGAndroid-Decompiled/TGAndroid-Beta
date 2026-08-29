package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends a6.a {
    public final long f19274a;
    public final long f19275b;
    public final boolean f19276c;
    public final boolean d;
    public static final s5.b f19273e = new s5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f19274a = Math.max(j10, 0L);
        this.f19275b = Math.max(j11, 0L);
        this.f19276c = z10;
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
        if (this.f19274a == jVar.f19274a && this.f19275b == jVar.f19275b && this.f19276c == jVar.f19276c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19274a), Long.valueOf(this.f19275b), Boolean.valueOf(this.f19276c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeLong(this.f19274a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.f19275b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f19276c ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
