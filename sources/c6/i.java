package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4314a;
    public final String f4315b;
    public final boolean f4316c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4314a = z10;
        this.f4315b = str;
        this.f4316c = z11;
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
        if (this.f4314a == iVar.f4314a && g6.a.d(this.f4315b, iVar.f4315b) && this.f4316c == iVar.f4316c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4314a), this.f4315b, Boolean.valueOf(this.f4316c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4314a + ", language=" + this.f4315b + ", androidReceiverCompatible: " + this.f4316c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f4314a ? 1 : 0);
        g0.l(parcel, 3, this.f4315b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4316c ? 1 : 0);
        g0.k(parcel, 5, this.d, i10);
        g0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
