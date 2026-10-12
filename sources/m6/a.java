package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import hg.c;
import java.util.Arrays;
import java.util.Locale;
import n6.m;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f16016a;
    public final Uri f16017b;
    public final int f16018c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f16016a = i10;
        this.f16017b = uri;
        this.f16018c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.l(this.f16017b, aVar.f16017b) && this.f16018c == aVar.f16018c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16017b, Integer.valueOf(this.f16018c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f16017b.toString();
        StringBuilder m10 = c.m("Image ", this.f16018c, "x", this.d, " ");
        m10.append(uri);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16016a);
        c0.k(parcel, 2, this.f16017b, i10);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16018c);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        c0.r(parcel, q6);
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
