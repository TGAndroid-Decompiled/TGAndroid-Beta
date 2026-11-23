package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean f19780a;
    public final long f19781b;
    public final long f19782c;

    public b(long j3, long j10, boolean z10) {
        this.f19780a = z10;
        this.f19781b = j3;
        this.f19782c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19780a == bVar.f19780a && this.f19781b == bVar.f19781b && this.f19782c == bVar.f19782c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19780a), Long.valueOf(this.f19781b), Long.valueOf(this.f19782c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f19780a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f19781b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.f19782c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f19780a ? 1 : 0);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f19782c);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f19781b);
        cc.s(parcel, r10);
    }
}
