package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class tgd extends b4 {
    public static final Parcelable.Creator<tgd> CREATOR = new igd((byte) 18);
    public final boolean a;
    public final long b;
    public final long c;

    public tgd(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tgd) {
            tgd tgdVar = (tgd) obj;
            if (this.a == tgdVar.a && this.b == tgdVar.b && this.c == tgdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.a);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.b);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        return ls6.p(sb, this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.c);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        jte.s(parcel, r);
    }
}
