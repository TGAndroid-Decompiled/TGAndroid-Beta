package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends p6.a {
    public final long f8048a;
    public final long f8049b;
    public final String f8050c;
    public final String d;
    public final long e;
    public static final h6.b f8047f = new h6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f8048a = j10;
        this.f8049b = j11;
        this.f8050c = str;
        this.d = str2;
        this.e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8048a == cVar.f8048a && this.f8049b == cVar.f8049b && h6.a.d(this.f8050c, cVar.f8050c) && h6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8048a), Long.valueOf(this.f8049b), this.f8050c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f8048a);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f8049b);
        df.l(parcel, 4, this.f8050c);
        df.l(parcel, 5, this.d);
        df.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        df.r(parcel, q5);
    }
}
