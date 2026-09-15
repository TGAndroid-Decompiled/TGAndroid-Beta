package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3993a;
    public final String f3994b;
    public final boolean f3995c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3993a = z10;
        this.f3994b = str;
        this.f3995c = z11;
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
        if (this.f3993a == iVar.f3993a && g6.a.d(this.f3994b, iVar.f3994b) && this.f3995c == iVar.f3995c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3993a), this.f3994b, Boolean.valueOf(this.f3995c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3993a + ", language=" + this.f3994b + ", androidReceiverCompatible: " + this.f3995c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f3993a ? 1 : 0);
        w7.e0.l(parcel, 3, this.f3994b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f3995c ? 1 : 0);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
