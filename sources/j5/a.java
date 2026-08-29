package j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import z5.l;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new i4.g(14);
    public final boolean f10869a;
    public final String f10870b;
    public final String f10871c;
    public final boolean d;
    public final String f10872e;
    public final ArrayList f10873f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f10869a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f10870b = str;
        this.f10871c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f10873f = arrayList2;
        this.f10872e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10869a == aVar.f10869a && l.l(this.f10870b, aVar.f10870b) && l.l(this.f10871c, aVar.f10871c) && this.d == aVar.d && l.l(this.f10872e, aVar.f10872e) && l.l(this.f10873f, aVar.f10873f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10869a), this.f10870b, this.f10871c, Boolean.valueOf(this.d), this.f10872e, this.f10873f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f10869a ? 1 : 0);
        o.l(parcel, 2, this.f10870b);
        o.l(parcel, 3, this.f10871c);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        o.l(parcel, 5, this.f10872e);
        o.n(parcel, 6, this.f10873f);
        o.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        o.r(parcel, q6);
    }
}
