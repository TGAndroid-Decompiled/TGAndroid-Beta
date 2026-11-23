package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19714a;
    public final long f19715b;
    public final long f19716c;

    public b(long j3, long j10, boolean z10) {
        this.f19714a = z10;
        this.f19715b = j3;
        this.f19716c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19714a == bVar.f19714a && this.f19715b == bVar.f19715b && this.f19716c == bVar.f19716c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19714a), Long.valueOf(this.f19715b), Long.valueOf(this.f19716c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19714a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19715b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19716c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f19714a ? 1 : 0);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f19716c);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f19715b);
        bc.s(parcel, r10);
    }
}
