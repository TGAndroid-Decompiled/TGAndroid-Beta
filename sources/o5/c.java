package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends a6.a {
    public final long f19234a;
    public final long f19235b;
    public final String f19236c;
    public final String d;
    public final long f19237e;
    public static final s5.b f19233f = new s5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f19234a = j10;
        this.f19235b = j11;
        this.f19236c = str;
        this.d = str2;
        this.f19237e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19234a == cVar.f19234a && this.f19235b == cVar.f19235b && s5.a.d(this.f19236c, cVar.f19236c) && s5.a.d(this.d, cVar.d) && this.f19237e == cVar.f19237e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19234a), Long.valueOf(this.f19235b), this.f19236c, this.d, Long.valueOf(this.f19237e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeLong(this.f19234a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.f19235b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f19236c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeLong(this.f19237e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
