package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
public final class wr extends b4 {
    public static final Parcelable.Creator<wr> CREATOR = new igd((byte) 27);
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final Boolean n;
    public final Boolean r;

    public wr(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
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
            if (obj instanceof wr) {
                wr wrVar = (wr) obj;
                if (id1.d(this.a, wrVar.a) && id1.d(this.b, wrVar.b) && id1.d(this.c, wrVar.c) && id1.d(this.d, wrVar.d) && id1.d(this.e, wrVar.e) && id1.d(this.f, wrVar.f) && id1.d(this.h, wrVar.h)) {
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
        StringBuilder l = yjb.l("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        l.append(size);
        l.append(", senderAppIdentifier: ");
        l.append(this.d);
        l.append(", senderAppLaunchUrl: ");
        ls6.u(l, valueOf, ", iconUrl: ", this.f, ", type: ");
        l.append(this.h);
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        jte.l(parcel, 6, this.d);
        jte.k(parcel, 7, this.e, i);
        jte.l(parcel, 8, this.f);
        jte.l(parcel, 9, this.h);
        jte.a(parcel, 10, this.n);
        jte.a(parcel, 11, this.r);
        jte.s(parcel, r);
    }
}
