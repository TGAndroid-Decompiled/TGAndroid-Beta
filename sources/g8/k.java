package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10487a;
    public final int f10488b;
    public final long f10489c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10487a = i10;
        this.f10488b = i11;
        this.f10489c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10487a == kVar.f10487a && this.f10488b == kVar.f10488b && this.f10489c == kVar.f10489c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10488b), Integer.valueOf(this.f10487a), Long.valueOf(this.d), Long.valueOf(this.f10489c)});
    }

    public final String toString() {
        StringBuilder k10 = e2.k("NetworkLocationStatus: Wifi status: ", this.f10487a, " Cell status: ", this.f10488b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10489c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f10487a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10488b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f10489c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
