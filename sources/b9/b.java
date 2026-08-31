package b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(29);
    public final String f1899a;
    public final String f1900b;
    public final String f1901c;
    public final String d;
    public final a f1902e;
    public final String f1903f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f1899a = str;
        this.f1900b = str2;
        this.f1901c = str3;
        this.d = str4;
        this.f1902e = aVar;
        this.f1903f = str5;
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
        sb.append(this.f1899a);
        sb.append("' } { objectName: '");
        sb.append(this.f1900b);
        sb.append("' } { objectUrl: '");
        sb.append(this.f1901c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        a aVar = this.f1902e;
        if (aVar != null) {
            sb.append("{ metadata: '");
            sb.append(aVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f1903f;
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f1899a);
        g5.l(parcel, 2, this.f1900b);
        g5.l(parcel, 3, this.f1901c);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.f1902e, i10);
        g5.l(parcel, 6, this.f1903f);
        g5.b(parcel, 7, this.h);
        g5.r(parcel, q10);
    }
}
