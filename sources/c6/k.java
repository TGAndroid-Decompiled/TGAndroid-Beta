package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;
public final class k extends o6.a {
    public final MediaInfo f4322a;
    public final n f4323b;
    public final Boolean f4324c;
    public final long d;
    public final double f4325e;
    public final long[] f4326f;
    public String h;
    public final JSONObject f4327n;
    public final String f4328r;
    public final String f4329s;
    public final String v;
    public final String f4330w;
    public final long f4331x;
    public static final g6.b f4321y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4322a = mediaInfo;
        this.f4323b = nVar;
        this.f4324c = bool;
        this.d = j3;
        this.f4325e = d;
        this.f4326f = jArr;
        this.f4327n = jSONObject;
        this.f4328r = str;
        this.f4329s = str2;
        this.v = str3;
        this.f4330w = str4;
        this.f4331x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4327n, kVar.f4327n) && n6.l.l(this.f4322a, kVar.f4322a) && n6.l.l(this.f4323b, kVar.f4323b) && n6.l.l(this.f4324c, kVar.f4324c) && this.d == kVar.d && this.f4325e == kVar.f4325e && Arrays.equals(this.f4326f, kVar.f4326f) && n6.l.l(this.f4328r, kVar.f4328r) && n6.l.l(this.f4329s, kVar.f4329s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4330w, kVar.f4330w) && this.f4331x == kVar.f4331x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4322a, this.f4323b, this.f4324c, Long.valueOf(this.d), Double.valueOf(this.f4325e), this.f4326f, String.valueOf(this.f4327n), this.f4328r, this.f4329s, this.v, this.f4330w, Long.valueOf(this.f4331x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4327n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4322a, i10);
        g0.k(parcel, 3, this.f4323b, i10);
        g0.a(parcel, 4, this.f4324c);
        g0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4325e);
        g0.j(parcel, 7, this.f4326f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f4328r);
        g0.l(parcel, 10, this.f4329s);
        g0.l(parcel, 11, this.v);
        g0.l(parcel, 12, this.f4330w);
        g0.s(parcel, 13, 8);
        parcel.writeLong(this.f4331x);
        g0.r(parcel, q6);
    }
}
