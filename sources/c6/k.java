package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4866a;
    public final n f4867b;
    public final Boolean f4868c;
    public final long d;
    public final double e;
    public final long[] f4869f;
    public String h;
    public final JSONObject f4870n;
    public final String f4871r;
    public final String f4872s;
    public final String v;
    public final String f4873w;
    public final long f4874x;
    public static final g6.b f4865y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4866a = mediaInfo;
        this.f4867b = nVar;
        this.f4868c = bool;
        this.d = j10;
        this.e = d;
        this.f4869f = jArr;
        this.f4870n = jSONObject;
        this.f4871r = str;
        this.f4872s = str2;
        this.v = str3;
        this.f4873w = str4;
        this.f4874x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4870n, kVar.f4870n) && n6.l.l(this.f4866a, kVar.f4866a) && n6.l.l(this.f4867b, kVar.f4867b) && n6.l.l(this.f4868c, kVar.f4868c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4869f, kVar.f4869f) && n6.l.l(this.f4871r, kVar.f4871r) && n6.l.l(this.f4872s, kVar.f4872s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4873w, kVar.f4873w) && this.f4874x == kVar.f4874x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4866a, this.f4867b, this.f4868c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4869f, String.valueOf(this.f4870n), this.f4871r, this.f4872s, this.v, this.f4873w, Long.valueOf(this.f4874x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4870n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4866a, i10);
        w7.f0.k(parcel, 3, this.f4867b, i10);
        w7.f0.a(parcel, 4, this.f4868c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4869f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4871r);
        w7.f0.l(parcel, 10, this.f4872s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4873w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4874x);
        w7.f0.r(parcel, q6);
    }
}
