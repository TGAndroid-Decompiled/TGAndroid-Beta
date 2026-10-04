package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11974a;
    public final long f11975b;
    public final long f11976c;

    public b(long j3, long j10, boolean z10) {
        this.f11974a = z10;
        this.f11975b = j3;
        this.f11976c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11974a == bVar.f11974a && this.f11975b == bVar.f11975b && this.f11976c == bVar.f11976c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11974a), Long.valueOf(this.f11975b), Long.valueOf(this.f11976c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11974a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11975b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.r(sb2, this.f11976c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f11974a ? 1 : 0);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f11976c);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f11975b);
        g0.r(parcel, q6);
    }
}
