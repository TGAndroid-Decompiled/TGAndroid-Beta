package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hi0 extends b4 {
    public static final Parcelable.Creator<hi0> CREATOR = new d3d((byte) 17);
    public final gi0 a;
    public final di0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final fi0 f;
    public final ei0 h;
    public final boolean n;

    public hi0(gi0 gi0Var, di0 di0Var, String str, boolean z, int i, fi0 fi0Var, ei0 ei0Var, boolean z2) {
        ite.h(gi0Var);
        this.a = gi0Var;
        ite.h(di0Var);
        this.b = di0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = fi0Var == null ? new fi0(false, null, null) : fi0Var;
        this.h = ei0Var == null ? new ei0(null, false) : ei0Var;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        if (!fse.a(this.a, hi0Var.a) || !fse.a(this.b, hi0Var.b) || !fse.a(this.f, hi0Var.f) || !fse.a(this.h, hi0Var.h) || !fse.a(this.c, hi0Var.c) || this.d != hi0Var.d || this.e != hi0Var.e || this.n != hi0Var.n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.k(parcel, 2, this.b, i);
        mve.l(parcel, 3, this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        mve.k(parcel, 6, this.f, i);
        mve.k(parcel, 7, this.h, i);
        mve.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        mve.s(parcel, r);
    }
}
