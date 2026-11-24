package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class wuc extends b4 {
    public static final Parcelable.Creator<wuc> CREATOR = new d3d((byte) 9);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public wuc(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wuc.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof wuc)) {
            wuc wucVar = (wuc) obj;
            if (fse.a(this.b, wucVar.b) && this.c == wucVar.c && this.d == wucVar.d) {
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
        StringBuilder o = ts2.o("Image ", this.c, "x", this.d, " ");
        o.append(uri);
        return o.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 2, this.b, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }

    public wuc(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            u36.j("url cannot be null");
            throw null;
        } else if (i < 0 || i2 < 0) {
            u36.j("width and height must not be negative");
            throw null;
        }
    }

    public wuc(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
