package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f12720a;
    public final long f12721b;
    public final long f12722c;

    public b(long j10, long j11, boolean z10) {
        this.f12720a = z10;
        this.f12721b = j10;
        this.f12722c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12720a == bVar.f12720a && this.f12721b == bVar.f12721b && this.f12722c == bVar.f12722c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12720a), Long.valueOf(this.f12721b), Long.valueOf(this.f12722c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f12720a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f12721b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f12722c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f12720a ? 1 : 0);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f12722c);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f12721b);
        f0.r(parcel, q6);
    }
}
