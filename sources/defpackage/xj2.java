package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xj2 extends b4 {
    public static final Parcelable.Creator<xj2> CREATOR = new hx6((byte) 28);
    public final int a;
    public final String b;

    public xj2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xj2)) {
            return false;
        }
        xj2 xj2Var = (xj2) obj;
        if (xj2Var.a == this.a && fse.a(xj2Var.b, this.b)) {
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
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
