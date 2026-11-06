package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f18183a;
    public final long f18184b;
    public final long f18185c;

    public b(long j3, long j10, boolean z9) {
        this.f18183a = z9;
        this.f18184b = j3;
        this.f18185c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f18183a == bVar.f18183a && this.f18184b == bVar.f18184b && this.f18185c == bVar.f18185c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18183a), Long.valueOf(this.f18184b), Long.valueOf(this.f18185c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f18183a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f18184b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f18185c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f18183a ? 1 : 0);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f18185c);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f18184b);
        xb.s(parcel, r10);
    }
}
