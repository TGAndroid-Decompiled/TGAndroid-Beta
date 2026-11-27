package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class it6 extends c4 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final he6 e = new he6("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<it6> CREATOR = new zkd((byte) 1);

    public it6(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        if (this.a == it6Var.a && this.b == it6Var.b && this.c == it6Var.c && this.d == it6Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.s(parcel, r);
    }
}
