package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hhf extends c4 {
    public static final Parcelable.Creator<hhf> CREATOR = new t4f((byte) 26);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final n4f[] h;
    public final String n;
    public final yjf r;

    public hhf(String str, String str2, boolean z, int i, boolean z2, String str3, n4f[] n4fVarArr, String str4, yjf yjfVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.h = n4fVarArr;
        this.n = str4;
        this.r = yjfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhf)) {
            return false;
        }
        hhf hhfVar = (hhf) obj;
        if (this.c == hhfVar.c && this.d == hhfVar.d && this.e == hhfVar.e && vue.a(this.a, hhfVar.a) && vue.a(this.b, hhfVar.b) && vue.a(this.f, hhfVar.f) && vue.a(this.n, hhfVar.n) && vue.a(this.r, hhfVar.r) && Arrays.equals(this.h, hhfVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.l(parcel, 6, this.f);
        bye.o(parcel, 7, this.h, i);
        bye.l(parcel, 11, this.n);
        bye.k(parcel, 12, this.r, i);
        bye.s(parcel, r);
    }
}
