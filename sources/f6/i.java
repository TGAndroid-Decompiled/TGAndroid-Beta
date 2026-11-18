package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11401a;
    public final String f11402b;
    public final boolean f11403c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f11401a = z10;
        this.f11402b = str;
        this.f11403c = z11;
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
        if (this.f11401a == iVar.f11401a && j6.a.d(this.f11402b, iVar.f11402b) && this.f11403c == iVar.f11403c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11401a), this.f11402b, Boolean.valueOf(this.f11403c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11401a + ", language=" + this.f11402b + ", androidReceiverCompatible: " + this.f11403c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11401a ? 1 : 0);
        bc.l(parcel, 3, this.f11402b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11403c ? 1 : 0);
        bc.k(parcel, 5, this.d, i7);
        bc.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
