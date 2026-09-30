package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3990a;
    public final String f3991b;
    public final boolean f3992c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3990a = z10;
        this.f3991b = str;
        this.f3992c = z11;
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
        if (this.f3990a == iVar.f3990a && g6.a.d(this.f3991b, iVar.f3991b) && this.f3992c == iVar.f3992c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3990a), this.f3991b, Boolean.valueOf(this.f3992c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3990a + ", language=" + this.f3991b + ", androidReceiverCompatible: " + this.f3992c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f3990a ? 1 : 0);
        w7.f0.l(parcel, 3, this.f3991b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f3992c ? 1 : 0);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
