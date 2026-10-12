package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f4363a;
    public final String f4364b;
    public final boolean f4365c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f4363a = z10;
        this.f4364b = str;
        this.f4365c = z11;
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
        if (this.f4363a == iVar.f4363a && g6.a.d(this.f4364b, iVar.f4364b) && this.f4365c == iVar.f4365c && g6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4363a), this.f4364b, Boolean.valueOf(this.f4365c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f4363a + ", language=" + this.f4364b + ", androidReceiverCompatible: " + this.f4365c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f4363a ? 1 : 0);
        w7.c0.l(parcel, 3, this.f4364b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f4365c ? 1 : 0);
        w7.c0.k(parcel, 5, this.d, i10);
        w7.c0.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: c6.i.<init>():void");
    }
}
