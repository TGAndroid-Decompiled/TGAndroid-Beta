package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new b9.e(12);
    public final String f4315a;
    public final String f4316b;
    public final boolean f4317c;
    public final int d;
    public final boolean f4318e;
    public final String f4319f;
    public final h[] h;
    public final String f4320n;
    public final l f4321r;

    public k(String str, String str2, boolean z4, int i10, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f4315a = str;
        this.f4316b = str2;
        this.f4317c = z4;
        this.d = i10;
        this.f4318e = z10;
        this.f4319f = str3;
        this.h = hVarArr;
        this.f4320n = str4;
        this.f4321r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f4317c == kVar.f4317c && this.d == kVar.d && this.f4318e == kVar.f4318e && b6.m.l(this.f4315a, kVar.f4315a) && b6.m.l(this.f4316b, kVar.f4316b) && b6.m.l(this.f4319f, kVar.f4319f) && b6.m.l(this.f4320n, kVar.f4320n) && b6.m.l(this.f4321r, kVar.f4321r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4315a, this.f4316b, Boolean.valueOf(this.f4317c), Integer.valueOf(this.d), Boolean.valueOf(this.f4318e), this.f4319f, Integer.valueOf(Arrays.hashCode(this.h)), this.f4320n, this.f4321r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f4315a);
        g5.l(parcel, 2, this.f4316b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f4317c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f4318e ? 1 : 0);
        g5.l(parcel, 6, this.f4319f);
        g5.o(parcel, 7, this.h, i10);
        g5.l(parcel, 11, this.f4320n);
        g5.k(parcel, 12, this.f4321r, i10);
        g5.r(parcel, q10);
    }
}
