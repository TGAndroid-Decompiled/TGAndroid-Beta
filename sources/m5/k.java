package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import h7.r8;
import java.util.Arrays;
import org.json.JSONObject;

public final class k extends z5.a {

    public final MediaInfo f17796a;

    public final n f17797b;

    public final Boolean f17798c;
    public final long d;

    public final double f17799e;

    public final long[] f17800f;
    public String h;

    public final JSONObject f17801n;

    public final String f17802r;

    public final String f17803s;
    public final String v;

    public final String f17804w;

    public final long f17805x;

    public static final r5.b f17795y = new r5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new w(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f17796a = mediaInfo;
        this.f17797b = nVar;
        this.f17798c = bool;
        this.d = j10;
        this.f17799e = d;
        this.f17800f = jArr;
        this.f17801n = jSONObject;
        this.f17802r = str;
        this.f17803s = str2;
        this.v = str3;
        this.f17804w = str4;
        this.f17805x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return f6.c.a(this.f17801n, kVar.f17801n) && y5.l.l(this.f17796a, kVar.f17796a) && y5.l.l(this.f17797b, kVar.f17797b) && y5.l.l(this.f17798c, kVar.f17798c) && this.d == kVar.d && this.f17799e == kVar.f17799e && Arrays.equals(this.f17800f, kVar.f17800f) && y5.l.l(this.f17802r, kVar.f17802r) && y5.l.l(this.f17803s, kVar.f17803s) && y5.l.l(this.v, kVar.v) && y5.l.l(this.f17804w, kVar.f17804w) && this.f17805x == kVar.f17805x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17796a, this.f17797b, this.f17798c, Long.valueOf(this.d), Double.valueOf(this.f17799e), this.f17800f, String.valueOf(this.f17801n), this.f17802r, this.f17803s, this.v, this.f17804w, Long.valueOf(this.f17805x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f17801n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f17796a, i10);
        r8.k(parcel, 3, this.f17797b, i10);
        r8.a(parcel, 4, this.f17798c);
        r8.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        r8.s(parcel, 6, 8);
        parcel.writeDouble(this.f17799e);
        r8.j(parcel, 7, this.f17800f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.f17802r);
        r8.l(parcel, 10, this.f17803s);
        r8.l(parcel, 11, this.v);
        r8.l(parcel, 12, this.f17804w);
        r8.s(parcel, 13, 8);
        parcel.writeLong(this.f17805x);
        r8.r(parcel, iQ);
    }
}
