package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends q6.a {
    public final long f9675a;
    public final long f9676b;
    public final String f9677c;
    public final String d;
    public final long f9678e;
    public static final i6.b f9674f = new i6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f9675a = j10;
        this.f9676b = j11;
        this.f9677c = str;
        this.d = str2;
        this.f9678e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9675a == cVar.f9675a && this.f9676b == cVar.f9676b && i6.a.d(this.f9677c, cVar.f9677c) && i6.a.d(this.d, cVar.d) && this.f9678e == cVar.f9678e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9675a), Long.valueOf(this.f9676b), this.f9677c, this.d, Long.valueOf(this.f9678e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f9675a);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f9676b);
        j8.a.m(parcel, 4, this.f9677c);
        j8.a.m(parcel, 5, this.d);
        j8.a.r(parcel, 6, 8);
        parcel.writeLong(this.f9678e);
        j8.a.t(parcel, s6);
    }
}
