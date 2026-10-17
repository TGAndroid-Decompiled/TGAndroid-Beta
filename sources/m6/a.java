package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f16787a;
    public final Uri f16788b;
    public final int f16789c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f16787a = i10;
        this.f16788b = uri;
        this.f16789c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f16788b, aVar.f16788b) && this.f16789c == aVar.f16789c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16788b, Integer.valueOf(this.f16789c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f16788b.toString();
        StringBuilder m10 = i0.a.m("Image ", this.f16789c, "x", this.d, " ");
        m10.append(uri);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f16787a);
        f0.k(parcel, 2, this.f16788b, i10);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f16789c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
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
