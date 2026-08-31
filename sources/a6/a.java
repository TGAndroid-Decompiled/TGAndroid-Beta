package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import e2.c;
import j7.g5;
import java.util.Arrays;
import java.util.Locale;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f131a;
    public final Uri f132b;
    public final int f133c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f131a = i10;
        this.f132b = uri;
        this.f133c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.l(this.f132b, aVar.f132b) && this.f133c == aVar.f133c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f132b, Integer.valueOf(this.f133c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f132b.toString();
        StringBuilder m9 = c.m("Image ", this.f133c, "x", this.d, " ");
        m9.append(uri);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f131a);
        g5.k(parcel, 2, this.f132b, i10);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f133c);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.r(parcel, q10);
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
        throw new UnsupportedOperationException("Method not decompiled: a6.a.<init>(org.json.JSONObject):void");
    }
}
