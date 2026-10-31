package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c3.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f3857a;
    public final String f3858b;
    public final List f3859c;
    public final String d;
    public final Uri e;
    public final String f3860f;
    public final String h;
    public final Boolean f3861n;
    public final Boolean f3862r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f3857a = str;
        this.f3858b = str2;
        this.f3859c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f3860f = str4;
        this.h = str5;
        this.f3861n = bool;
        this.f3862r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f3857a, dVar.f3857a) && g6.a.d(this.f3858b, dVar.f3858b) && g6.a.d(this.f3859c, dVar.f3859c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f3860f, dVar.f3860f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3857a, this.f3858b, this.f3859c, this.d, this.e, this.f3860f});
    }

    public final String toString() {
        int size;
        List list = this.f3859c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder v = a1.g.v("applicationId: ", this.f3857a, ", name: ", this.f3858b, ", namespaces.count: ");
        v.append(size);
        v.append(", senderAppIdentifier: ");
        v.append(this.d);
        v.append(", senderAppLaunchUrl: ");
        i0.r(v, valueOf, ", iconUrl: ", this.f3860f, ", type: ");
        v.append(this.h);
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f3857a);
        h0.l(parcel, 3, this.f3858b);
        h0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f3859c));
        h0.l(parcel, 6, this.d);
        h0.k(parcel, 7, this.e, i10);
        h0.l(parcel, 8, this.f3860f);
        h0.l(parcel, 9, this.h);
        h0.a(parcel, 10, this.f3861n);
        h0.a(parcel, 11, this.f3862r);
        h0.r(parcel, q6);
    }
}
