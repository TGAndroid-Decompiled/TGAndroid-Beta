package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ji2 extends b4 {
    public static final Parcelable.Creator<ji2> CREATOR = new hv6((byte) 28);
    public final int a;
    public final String b;

    public ji2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        if (ji2Var.a == this.a && cqe.a(ji2Var.b, this.b)) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
