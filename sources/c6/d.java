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
    public final String f4384a;
    public final String f4385b;
    public final List f4386c;
    public final String d;
    public final Uri e;
    public final String f4387f;
    public final String h;
    public final Boolean f4388n;
    public final Boolean f4389r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4384a = str;
        this.f4385b = str2;
        this.f4386c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f4387f = str4;
        this.h = str5;
        this.f4388n = bool;
        this.f4389r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4384a, dVar.f4384a) && g6.a.d(this.f4385b, dVar.f4385b) && g6.a.d(this.f4386c, dVar.f4386c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.e, dVar.e) && g6.a.d(this.f4387f, dVar.f4387f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4384a, this.f4385b, this.f4386c, this.d, this.e, this.f4387f});
    }

    public final String toString() {
        int size;
        List list = this.f4386c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f4384a, ", name: ", this.f4385b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f4387f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4384a);
        w7.e0.l(parcel, 3, this.f4385b);
        w7.e0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4386c));
        w7.e0.l(parcel, 6, this.d);
        w7.e0.k(parcel, 7, this.e, i10);
        w7.e0.l(parcel, 8, this.f4387f);
        w7.e0.l(parcel, 9, this.h);
        w7.e0.a(parcel, 10, this.f4388n);
        w7.e0.a(parcel, 11, this.f4389r);
        w7.e0.r(parcel, q6);
    }
}
