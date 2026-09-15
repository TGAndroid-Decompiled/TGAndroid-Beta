package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11003a;
    public final long f11004b;
    public final long f11005c;

    public b(long j3, long j10, boolean z10) {
        this.f11003a = z10;
        this.f11004b = j3;
        this.f11005c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11003a == bVar.f11003a && this.f11004b == bVar.f11004b && this.f11005c == bVar.f11005c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11003a), Long.valueOf(this.f11004b), Long.valueOf(this.f11005c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11003a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11004b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.r(sb2, this.f11005c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f11003a ? 1 : 0);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f11005c);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f11004b);
        e0.r(parcel, q6);
    }
}
