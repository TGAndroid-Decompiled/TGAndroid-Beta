package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4864a;
    public final n f4865b;
    public final Boolean f4866c;
    public final long d;
    public final double e;
    public final long[] f4867f;
    public String h;
    public final JSONObject f4868n;
    public final String f4869r;
    public final String f4870s;
    public final String v;
    public final String f4871w;
    public final long f4872x;
    public static final g6.b f4863y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4864a = mediaInfo;
        this.f4865b = nVar;
        this.f4866c = bool;
        this.d = j10;
        this.e = d;
        this.f4867f = jArr;
        this.f4868n = jSONObject;
        this.f4869r = str;
        this.f4870s = str2;
        this.v = str3;
        this.f4871w = str4;
        this.f4872x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4868n, kVar.f4868n) && n6.l.l(this.f4864a, kVar.f4864a) && n6.l.l(this.f4865b, kVar.f4865b) && n6.l.l(this.f4866c, kVar.f4866c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4867f, kVar.f4867f) && n6.l.l(this.f4869r, kVar.f4869r) && n6.l.l(this.f4870s, kVar.f4870s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4871w, kVar.f4871w) && this.f4872x == kVar.f4872x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4864a, this.f4865b, this.f4866c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4867f, String.valueOf(this.f4868n), this.f4869r, this.f4870s, this.v, this.f4871w, Long.valueOf(this.f4872x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4868n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4864a, i10);
        w7.f0.k(parcel, 3, this.f4865b, i10);
        w7.f0.a(parcel, 4, this.f4866c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4867f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4869r);
        w7.f0.l(parcel, 10, this.f4870s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4871w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4872x);
        w7.f0.r(parcel, q6);
    }
}
