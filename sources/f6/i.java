package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11427a;
    public final String f11428b;
    public final boolean f11429c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f11427a = z10;
        this.f11428b = str;
        this.f11429c = z11;
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
        if (this.f11427a == iVar.f11427a && j6.a.d(this.f11428b, iVar.f11428b) && this.f11429c == iVar.f11429c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11427a), this.f11428b, Boolean.valueOf(this.f11429c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11427a + ", language=" + this.f11428b + ", androidReceiverCompatible: " + this.f11429c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11427a ? 1 : 0);
        bc.l(parcel, 3, this.f11428b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11429c ? 1 : 0);
        bc.k(parcel, 5, this.d, i7);
        bc.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
