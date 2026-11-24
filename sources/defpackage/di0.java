package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public final class di0 extends b4 {
    public static final Parcelable.Creator<di0> CREATOR = new d3d((byte) 19);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean h;

    public di0(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        ite.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.a = z;
        if (z) {
            ite.i(str, "serverClientId must be provided if Google ID tokens are requested");
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
        if (obj instanceof di0) {
            di0 di0Var = (di0) obj;
            if (this.a == di0Var.a && fse.a(this.b, di0Var.b) && fse.a(this.c, di0Var.c) && this.d == di0Var.d && fse.a(this.e, di0Var.e) && fse.a(this.f, di0Var.f) && this.h == di0Var.h) {
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
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.l(parcel, 5, this.e);
        mve.n(parcel, 6, this.f);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        mve.s(parcel, r);
    }
}
