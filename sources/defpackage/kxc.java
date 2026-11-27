package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class kxc extends c4 {
    public static final Parcelable.Creator<kxc> CREATOR = new s5d((byte) 9);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public kxc(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxc.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof kxc)) {
            kxc kxcVar = (kxc) obj;
            if (vue.a(this.b, kxcVar.b) && this.c == kxcVar.c && this.d == kxcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.b.toString();
        StringBuilder p = bs2.p("Image ", this.c, "x", this.d, " ");
        p.append(uri);
        return p.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }

    public kxc(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            lq5.j("url cannot be null");
            throw null;
        } else if (i < 0 || i2 < 0) {
            lq5.j("width and height must not be negative");
            throw null;
        }
    }

    public kxc(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
