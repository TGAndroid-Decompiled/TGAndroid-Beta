package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f3885a;
    public final String f3886b;
    public final boolean f3887c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f3885a = z10;
        this.f3886b = str;
        this.f3887c = z11;
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
        if (this.f3885a == iVar.f3885a && g6.a.d(this.f3886b, iVar.f3886b) && this.f3887c == iVar.f3887c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3885a), this.f3886b, Boolean.valueOf(this.f3887c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f3885a + ", language=" + this.f3886b + ", androidReceiverCompatible: " + this.f3887c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f3885a ? 1 : 0);
        h0.l(parcel, 3, this.f3886b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f3887c ? 1 : 0);
        h0.k(parcel, 5, this.d, i10);
        h0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
