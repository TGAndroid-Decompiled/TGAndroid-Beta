package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4861a;
    public final n f4862b;
    public final Boolean f4863c;
    public final long d;
    public final double e;
    public final long[] f4864f;
    public String h;
    public final JSONObject f4865n;
    public final String f4866r;
    public final String f4867s;
    public final String v;
    public final String f4868w;
    public final long f4869x;
    public static final g6.b f4860y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f4861a = mediaInfo;
        this.f4862b = nVar;
        this.f4863c = bool;
        this.d = j10;
        this.e = d;
        this.f4864f = jArr;
        this.f4865n = jSONObject;
        this.f4866r = str;
        this.f4867s = str2;
        this.v = str3;
        this.f4868w = str4;
        this.f4869x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4865n, kVar.f4865n) && n6.l.l(this.f4861a, kVar.f4861a) && n6.l.l(this.f4862b, kVar.f4862b) && n6.l.l(this.f4863c, kVar.f4863c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4864f, kVar.f4864f) && n6.l.l(this.f4866r, kVar.f4866r) && n6.l.l(this.f4867s, kVar.f4867s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4868w, kVar.f4868w) && this.f4869x == kVar.f4869x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4861a, this.f4862b, this.f4863c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4864f, String.valueOf(this.f4865n), this.f4866r, this.f4867s, this.v, this.f4868w, Long.valueOf(this.f4869x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4865n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4861a, i10);
        w7.f0.k(parcel, 3, this.f4862b, i10);
        w7.f0.a(parcel, 4, this.f4863c);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.f0.j(parcel, 7, this.f4864f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4866r);
        w7.f0.l(parcel, 10, this.f4867s);
        w7.f0.l(parcel, 11, this.v);
        w7.f0.l(parcel, 12, this.f4868w);
        w7.f0.s(parcel, 13, 8);
        parcel.writeLong(this.f4869x);
        w7.f0.r(parcel, q6);
    }
}
