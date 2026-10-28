package h8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import c3.h0;
import java.util.Arrays;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f12713a;
    public final int f12714b;
    public final long f12715c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f12713a = i10;
        this.f12714b = i11;
        this.f12715c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f12713a == kVar.f12713a && this.f12714b == kVar.f12714b && this.f12715c == kVar.f12715c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12714b), Integer.valueOf(this.f12713a), Long.valueOf(this.d), Long.valueOf(this.f12715c)});
    }

    public final String toString() {
        StringBuilder n10 = h0.n("NetworkLocationStatus: Wifi status: ", this.f12713a, " Cell status: ", this.f12714b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.f12715c);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f12713a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f12714b);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.f12715c);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        df.r(parcel, q5);
    }
}
