package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19686a;
    public final long f19687b;
    public final long f19688c;

    public b(long j3, long j10, boolean z10) {
        this.f19686a = z10;
        this.f19687b = j3;
        this.f19688c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19686a == bVar.f19686a && this.f19687b == bVar.f19687b && this.f19688c == bVar.f19688c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19686a), Long.valueOf(this.f19687b), Long.valueOf(this.f19688c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19686a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19687b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19688c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f19686a ? 1 : 0);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f19688c);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f19687b);
        bc.s(parcel, r10);
    }
}
