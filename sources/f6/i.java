package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11392a;
    public final String f11393b;
    public final boolean f11394c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f11392a = z10;
        this.f11393b = str;
        this.f11394c = z11;
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
        if (this.f11392a == iVar.f11392a && j6.a.d(this.f11393b, iVar.f11393b) && this.f11394c == iVar.f11394c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11392a), this.f11393b, Boolean.valueOf(this.f11394c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11392a + ", language=" + this.f11393b + ", androidReceiverCompatible: " + this.f11394c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f11392a ? 1 : 0);
        cc.l(parcel, 3, this.f11393b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11394c ? 1 : 0);
        cc.k(parcel, 5, this.d, i7);
        cc.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
