package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11400a;
    public final n f11401b;
    public final Boolean f11402c;
    public final long d;
    public final double f11403e;
    public final long[] f11404f;
    public String h;
    public final JSONObject f11405n;
    public final String f11406r;
    public final String f11407s;
    public final String f11408w;
    public final String f11409x;
    public final long f11410y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11400a = mediaInfo;
        this.f11401b = nVar;
        this.f11402c = bool;
        this.d = j3;
        this.f11403e = d;
        this.f11404f = jArr;
        this.f11405n = jSONObject;
        this.f11406r = str;
        this.f11407s = str2;
        this.f11408w = str3;
        this.f11409x = str4;
        this.f11410y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11405n, kVar.f11405n) && q6.m.l(this.f11400a, kVar.f11400a) && q6.m.l(this.f11401b, kVar.f11401b) && q6.m.l(this.f11402c, kVar.f11402c) && this.d == kVar.d && this.f11403e == kVar.f11403e && Arrays.equals(this.f11404f, kVar.f11404f) && q6.m.l(this.f11406r, kVar.f11406r) && q6.m.l(this.f11407s, kVar.f11407s) && q6.m.l(this.f11408w, kVar.f11408w) && q6.m.l(this.f11409x, kVar.f11409x) && this.f11410y == kVar.f11410y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11400a, this.f11401b, this.f11402c, Long.valueOf(this.d), Double.valueOf(this.f11403e), this.f11404f, String.valueOf(this.f11405n), this.f11406r, this.f11407s, this.f11408w, this.f11409x, Long.valueOf(this.f11410y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11405n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11400a, i7);
        cc.k(parcel, 3, this.f11401b, i7);
        cc.a(parcel, 4, this.f11402c);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        cc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11403e);
        cc.j(parcel, 7, this.f11404f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f11406r);
        cc.l(parcel, 10, this.f11407s);
        cc.l(parcel, 11, this.f11408w);
        cc.l(parcel, 12, this.f11409x);
        cc.q(parcel, 13, 8);
        parcel.writeLong(this.f11410y);
        cc.s(parcel, r10);
    }
}
