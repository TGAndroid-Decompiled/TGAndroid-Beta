package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class uid extends b4 {
    public static final Parcelable.Creator<uid> CREATOR = new jid((byte) 18);
    public final boolean a;
    public final long b;
    public final long c;

    public uid(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uid) {
            uid uidVar = (uid) obj;
            if (this.a == uidVar.a && this.b == uidVar.b && this.c == uidVar.c) {
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
        return kt6.q(sb, this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.q(parcel, 2, 8);
        parcel.writeLong(this.c);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        mve.s(parcel, r);
    }
}
