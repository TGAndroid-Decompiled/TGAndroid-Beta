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
    public final String f3971a;
    public final String f3972b;
    public final List f3973c;
    public final String d;
    public final Uri e;
    public final String f3974f;
    public final String h;
    public final Boolean f3975n;
    public final Boolean f3976r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f3971a = str;
        this.f3972b = str2;
        this.f3973c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f3974f = str4;
        this.h = str5;
        this.f3975n = bool;
        this.f3976r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f3971a, dVar.f3971a) && g6.a.d(this.f3972b, dVar.f3972b) && g6.a.d(this.f3973c, dVar.f3973c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f3974f, dVar.f3974f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3971a, this.f3972b, this.f3973c, this.d, this.e, this.f3974f});
    }

    public final String toString() {
        int size;
        List list = this.f3973c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f3971a, ", name: ", this.f3972b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f3974f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f3971a);
        w7.f0.l(parcel, 3, this.f3972b);
        w7.f0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f3973c));
        w7.f0.l(parcel, 6, this.d);
        w7.f0.k(parcel, 7, this.e, i10);
        w7.f0.l(parcel, 8, this.f3974f);
        w7.f0.l(parcel, 9, this.h);
        w7.f0.a(parcel, 10, this.f3975n);
        w7.f0.a(parcel, 11, this.f3976r);
        w7.f0.r(parcel, q6);
    }
}
