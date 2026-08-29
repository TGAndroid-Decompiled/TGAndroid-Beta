package o5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.th;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f19241a;
    public final String f19242b;
    public final List f19243c;
    public final String d;
    public final Uri f19244e;
    public final String f19245f;
    public final String h;
    public final Boolean f19246n;
    public final Boolean f19247r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f19241a = str;
        this.f19242b = str2;
        this.f19243c = arrayList;
        this.d = str3;
        this.f19244e = uri;
        this.f19245f = str4;
        this.h = str5;
        this.f19246n = bool;
        this.f19247r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (s5.a.d(this.f19241a, dVar.f19241a) && s5.a.d(this.f19242b, dVar.f19242b) && s5.a.d(this.f19243c, dVar.f19243c) && s5.a.d(this.d, dVar.d) && s5.a.d(this.f19244e, dVar.f19244e) && s5.a.d(this.f19245f, dVar.f19245f) && s5.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19241a, this.f19242b, this.f19243c, this.d, this.f19244e, this.f19245f});
    }

    public final String toString() {
        int size;
        List list = this.f19243c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f19244e);
        StringBuilder k9 = th.k("applicationId: ", this.f19241a, ", name: ", this.f19242b, ", namespaces.count: ");
        k9.append(size);
        k9.append(", senderAppIdentifier: ");
        k9.append(this.d);
        k9.append(", senderAppLaunchUrl: ");
        th.w(k9, valueOf, ", iconUrl: ", this.f19245f, ", type: ");
        k9.append(this.h);
        return k9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19241a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19242b);
        com.google.android.gms.internal.cast.o.n(parcel, 5, DesugarCollections.unmodifiableList(this.f19243c));
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.d);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f19244e, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.f19245f);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.h);
        com.google.android.gms.internal.cast.o.a(parcel, 10, this.f19246n);
        com.google.android.gms.internal.cast.o.a(parcel, 11, this.f19247r);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
