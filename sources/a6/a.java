package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(3);
    public final boolean f274a;
    public final String f275b;
    public final String f276c;
    public final boolean d;
    public final String f277e;
    public final ArrayList f278f;
    public final boolean h;

    public a(boolean z9, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f274a = z9;
        if (z9) {
            m.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f275b = str;
        this.f276c = str2;
        this.d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f278f = arrayList2;
        this.f277e = str3;
        this.h = z11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f274a == aVar.f274a && m.k(this.f275b, aVar.f275b) && m.k(this.f276c, aVar.f276c) && this.d == aVar.d && m.k(this.f277e, aVar.f277e) && m.k(this.f278f, aVar.f278f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f274a), this.f275b, this.f276c, Boolean.valueOf(this.d), this.f277e, this.f278f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f274a ? 1 : 0);
        xb.l(parcel, 2, this.f275b);
        xb.l(parcel, 3, this.f276c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.l(parcel, 5, this.f277e);
        xb.n(parcel, 6, this.f278f);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        xb.s(parcel, r10);
    }
}
