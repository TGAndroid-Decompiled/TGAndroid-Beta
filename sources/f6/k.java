package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11399a;
    public final n f11400b;
    public final Boolean f11401c;
    public final long d;
    public final double f11402e;
    public final long[] f11403f;
    public String h;
    public final JSONObject f11404n;
    public final String f11405r;
    public final String f11406s;
    public final String f11407w;
    public final String f11408x;
    public final long f11409y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11399a = mediaInfo;
        this.f11400b = nVar;
        this.f11401c = bool;
        this.d = j3;
        this.f11402e = d;
        this.f11403f = jArr;
        this.f11404n = jSONObject;
        this.f11405r = str;
        this.f11406s = str2;
        this.f11407w = str3;
        this.f11408x = str4;
        this.f11409y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11404n, kVar.f11404n) && q6.m.l(this.f11399a, kVar.f11399a) && q6.m.l(this.f11400b, kVar.f11400b) && q6.m.l(this.f11401c, kVar.f11401c) && this.d == kVar.d && this.f11402e == kVar.f11402e && Arrays.equals(this.f11403f, kVar.f11403f) && q6.m.l(this.f11405r, kVar.f11405r) && q6.m.l(this.f11406s, kVar.f11406s) && q6.m.l(this.f11407w, kVar.f11407w) && q6.m.l(this.f11408x, kVar.f11408x) && this.f11409y == kVar.f11409y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11399a, this.f11400b, this.f11401c, Long.valueOf(this.d), Double.valueOf(this.f11402e), this.f11403f, String.valueOf(this.f11404n), this.f11405r, this.f11406s, this.f11407w, this.f11408x, Long.valueOf(this.f11409y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11404n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11399a, i7);
        cc.k(parcel, 3, this.f11400b, i7);
        cc.a(parcel, 4, this.f11401c);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        cc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11402e);
        cc.j(parcel, 7, this.f11403f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f11405r);
        cc.l(parcel, 10, this.f11406s);
        cc.l(parcel, 11, this.f11407w);
        cc.l(parcel, 12, this.f11408x);
        cc.q(parcel, 13, 8);
        parcel.writeLong(this.f11409y);
        cc.s(parcel, r10);
    }
}
