package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f18186a;
    public final long f18187b;
    public final long f18188c;

    public b(long j3, long j10, boolean z9) {
        this.f18186a = z9;
        this.f18187b = j3;
        this.f18188c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f18186a == bVar.f18186a && this.f18187b == bVar.f18187b && this.f18188c == bVar.f18188c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18186a), Long.valueOf(this.f18187b), Long.valueOf(this.f18188c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f18186a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f18187b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f18188c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f18186a ? 1 : 0);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f18188c);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f18187b);
        xb.s(parcel, r10);
    }
}
