package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class fhd extends b4 {
    public static final Parcelable.Creator<fhd> CREATOR = new igd((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final kbd e;
    public final String f;
    public final Bundle h;

    public fhd(String str, String str2, String str3, String str4, kbd kbdVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = kbdVar;
        this.f = str5;
        if (bundle != null) {
            this.h = bundle;
        } else {
            bundle = Bundle.EMPTY;
            this.h = bundle;
        }
        ClassLoader classLoader = fhd.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            ug8.z("{ objectSameAs: '", str, "' } ", sb);
        }
        kbd kbdVar = this.e;
        if (kbdVar != null) {
            sb.append("{ metadata: '");
            sb.append(kbdVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f;
        if (str2 != null) {
            ug8.z("{ actionStatus: '", str2, "' } ", sb);
        }
        Bundle bundle = this.h;
        if (!bundle.isEmpty()) {
            sb.append("{ ");
            sb.append(bundle);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.k(parcel, 5, this.e, i);
        jte.l(parcel, 6, this.f);
        jte.b(parcel, 7, this.h);
        jte.s(parcel, r);
    }
}
