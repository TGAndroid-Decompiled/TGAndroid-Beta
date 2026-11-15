package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f11053a;
    public final String f11054b;
    public final List f11055c;
    public final String d;
    public final Uri f11056e;
    public final String f11057f;
    public final String h;
    public final Boolean f11058n;
    public final Boolean f11059r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11053a = str;
        this.f11054b = str2;
        this.f11055c = arrayList;
        this.d = str3;
        this.f11056e = uri;
        this.f11057f = str4;
        this.h = str5;
        this.f11058n = bool;
        this.f11059r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11053a, dVar.f11053a) && j6.a.d(this.f11054b, dVar.f11054b) && j6.a.d(this.f11055c, dVar.f11055c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11056e, dVar.f11056e) && j6.a.d(this.f11057f, dVar.f11057f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11053a, this.f11054b, this.f11055c, this.d, this.f11056e, this.f11057f});
    }

    public final String toString() {
        int size;
        List list = this.f11055c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11056e);
        StringBuilder n10 = e2.n("applicationId: ", this.f11053a, ", name: ", this.f11054b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f11057f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f11053a);
        yb.l(parcel, 3, this.f11054b);
        yb.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11055c));
        yb.l(parcel, 6, this.d);
        yb.k(parcel, 7, this.f11056e, i7);
        yb.l(parcel, 8, this.f11057f);
        yb.l(parcel, 9, this.h);
        yb.a(parcel, 10, this.f11058n);
        yb.a(parcel, 11, this.f11059r);
        yb.s(parcel, r10);
    }
}
