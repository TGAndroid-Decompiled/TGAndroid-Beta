package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fj2 extends c4 {
    public static final Parcelable.Creator<fj2> CREATOR = new mx6((byte) 28);
    public final int a;
    public final String b;

    public fj2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj2)) {
            return false;
        }
        fj2 fj2Var = (fj2) obj;
        if (fj2Var.a == this.a && vue.a(fj2Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
