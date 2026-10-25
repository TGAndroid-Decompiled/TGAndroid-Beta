package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends p6.a {
    public final MediaInfo f8089a;
    public final n f8090b;
    public final Boolean f8091c;
    public final long d;
    public final double e;
    public final long[] f8092f;
    public String h;
    public final JSONObject f8093n;
    public final String f8094r;
    public final String f8095s;
    public final String v;
    public final String f8096w;
    public final long f8097x;
    public static final h6.b f8088y = new h6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f8089a = mediaInfo;
        this.f8090b = nVar;
        this.f8091c = bool;
        this.d = j10;
        this.e = d;
        this.f8092f = jArr;
        this.f8093n = jSONObject;
        this.f8094r = str;
        this.f8095s = str2;
        this.v = str3;
        this.f8096w = str4;
        this.f8097x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (v6.c.a(this.f8093n, kVar.f8093n) && o6.l.l(this.f8089a, kVar.f8089a) && o6.l.l(this.f8090b, kVar.f8090b) && o6.l.l(this.f8091c, kVar.f8091c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f8092f, kVar.f8092f) && o6.l.l(this.f8094r, kVar.f8094r) && o6.l.l(this.f8095s, kVar.f8095s) && o6.l.l(this.v, kVar.v) && o6.l.l(this.f8096w, kVar.f8096w) && this.f8097x == kVar.f8097x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8089a, this.f8090b, this.f8091c, Long.valueOf(this.d), Double.valueOf(this.e), this.f8092f, String.valueOf(this.f8093n), this.f8094r, this.f8095s, this.v, this.f8096w, Long.valueOf(this.f8097x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f8093n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8089a, i10);
        df.k(parcel, 3, this.f8090b, i10);
        df.a(parcel, 4, this.f8091c);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        df.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        df.j(parcel, 7, this.f8092f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.f8094r);
        df.l(parcel, 10, this.f8095s);
        df.l(parcel, 11, this.v);
        df.l(parcel, 12, this.f8096w);
        df.s(parcel, 13, 8);
        parcel.writeLong(this.f8097x);
        df.r(parcel, q5);
    }
}
