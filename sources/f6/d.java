package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f11373a;
    public final String f11374b;
    public final List f11375c;
    public final String d;
    public final Uri f11376e;
    public final String f11377f;
    public final String h;
    public final Boolean f11378n;
    public final Boolean f11379r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11373a = str;
        this.f11374b = str2;
        this.f11375c = arrayList;
        this.d = str3;
        this.f11376e = uri;
        this.f11377f = str4;
        this.h = str5;
        this.f11378n = bool;
        this.f11379r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11373a, dVar.f11373a) && j6.a.d(this.f11374b, dVar.f11374b) && j6.a.d(this.f11375c, dVar.f11375c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11376e, dVar.f11376e) && j6.a.d(this.f11377f, dVar.f11377f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11373a, this.f11374b, this.f11375c, this.d, this.f11376e, this.f11377f});
    }

    public final String toString() {
        int size;
        List list = this.f11375c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11376e);
        StringBuilder n10 = e2.n("applicationId: ", this.f11373a, ", name: ", this.f11374b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f11377f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11373a);
        bc.l(parcel, 3, this.f11374b);
        bc.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11375c));
        bc.l(parcel, 6, this.d);
        bc.k(parcel, 7, this.f11376e, i7);
        bc.l(parcel, 8, this.f11377f);
        bc.l(parcel, 9, this.h);
        bc.a(parcel, 10, this.f11378n);
        bc.a(parcel, 11, this.f11379r);
        bc.s(parcel, r10);
    }
}
