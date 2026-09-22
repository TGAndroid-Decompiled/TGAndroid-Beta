package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4004a;
    public final n f4005b;
    public final Boolean f4006c;
    public final long d;
    public final double e;
    public final long[] f4007f;
    public String h;
    public final JSONObject f4008n;
    public final String f4009r;
    public final String f4010s;
    public final String v;
    public final String f4011w;
    public final long f4012x;
    public static final g6.b f4003y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4004a = mediaInfo;
        this.f4005b = nVar;
        this.f4006c = bool;
        this.d = j3;
        this.e = d;
        this.f4007f = jArr;
        this.f4008n = jSONObject;
        this.f4009r = str;
        this.f4010s = str2;
        this.v = str3;
        this.f4011w = str4;
        this.f4012x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4008n, kVar.f4008n) && n6.l.l(this.f4004a, kVar.f4004a) && n6.l.l(this.f4005b, kVar.f4005b) && n6.l.l(this.f4006c, kVar.f4006c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4007f, kVar.f4007f) && n6.l.l(this.f4009r, kVar.f4009r) && n6.l.l(this.f4010s, kVar.f4010s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4011w, kVar.f4011w) && this.f4012x == kVar.f4012x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4004a, this.f4005b, this.f4006c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4007f, String.valueOf(this.f4008n), this.f4009r, this.f4010s, this.v, this.f4011w, Long.valueOf(this.f4012x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4008n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4004a, i10);
        w7.f0.k(parcel, 3, this.f4005b, i10);
        w7.f0.a(parcel, 4, this.f4006c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4007f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4009r);
        w7.f0.l(parcel, 10, this.f4010s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4011w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4012x);
        w7.f0.r(parcel, q6);
    }
}
