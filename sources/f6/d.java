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
    public final String f11365a;
    public final String f11366b;
    public final List f11367c;
    public final String d;
    public final Uri f11368e;
    public final String f11369f;
    public final String h;
    public final Boolean f11370n;
    public final Boolean f11371r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11365a = str;
        this.f11366b = str2;
        this.f11367c = arrayList;
        this.d = str3;
        this.f11368e = uri;
        this.f11369f = str4;
        this.h = str5;
        this.f11370n = bool;
        this.f11371r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11365a, dVar.f11365a) && j6.a.d(this.f11366b, dVar.f11366b) && j6.a.d(this.f11367c, dVar.f11367c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11368e, dVar.f11368e) && j6.a.d(this.f11369f, dVar.f11369f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11365a, this.f11366b, this.f11367c, this.d, this.f11368e, this.f11369f});
    }

    public final String toString() {
        int size;
        List list = this.f11367c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11368e);
        StringBuilder n10 = e2.n("applicationId: ", this.f11365a, ", name: ", this.f11366b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        e2.r(n10, valueOf, ", iconUrl: ", this.f11369f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11365a);
        cc.l(parcel, 3, this.f11366b);
        cc.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11367c));
        cc.l(parcel, 6, this.d);
        cc.k(parcel, 7, this.f11368e, i7);
        cc.l(parcel, 8, this.f11369f);
        cc.l(parcel, 9, this.h);
        cc.a(parcel, 10, this.f11370n);
        cc.a(parcel, 11, this.f11371r);
        cc.s(parcel, r10);
    }
}
