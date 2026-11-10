package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f11244a;
    public final String f11245b;
    public final List f11246c;
    public final String d;
    public final Uri f11247e;
    public final String f11248f;
    public final String h;
    public final Boolean f11249n;
    public final Boolean f11250r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11244a = str;
        this.f11245b = str2;
        this.f11246c = arrayList;
        this.d = str3;
        this.f11247e = uri;
        this.f11248f = str4;
        this.h = str5;
        this.f11249n = bool;
        this.f11250r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11244a, dVar.f11244a) && j6.a.d(this.f11245b, dVar.f11245b) && j6.a.d(this.f11246c, dVar.f11246c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11247e, dVar.f11247e) && j6.a.d(this.f11248f, dVar.f11248f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11244a, this.f11245b, this.f11246c, this.d, this.f11247e, this.f11248f});
    }

    public final String toString() {
        int size;
        List list = this.f11246c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11247e);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("applicationId: ", this.f11244a, ", name: ", this.f11245b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        com.google.android.recaptcha.internal.a.s(n10, valueOf, ", iconUrl: ", this.f11248f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11244a);
        xb.l(parcel, 3, this.f11245b);
        xb.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11246c));
        xb.l(parcel, 6, this.d);
        xb.k(parcel, 7, this.f11247e, i7);
        xb.l(parcel, 8, this.f11248f);
        xb.l(parcel, 9, this.h);
        xb.a(parcel, 10, this.f11249n);
        xb.a(parcel, 11, this.f11250r);
        xb.s(parcel, r10);
    }
}
