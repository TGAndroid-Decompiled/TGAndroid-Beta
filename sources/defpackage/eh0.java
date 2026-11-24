package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class eh0 extends b4 {
    public static final Parcelable.Creator<eh0> CREATOR = new b1d((byte) 20);
    public final boolean a;
    public final String b;

    public eh0(String str, boolean z) {
        if (z) {
            fre.h(str);
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        if (this.a == eh0Var.a && cqe.a(this.b, eh0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.l(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
