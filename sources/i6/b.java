package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f10996a;
    public final long f10997b;
    public final long f10998c;

    public b(long j3, long j10, boolean z10) {
        this.f10996a = z10;
        this.f10997b = j3;
        this.f10998c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f10996a == bVar.f10996a && this.f10997b == bVar.f10997b && this.f10998c == bVar.f10998c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10996a), Long.valueOf(this.f10997b), Long.valueOf(this.f10998c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f10996a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f10997b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.r(sb2, this.f10998c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10996a ? 1 : 0);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f10998c);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10997b);
        f0.r(parcel, q6);
    }
}
