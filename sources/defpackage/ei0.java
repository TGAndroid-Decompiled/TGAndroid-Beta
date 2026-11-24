package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ei0 extends b4 {
    public static final Parcelable.Creator<ei0> CREATOR = new d3d((byte) 20);
    public final boolean a;
    public final String b;

    public ei0(String str, boolean z) {
        if (z) {
            ite.h(str);
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        if (this.a == ei0Var.a && fse.a(this.b, ei0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
