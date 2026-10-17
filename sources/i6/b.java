package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f12722a;
    public final long f12723b;
    public final long f12724c;

    public b(long j10, long j11, boolean z10) {
        this.f12722a = z10;
        this.f12723b = j10;
        this.f12724c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12722a == bVar.f12722a && this.f12723b == bVar.f12723b && this.f12724c == bVar.f12724c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12722a), Long.valueOf(this.f12723b), Long.valueOf(this.f12724c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f12722a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f12723b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f12724c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f12722a ? 1 : 0);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f12724c);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f12723b);
        f0.r(parcel, q6);
    }
}
