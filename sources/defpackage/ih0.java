package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ih0 extends c4 {
    public static final Parcelable.Creator<ih0> CREATOR = new s5d((byte) 17);
    public final hh0 a;
    public final eh0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final gh0 f;
    public final fh0 h;
    public final boolean n;

    public ih0(hh0 hh0Var, eh0 eh0Var, String str, boolean z, int i, gh0 gh0Var, fh0 fh0Var, boolean z2) {
        xve.h(hh0Var);
        this.a = hh0Var;
        xve.h(eh0Var);
        this.b = eh0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = gh0Var == null ? new gh0(false, null, null) : gh0Var;
        this.h = fh0Var == null ? new fh0(null, false) : fh0Var;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ih0)) {
            return false;
        }
        ih0 ih0Var = (ih0) obj;
        if (!vue.a(this.a, ih0Var.a) || !vue.a(this.b, ih0Var.b) || !vue.a(this.f, ih0Var.f) || !vue.a(this.h, ih0Var.h) || !vue.a(this.c, ih0Var.c) || this.d != ih0Var.d || this.e != ih0Var.e || this.n != ih0Var.n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.k(parcel, 2, this.b, i);
        bye.l(parcel, 3, this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bye.k(parcel, 6, this.f, i);
        bye.k(parcel, 7, this.h, i);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        bye.s(parcel, r);
    }
}
