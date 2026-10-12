package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11329a;
    public final long f11330b;
    public final long f11331c;

    public b(long j10, long j11, boolean z10) {
        this.f11329a = z10;
        this.f11330b = j10;
        this.f11331c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11329a == bVar.f11329a && this.f11330b == bVar.f11330b && this.f11331c == bVar.f11331c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11329a), Long.valueOf(this.f11330b), Long.valueOf(this.f11331c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11329a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11330b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f11331c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f11329a ? 1 : 0);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f11331c);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f11330b);
        g0.r(parcel, q6);
    }
}
