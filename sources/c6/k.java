package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f3997a;
    public final n f3998b;
    public final Boolean f3999c;
    public final long d;
    public final double e;
    public final long[] f4000f;
    public String h;
    public final JSONObject f4001n;
    public final String f4002r;
    public final String f4003s;
    public final String v;
    public final String f4004w;
    public final long f4005x;
    public static final g6.b f3996y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f3997a = mediaInfo;
        this.f3998b = nVar;
        this.f3999c = bool;
        this.d = j3;
        this.e = d;
        this.f4000f = jArr;
        this.f4001n = jSONObject;
        this.f4002r = str;
        this.f4003s = str2;
        this.v = str3;
        this.f4004w = str4;
        this.f4005x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4001n, kVar.f4001n) && n6.l.l(this.f3997a, kVar.f3997a) && n6.l.l(this.f3998b, kVar.f3998b) && n6.l.l(this.f3999c, kVar.f3999c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4000f, kVar.f4000f) && n6.l.l(this.f4002r, kVar.f4002r) && n6.l.l(this.f4003s, kVar.f4003s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4004w, kVar.f4004w) && this.f4005x == kVar.f4005x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3997a, this.f3998b, this.f3999c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4000f, String.valueOf(this.f4001n), this.f4002r, this.f4003s, this.v, this.f4004w, Long.valueOf(this.f4005x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4001n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f3997a, i10);
        w7.f0.k(parcel, 3, this.f3998b, i10);
        w7.f0.a(parcel, 4, this.f3999c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4000f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4002r);
        w7.f0.l(parcel, 10, this.f4003s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4004w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4005x);
        w7.f0.r(parcel, q6);
    }
}
