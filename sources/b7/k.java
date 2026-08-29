package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
public final class k extends a6.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(21);
    public final String f1960a;
    public final String f1961b;
    public final boolean f1962c;
    public final int d;
    public final boolean f1963e;
    public final String f1964f;
    public final h[] h;
    public final String f1965n;
    public final l f1966r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f1960a = str;
        this.f1961b = str2;
        this.f1962c = z10;
        this.d = i10;
        this.f1963e = z11;
        this.f1964f = str3;
        this.h = hVarArr;
        this.f1965n = str4;
        this.f1966r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f1962c == kVar.f1962c && this.d == kVar.d && this.f1963e == kVar.f1963e && z5.l.l(this.f1960a, kVar.f1960a) && z5.l.l(this.f1961b, kVar.f1961b) && z5.l.l(this.f1964f, kVar.f1964f) && z5.l.l(this.f1965n, kVar.f1965n) && z5.l.l(this.f1966r, kVar.f1966r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1960a, this.f1961b, Boolean.valueOf(this.f1962c), Integer.valueOf(this.d), Boolean.valueOf(this.f1963e), this.f1964f, Integer.valueOf(Arrays.hashCode(this.h)), this.f1965n, this.f1966r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f1960a);
        o.l(parcel, 2, this.f1961b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f1962c ? 1 : 0);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        o.s(parcel, 5, 4);
        parcel.writeInt(this.f1963e ? 1 : 0);
        o.l(parcel, 6, this.f1964f);
        o.o(parcel, 7, this.h, i10);
        o.l(parcel, 11, this.f1965n);
        o.k(parcel, 12, this.f1966r, i10);
        o.r(parcel, q6);
    }
}
