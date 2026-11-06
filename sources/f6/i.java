package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f11267a;
    public final String f11268b;
    public final boolean f11269c;
    public final h d;

    public i(boolean z9, String str, boolean z10, h hVar) {
        this.f11267a = z9;
        this.f11268b = str;
        this.f11269c = z10;
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
        if (this.f11267a == iVar.f11267a && j6.a.d(this.f11268b, iVar.f11268b) && this.f11269c == iVar.f11269c && j6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11267a), this.f11268b, Boolean.valueOf(this.f11269c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f11267a + ", language=" + this.f11268b + ", androidReceiverCompatible: " + this.f11269c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f11267a ? 1 : 0);
        xb.l(parcel, 3, this.f11268b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11269c ? 1 : 0);
        xb.k(parcel, 5, this.d, i7);
        xb.s(parcel, r10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: f6.i.<init>():void");
    }
}
