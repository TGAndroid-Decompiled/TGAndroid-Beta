package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4508a;
    public final String f4509b;
    public final boolean f4510c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4508a = z10;
        this.f4509b = str;
        this.f4510c = z11;
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
        if (this.f4508a == iVar.f4508a && g6.a.d(this.f4509b, iVar.f4509b) && this.f4510c == iVar.f4510c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4508a), this.f4509b, Boolean.valueOf(this.f4510c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4508a + ", language=" + this.f4509b + ", androidReceiverCompatible: " + this.f4510c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4508a ? 1 : 0);
        w7.e0.l(parcel, 3, this.f4509b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4510c ? 1 : 0);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
