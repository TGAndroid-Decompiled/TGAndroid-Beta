package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4863a;
    public final n f4864b;
    public final Boolean f4865c;
    public final long d;
    public final double e;
    public final long[] f4866f;
    public String h;
    public final JSONObject f4867n;
    public final String f4868r;
    public final String f4869s;
    public final String v;
    public final String f4870w;
    public final long f4871x;
    public static final g6.b f4862y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4863a = mediaInfo;
        this.f4864b = nVar;
        this.f4865c = bool;
        this.d = j10;
        this.e = d;
        this.f4866f = jArr;
        this.f4867n = jSONObject;
        this.f4868r = str;
        this.f4869s = str2;
        this.v = str3;
        this.f4870w = str4;
        this.f4871x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4867n, kVar.f4867n) && n6.l.l(this.f4863a, kVar.f4863a) && n6.l.l(this.f4864b, kVar.f4864b) && n6.l.l(this.f4865c, kVar.f4865c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4866f, kVar.f4866f) && n6.l.l(this.f4868r, kVar.f4868r) && n6.l.l(this.f4869s, kVar.f4869s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4870w, kVar.f4870w) && this.f4871x == kVar.f4871x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4863a, this.f4864b, this.f4865c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4866f, String.valueOf(this.f4867n), this.f4868r, this.f4869s, this.v, this.f4870w, Long.valueOf(this.f4871x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4867n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4863a, i10);
        w7.f0.k(parcel, 3, this.f4864b, i10);
        w7.f0.a(parcel, 4, this.f4865c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4866f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4868r);
        w7.f0.l(parcel, 10, this.f4869s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4870w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4871x);
        w7.f0.r(parcel, q6);
    }
}
