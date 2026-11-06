package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11274a;
    public final n f11275b;
    public final Boolean f11276c;
    public final long d;
    public final double f11277e;
    public final long[] f11278f;
    public String h;
    public final JSONObject f11279n;
    public final String f11280r;
    public final String f11281s;
    public final String f11282w;
    public final String f11283x;
    public final long f11284y;
    public static final j6.b D = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11274a = mediaInfo;
        this.f11275b = nVar;
        this.f11276c = bool;
        this.d = j3;
        this.f11277e = d;
        this.f11278f = jArr;
        this.f11279n = jSONObject;
        this.f11280r = str;
        this.f11281s = str2;
        this.f11282w = str3;
        this.f11283x = str4;
        this.f11284y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11279n, kVar.f11279n) && q6.m.k(this.f11274a, kVar.f11274a) && q6.m.k(this.f11275b, kVar.f11275b) && q6.m.k(this.f11276c, kVar.f11276c) && this.d == kVar.d && this.f11277e == kVar.f11277e && Arrays.equals(this.f11278f, kVar.f11278f) && q6.m.k(this.f11280r, kVar.f11280r) && q6.m.k(this.f11281s, kVar.f11281s) && q6.m.k(this.f11282w, kVar.f11282w) && q6.m.k(this.f11283x, kVar.f11283x) && this.f11284y == kVar.f11284y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11274a, this.f11275b, this.f11276c, Long.valueOf(this.d), Double.valueOf(this.f11277e), this.f11278f, String.valueOf(this.f11279n), this.f11280r, this.f11281s, this.f11282w, this.f11283x, Long.valueOf(this.f11284y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11279n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11274a, i7);
        xb.k(parcel, 3, this.f11275b, i7);
        xb.a(parcel, 4, this.f11276c);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 6, 8);
        parcel.writeDouble(this.f11277e);
        xb.j(parcel, 7, this.f11278f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f11280r);
        xb.l(parcel, 10, this.f11281s);
        xb.l(parcel, 11, this.f11282w);
        xb.l(parcel, 12, this.f11283x);
        xb.q(parcel, 13, 8);
        parcel.writeLong(this.f11284y);
        xb.s(parcel, r10);
    }
}
