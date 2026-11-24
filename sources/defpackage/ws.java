package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
public final class ws extends b4 {
    public static final Parcelable.Creator<ws> CREATOR = new jid((byte) 27);
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final Boolean n;
    public final Boolean r;

    public ws(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.h = str5;
        this.n = bool;
        this.r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ws) {
                ws wsVar = (ws) obj;
                if (qe1.d(this.a, wsVar.a) && qe1.d(this.b, wsVar.b) && qe1.d(this.c, wsVar.c) && qe1.d(this.d, wsVar.d) && qe1.d(this.e, wsVar.e) && qe1.d(this.f, wsVar.f) && qe1.d(this.h, wsVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder m = mlb.m("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        m.append(size);
        m.append(", senderAppIdentifier: ");
        m.append(this.d);
        m.append(", senderAppLaunchUrl: ");
        kt6.v(m, valueOf, ", iconUrl: ", this.f, ", type: ");
        m.append(this.h);
        return m.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        mve.l(parcel, 6, this.d);
        mve.k(parcel, 7, this.e, i);
        mve.l(parcel, 8, this.f);
        mve.l(parcel, 9, this.h);
        mve.a(parcel, 10, this.n);
        mve.a(parcel, 11, this.r);
        mve.s(parcel, r);
    }
}
