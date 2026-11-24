package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class rcf extends b4 {
    public static final Parcelable.Creator<rcf> CREATOR = new c0f((byte) 26);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final wze[] h;
    public final String n;
    public final iff r;

    public rcf(String str, String str2, boolean z, int i, boolean z2, String str3, wze[] wzeVarArr, String str4, iff iffVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.h = wzeVarArr;
        this.n = str4;
        this.r = iffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcf)) {
            return false;
        }
        rcf rcfVar = (rcf) obj;
        if (this.c == rcfVar.c && this.d == rcfVar.d && this.e == rcfVar.e && cqe.a(this.a, rcfVar.a) && cqe.a(this.b, rcfVar.b) && cqe.a(this.f, rcfVar.f) && cqe.a(this.n, rcfVar.n) && cqe.a(this.r, rcfVar.r) && Arrays.equals(this.h, rcfVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.l(parcel, 6, this.f);
        jte.o(parcel, 7, this.h, i);
        jte.l(parcel, 11, this.n);
        jte.k(parcel, 12, this.r, i);
        jte.s(parcel, r);
    }
}
