package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f4286a;
    public final String f4287b;
    public final List f4288c;
    public final String d;
    public final Uri f4289e;
    public final String f4290f;
    public final String h;
    public final Boolean f4291n;
    public final Boolean f4292r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4286a = str;
        this.f4287b = str2;
        this.f4288c = arrayList;
        this.d = str3;
        this.f4289e = uri;
        this.f4290f = str4;
        this.h = str5;
        this.f4291n = bool;
        this.f4292r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4286a, dVar.f4286a) && g6.a.d(this.f4287b, dVar.f4287b) && g6.a.d(this.f4288c, dVar.f4288c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4289e, dVar.f4289e) && g6.a.d(this.f4290f, dVar.f4290f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4286a, this.f4287b, this.f4288c, this.d, this.f4289e, this.f4290f});
    }

    public final String toString() {
        int size;
        List list = this.f4288c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4289e);
        StringBuilder x10 = a4.a.x("applicationId: ", this.f4286a, ", name: ", this.f4287b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a4.a.A(x10, valueOf, ", iconUrl: ", this.f4290f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4286a);
        g0.l(parcel, 3, this.f4287b);
        g0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4288c));
        g0.l(parcel, 6, this.d);
        g0.k(parcel, 7, this.f4289e, i10);
        g0.l(parcel, 8, this.f4290f);
        g0.l(parcel, 9, this.h);
        g0.a(parcel, 10, this.f4291n);
        g0.a(parcel, 11, this.f4292r);
        g0.r(parcel, q6);
    }
}
