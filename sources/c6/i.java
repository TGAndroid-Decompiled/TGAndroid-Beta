package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3997a;
    public final String f3998b;
    public final boolean f3999c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3997a = z10;
        this.f3998b = str;
        this.f3999c = z11;
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
        if (this.f3997a == iVar.f3997a && g6.a.d(this.f3998b, iVar.f3998b) && this.f3999c == iVar.f3999c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3997a), this.f3998b, Boolean.valueOf(this.f3999c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3997a + ", language=" + this.f3998b + ", androidReceiverCompatible: " + this.f3999c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f3997a ? 1 : 0);
        w7.f0.l(parcel, 3, this.f3998b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f3999c ? 1 : 0);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
