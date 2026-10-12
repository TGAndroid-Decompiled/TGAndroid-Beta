package m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import i2.d;
import java.util.Arrays;
import java.util.Locale;
import n6.l;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(26);
    public final int f15700a;
    public final Uri f15701b;
    public final int f15702c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f15700a = i10;
        this.f15701b = uri;
        this.f15702c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f15701b, aVar.f15701b) && this.f15702c == aVar.f15702c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15701b, Integer.valueOf(this.f15702c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f15701b.toString();
        StringBuilder l4 = d.l("Image ", this.f15702c, "x", this.d, " ");
        l4.append(uri);
        return l4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f15700a);
        g0.k(parcel, 2, this.f15701b, i10);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f15702c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.r(parcel, q6);
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
