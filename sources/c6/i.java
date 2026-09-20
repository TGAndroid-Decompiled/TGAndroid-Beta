package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3999a;
    public final String f4000b;
    public final boolean f4001c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3999a = z10;
        this.f4000b = str;
        this.f4001c = z11;
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
        if (this.f3999a == iVar.f3999a && g6.a.d(this.f4000b, iVar.f4000b) && this.f4001c == iVar.f4001c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3999a), this.f4000b, Boolean.valueOf(this.f4001c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3999a + ", language=" + this.f4000b + ", androidReceiverCompatible: " + this.f4001c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f3999a ? 1 : 0);
        w7.f0.l(parcel, 3, this.f4000b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4001c ? 1 : 0);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
