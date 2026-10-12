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
    public final String f4455a;
    public final String f4456b;
    public final List f4457c;
    public final String d;
    public final Uri e;
    public final String f4458f;
    public final String h;
    public final Boolean f4459n;
    public final Boolean f4460r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4455a = str;
        this.f4456b = str2;
        this.f4457c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f4458f = str4;
        this.h = str5;
        this.f4459n = bool;
        this.f4460r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4455a, dVar.f4455a) && g6.a.d(this.f4456b, dVar.f4456b) && g6.a.d(this.f4457c, dVar.f4457c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f4458f, dVar.f4458f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4455a, this.f4456b, this.f4457c, this.d, this.e, this.f4458f});
    }

    public final String toString() {
        int size;
        List list = this.f4457c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w9 = a1.g.w("applicationId: ", this.f4455a, ", name: ", this.f4456b, ", namespaces.count: ");
        w9.append(size);
        w9.append(", senderAppIdentifier: ");
        w9.append(this.d);
        w9.append(", senderAppLaunchUrl: ");
        a1.g.A(w9, valueOf, ", iconUrl: ", this.f4458f, ", type: ");
        w9.append(this.h);
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4455a);
        g0.l(parcel, 3, this.f4456b);
        g0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4457c));
        g0.l(parcel, 6, this.d);
        g0.k(parcel, 7, this.e, i10);
        g0.l(parcel, 8, this.f4458f);
        g0.l(parcel, 9, this.h);
        g0.a(parcel, 10, this.f4459n);
        g0.a(parcel, 11, this.f4460r);
        g0.r(parcel, q6);
    }
}
