package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y5.l;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new h(1);

    public final boolean f8262a;

    public final String f8263b;

    public final String f8264c;
    public final boolean d;

    public final String f8265e;

    public final ArrayList f8266f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f8262a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f8263b = str;
        this.f8264c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f8266f = arrayList2;
        this.f8265e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8262a == aVar.f8262a && l.l(this.f8263b, aVar.f8263b) && l.l(this.f8264c, aVar.f8264c) && this.d == aVar.d && l.l(this.f8265e, aVar.f8265e) && l.l(this.f8266f, aVar.f8266f) && this.h == aVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8262a), this.f8263b, this.f8264c, Boolean.valueOf(this.d), this.f8265e, this.f8266f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f8262a ? 1 : 0);
        r8.l(parcel, 2, this.f8263b);
        r8.l(parcel, 3, this.f8264c);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.l(parcel, 5, this.f8265e);
        r8.n(parcel, 6, this.f8266f);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
