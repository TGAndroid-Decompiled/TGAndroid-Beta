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
    public final String f4828a;
    public final String f4829b;
    public final List f4830c;
    public final String d;
    public final Uri e;
    public final String f4831f;
    public final String h;
    public final Boolean f4832n;
    public final Boolean f4833r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4828a = str;
        this.f4829b = str2;
        this.f4830c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f4831f = str4;
        this.h = str5;
        this.f4832n = bool;
        this.f4833r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4828a, dVar.f4828a) && g6.a.d(this.f4829b, dVar.f4829b) && g6.a.d(this.f4830c, dVar.f4830c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f4831f, dVar.f4831f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4828a, this.f4829b, this.f4830c, this.d, this.e, this.f4831f});
    }

    public final String toString() {
        int size;
        List list = this.f4830c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w9 = a1.g.w("applicationId: ", this.f4828a, ", name: ", this.f4829b, ", namespaces.count: ");
        w9.append(size);
        w9.append(", senderAppIdentifier: ");
        w9.append(this.d);
        w9.append(", senderAppLaunchUrl: ");
        a1.g.A(w9, valueOf, ", iconUrl: ", this.f4831f, ", type: ");
        w9.append(this.h);
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4828a);
        w7.f0.l(parcel, 3, this.f4829b);
        w7.f0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4830c));
        w7.f0.l(parcel, 6, this.d);
        w7.f0.k(parcel, 7, this.e, i10);
        w7.f0.l(parcel, 8, this.f4831f);
        w7.f0.l(parcel, 9, this.h);
        w7.f0.a(parcel, 10, this.f4832n);
        w7.f0.a(parcel, 11, this.f4833r);
        w7.f0.r(parcel, q6);
    }
}
