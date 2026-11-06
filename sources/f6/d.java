package f6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String f11239a;
    public final String f11240b;
    public final List f11241c;
    public final String d;
    public final Uri f11242e;
    public final String f11243f;
    public final String h;
    public final Boolean f11244n;
    public final Boolean f11245r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f11239a = str;
        this.f11240b = str2;
        this.f11241c = arrayList;
        this.d = str3;
        this.f11242e = uri;
        this.f11243f = str4;
        this.h = str5;
        this.f11244n = bool;
        this.f11245r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j6.a.d(this.f11239a, dVar.f11239a) && j6.a.d(this.f11240b, dVar.f11240b) && j6.a.d(this.f11241c, dVar.f11241c) && j6.a.d(this.d, dVar.d) && j6.a.d(this.f11242e, dVar.f11242e) && j6.a.d(this.f11243f, dVar.f11243f) && j6.a.d(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11239a, this.f11240b, this.f11241c, this.d, this.f11242e, this.f11243f});
    }

    public final String toString() {
        int size;
        List list = this.f11241c;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f11242e);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("applicationId: ", this.f11239a, ", name: ", this.f11240b, ", namespaces.count: ");
        n10.append(size);
        n10.append(", senderAppIdentifier: ");
        n10.append(this.d);
        n10.append(", senderAppLaunchUrl: ");
        com.google.android.recaptcha.internal.a.s(n10, valueOf, ", iconUrl: ", this.f11243f, ", type: ");
        n10.append(this.h);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f11239a);
        wb.l(parcel, 3, this.f11240b);
        wb.n(parcel, 5, DesugarCollections.unmodifiableList(this.f11241c));
        wb.l(parcel, 6, this.d);
        wb.k(parcel, 7, this.f11242e, i7);
        wb.l(parcel, 8, this.f11243f);
        wb.l(parcel, 9, this.h);
        wb.a(parcel, 10, this.f11244n);
        wb.a(parcel, 11, this.f11245r);
        wb.s(parcel, r10);
    }
}
