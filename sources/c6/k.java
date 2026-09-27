package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f3999a;
    public final n f4000b;
    public final Boolean f4001c;
    public final long d;
    public final double e;
    public final long[] f4002f;
    public String h;
    public final JSONObject f4003n;
    public final String f4004r;
    public final String f4005s;
    public final String v;
    public final String f4006w;
    public final long f4007x;
    public static final g6.b f3998y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f3999a = mediaInfo;
        this.f4000b = nVar;
        this.f4001c = bool;
        this.d = j3;
        this.e = d;
        this.f4002f = jArr;
        this.f4003n = jSONObject;
        this.f4004r = str;
        this.f4005s = str2;
        this.v = str3;
        this.f4006w = str4;
        this.f4007x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4003n, kVar.f4003n) && n6.l.l(this.f3999a, kVar.f3999a) && n6.l.l(this.f4000b, kVar.f4000b) && n6.l.l(this.f4001c, kVar.f4001c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4002f, kVar.f4002f) && n6.l.l(this.f4004r, kVar.f4004r) && n6.l.l(this.f4005s, kVar.f4005s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4006w, kVar.f4006w) && this.f4007x == kVar.f4007x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3999a, this.f4000b, this.f4001c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4002f, String.valueOf(this.f4003n), this.f4004r, this.f4005s, this.v, this.f4006w, Long.valueOf(this.f4007x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4003n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f3999a, i10);
        w7.f0.k(parcel, 3, this.f4000b, i10);
        w7.f0.a(parcel, 4, this.f4001c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4002f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4004r);
        w7.f0.l(parcel, 10, this.f4005s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4006w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4007x);
        w7.f0.r(parcel, q6);
    }
}
