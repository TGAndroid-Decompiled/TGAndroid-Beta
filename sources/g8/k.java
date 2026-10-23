package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.k3;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10954a;
    public final int f10955b;
    public final long f10956c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10954a = i10;
        this.f10955b = i11;
        this.f10956c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10954a == kVar.f10954a && this.f10955b == kVar.f10955b && this.f10956c == kVar.f10956c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10955b), Integer.valueOf(this.f10954a), Long.valueOf(this.d), Long.valueOf(this.f10956c)});
    }

    public final String toString() {
        StringBuilder k10 = k3.k("NetworkLocationStatus: Wifi status: ", this.f10954a, " Cell status: ", this.f10955b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10956c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10954a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10955b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10956c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
