package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f17411a;
    public final String f17412b;
    public final boolean f17413c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f17411a = z10;
        this.f17412b = str;
        this.f17413c = z11;
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
        if (this.f17411a == iVar.f17411a && q5.a.d(this.f17412b, iVar.f17412b) && this.f17413c == iVar.f17413c && q5.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17411a), this.f17412b, Boolean.valueOf(this.f17413c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f17411a + ", language=" + this.f17412b + ", androidReceiverCompatible: " + this.f17413c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f17411a ? 1 : 0);
        p8.l(parcel, 3, this.f17412b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f17413c ? 1 : 0);
        p8.k(parcel, 5, this.d, i9);
        p8.r(parcel, q10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: m5.i.<init>():void");
    }
}
