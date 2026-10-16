package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4493a;
    public final n f4494b;
    public final Boolean f4495c;
    public final long d;
    public final double e;
    public final long[] f4496f;
    public String h;
    public final JSONObject f4497n;
    public final String f4498r;
    public final String f4499s;
    public final String v;
    public final String f4500w;
    public final long f4501x;
    public static final g6.b f4492y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4493a = mediaInfo;
        this.f4494b = nVar;
        this.f4495c = bool;
        this.d = j10;
        this.e = d;
        this.f4496f = jArr;
        this.f4497n = jSONObject;
        this.f4498r = str;
        this.f4499s = str2;
        this.v = str3;
        this.f4500w = str4;
        this.f4501x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4497n, kVar.f4497n) && n6.l.l(this.f4493a, kVar.f4493a) && n6.l.l(this.f4494b, kVar.f4494b) && n6.l.l(this.f4495c, kVar.f4495c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4496f, kVar.f4496f) && n6.l.l(this.f4498r, kVar.f4498r) && n6.l.l(this.f4499s, kVar.f4499s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4500w, kVar.f4500w) && this.f4501x == kVar.f4501x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4493a, this.f4494b, this.f4495c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4496f, String.valueOf(this.f4497n), this.f4498r, this.f4499s, this.v, this.f4500w, Long.valueOf(this.f4501x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4497n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4493a, i10);
        w7.f0.k(parcel, 3, this.f4494b, i10);
        w7.f0.a(parcel, 4, this.f4495c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4496f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4498r);
        w7.f0.l(parcel, 10, this.f4499s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4500w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4501x);
        w7.f0.r(parcel, q6);
    }
}
