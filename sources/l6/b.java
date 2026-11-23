package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19680a;
    public final long f19681b;
    public final long f19682c;

    public b(long j3, long j10, boolean z10) {
        this.f19680a = z10;
        this.f19681b = j3;
        this.f19682c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19680a == bVar.f19680a && this.f19681b == bVar.f19681b && this.f19682c == bVar.f19682c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19680a), Long.valueOf(this.f19681b), Long.valueOf(this.f19682c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19680a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19681b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19682c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f19680a ? 1 : 0);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f19682c);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f19681b);
        cc.s(parcel, r10);
    }
}
