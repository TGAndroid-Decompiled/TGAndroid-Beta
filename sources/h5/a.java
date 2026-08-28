package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import x5.l;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new h(2);
    public final boolean f9832a;
    public final String f9833b;
    public final String f9834c;
    public final boolean d;
    public final String f9835e;
    public final ArrayList f9836f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f9832a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f9833b = str;
        this.f9834c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f9836f = arrayList2;
        this.f9835e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9832a == aVar.f9832a && l.l(this.f9833b, aVar.f9833b) && l.l(this.f9834c, aVar.f9834c) && this.d == aVar.d && l.l(this.f9835e, aVar.f9835e) && l.l(this.f9836f, aVar.f9836f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9832a), this.f9833b, this.f9834c, Boolean.valueOf(this.d), this.f9835e, this.f9836f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f9832a ? 1 : 0);
        p8.l(parcel, 2, this.f9833b);
        p8.l(parcel, 3, this.f9834c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.l(parcel, 5, this.f9835e);
        p8.n(parcel, 6, this.f9836f);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        p8.r(parcel, q10);
    }
}
