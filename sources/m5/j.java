package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class j extends y5.a {
    public final long f17415a;
    public final long f17416b;
    public final boolean f17417c;
    public final boolean d;
    public static final q5.b f17414e = new q5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f17415a = Math.max(j10, 0L);
        this.f17416b = Math.max(j11, 0L);
        this.f17417c = z10;
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
        if (this.f17415a == jVar.f17415a && this.f17416b == jVar.f17416b && this.f17417c == jVar.f17417c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17415a), Long.valueOf(this.f17416b), Boolean.valueOf(this.f17417c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f17415a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.f17416b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f17417c ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
