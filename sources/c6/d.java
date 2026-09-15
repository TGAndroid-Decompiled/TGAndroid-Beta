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
    public final String f3965a;
    public final String f3966b;
    public final List f3967c;
    public final String d;
    public final Uri e;
    public final String f3968f;
    public final String h;
    public final Boolean f3969n;
    public final Boolean f3970r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f3965a = str;
        this.f3966b = str2;
        this.f3967c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f3968f = str4;
        this.h = str5;
        this.f3969n = bool;
        this.f3970r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f3965a, dVar.f3965a) && g6.a.d(this.f3966b, dVar.f3966b) && g6.a.d(this.f3967c, dVar.f3967c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f3968f, dVar.f3968f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3965a, this.f3966b, this.f3967c, this.d, this.e, this.f3968f});
    }

    public final String toString() {
        int size;
        List list = this.f3967c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f3965a, ", name: ", this.f3966b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f3968f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f3965a);
        w7.e0.l(parcel, 3, this.f3966b);
        w7.e0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f3967c));
        w7.e0.l(parcel, 6, this.d);
        w7.e0.k(parcel, 7, this.e, i10);
        w7.e0.l(parcel, 8, this.f3968f);
        w7.e0.l(parcel, 9, this.h);
        w7.e0.a(parcel, 10, this.f3969n);
        w7.e0.a(parcel, 11, this.f3970r);
        w7.e0.r(parcel, q6);
    }
}
