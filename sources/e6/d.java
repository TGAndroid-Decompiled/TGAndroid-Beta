package e6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f9682a;
    public final String f9683b;
    public final List f9684c;
    public final String d;
    public final Uri f9685e;
    public final String f9686f;
    public final String h;
    public final Boolean f9687n;
    public final Boolean f9688r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f9682a = str;
        this.f9683b = str2;
        this.f9684c = arrayList;
        this.d = str3;
        this.f9685e = uri;
        this.f9686f = str4;
        this.h = str5;
        this.f9687n = bool;
        this.f9688r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i6.a.d(this.f9682a, dVar.f9682a) && i6.a.d(this.f9683b, dVar.f9683b) && i6.a.d(this.f9684c, dVar.f9684c) && i6.a.d(this.d, dVar.d) && i6.a.d(this.f9685e, dVar.f9685e) && i6.a.d(this.f9686f, dVar.f9686f) && i6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9682a, this.f9683b, this.f9684c, this.d, this.f9685e, this.f9686f});
    }

    public final String toString() {
        int size;
        List list = this.f9684c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f9685e);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("applicationId: ", this.f9682a, ", name: ", this.f9683b, ", namespaces.count: ");
        n4.append(size);
        n4.append(", senderAppIdentifier: ");
        n4.append(this.d);
        n4.append(", senderAppLaunchUrl: ");
        com.google.android.recaptcha.internal.a.s(n4, valueOf, ", iconUrl: ", this.f9686f, ", type: ");
        n4.append(this.h);
        return n4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9682a);
        j8.a.m(parcel, 3, this.f9683b);
        j8.a.o(parcel, 5, DesugarCollections.unmodifiableList(this.f9684c));
        j8.a.m(parcel, 6, this.d);
        j8.a.l(parcel, 7, this.f9685e, i3);
        j8.a.m(parcel, 8, this.f9686f);
        j8.a.m(parcel, 9, this.h);
        j8.a.b(parcel, 10, this.f9687n);
        j8.a.b(parcel, 11, this.f9688r);
        j8.a.t(parcel, s6);
    }
}
