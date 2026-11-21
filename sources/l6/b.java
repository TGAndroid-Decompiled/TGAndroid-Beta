package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19711a;
    public final long f19712b;
    public final long f19713c;

    public b(long j3, long j10, boolean z10) {
        this.f19711a = z10;
        this.f19712b = j3;
        this.f19713c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19711a == bVar.f19711a && this.f19712b == bVar.f19712b && this.f19713c == bVar.f19713c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19711a), Long.valueOf(this.f19712b), Long.valueOf(this.f19713c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19711a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19712b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19713c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f19711a ? 1 : 0);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f19713c);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f19712b);
        bc.s(parcel, r10);
    }
}
