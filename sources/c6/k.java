package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4516a;
    public final n f4517b;
    public final Boolean f4518c;
    public final long d;
    public final double f4519e;
    public final long[] f4520f;
    public String h;
    public final JSONObject f4521n;
    public final String f4522r;
    public final String f4523s;
    public final String v;
    public final String f4524w;
    public final long f4525x;
    public static final g6.b f4515y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4516a = mediaInfo;
        this.f4517b = nVar;
        this.f4518c = bool;
        this.d = j3;
        this.f4519e = d;
        this.f4520f = jArr;
        this.f4521n = jSONObject;
        this.f4522r = str;
        this.f4523s = str2;
        this.v = str3;
        this.f4524w = str4;
        this.f4525x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4521n, kVar.f4521n) && n6.l.l(this.f4516a, kVar.f4516a) && n6.l.l(this.f4517b, kVar.f4517b) && n6.l.l(this.f4518c, kVar.f4518c) && this.d == kVar.d && this.f4519e == kVar.f4519e && Arrays.equals(this.f4520f, kVar.f4520f) && n6.l.l(this.f4522r, kVar.f4522r) && n6.l.l(this.f4523s, kVar.f4523s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4524w, kVar.f4524w) && this.f4525x == kVar.f4525x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4516a, this.f4517b, this.f4518c, Long.valueOf(this.d), Double.valueOf(this.f4519e), this.f4520f, String.valueOf(this.f4521n), this.f4522r, this.f4523s, this.v, this.f4524w, Long.valueOf(this.f4525x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4521n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4516a, i10);
        w7.e0.k(parcel, 3, this.f4517b, i10);
        w7.e0.a(parcel, 4, this.f4518c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.f4519e);
        w7.e0.j(parcel, 7, this.f4520f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4522r);
        w7.e0.l(parcel, 10, this.f4523s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4524w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4525x);
        w7.e0.r(parcel, q6);
    }
}
