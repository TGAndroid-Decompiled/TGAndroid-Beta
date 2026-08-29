package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f19270a;
    public final String f19271b;
    public final boolean f19272c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f19270a = z10;
        this.f19271b = str;
        this.f19272c = z11;
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
        if (this.f19270a == iVar.f19270a && s5.a.d(this.f19271b, iVar.f19271b) && this.f19272c == iVar.f19272c && s5.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19270a), this.f19271b, Boolean.valueOf(this.f19272c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f19270a + ", language=" + this.f19271b + ", androidReceiverCompatible: " + this.f19272c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f19270a ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19271b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f19272c ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: o5.i.<init>():void");
    }
}
