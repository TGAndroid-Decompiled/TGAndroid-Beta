package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4412a;
    public final String f4413b;
    public final boolean f4414c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4412a = z10;
        this.f4413b = str;
        this.f4414c = z11;
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
        if (this.f4412a == iVar.f4412a && g6.a.d(this.f4413b, iVar.f4413b) && this.f4414c == iVar.f4414c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4412a), this.f4413b, Boolean.valueOf(this.f4414c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4412a + ", language=" + this.f4413b + ", androidReceiverCompatible: " + this.f4414c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4412a ? 1 : 0);
        w7.e0.l(parcel, 3, this.f4413b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4414c ? 1 : 0);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
