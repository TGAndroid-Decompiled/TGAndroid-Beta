package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b26 extends b4 {
    public static final Parcelable.Creator<b26> CREATOR = new lbd((byte) 26);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final y33 d;

    public b26() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b26.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b26)) {
            return false;
        }
        b26 b26Var = (b26) obj;
        if (this.a == b26Var.a && qe1.d(this.b, b26Var.b) && this.c == b26Var.c && qe1.d(this.d, b26Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.k(parcel, 5, this.d, i);
        mve.s(parcel, r);
    }

    public b26(boolean z, String str, boolean z2, y33 y33Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = y33Var;
    }
}
