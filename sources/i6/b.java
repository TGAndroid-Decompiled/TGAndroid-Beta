package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f10487a;
    public final long f10488b;
    public final long f10489c;

    public b(long j3, long j10, boolean z10) {
        this.f10487a = z10;
        this.f10488b = j3;
        this.f10489c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f10487a == bVar.f10487a && this.f10488b == bVar.f10488b && this.f10489c == bVar.f10489c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10487a), Long.valueOf(this.f10488b), Long.valueOf(this.f10489c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f10487a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f10488b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.r(sb2, this.f10489c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f10487a ? 1 : 0);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f10489c);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f10488b);
        e0.r(parcel, q6);
    }
}
