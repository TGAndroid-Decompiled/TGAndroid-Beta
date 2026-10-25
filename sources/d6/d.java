package d6;

import a8.df;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c3.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f8054a;
    public final String f8055b;
    public final List f8056c;
    public final String d;
    public final Uri e;
    public final String f8057f;
    public final String h;
    public final Boolean f8058n;
    public final Boolean f8059r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f8054a = str;
        this.f8055b = str2;
        this.f8056c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f8057f = str4;
        this.h = str5;
        this.f8058n = bool;
        this.f8059r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (h6.a.d(this.f8054a, dVar.f8054a) && h6.a.d(this.f8055b, dVar.f8055b) && h6.a.d(this.f8056c, dVar.f8056c) && h6.a.d(this.d, dVar.d) && h6.a.d(this.e, dVar.e) && h6.a.d(this.f8057f, dVar.f8057f) && h6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8054a, this.f8055b, this.f8056c, this.d, this.e, this.f8057f});
    }

    public final String toString() {
        int size;
        List list = this.f8056c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w10 = a1.g.w("applicationId: ", this.f8054a, ", name: ", this.f8055b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        h0.r(w10, valueOf, ", iconUrl: ", this.f8057f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8054a);
        df.l(parcel, 3, this.f8055b);
        df.n(parcel, 5, DesugarCollections.unmodifiableList(this.f8056c));
        df.l(parcel, 6, this.d);
        df.k(parcel, 7, this.e, i10);
        df.l(parcel, 8, this.f8057f);
        df.l(parcel, 9, this.h);
        df.a(parcel, 10, this.f8058n);
        df.a(parcel, 11, this.f8059r);
        df.r(parcel, q5);
    }
}
