package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends p6.a {
    public final long f8085a;
    public final long f8086b;
    public final boolean f8087c;
    public final boolean d;
    public static final h6.b e = new h6.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f8085a = Math.max(j10, 0L);
        this.f8086b = Math.max(j11, 0L);
        this.f8087c = z10;
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
        if (this.f8085a == jVar.f8085a && this.f8086b == jVar.f8086b && this.f8087c == jVar.f8087c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8085a), Long.valueOf(this.f8086b), Boolean.valueOf(this.f8087c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f8085a);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f8086b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f8087c ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.r(parcel, q5);
    }
}
