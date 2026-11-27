package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f26 extends c4 {
    public static final Parcelable.Creator<f26> CREATOR = new ced((byte) 26);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final f33 d;

    public f26() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f26.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f26)) {
            return false;
        }
        f26 f26Var = (f26) obj;
        if (this.a == f26Var.a && qd1.d(this.b, f26Var.b) && this.c == f26Var.c && qd1.d(this.d, f26Var.d)) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.k(parcel, 5, this.d, i);
        bye.s(parcel, r);
    }

    public f26(boolean z, String str, boolean z2, f33 f33Var) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = f33Var;
    }
}
