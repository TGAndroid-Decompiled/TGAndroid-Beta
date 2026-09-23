package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f10993a;
    public final long f10994b;
    public final long f10995c;

    public b(long j3, long j10, boolean z10) {
        this.f10993a = z10;
        this.f10994b = j3;
        this.f10995c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f10993a == bVar.f10993a && this.f10994b == bVar.f10994b && this.f10995c == bVar.f10995c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10993a), Long.valueOf(this.f10994b), Long.valueOf(this.f10995c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f10993a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f10994b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.s(sb2, this.f10995c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f10993a ? 1 : 0);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f10995c);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f10994b);
        e0.r(parcel, q6);
    }
}
