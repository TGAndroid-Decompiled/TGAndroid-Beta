package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19683a;
    public final long f19684b;
    public final long f19685c;

    public b(long j3, long j10, boolean z10) {
        this.f19683a = z10;
        this.f19684b = j3;
        this.f19685c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19683a == bVar.f19683a && this.f19684b == bVar.f19684b && this.f19685c == bVar.f19685c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19683a), Long.valueOf(this.f19684b), Long.valueOf(this.f19685c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19683a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19684b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19685c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f19683a ? 1 : 0);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f19685c);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f19684b);
        bc.s(parcel, r10);
    }
}
