package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4365a;
    public final String f4366b;
    public final boolean f4367c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4365a = z10;
        this.f4366b = str;
        this.f4367c = z11;
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
        if (this.f4365a == iVar.f4365a && g6.a.d(this.f4366b, iVar.f4366b) && this.f4367c == iVar.f4367c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4365a), this.f4366b, Boolean.valueOf(this.f4367c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4365a + ", language=" + this.f4366b + ", androidReceiverCompatible: " + this.f4367c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f4365a ? 1 : 0);
        w7.d0.l(parcel, 3, this.f4366b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4367c ? 1 : 0);
        w7.d0.k(parcel, 5, this.d, i10);
        w7.d0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
