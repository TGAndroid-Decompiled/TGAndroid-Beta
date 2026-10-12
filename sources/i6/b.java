package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f12023a;
    public final long f12024b;
    public final long f12025c;

    public b(long j3, long j10, boolean z10) {
        this.f12023a = z10;
        this.f12024b = j3;
        this.f12025c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12023a == bVar.f12023a && this.f12024b == bVar.f12024b && this.f12025c == bVar.f12025c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12023a), Long.valueOf(this.f12024b), Long.valueOf(this.f12025c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f12023a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f12024b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.s(sb2, this.f12025c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f12023a ? 1 : 0);
        c0.s(parcel, 2, 8);
        parcel.writeLong(this.f12025c);
        c0.s(parcel, 3, 8);
        parcel.writeLong(this.f12024b);
        c0.r(parcel, q6);
    }
}
