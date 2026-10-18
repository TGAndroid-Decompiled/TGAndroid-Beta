package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f4829a;
    public final String f4830b;
    public final List f4831c;
    public final String d;
    public final Uri e;
    public final String f4832f;
    public final String h;
    public final Boolean f4833n;
    public final Boolean f4834r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4829a = str;
        this.f4830b = str2;
        this.f4831c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f4832f = str4;
        this.h = str5;
        this.f4833n = bool;
        this.f4834r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4829a, dVar.f4829a) && g6.a.d(this.f4830b, dVar.f4830b) && g6.a.d(this.f4831c, dVar.f4831c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f4832f, dVar.f4832f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4829a, this.f4830b, this.f4831c, this.d, this.e, this.f4832f});
    }

    public final String toString() {
        int size;
        List list = this.f4831c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w9 = a1.g.w("applicationId: ", this.f4829a, ", name: ", this.f4830b, ", namespaces.count: ");
        w9.append(size);
        w9.append(", senderAppIdentifier: ");
        w9.append(this.d);
        w9.append(", senderAppLaunchUrl: ");
        a1.g.A(w9, valueOf, ", iconUrl: ", this.f4832f, ", type: ");
        w9.append(this.h);
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4829a);
        w7.f0.l(parcel, 3, this.f4830b);
        w7.f0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4831c));
        w7.f0.l(parcel, 6, this.d);
        w7.f0.k(parcel, 7, this.e, i10);
        w7.f0.l(parcel, 8, this.f4832f);
        w7.f0.l(parcel, 9, this.h);
        w7.f0.a(parcel, 10, this.f4833n);
        w7.f0.a(parcel, 11, this.f4834r);
        w7.f0.r(parcel, q6);
    }
}
