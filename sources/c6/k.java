package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4002a;
    public final n f4003b;
    public final Boolean f4004c;
    public final long d;
    public final double e;
    public final long[] f4005f;
    public String h;
    public final JSONObject f4006n;
    public final String f4007r;
    public final String f4008s;
    public final String v;
    public final String f4009w;
    public final long f4010x;
    public static final g6.b f4001y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4002a = mediaInfo;
        this.f4003b = nVar;
        this.f4004c = bool;
        this.d = j3;
        this.e = d;
        this.f4005f = jArr;
        this.f4006n = jSONObject;
        this.f4007r = str;
        this.f4008s = str2;
        this.v = str3;
        this.f4009w = str4;
        this.f4010x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4006n, kVar.f4006n) && n6.l.l(this.f4002a, kVar.f4002a) && n6.l.l(this.f4003b, kVar.f4003b) && n6.l.l(this.f4004c, kVar.f4004c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4005f, kVar.f4005f) && n6.l.l(this.f4007r, kVar.f4007r) && n6.l.l(this.f4008s, kVar.f4008s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4009w, kVar.f4009w) && this.f4010x == kVar.f4010x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4002a, this.f4003b, this.f4004c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4005f, String.valueOf(this.f4006n), this.f4007r, this.f4008s, this.v, this.f4009w, Long.valueOf(this.f4010x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4006n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4002a, i10);
        w7.e0.k(parcel, 3, this.f4003b, i10);
        w7.e0.a(parcel, 4, this.f4004c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.e0.j(parcel, 7, this.f4005f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4007r);
        w7.e0.l(parcel, 10, this.f4008s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4009w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4010x);
        w7.e0.r(parcel, q6);
    }
}
