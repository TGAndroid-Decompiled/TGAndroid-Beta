package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(25);
    public final int f13015a;
    public final Uri f13016b;
    public final int f13017c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f13015a = i10;
        this.f13016b = uri;
        this.f13017c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.k(this.f13016b, aVar.f13016b) && this.f13017c == aVar.f13017c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13016b, Integer.valueOf(this.f13017c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f13016b.toString();
        StringBuilder m10 = i0.a.m("Image ", this.f13017c, "x", this.d, " ");
        m10.append(uri);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f13015a);
        h0.k(parcel, 2, this.f13016b, i10);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13017c);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h0.r(parcel, q6);
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
