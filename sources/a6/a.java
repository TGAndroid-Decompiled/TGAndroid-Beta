package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import e2.c;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int f120a;
    public final Uri f121b;
    public final int f122c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f120a = i10;
        this.f121b = uri;
        this.f122c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.l(this.f121b, aVar.f121b) && this.f122c == aVar.f122c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f121b, Integer.valueOf(this.f122c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f121b.toString();
        StringBuilder m9 = c.m("Image ", this.f122c, "x", this.d, " ");
        m9.append(uri);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f120a);
        f5.k(parcel, 2, this.f121b, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f122c);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
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
