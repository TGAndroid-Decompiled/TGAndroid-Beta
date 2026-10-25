package j6;

import a1.g;
import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import java.util.Arrays;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f15523a;
    public final long f15524b;
    public final long f15525c;

    public b(long j10, long j11, boolean z10) {
        this.f15523a = z10;
        this.f15524b = j10;
        this.f15525c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f15523a == bVar.f15523a && this.f15524b == bVar.f15524b && this.f15525c == bVar.f15525c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15523a), Long.valueOf(this.f15524b), Long.valueOf(this.f15525c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f15523a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f15524b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f15525c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f15523a ? 1 : 0);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f15525c);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f15524b);
        df.r(parcel, q5);
    }
}
