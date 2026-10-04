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
    public final String f4285a;
    public final String f4286b;
    public final List f4287c;
    public final String d;
    public final Uri f4288e;
    public final String f4289f;
    public final String h;
    public final Boolean f4290n;
    public final Boolean f4291r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4285a = str;
        this.f4286b = str2;
        this.f4287c = arrayList;
        this.d = str3;
        this.f4288e = uri;
        this.f4289f = str4;
        this.h = str5;
        this.f4290n = bool;
        this.f4291r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4285a, dVar.f4285a) && g6.a.d(this.f4286b, dVar.f4286b) && g6.a.d(this.f4287c, dVar.f4287c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4288e, dVar.f4288e) && g6.a.d(this.f4289f, dVar.f4289f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4285a, this.f4286b, this.f4287c, this.d, this.f4288e, this.f4289f});
    }

    public final String toString() {
        int size;
        List list = this.f4287c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4288e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f4285a, ", name: ", this.f4286b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f4289f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4285a);
        g0.l(parcel, 3, this.f4286b);
        g0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4287c));
        g0.l(parcel, 6, this.d);
        g0.k(parcel, 7, this.f4288e, i10);
        g0.l(parcel, 8, this.f4289f);
        g0.l(parcel, 9, this.h);
        g0.a(parcel, 10, this.f4290n);
        g0.a(parcel, 11, this.f4291r);
        g0.r(parcel, q6);
    }
}
