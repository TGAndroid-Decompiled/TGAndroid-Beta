package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new b9.e(12);
    public final String f4242a;
    public final String f4243b;
    public final boolean f4244c;
    public final int d;
    public final boolean e;
    public final String f4245f;
    public final h[] h;
    public final String f4246n;
    public final l f4247r;

    public k(String str, String str2, boolean z4, int i10, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f4242a = str;
        this.f4243b = str2;
        this.f4244c = z4;
        this.d = i10;
        this.e = z10;
        this.f4245f = str3;
        this.h = hVarArr;
        this.f4246n = str4;
        this.f4247r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f4244c == kVar.f4244c && this.d == kVar.d && this.e == kVar.e && b6.m.l(this.f4242a, kVar.f4242a) && b6.m.l(this.f4243b, kVar.f4243b) && b6.m.l(this.f4245f, kVar.f4245f) && b6.m.l(this.f4246n, kVar.f4246n) && b6.m.l(this.f4247r, kVar.f4247r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4242a, this.f4243b, Boolean.valueOf(this.f4244c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f4245f, Integer.valueOf(Arrays.hashCode(this.h)), this.f4246n, this.f4247r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f4242a);
        f5.l(parcel, 2, this.f4243b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f4244c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.l(parcel, 6, this.f4245f);
        f5.o(parcel, 7, this.h, i10);
        f5.l(parcel, 11, this.f4246n);
        f5.k(parcel, 12, this.f4247r, i10);
        f5.r(parcel, q10);
    }
}
