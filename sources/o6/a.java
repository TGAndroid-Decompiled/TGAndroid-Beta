package o6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import n8.g;
import p6.m;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(2);
    public final int f20914a;
    public final Uri f20915b;
    public final int f20916c;
    public final int d;

    public a(int i3, Uri uri, int i10, int i11) {
        this.f20914a = i3;
        this.f20915b = uri;
        this.f20916c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.k(this.f20915b, aVar.f20915b) && this.f20916c == aVar.f20916c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20915b, Integer.valueOf(this.f20916c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f20915b.toString();
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("Image ", this.f20916c, "x", this.d, " ");
        m10.append(uri);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f20914a);
        j8.a.l(parcel, 2, this.f20915b, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f20916c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }

    public a(Uri uri, int i3, int i10) {
        this(1, uri, i3, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i3 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: o6.a.<init>(org.json.JSONObject):void");
    }
}
