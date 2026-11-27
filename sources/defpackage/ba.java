package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ba extends c4 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final he6 f = new he6("AdBreakStatus", null);
    public static final Parcelable.Creator<ba> CREATOR = new zkd((byte) 8);

    public ba(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (this.a == baVar.a && this.b == baVar.b && qd1.d(this.c, baVar.c) && qd1.d(this.d, baVar.d) && this.e == baVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.q(parcel, 6, 8);
        parcel.writeLong(this.e);
        bye.s(parcel, r);
    }
}
