package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4543a;
    public final n f4544b;
    public final Boolean f4545c;
    public final long d;
    public final double f4546e;
    public final long[] f4547f;
    public String h;
    public final JSONObject f4548n;
    public final String f4549r;
    public final String f4550s;
    public final String v;
    public final String f4551w;
    public final long f4552x;
    public static final g6.b f4542y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4543a = mediaInfo;
        this.f4544b = nVar;
        this.f4545c = bool;
        this.d = j3;
        this.f4546e = d;
        this.f4547f = jArr;
        this.f4548n = jSONObject;
        this.f4549r = str;
        this.f4550s = str2;
        this.v = str3;
        this.f4551w = str4;
        this.f4552x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4548n, kVar.f4548n) && n6.l.l(this.f4543a, kVar.f4543a) && n6.l.l(this.f4544b, kVar.f4544b) && n6.l.l(this.f4545c, kVar.f4545c) && this.d == kVar.d && this.f4546e == kVar.f4546e && Arrays.equals(this.f4547f, kVar.f4547f) && n6.l.l(this.f4549r, kVar.f4549r) && n6.l.l(this.f4550s, kVar.f4550s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4551w, kVar.f4551w) && this.f4552x == kVar.f4552x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4543a, this.f4544b, this.f4545c, Long.valueOf(this.d), Double.valueOf(this.f4546e), this.f4547f, String.valueOf(this.f4548n), this.f4549r, this.f4550s, this.v, this.f4551w, Long.valueOf(this.f4552x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4548n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4543a, i10);
        w7.e0.k(parcel, 3, this.f4544b, i10);
        w7.e0.a(parcel, 4, this.f4545c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4546e);
        w7.e0.j(parcel, 7, this.f4547f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4549r);
        w7.e0.l(parcel, 10, this.f4550s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4551w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4552x);
        w7.e0.r(parcel, q6);
    }
}
