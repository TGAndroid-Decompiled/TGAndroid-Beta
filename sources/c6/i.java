package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4859a;
    public final String f4860b;
    public final boolean f4861c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4859a = z10;
        this.f4860b = str;
        this.f4861c = z11;
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
        if (this.f4859a == iVar.f4859a && g6.a.d(this.f4860b, iVar.f4860b) && this.f4861c == iVar.f4861c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4859a), this.f4860b, Boolean.valueOf(this.f4861c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4859a + ", language=" + this.f4860b + ", androidReceiverCompatible: " + this.f4861c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4859a ? 1 : 0);
        w7.f0.l(parcel, 3, this.f4860b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4861c ? 1 : 0);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
