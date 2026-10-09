package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4373a;
    public final n f4374b;
    public final Boolean f4375c;
    public final long d;
    public final double f4376e;
    public final long[] f4377f;
    public String h;
    public final JSONObject f4378n;
    public final String f4379r;
    public final String f4380s;
    public final String v;
    public final String f4381w;
    public final long f4382x;
    public static final g6.b f4372y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4373a = mediaInfo;
        this.f4374b = nVar;
        this.f4375c = bool;
        this.d = j3;
        this.f4376e = d;
        this.f4377f = jArr;
        this.f4378n = jSONObject;
        this.f4379r = str;
        this.f4380s = str2;
        this.v = str3;
        this.f4381w = str4;
        this.f4382x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4378n, kVar.f4378n) && n6.l.l(this.f4373a, kVar.f4373a) && n6.l.l(this.f4374b, kVar.f4374b) && n6.l.l(this.f4375c, kVar.f4375c) && this.d == kVar.d && this.f4376e == kVar.f4376e && Arrays.equals(this.f4377f, kVar.f4377f) && n6.l.l(this.f4379r, kVar.f4379r) && n6.l.l(this.f4380s, kVar.f4380s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4381w, kVar.f4381w) && this.f4382x == kVar.f4382x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4373a, this.f4374b, this.f4375c, Long.valueOf(this.d), Double.valueOf(this.f4376e), this.f4377f, String.valueOf(this.f4378n), this.f4379r, this.f4380s, this.v, this.f4381w, Long.valueOf(this.f4382x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4378n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4373a, i10);
        w7.d0.k(parcel, 3, this.f4374b, i10);
        w7.d0.a(parcel, 4, this.f4375c);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.d0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4376e);
        w7.d0.j(parcel, 7, this.f4377f);
        w7.d0.l(parcel, 8, this.h);
        w7.d0.l(parcel, 9, this.f4379r);
        w7.d0.l(parcel, 10, this.f4380s);
        w7.d0.l(parcel, 11, this.v);
        w7.d0.l(parcel, 12, this.f4381w);
        w7.d0.s(parcel, 13, 8);
        parcel.writeLong(this.f4382x);
        w7.d0.r(parcel, q6);
    }
}
