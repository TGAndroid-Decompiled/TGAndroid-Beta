package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b06 extends b4 {
    public static final Parcelable.Creator<b06> CREATOR = new j9d((byte) 26);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final n23 d;

    public b06() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b06.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b06)) {
            return false;
        }
        b06 b06Var = (b06) obj;
        if (this.a == b06Var.a && id1.d(this.b, b06Var.b) && this.c == b06Var.c && id1.d(this.d, b06Var.d)) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.k(parcel, 5, this.d, i);
        jte.s(parcel, r);
    }

    public b06(boolean z, String str, boolean z2, n23 n23Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = n23Var;
    }
}
