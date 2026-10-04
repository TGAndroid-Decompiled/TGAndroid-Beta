package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;
public final class k extends o6.a {
    public final MediaInfo f4323a;
    public final n f4324b;
    public final Boolean f4325c;
    public final long d;
    public final double f4326e;
    public final long[] f4327f;
    public String h;
    public final JSONObject f4328n;
    public final String f4329r;
    public final String f4330s;
    public final String v;
    public final String f4331w;
    public final long f4332x;
    public static final g6.b f4322y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4323a = mediaInfo;
        this.f4324b = nVar;
        this.f4325c = bool;
        this.d = j3;
        this.f4326e = d;
        this.f4327f = jArr;
        this.f4328n = jSONObject;
        this.f4329r = str;
        this.f4330s = str2;
        this.v = str3;
        this.f4331w = str4;
        this.f4332x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4328n, kVar.f4328n) && n6.l.l(this.f4323a, kVar.f4323a) && n6.l.l(this.f4324b, kVar.f4324b) && n6.l.l(this.f4325c, kVar.f4325c) && this.d == kVar.d && this.f4326e == kVar.f4326e && Arrays.equals(this.f4327f, kVar.f4327f) && n6.l.l(this.f4329r, kVar.f4329r) && n6.l.l(this.f4330s, kVar.f4330s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4331w, kVar.f4331w) && this.f4332x == kVar.f4332x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4323a, this.f4324b, this.f4325c, Long.valueOf(this.d), Double.valueOf(this.f4326e), this.f4327f, String.valueOf(this.f4328n), this.f4329r, this.f4330s, this.v, this.f4331w, Long.valueOf(this.f4332x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4328n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4323a, i10);
        g0.k(parcel, 3, this.f4324b, i10);
        g0.a(parcel, 4, this.f4325c);
        g0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4326e);
        g0.j(parcel, 7, this.f4327f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f4329r);
        g0.l(parcel, 10, this.f4330s);
        g0.l(parcel, 11, this.v);
        g0.l(parcel, 12, this.f4331w);
        g0.s(parcel, 13, 8);
        parcel.writeLong(this.f4332x);
        g0.r(parcel, q6);
    }
}
