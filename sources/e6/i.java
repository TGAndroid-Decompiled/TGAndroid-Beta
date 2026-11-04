package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends q6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f9710a;
    public final String f9711b;
    public final boolean f9712c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f9710a = z10;
        this.f9711b = str;
        this.f9712c = z11;
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
        if (this.f9710a == iVar.f9710a && i6.a.d(this.f9711b, iVar.f9711b) && this.f9712c == iVar.f9712c && i6.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9710a), this.f9711b, Boolean.valueOf(this.f9712c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f9710a + ", language=" + this.f9711b + ", androidReceiverCompatible: " + this.f9712c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f9710a ? 1 : 0);
        j8.a.m(parcel, 3, this.f9711b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f9712c ? 1 : 0);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.t(parcel, s6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: e6.i.<init>():void");
    }
}
