package n6;

import a8.df;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c3.h0;
import java.util.Arrays;
import java.util.Locale;
import n4.x;
import o6.l;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(3);
    public final int f18725a;
    public final Uri f18726b;
    public final int f18727c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f18725a = i10;
        this.f18726b = uri;
        this.f18727c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f18726b, aVar.f18726b) && this.f18727c == aVar.f18727c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18726b, Integer.valueOf(this.f18727c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f18726b.toString();
        StringBuilder n10 = h0.n("Image ", this.f18727c, "x", this.d, " ");
        n10.append(uri);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f18725a);
        df.k(parcel, 2, this.f18726b, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f18727c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
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
        throw new UnsupportedOperationException("Method not decompiled: n6.a.<init>(org.json.JSONObject):void");
    }
}
