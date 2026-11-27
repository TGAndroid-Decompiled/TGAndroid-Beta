package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public final class eh0 extends c4 {
    public static final Parcelable.Creator<eh0> CREATOR = new s5d((byte) 19);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean h;

    public eh0(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        xve.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.a = z;
        if (z) {
            xve.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eh0) {
            eh0 eh0Var = (eh0) obj;
            if (this.a == eh0Var.a && vue.a(this.b, eh0Var.b) && vue.a(this.c, eh0Var.c) && this.d == eh0Var.d && vue.a(this.e, eh0Var.e) && vue.a(this.f, eh0Var.f) && this.h == eh0Var.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.l(parcel, 5, this.e);
        bye.n(parcel, 6, this.f);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bye.s(parcel, r);
    }
}
