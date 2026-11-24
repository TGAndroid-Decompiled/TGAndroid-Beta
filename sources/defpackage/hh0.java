package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hh0 extends b4 {
    public static final Parcelable.Creator<hh0> CREATOR = new b1d((byte) 17);
    public final gh0 a;
    public final dh0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final fh0 f;
    public final eh0 h;
    public final boolean n;

    public hh0(gh0 gh0Var, dh0 dh0Var, String str, boolean z, int i, fh0 fh0Var, eh0 eh0Var, boolean z2) {
        fre.h(gh0Var);
        this.a = gh0Var;
        fre.h(dh0Var);
        this.b = dh0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = fh0Var == null ? new fh0(false, null, null) : fh0Var;
        this.h = eh0Var == null ? new eh0(null, false) : eh0Var;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        if (!cqe.a(this.a, hh0Var.a) || !cqe.a(this.b, hh0Var.b) || !cqe.a(this.f, hh0Var.f) || !cqe.a(this.h, hh0Var.h) || !cqe.a(this.c, hh0Var.c) || this.d != hh0Var.d || this.e != hh0Var.e || this.n != hh0Var.n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.l(parcel, 3, this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        jte.k(parcel, 6, this.f, i);
        jte.k(parcel, 7, this.h, i);
        jte.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        jte.s(parcel, r);
    }
}
