package m5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f17379a;
    public final String f17380b;
    public final List f17381c;
    public final String d;
    public final Uri f17382e;
    public final String f17383f;
    public final String h;
    public final Boolean f17384n;
    public final Boolean f17385r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f17379a = str;
        this.f17380b = str2;
        this.f17381c = arrayList;
        this.d = str3;
        this.f17382e = uri;
        this.f17383f = str4;
        this.h = str5;
        this.f17384n = bool;
        this.f17385r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (q5.a.d(this.f17379a, dVar.f17379a) && q5.a.d(this.f17380b, dVar.f17380b) && q5.a.d(this.f17381c, dVar.f17381c) && q5.a.d(this.d, dVar.d) && q5.a.d(this.f17382e, dVar.f17382e) && q5.a.d(this.f17383f, dVar.f17383f) && q5.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17379a, this.f17380b, this.f17381c, this.d, this.f17382e, this.f17383f});
    }

    public final String toString() {
        int size;
        List list = this.f17381c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f17382e);
        StringBuilder q10 = r0.q("applicationId: ", this.f17379a, ", name: ", this.f17380b, ", namespaces.count: ");
        q10.append(size);
        q10.append(", senderAppIdentifier: ");
        q10.append(this.d);
        q10.append(", senderAppLaunchUrl: ");
        r0.A(q10, valueOf, ", iconUrl: ", this.f17383f, ", type: ");
        q10.append(this.h);
        return q10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17379a);
        p8.l(parcel, 3, this.f17380b);
        p8.n(parcel, 5, DesugarCollections.unmodifiableList(this.f17381c));
        p8.l(parcel, 6, this.d);
        p8.k(parcel, 7, this.f17382e, i9);
        p8.l(parcel, 8, this.f17383f);
        p8.l(parcel, 9, this.h);
        p8.a(parcel, 10, this.f17384n);
        p8.a(parcel, 11, this.f17385r);
        p8.r(parcel, q10);
    }
}
