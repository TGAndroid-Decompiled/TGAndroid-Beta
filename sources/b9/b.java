package b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(29);
    public final String f1752a;
    public final String f1753b;
    public final String f1754c;
    public final String d;
    public final a e;
    public final String f1755f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f1752a = str;
        this.f1753b = str2;
        this.f1754c = str3;
        this.d = str4;
        this.e = aVar;
        this.f1755f = str5;
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = Bundle.EMPTY;
        }
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader != null) {
            this.h.setClassLoader(classLoader);
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.f1752a);
        sb.append("' } { objectName: '");
        sb.append(this.f1753b);
        sb.append("' } { objectUrl: '");
        sb.append(this.f1754c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        a aVar = this.e;
        if (aVar != null) {
            sb.append("{ metadata: '");
            sb.append(aVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f1755f;
        if (str2 != null) {
            sb.append("{ actionStatus: '");
            sb.append(str2);
            sb.append("' } ");
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f1752a);
        f5.l(parcel, 2, this.f1753b);
        f5.l(parcel, 3, this.f1754c);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.l(parcel, 6, this.f1755f);
        f5.b(parcel, 7, this.h);
        f5.r(parcel, q10);
    }
}
