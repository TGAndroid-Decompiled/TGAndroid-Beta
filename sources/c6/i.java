package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4483a;
    public final String f4484b;
    public final boolean f4485c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4483a = z10;
        this.f4484b = str;
        this.f4485c = z11;
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
        if (this.f4483a == iVar.f4483a && g6.a.d(this.f4484b, iVar.f4484b) && this.f4485c == iVar.f4485c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4483a), this.f4484b, Boolean.valueOf(this.f4485c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4483a + ", language=" + this.f4484b + ", androidReceiverCompatible: " + this.f4485c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f4483a ? 1 : 0);
        g0.l(parcel, 3, this.f4484b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4485c ? 1 : 0);
        g0.k(parcel, 5, this.d, i10);
        g0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
