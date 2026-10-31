package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new g(1);
    public final int f7460a;
    public final int f7461b;
    public final long f7462c;
    public final long d;

    public h(long j10, long j11, int i10, int i11) {
        this.f7460a = i10;
        this.f7461b = i11;
        this.f7462c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f7460a == hVar.f7460a && this.f7461b == hVar.f7461b && this.f7462c == hVar.f7462c && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7461b), Integer.valueOf(this.f7460a), Long.valueOf(this.d), Long.valueOf(this.f7462c)});
    }

    public final String toString() {
        StringBuilder m10 = i0.a.m("NetworkLocationStatus: Wifi status: ", this.f7460a, " Cell status: ", this.f7461b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f7462c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f7460a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7461b);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.f7462c);
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        h0.r(parcel, q6);
    }
}
