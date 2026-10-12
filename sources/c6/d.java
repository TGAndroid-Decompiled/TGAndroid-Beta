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
    public final String f4334a;
    public final String f4335b;
    public final List f4336c;
    public final String d;
    public final Uri f4337e;
    public final String f4338f;
    public final String h;
    public final Boolean f4339n;
    public final Boolean f4340r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4334a = str;
        this.f4335b = str2;
        this.f4336c = arrayList;
        this.d = str3;
        this.f4337e = uri;
        this.f4338f = str4;
        this.h = str5;
        this.f4339n = bool;
        this.f4340r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4334a, dVar.f4334a) && g6.a.d(this.f4335b, dVar.f4335b) && g6.a.d(this.f4336c, dVar.f4336c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4337e, dVar.f4337e) && g6.a.d(this.f4338f, dVar.f4338f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4334a, this.f4335b, this.f4336c, this.d, this.f4337e, this.f4338f});
    }

    public final String toString() {
        int size;
        List list = this.f4336c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4337e);
        StringBuilder x10 = a1.g.x("applicationId: ", this.f4334a, ", name: ", this.f4335b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a1.g.A(x10, valueOf, ", iconUrl: ", this.f4338f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f4334a);
        w7.c0.l(parcel, 3, this.f4335b);
        w7.c0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4336c));
        w7.c0.l(parcel, 6, this.d);
        w7.c0.k(parcel, 7, this.f4337e, i10);
        w7.c0.l(parcel, 8, this.f4338f);
        w7.c0.l(parcel, 9, this.h);
        w7.c0.a(parcel, 10, this.f4339n);
        w7.c0.a(parcel, 11, this.f4340r);
        w7.c0.r(parcel, q6);
    }
}
