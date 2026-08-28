package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class c extends y5.a {
    public final long f17373a;
    public final long f17374b;
    public final String f17375c;
    public final String d;
    public final long f17376e;
    public static final q5.b f17372f = new q5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f17373a = j10;
        this.f17374b = j11;
        this.f17375c = str;
        this.d = str2;
        this.f17376e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f17373a == cVar.f17373a && this.f17374b == cVar.f17374b && q5.a.d(this.f17375c, cVar.f17375c) && q5.a.d(this.d, cVar.d) && this.f17376e == cVar.f17376e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17373a), Long.valueOf(this.f17374b), this.f17375c, this.d, Long.valueOf(this.f17376e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f17373a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.f17374b);
        p8.l(parcel, 4, this.f17375c);
        p8.l(parcel, 5, this.d);
        p8.s(parcel, 6, 8);
        parcel.writeLong(this.f17376e);
        p8.r(parcel, q10);
    }
}
