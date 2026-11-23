package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11393a;
    public final String f11394b;
    public final boolean f11395c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f11393a = z10;
        this.f11394b = str;
        this.f11395c = z11;
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
        if (this.f11393a == iVar.f11393a && j6.a.d(this.f11394b, iVar.f11394b) && this.f11395c == iVar.f11395c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11393a), this.f11394b, Boolean.valueOf(this.f11395c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11393a + ", language=" + this.f11394b + ", androidReceiverCompatible: " + this.f11395c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f11393a ? 1 : 0);
        cc.l(parcel, 3, this.f11394b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11395c ? 1 : 0);
        cc.k(parcel, 5, this.d, i7);
        cc.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
