package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11279a;
    public final n f11280b;
    public final Boolean f11281c;
    public final long d;
    public final double f11282e;
    public final long[] f11283f;
    public String h;
    public final JSONObject f11284n;
    public final String f11285r;
    public final String f11286s;
    public final String f11287w;
    public final String f11288x;
    public final long f11289y;
    public static final j6.b D = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11279a = mediaInfo;
        this.f11280b = nVar;
        this.f11281c = bool;
        this.d = j3;
        this.f11282e = d;
        this.f11283f = jArr;
        this.f11284n = jSONObject;
        this.f11285r = str;
        this.f11286s = str2;
        this.f11287w = str3;
        this.f11288x = str4;
        this.f11289y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11284n, kVar.f11284n) && q6.m.k(this.f11279a, kVar.f11279a) && q6.m.k(this.f11280b, kVar.f11280b) && q6.m.k(this.f11281c, kVar.f11281c) && this.d == kVar.d && this.f11282e == kVar.f11282e && Arrays.equals(this.f11283f, kVar.f11283f) && q6.m.k(this.f11285r, kVar.f11285r) && q6.m.k(this.f11286s, kVar.f11286s) && q6.m.k(this.f11287w, kVar.f11287w) && q6.m.k(this.f11288x, kVar.f11288x) && this.f11289y == kVar.f11289y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11279a, this.f11280b, this.f11281c, Long.valueOf(this.d), Double.valueOf(this.f11282e), this.f11283f, String.valueOf(this.f11284n), this.f11285r, this.f11286s, this.f11287w, this.f11288x, Long.valueOf(this.f11289y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11284n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11279a, i7);
        xb.k(parcel, 3, this.f11280b, i7);
        xb.a(parcel, 4, this.f11281c);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 6, 8);
        parcel.writeDouble(this.f11282e);
        xb.j(parcel, 7, this.f11283f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f11285r);
        xb.l(parcel, 10, this.f11286s);
        xb.l(parcel, 11, this.f11287w);
        xb.l(parcel, 12, this.f11288x);
        xb.q(parcel, 13, 8);
        parcel.writeLong(this.f11289y);
        xb.s(parcel, r10);
    }
}
