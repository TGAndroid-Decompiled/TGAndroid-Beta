package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new b9.e(12);
    public final String f4223a;
    public final String f4224b;
    public final boolean f4225c;
    public final int d;
    public final boolean e;
    public final String f4226f;
    public final h[] h;
    public final String f4227n;
    public final l f4228r;

    public k(String str, String str2, boolean z4, int i10, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f4223a = str;
        this.f4224b = str2;
        this.f4225c = z4;
        this.d = i10;
        this.e = z10;
        this.f4226f = str3;
        this.h = hVarArr;
        this.f4227n = str4;
        this.f4228r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f4225c == kVar.f4225c && this.d == kVar.d && this.e == kVar.e && b6.m.l(this.f4223a, kVar.f4223a) && b6.m.l(this.f4224b, kVar.f4224b) && b6.m.l(this.f4226f, kVar.f4226f) && b6.m.l(this.f4227n, kVar.f4227n) && b6.m.l(this.f4228r, kVar.f4228r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4223a, this.f4224b, Boolean.valueOf(this.f4225c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f4226f, Integer.valueOf(Arrays.hashCode(this.h)), this.f4227n, this.f4228r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f4223a);
        f5.l(parcel, 2, this.f4224b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f4225c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.l(parcel, 6, this.f4226f);
        f5.o(parcel, 7, this.h, i10);
        f5.l(parcel, 11, this.f4227n);
        f5.k(parcel, 12, this.f4228r, i10);
        f5.r(parcel, q10);
    }
}
