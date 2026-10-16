package i6;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11333a;
    public final long f11334b;
    public final long f11335c;

    public b(long j10, long j11, boolean z10) {
        this.f11333a = z10;
        this.f11334b = j10;
        this.f11335c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11333a == bVar.f11333a && this.f11334b == bVar.f11334b && this.f11335c == bVar.f11335c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11333a), Long.valueOf(this.f11334b), Long.valueOf(this.f11335c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11333a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11334b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f11335c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f11333a ? 1 : 0);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f11335c);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f11334b);
        f0.r(parcel, q6);
    }
}
