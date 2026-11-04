package k6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(11);
    public final boolean f16888a;
    public final long f16889b;
    public final long f16890c;

    public b(long j10, long j11, boolean z10) {
        this.f16888a = z10;
        this.f16889b = j10;
        this.f16890c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f16888a == bVar.f16888a && this.f16889b == bVar.f16889b && this.f16890c == bVar.f16890c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16888a), Long.valueOf(this.f16889b), Long.valueOf(this.f16890c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f16888a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f16889b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f16890c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f16888a ? 1 : 0);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f16890c);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f16889b);
        j8.a.t(parcel, s6);
    }
}
