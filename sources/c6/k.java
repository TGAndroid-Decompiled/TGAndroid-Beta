package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4006a;
    public final n f4007b;
    public final Boolean f4008c;
    public final long d;
    public final double e;
    public final long[] f4009f;
    public String h;
    public final JSONObject f4010n;
    public final String f4011r;
    public final String f4012s;
    public final String v;
    public final String f4013w;
    public final long f4014x;
    public static final g6.b f4005y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4006a = mediaInfo;
        this.f4007b = nVar;
        this.f4008c = bool;
        this.d = j3;
        this.e = d;
        this.f4009f = jArr;
        this.f4010n = jSONObject;
        this.f4011r = str;
        this.f4012s = str2;
        this.v = str3;
        this.f4013w = str4;
        this.f4014x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4010n, kVar.f4010n) && n6.l.l(this.f4006a, kVar.f4006a) && n6.l.l(this.f4007b, kVar.f4007b) && n6.l.l(this.f4008c, kVar.f4008c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4009f, kVar.f4009f) && n6.l.l(this.f4011r, kVar.f4011r) && n6.l.l(this.f4012s, kVar.f4012s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4013w, kVar.f4013w) && this.f4014x == kVar.f4014x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4006a, this.f4007b, this.f4008c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4009f, String.valueOf(this.f4010n), this.f4011r, this.f4012s, this.v, this.f4013w, Long.valueOf(this.f4014x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4010n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4006a, i10);
        w7.f0.k(parcel, 3, this.f4007b, i10);
        w7.f0.a(parcel, 4, this.f4008c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4009f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4011r);
        w7.f0.l(parcel, 10, this.f4012s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4013w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4014x);
        w7.f0.r(parcel, q6);
    }
}
