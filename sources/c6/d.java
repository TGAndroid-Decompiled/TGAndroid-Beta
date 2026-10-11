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
    public final String f4335a;
    public final String f4336b;
    public final List f4337c;
    public final String d;
    public final Uri f4338e;
    public final String f4339f;
    public final String h;
    public final Boolean f4340n;
    public final Boolean f4341r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4335a = str;
        this.f4336b = str2;
        this.f4337c = arrayList;
        this.d = str3;
        this.f4338e = uri;
        this.f4339f = str4;
        this.h = str5;
        this.f4340n = bool;
        this.f4341r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4335a, dVar.f4335a) && g6.a.d(this.f4336b, dVar.f4336b) && g6.a.d(this.f4337c, dVar.f4337c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4338e, dVar.f4338e) && g6.a.d(this.f4339f, dVar.f4339f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4335a, this.f4336b, this.f4337c, this.d, this.f4338e, this.f4339f});
    }

    public final String toString() {
        int size;
        List list = this.f4337c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4338e);
        StringBuilder x10 = a1.g.x("applicationId: ", this.f4335a, ", name: ", this.f4336b, ", namespaces.count: ");
        x10.append(size);
        x10.append(", senderAppIdentifier: ");
        x10.append(this.d);
        x10.append(", senderAppLaunchUrl: ");
        a1.g.A(x10, valueOf, ", iconUrl: ", this.f4339f, ", type: ");
        x10.append(this.h);
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4335a);
        w7.d0.l(parcel, 3, this.f4336b);
        w7.d0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4337c));
        w7.d0.l(parcel, 6, this.d);
        w7.d0.k(parcel, 7, this.f4338e, i10);
        w7.d0.l(parcel, 8, this.f4339f);
        w7.d0.l(parcel, 9, this.h);
        w7.d0.a(parcel, 10, this.f4340n);
        w7.d0.a(parcel, 11, this.f4341r);
        w7.d0.r(parcel, q6);
    }
}
