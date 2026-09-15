package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4000a;
    public final n f4001b;
    public final Boolean f4002c;
    public final long d;
    public final double e;
    public final long[] f4003f;
    public String h;
    public final JSONObject f4004n;
    public final String f4005r;
    public final String f4006s;
    public final String v;
    public final String f4007w;
    public final long f4008x;
    public static final g6.b f3999y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4000a = mediaInfo;
        this.f4001b = nVar;
        this.f4002c = bool;
        this.d = j3;
        this.e = d;
        this.f4003f = jArr;
        this.f4004n = jSONObject;
        this.f4005r = str;
        this.f4006s = str2;
        this.v = str3;
        this.f4007w = str4;
        this.f4008x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4004n, kVar.f4004n) && n6.l.l(this.f4000a, kVar.f4000a) && n6.l.l(this.f4001b, kVar.f4001b) && n6.l.l(this.f4002c, kVar.f4002c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4003f, kVar.f4003f) && n6.l.l(this.f4005r, kVar.f4005r) && n6.l.l(this.f4006s, kVar.f4006s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4007w, kVar.f4007w) && this.f4008x == kVar.f4008x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4000a, this.f4001b, this.f4002c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4003f, String.valueOf(this.f4004n), this.f4005r, this.f4006s, this.v, this.f4007w, Long.valueOf(this.f4008x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4004n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4000a, i10);
        w7.e0.k(parcel, 3, this.f4001b, i10);
        w7.e0.a(parcel, 4, this.f4002c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.e0.j(parcel, 7, this.f4003f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4005r);
        w7.e0.l(parcel, 10, this.f4006s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4007w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4008x);
        w7.e0.r(parcel, q6);
    }
}
