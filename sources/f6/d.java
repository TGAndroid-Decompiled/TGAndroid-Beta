package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f11364a;
    public final String f11365b;
    public final List f11366c;
    public final String d;
    public final Uri f11367e;
    public final String f11368f;
    public final String h;
    public final Boolean f11369n;
    public final Boolean f11370r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11364a = str;
        this.f11365b = str2;
        this.f11366c = arrayList;
        this.d = str3;
        this.f11367e = uri;
        this.f11368f = str4;
        this.h = str5;
        this.f11369n = bool;
        this.f11370r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11364a, dVar.f11364a) && j6.a.d(this.f11365b, dVar.f11365b) && j6.a.d(this.f11366c, dVar.f11366c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11367e, dVar.f11367e) && j6.a.d(this.f11368f, dVar.f11368f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11364a, this.f11365b, this.f11366c, this.d, this.f11367e, this.f11368f});
    }

    public final String toString() {
        int size;
        List list = this.f11366c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11367e);
        StringBuilder n10 = e2.n("applicationId: ", this.f11364a, ", name: ", this.f11365b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f11368f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11364a);
        cc.l(parcel, 3, this.f11365b);
        cc.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11366c));
        cc.l(parcel, 6, this.d);
        cc.k(parcel, 7, this.f11367e, i7);
        cc.l(parcel, 8, this.f11368f);
        cc.l(parcel, 9, this.h);
        cc.a(parcel, 10, this.f11369n);
        cc.a(parcel, 11, this.f11370r);
        cc.s(parcel, r10);
    }
}
