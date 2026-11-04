package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends q6.a {
    public final long f9714a;
    public final long f9715b;
    public final boolean f9716c;
    public final boolean d;
    public static final i6.b f9713e = new i6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f9714a = Math.max(j10, 0L);
        this.f9715b = Math.max(j11, 0L);
        this.f9716c = z10;
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
        if (this.f9714a == jVar.f9714a && this.f9715b == jVar.f9715b && this.f9716c == jVar.f9716c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9714a), Long.valueOf(this.f9715b), Boolean.valueOf(this.f9716c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f9714a);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f9715b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f9716c ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
