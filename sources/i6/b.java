package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import java.util.Arrays;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new g(7);
    public final boolean f8217a;
    public final long f8218b;
    public final long f8219c;

    public b(long j10, long j11, boolean z10) {
        this.f8217a = z10;
        this.f8218b = j10;
        this.f8219c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8217a == bVar.f8217a && this.f8218b == bVar.f8218b && this.f8219c == bVar.f8219c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8217a), Long.valueOf(this.f8218b), Long.valueOf(this.f8219c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f8217a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f8218b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a1.g.q(sb2, this.f8219c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f8217a ? 1 : 0);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f8219c);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.f8218b);
        h0.r(parcel, q6);
    }
}
