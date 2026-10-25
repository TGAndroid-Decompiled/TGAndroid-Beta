package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f8082a;
    public final String f8083b;
    public final boolean f8084c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f8082a = z10;
        this.f8083b = str;
        this.f8084c = z11;
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
        if (this.f8082a == iVar.f8082a && h6.a.d(this.f8083b, iVar.f8083b) && this.f8084c == iVar.f8084c && h6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8082a), this.f8083b, Boolean.valueOf(this.f8084c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f8082a + ", language=" + this.f8083b + ", androidReceiverCompatible: " + this.f8084c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f8082a ? 1 : 0);
        df.l(parcel, 3, this.f8083b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f8084c ? 1 : 0);
        df.k(parcel, 5, this.d, i10);
        df.r(parcel, q5);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.<init>():void");
    }
}
