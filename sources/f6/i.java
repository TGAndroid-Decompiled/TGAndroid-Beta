package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11081a;
    public final String f11082b;
    public final boolean f11083c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f11081a = z10;
        this.f11082b = str;
        this.f11083c = z11;
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
        if (this.f11081a == iVar.f11081a && j6.a.d(this.f11082b, iVar.f11082b) && this.f11083c == iVar.f11083c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11081a), this.f11082b, Boolean.valueOf(this.f11083c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11081a + ", language=" + this.f11082b + ", androidReceiverCompatible: " + this.f11083c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f11081a ? 1 : 0);
        yb.l(parcel, 3, this.f11082b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f11083c ? 1 : 0);
        yb.k(parcel, 5, this.d, i7);
        yb.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
