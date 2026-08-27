package m5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w(17);

    public final String f17756a;

    public final String f17757b;

    public final List f17758c;
    public final String d;

    public final Uri f17759e;

    public final String f17760f;
    public final String h;

    public final Boolean f17761n;

    public final Boolean f17762r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f17756a = str;
        this.f17757b = str2;
        this.f17758c = arrayList;
        this.d = str3;
        this.f17759e = uri;
        this.f17760f = str4;
        this.h = str5;
        this.f17761n = bool;
        this.f17762r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r5.a.d(this.f17756a, dVar.f17756a) && r5.a.d(this.f17757b, dVar.f17757b) && r5.a.d(this.f17758c, dVar.f17758c) && r5.a.d(this.d, dVar.d) && r5.a.d(this.f17759e, dVar.f17759e) && r5.a.d(this.f17760f, dVar.f17760f) && r5.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17756a, this.f17757b, this.f17758c, this.d, this.f17759e, this.f17760f});
    }

    public final String toString() {
        List list = this.f17758c;
        int size = list == null ? 0 : list.size();
        String strValueOf = String.valueOf(this.f17759e);
        StringBuilder sbP = i0.a.p("applicationId: ", this.f17756a, ", name: ", this.f17757b, ", namespaces.count: ");
        sbP.append(size);
        sbP.append(", senderAppIdentifier: ");
        sbP.append(this.d);
        sbP.append(", senderAppLaunchUrl: ");
        i0.a.z(sbP, strValueOf, ", iconUrl: ", this.f17760f, ", type: ");
        sbP.append(this.h);
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f17756a);
        r8.l(parcel, 3, this.f17757b);
        r8.n(parcel, 5, DesugarCollections.unmodifiableList(this.f17758c));
        r8.l(parcel, 6, this.d);
        r8.k(parcel, 7, this.f17759e, i10);
        r8.l(parcel, 8, this.f17760f);
        r8.l(parcel, 9, this.h);
        r8.a(parcel, 10, this.f17761n);
        r8.a(parcel, 11, this.f17762r);
        r8.r(parcel, iQ);
    }
}
