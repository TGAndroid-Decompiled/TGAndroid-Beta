package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;
public final class k extends o6.a {
    public final MediaInfo f4490a;
    public final n f4491b;
    public final Boolean f4492c;
    public final long d;
    public final double e;
    public final long[] f4493f;
    public String h;
    public final JSONObject f4494n;
    public final String f4495r;
    public final String f4496s;
    public final String v;
    public final String f4497w;
    public final long f4498x;
    public static final g6.b f4489y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4490a = mediaInfo;
        this.f4491b = nVar;
        this.f4492c = bool;
        this.d = j10;
        this.e = d;
        this.f4493f = jArr;
        this.f4494n = jSONObject;
        this.f4495r = str;
        this.f4496s = str2;
        this.v = str3;
        this.f4497w = str4;
        this.f4498x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4494n, kVar.f4494n) && n6.l.l(this.f4490a, kVar.f4490a) && n6.l.l(this.f4491b, kVar.f4491b) && n6.l.l(this.f4492c, kVar.f4492c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4493f, kVar.f4493f) && n6.l.l(this.f4495r, kVar.f4495r) && n6.l.l(this.f4496s, kVar.f4496s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4497w, kVar.f4497w) && this.f4498x == kVar.f4498x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4490a, this.f4491b, this.f4492c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4493f, String.valueOf(this.f4494n), this.f4495r, this.f4496s, this.v, this.f4497w, Long.valueOf(this.f4498x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4494n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4490a, i10);
        g0.k(parcel, 3, this.f4491b, i10);
        g0.a(parcel, 4, this.f4492c);
        g0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        g0.j(parcel, 7, this.f4493f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f4495r);
        g0.l(parcel, 10, this.f4496s);
        g0.l(parcel, 11, this.v);
        g0.l(parcel, 12, this.f4497w);
        g0.s(parcel, 13, 8);
        parcel.writeLong(this.f4498x);
        g0.r(parcel, q6);
    }
}
