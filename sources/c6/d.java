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
    public final String f3962a;
    public final String f3963b;
    public final List f3964c;
    public final String d;
    public final Uri e;
    public final String f3965f;
    public final String h;
    public final Boolean f3966n;
    public final Boolean f3967r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f3962a = str;
        this.f3963b = str2;
        this.f3964c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f3965f = str4;
        this.h = str5;
        this.f3966n = bool;
        this.f3967r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f3962a, dVar.f3962a) && g6.a.d(this.f3963b, dVar.f3963b) && g6.a.d(this.f3964c, dVar.f3964c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f3965f, dVar.f3965f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3962a, this.f3963b, this.f3964c, this.d, this.e, this.f3965f});
    }

    public final String toString() {
        int size;
        List list = this.f3964c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder x10 = a4.a.x("applicationId: ", this.f3962a, ", name: ", this.f3963b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a4.a.A(x10, valueOf, ", iconUrl: ", this.f3965f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f3962a);
        w7.f0.l(parcel, 3, this.f3963b);
        w7.f0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f3964c));
        w7.f0.l(parcel, 6, this.d);
        w7.f0.k(parcel, 7, this.e, i10);
        w7.f0.l(parcel, 8, this.f3965f);
        w7.f0.l(parcel, 9, this.h);
        w7.f0.a(parcel, 10, this.f3966n);
        w7.f0.a(parcel, 11, this.f3967r);
        w7.f0.r(parcel, q6);
    }
}
