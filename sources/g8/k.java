package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10515a;
    public final int f10516b;
    public final long f10517c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10515a = i10;
        this.f10516b = i11;
        this.f10517c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10515a == kVar.f10515a && this.f10516b == kVar.f10516b && this.f10517c == kVar.f10517c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10516b), Integer.valueOf(this.f10515a), Long.valueOf(this.d), Long.valueOf(this.f10517c)});
    }

    public final String toString() {
        StringBuilder k10 = e2.k("NetworkLocationStatus: Wifi status: ", this.f10515a, " Cell status: ", this.f10516b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10517c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f10515a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10516b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f10517c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
