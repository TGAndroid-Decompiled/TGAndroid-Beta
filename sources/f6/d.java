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
    public final String f11402a;
    public final String f11403b;
    public final List f11404c;
    public final String d;
    public final Uri f11405e;
    public final String f11406f;
    public final String h;
    public final Boolean f11407n;
    public final Boolean f11408r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11402a = str;
        this.f11403b = str2;
        this.f11404c = arrayList;
        this.d = str3;
        this.f11405e = uri;
        this.f11406f = str4;
        this.h = str5;
        this.f11407n = bool;
        this.f11408r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11402a, dVar.f11402a) && j6.a.d(this.f11403b, dVar.f11403b) && j6.a.d(this.f11404c, dVar.f11404c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11405e, dVar.f11405e) && j6.a.d(this.f11406f, dVar.f11406f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11402a, this.f11403b, this.f11404c, this.d, this.f11405e, this.f11406f});
    }

    public final String toString() {
        int size;
        List list = this.f11404c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11405e);
        StringBuilder n10 = e2.n("applicationId: ", this.f11402a, ", name: ", this.f11403b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f11406f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11402a);
        bc.l(parcel, 3, this.f11403b);
        bc.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11404c));
        bc.l(parcel, 6, this.d);
        bc.k(parcel, 7, this.f11405e, i7);
        bc.l(parcel, 8, this.f11406f);
        bc.l(parcel, 9, this.h);
        bc.a(parcel, 10, this.f11407n);
        bc.a(parcel, 11, this.f11408r);
        bc.s(parcel, r10);
    }
}
