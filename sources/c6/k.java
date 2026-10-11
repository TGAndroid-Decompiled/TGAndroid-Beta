package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4372a;
    public final n f4373b;
    public final Boolean f4374c;
    public final long d;
    public final double f4375e;
    public final long[] f4376f;
    public String h;
    public final JSONObject f4377n;
    public final String f4378r;
    public final String f4379s;
    public final String v;
    public final String f4380w;
    public final long f4381x;
    public static final g6.b f4371y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4372a = mediaInfo;
        this.f4373b = nVar;
        this.f4374c = bool;
        this.d = j3;
        this.f4375e = d;
        this.f4376f = jArr;
        this.f4377n = jSONObject;
        this.f4378r = str;
        this.f4379s = str2;
        this.v = str3;
        this.f4380w = str4;
        this.f4381x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4377n, kVar.f4377n) && n6.m.l(this.f4372a, kVar.f4372a) && n6.m.l(this.f4373b, kVar.f4373b) && n6.m.l(this.f4374c, kVar.f4374c) && this.d == kVar.d && this.f4375e == kVar.f4375e && Arrays.equals(this.f4376f, kVar.f4376f) && n6.m.l(this.f4378r, kVar.f4378r) && n6.m.l(this.f4379s, kVar.f4379s) && n6.m.l(this.v, kVar.v) && n6.m.l(this.f4380w, kVar.f4380w) && this.f4381x == kVar.f4381x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4372a, this.f4373b, this.f4374c, Long.valueOf(this.d), Double.valueOf(this.f4375e), this.f4376f, String.valueOf(this.f4377n), this.f4378r, this.f4379s, this.v, this.f4380w, Long.valueOf(this.f4381x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4377n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4372a, i10);
        w7.d0.k(parcel, 3, this.f4373b, i10);
        w7.d0.a(parcel, 4, this.f4374c);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.d0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4375e);
        w7.d0.j(parcel, 7, this.f4376f);
        w7.d0.l(parcel, 8, this.h);
        w7.d0.l(parcel, 9, this.f4378r);
        w7.d0.l(parcel, 10, this.f4379s);
        w7.d0.l(parcel, 11, this.v);
        w7.d0.l(parcel, 12, this.f4380w);
        w7.d0.s(parcel, 13, 8);
        parcel.writeLong(this.f4381x);
        w7.d0.r(parcel, q6);
    }
}
