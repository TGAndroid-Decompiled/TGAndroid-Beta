package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class vsc extends b4 {
    public static final Parcelable.Creator<vsc> CREATOR = new b1d((byte) 9);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public vsc(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsc.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof vsc)) {
            vsc vscVar = (vsc) obj;
            if (cqe.a(this.b, vscVar.b) && this.c == vscVar.c && this.d == vscVar.d) {
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
        StringBuilder p = ir2.p("Image ", this.c, "x", this.d, " ");
        p.append(uri);
        return p.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 2, this.b, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }

    public vsc(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            w26.j("url cannot be null");
            throw null;
        } else if (i < 0 || i2 < 0) {
            w26.j("width and height must not be negative");
            throw null;
        }
    }

    public vsc(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
