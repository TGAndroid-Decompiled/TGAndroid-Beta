package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import hg.c;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f16269a;
    public final Uri f16270b;
    public final int f16271c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f16269a = i10;
        this.f16270b = uri;
        this.f16271c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f16270b, aVar.f16270b) && this.f16271c == aVar.f16271c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16270b, Integer.valueOf(this.f16271c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f16270b.toString();
        StringBuilder k10 = c.k("Image ", this.f16271c, "x", this.d, " ");
        k10.append(uri);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16269a);
        d0.k(parcel, 2, this.f16270b, i10);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16271c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.r(parcel, q6);
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
