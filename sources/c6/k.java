package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4371a;
    public final n f4372b;
    public final Boolean f4373c;
    public final long d;
    public final double f4374e;
    public final long[] f4375f;
    public String h;
    public final JSONObject f4376n;
    public final String f4377r;
    public final String f4378s;
    public final String v;
    public final String f4379w;
    public final long f4380x;
    public static final g6.b f4370y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4371a = mediaInfo;
        this.f4372b = nVar;
        this.f4373c = bool;
        this.d = j3;
        this.f4374e = d;
        this.f4375f = jArr;
        this.f4376n = jSONObject;
        this.f4377r = str;
        this.f4378s = str2;
        this.v = str3;
        this.f4379w = str4;
        this.f4380x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4376n, kVar.f4376n) && n6.m.l(this.f4371a, kVar.f4371a) && n6.m.l(this.f4372b, kVar.f4372b) && n6.m.l(this.f4373c, kVar.f4373c) && this.d == kVar.d && this.f4374e == kVar.f4374e && Arrays.equals(this.f4375f, kVar.f4375f) && n6.m.l(this.f4377r, kVar.f4377r) && n6.m.l(this.f4378s, kVar.f4378s) && n6.m.l(this.v, kVar.v) && n6.m.l(this.f4379w, kVar.f4379w) && this.f4380x == kVar.f4380x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4371a, this.f4372b, this.f4373c, Long.valueOf(this.d), Double.valueOf(this.f4374e), this.f4375f, String.valueOf(this.f4376n), this.f4377r, this.f4378s, this.v, this.f4379w, Long.valueOf(this.f4380x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4376n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.k(parcel, 2, this.f4371a, i10);
        w7.c0.k(parcel, 3, this.f4372b, i10);
        w7.c0.a(parcel, 4, this.f4373c);
        w7.c0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.c0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4374e);
        w7.c0.j(parcel, 7, this.f4375f);
        w7.c0.l(parcel, 8, this.h);
        w7.c0.l(parcel, 9, this.f4377r);
        w7.c0.l(parcel, 10, this.f4378s);
        w7.c0.l(parcel, 11, this.v);
        w7.c0.l(parcel, 12, this.f4379w);
        w7.c0.s(parcel, 13, 8);
        parcel.writeLong(this.f4380x);
        w7.c0.r(parcel, q6);
    }
}
