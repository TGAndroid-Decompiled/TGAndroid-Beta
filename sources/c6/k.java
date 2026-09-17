package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4005a;
    public final n f4006b;
    public final Boolean f4007c;
    public final long d;
    public final double e;
    public final long[] f4008f;
    public String h;
    public final JSONObject f4009n;
    public final String f4010r;
    public final String f4011s;
    public final String v;
    public final String f4012w;
    public final long f4013x;
    public static final g6.b f4004y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4005a = mediaInfo;
        this.f4006b = nVar;
        this.f4007c = bool;
        this.d = j3;
        this.e = d;
        this.f4008f = jArr;
        this.f4009n = jSONObject;
        this.f4010r = str;
        this.f4011s = str2;
        this.v = str3;
        this.f4012w = str4;
        this.f4013x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4009n, kVar.f4009n) && n6.l.l(this.f4005a, kVar.f4005a) && n6.l.l(this.f4006b, kVar.f4006b) && n6.l.l(this.f4007c, kVar.f4007c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4008f, kVar.f4008f) && n6.l.l(this.f4010r, kVar.f4010r) && n6.l.l(this.f4011s, kVar.f4011s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4012w, kVar.f4012w) && this.f4013x == kVar.f4013x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4005a, this.f4006b, this.f4007c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4008f, String.valueOf(this.f4009n), this.f4010r, this.f4011s, this.v, this.f4012w, Long.valueOf(this.f4013x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4009n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4005a, i10);
        w7.e0.k(parcel, 3, this.f4006b, i10);
        w7.e0.a(parcel, 4, this.f4007c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.e0.j(parcel, 7, this.f4008f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4010r);
        w7.e0.l(parcel, 10, this.f4011s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4012w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4013x);
        w7.e0.r(parcel, q6);
    }
}
