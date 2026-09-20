package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11007a;
    public final long f11008b;
    public final long f11009c;

    public b(long j3, long j10, boolean z10) {
        this.f11007a = z10;
        this.f11008b = j3;
        this.f11009c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11007a == bVar.f11007a && this.f11008b == bVar.f11008b && this.f11009c == bVar.f11009c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11007a), Long.valueOf(this.f11008b), Long.valueOf(this.f11009c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11007a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11008b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.r(sb2, this.f11009c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f11007a ? 1 : 0);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f11009c);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f11008b);
        f0.r(parcel, q6);
    }
}
