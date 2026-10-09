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
    public final String f4336a;
    public final String f4337b;
    public final List f4338c;
    public final String d;
    public final Uri f4339e;
    public final String f4340f;
    public final String h;
    public final Boolean f4341n;
    public final Boolean f4342r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4336a = str;
        this.f4337b = str2;
        this.f4338c = arrayList;
        this.d = str3;
        this.f4339e = uri;
        this.f4340f = str4;
        this.h = str5;
        this.f4341n = bool;
        this.f4342r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4336a, dVar.f4336a) && g6.a.d(this.f4337b, dVar.f4337b) && g6.a.d(this.f4338c, dVar.f4338c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4339e, dVar.f4339e) && g6.a.d(this.f4340f, dVar.f4340f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4336a, this.f4337b, this.f4338c, this.d, this.f4339e, this.f4340f});
    }

    public final String toString() {
        int size;
        List list = this.f4338c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4339e);
        StringBuilder x10 = a1.g.x("applicationId: ", this.f4336a, ", name: ", this.f4337b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a1.g.A(x10, valueOf, ", iconUrl: ", this.f4340f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4336a);
        w7.d0.l(parcel, 3, this.f4337b);
        w7.d0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4338c));
        w7.d0.l(parcel, 6, this.d);
        w7.d0.k(parcel, 7, this.f4339e, i10);
        w7.d0.l(parcel, 8, this.f4340f);
        w7.d0.l(parcel, 9, this.h);
        w7.d0.a(parcel, 10, this.f4341n);
        w7.d0.a(parcel, 11, this.f4342r);
        w7.d0.r(parcel, q6);
    }
}
