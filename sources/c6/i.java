package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3992a;
    public final String f3993b;
    public final boolean f3994c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3992a = z10;
        this.f3993b = str;
        this.f3994c = z11;
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
        if (this.f3992a == iVar.f3992a && g6.a.d(this.f3993b, iVar.f3993b) && this.f3994c == iVar.f3994c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3992a), this.f3993b, Boolean.valueOf(this.f3994c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3992a + ", language=" + this.f3993b + ", androidReceiverCompatible: " + this.f3994c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f3992a ? 1 : 0);
        w7.f0.l(parcel, 3, this.f3993b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f3994c ? 1 : 0);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
