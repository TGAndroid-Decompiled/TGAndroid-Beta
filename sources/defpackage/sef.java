package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class sef extends b4 {
    public static final Parcelable.Creator<sef> CREATOR = new e2f((byte) 26);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final y1f[] h;
    public final String n;
    public final jhf r;

    public sef(String str, String str2, boolean z, int i, boolean z2, String str3, y1f[] y1fVarArr, String str4, jhf jhfVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.h = y1fVarArr;
        this.n = str4;
        this.r = jhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sef)) {
            return false;
        }
        sef sefVar = (sef) obj;
        if (this.c == sefVar.c && this.d == sefVar.d && this.e == sefVar.e && fse.a(this.a, sefVar.a) && fse.a(this.b, sefVar.b) && fse.a(this.f, sefVar.f) && fse.a(this.n, sefVar.n) && fse.a(this.r, sefVar.r) && Arrays.equals(this.h, sefVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.l(parcel, 6, this.f);
        mve.o(parcel, 7, this.h, i);
        mve.l(parcel, 11, this.n);
        mve.k(parcel, 12, this.r, i);
        mve.s(parcel, r);
    }
}
