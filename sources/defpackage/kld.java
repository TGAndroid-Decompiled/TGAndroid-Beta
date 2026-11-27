package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class kld extends c4 {
    public static final Parcelable.Creator<kld> CREATOR = new zkd((byte) 18);
    public final boolean a;
    public final long b;
    public final long c;

    public kld(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kld) {
            kld kldVar = (kld) obj;
            if (this.a == kldVar.a && this.b == kldVar.b && this.c == kldVar.c) {
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
        return qu6.p(sb, this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.c);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        bye.s(parcel, r);
    }
}
