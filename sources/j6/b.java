package j6;

import a1.g;
import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import java.util.Arrays;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(8);
    public final boolean f15522a;
    public final long f15523b;
    public final long f15524c;

    public b(long j10, long j11, boolean z10) {
        this.f15522a = z10;
        this.f15523b = j10;
        this.f15524c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f15522a == bVar.f15522a && this.f15523b == bVar.f15523b && this.f15524c == bVar.f15524c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15522a), Long.valueOf(this.f15523b), Long.valueOf(this.f15524c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f15522a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f15523b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return g.r(sb2, this.f15524c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f15522a ? 1 : 0);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f15524c);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f15523b);
        df.r(parcel, q5);
    }
}
