package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class j extends z5.a {

    public final long f17792a;

    public final long f17793b;

    public final boolean f17794c;
    public final boolean d;

    public static final r5.b f17791e = new r5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new w(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.f17792a = Math.max(j10, 0L);
        this.f17793b = Math.max(j11, 0L);
        this.f17794c = z10;
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
        return this.f17792a == jVar.f17792a && this.f17793b == jVar.f17793b && this.f17794c == jVar.f17794c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17792a), Long.valueOf(this.f17793b), Boolean.valueOf(this.f17794c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f17792a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.f17793b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f17794c ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
