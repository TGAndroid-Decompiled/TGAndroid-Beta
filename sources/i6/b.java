package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f12025a;
    public final long f12026b;
    public final long f12027c;

    public b(long j3, long j10, boolean z10) {
        this.f12025a = z10;
        this.f12026b = j3;
        this.f12027c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12025a == bVar.f12025a && this.f12026b == bVar.f12026b && this.f12027c == bVar.f12027c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12025a), Long.valueOf(this.f12026b), Long.valueOf(this.f12027c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f12025a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f12026b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.s(sb2, this.f12027c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f12025a ? 1 : 0);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f12027c);
        d0.s(parcel, 3, 8);
        parcel.writeLong(this.f12026b);
        d0.r(parcel, q6);
    }
}
