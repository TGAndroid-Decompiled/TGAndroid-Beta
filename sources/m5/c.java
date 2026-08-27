package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class c extends z5.a {

    public final long f17749a;

    public final long f17750b;

    public final String f17751c;
    public final String d;

    public final long f17752e;

    public static final r5.b f17748f = new r5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new w(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f17749a = j10;
        this.f17750b = j11;
        this.f17751c = str;
        this.d = str2;
        this.f17752e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17749a == cVar.f17749a && this.f17750b == cVar.f17750b && r5.a.d(this.f17751c, cVar.f17751c) && r5.a.d(this.d, cVar.d) && this.f17752e == cVar.f17752e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17749a), Long.valueOf(this.f17750b), this.f17751c, this.d, Long.valueOf(this.f17752e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f17749a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.f17750b);
        r8.l(parcel, 4, this.f17751c);
        r8.l(parcel, 5, this.d);
        r8.s(parcel, 6, 8);
        parcel.writeLong(this.f17752e);
        r8.r(parcel, iQ);
    }
}
