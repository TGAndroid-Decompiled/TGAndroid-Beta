package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class l extends z5.a {
    public static final Parcelable.Creator<l> CREATOR = new w.a(7);

    public final String f124a;

    public final String f125b;

    public final boolean f126c;
    public final int d;

    public final boolean f127e;

    public final String f128f;
    public final i[] h;

    public final String f129n;

    public final m f130r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, i[] iVarArr, String str4, m mVar) {
        this.f124a = str;
        this.f125b = str2;
        this.f126c = z10;
        this.d = i10;
        this.f127e = z11;
        this.f128f = str3;
        this.h = iVarArr;
        this.f129n = str4;
        this.f130r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f126c == lVar.f126c && this.d == lVar.d && this.f127e == lVar.f127e && y5.l.l(this.f124a, lVar.f124a) && y5.l.l(this.f125b, lVar.f125b) && y5.l.l(this.f128f, lVar.f128f) && y5.l.l(this.f129n, lVar.f129n) && y5.l.l(this.f130r, lVar.f130r) && Arrays.equals(this.h, lVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f124a, this.f125b, Boolean.valueOf(this.f126c), Integer.valueOf(this.d), Boolean.valueOf(this.f127e), this.f128f, Integer.valueOf(Arrays.hashCode(this.h)), this.f129n, this.f130r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f124a);
        r8.l(parcel, 2, this.f125b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f126c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f127e ? 1 : 0);
        r8.l(parcel, 6, this.f128f);
        r8.o(parcel, 7, this.h, i10);
        r8.l(parcel, 11, this.f129n);
        r8.k(parcel, 12, this.f130r, i10);
        r8.r(parcel, iQ);
    }
}
