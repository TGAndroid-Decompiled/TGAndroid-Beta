package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import g8.j;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f16152a;
    public final Uri f16153b;
    public final int f16154c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f16152a = i10;
        this.f16153b = uri;
        this.f16154c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f16153b, aVar.f16153b) && this.f16154c == aVar.f16154c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16153b, Integer.valueOf(this.f16154c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f16153b.toString();
        StringBuilder k10 = e2.k("Image ", this.f16154c, "x", this.d, " ");
        k10.append(uri);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16152a);
        e0.k(parcel, 2, this.f16153b, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f16154c);
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
