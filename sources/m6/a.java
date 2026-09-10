package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import hc.b;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f13576a;
    public final Uri f13577b;
    public final int f13578c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f13576a = i10;
        this.f13577b = uri;
        this.f13578c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f13577b, aVar.f13577b) && this.f13578c == aVar.f13578c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13577b, Integer.valueOf(this.f13578c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f13577b.toString();
        StringBuilder n10 = b.n("Image ", this.f13578c, "x", this.d, " ");
        n10.append(uri);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f13576a);
        e0.k(parcel, 2, this.f13577b, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f13578c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }

    public a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: m6.a.<init>(org.json.JSONObject):void");
    }
}
