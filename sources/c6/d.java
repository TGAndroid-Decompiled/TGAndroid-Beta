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
    public final String f4506a;
    public final String f4507b;
    public final List f4508c;
    public final String d;
    public final Uri f4509e;
    public final String f4510f;
    public final String h;
    public final Boolean f4511n;
    public final Boolean f4512r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f4506a = str;
        this.f4507b = str2;
        this.f4508c = arrayList;
        this.d = str3;
        this.f4509e = uri;
        this.f4510f = str4;
        this.h = str5;
        this.f4511n = bool;
        this.f4512r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g6.a.d(this.f4506a, dVar.f4506a) && g6.a.d(this.f4507b, dVar.f4507b) && g6.a.d(this.f4508c, dVar.f4508c) && g6.a.d(this.d, dVar.d) && g6.a.d(this.f4509e, dVar.f4509e) && g6.a.d(this.f4510f, dVar.f4510f) && g6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4506a, this.f4507b, this.f4508c, this.d, this.f4509e, this.f4510f});
    }

    public final String toString() {
        int size;
        List list = this.f4508c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f4509e);
        StringBuilder w10 = a4.a.w("applicationId: ", this.f4506a, ", name: ", this.f4507b, ", namespaces.count: ");
        w10.append(size);
        w10.append(", senderAppIdentifier: ");
        w10.append(this.d);
        w10.append(", senderAppLaunchUrl: ");
        a4.a.z(w10, valueOf, ", iconUrl: ", this.f4510f, ", type: ");
        w10.append(this.h);
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4506a);
        w7.e0.l(parcel, 3, this.f4507b);
        w7.e0.n(parcel, 5, DesugarCollections.unmodifiableList(this.f4508c));
        w7.e0.l(parcel, 6, this.d);
        w7.e0.k(parcel, 7, this.f4509e, i10);
        w7.e0.l(parcel, 8, this.f4510f);
        w7.e0.l(parcel, 9, this.h);
        w7.e0.a(parcel, 10, this.f4511n);
        w7.e0.a(parcel, 11, this.f4512r);
        w7.e0.r(parcel, q6);
    }
}
