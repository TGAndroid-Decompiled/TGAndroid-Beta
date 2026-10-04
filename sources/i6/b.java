package i6;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f11975a;
    public final long f11976b;
    public final long f11977c;

    public b(long j3, long j10, boolean z10) {
        this.f11975a = z10;
        this.f11976b = j3;
        this.f11977c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11975a == bVar.f11975a && this.f11976b == bVar.f11976b && this.f11977c == bVar.f11977c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11975a), Long.valueOf(this.f11976b), Long.valueOf(this.f11977c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f11975a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f11976b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return a4.a.s(sb2, this.f11977c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f11975a ? 1 : 0);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f11977c);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f11976b);
        g0.r(parcel, q6);
    }
}
