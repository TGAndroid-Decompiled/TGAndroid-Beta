package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19319a;
    public final long f19320b;
    public final long f19321c;

    public b(long j3, long j10, boolean z10) {
        this.f19319a = z10;
        this.f19320b = j3;
        this.f19321c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19319a == bVar.f19319a && this.f19320b == bVar.f19320b && this.f19321c == bVar.f19321c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19319a), Long.valueOf(this.f19320b), Long.valueOf(this.f19321c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19319a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19320b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19321c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f19319a ? 1 : 0);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f19321c);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f19320b);
        yb.s(parcel, r10);
    }
}
