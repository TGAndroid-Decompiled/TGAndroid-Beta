package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4364a;
    public final String f4365b;
    public final boolean f4366c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4364a = z10;
        this.f4365b = str;
        this.f4366c = z11;
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
        if (this.f4364a == iVar.f4364a && g6.a.d(this.f4365b, iVar.f4365b) && this.f4366c == iVar.f4366c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4364a), this.f4365b, Boolean.valueOf(this.f4366c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4364a + ", language=" + this.f4365b + ", androidReceiverCompatible: " + this.f4366c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f4364a ? 1 : 0);
        w7.d0.l(parcel, 3, this.f4365b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4366c ? 1 : 0);
        w7.d0.k(parcel, 5, this.d, i10);
        w7.d0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
