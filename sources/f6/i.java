package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11272a;
    public final String f11273b;
    public final boolean f11274c;
    public final h d;

    public i(boolean z9, String str, boolean z10, h hVar) {
        this.f11272a = z9;
        this.f11273b = str;
        this.f11274c = z10;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11272a == iVar.f11272a && j6.a.d(this.f11273b, iVar.f11273b) && this.f11274c == iVar.f11274c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11272a), this.f11273b, Boolean.valueOf(this.f11274c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11272a + ", language=" + this.f11273b + ", androidReceiverCompatible: " + this.f11274c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f11272a ? 1 : 0);
        xb.l(parcel, 3, this.f11273b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11274c ? 1 : 0);
        xb.k(parcel, 5, this.d, i7);
        xb.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
