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
    public final String f4479a;
    public final String f4480b;
    public final List f4481c;
    public final String d;
    public final Uri f4482e;
    public final String f4483f;
    public final String h;
    public final Boolean f4484n;
    public final Boolean f4485r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4479a = str;
        this.f4480b = str2;
        this.f4481c = arrayList;
        this.d = str3;
        this.f4482e = uri;
        this.f4483f = str4;
        this.h = str5;
        this.f4484n = bool;
        this.f4485r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4479a, dVar.f4479a) && g6.a.d(this.f4480b, dVar.f4480b) && g6.a.d(this.f4481c, dVar.f4481c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4482e, dVar.f4482e) && g6.a.d(this.f4483f, dVar.f4483f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4479a, this.f4480b, this.f4481c, this.d, this.f4482e, this.f4483f});
    }

    public final String toString() {
        int size;
        List list = this.f4481c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4482e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f4479a, ", name: ", this.f4480b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f4483f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4479a);
        w7.e0.l(parcel, 3, this.f4480b);
        w7.e0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4481c));
        w7.e0.l(parcel, 6, this.d);
        w7.e0.k(parcel, 7, this.f4482e, i10);
        w7.e0.l(parcel, 8, this.f4483f);
        w7.e0.l(parcel, 9, this.h);
        w7.e0.a(parcel, 10, this.f4484n);
        w7.e0.a(parcel, 11, this.f4485r);
        w7.e0.r(parcel, q6);
    }
}
