package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f18189a;
    public final long f18190b;
    public final long f18191c;

    public b(long j3, long j10, boolean z9) {
        this.f18189a = z9;
        this.f18190b = j3;
        this.f18191c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f18189a == bVar.f18189a && this.f18190b == bVar.f18190b && this.f18191c == bVar.f18191c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18189a), Long.valueOf(this.f18190b), Long.valueOf(this.f18191c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f18189a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f18190b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f18191c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f18189a ? 1 : 0);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f18191c);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f18190b);
        xb.s(parcel, r10);
    }
}
