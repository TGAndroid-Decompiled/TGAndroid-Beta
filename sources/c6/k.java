package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
import w7.h0;
public final class k extends o6.a {
    public final MediaInfo f3891a;
    public final n f3892b;
    public final Boolean f3893c;
    public final long d;
    public final double e;
    public final long[] f3894f;
    public String h;
    public final JSONObject f3895n;
    public final String f3896r;
    public final String f3897s;
    public final String f3898w;
    public final String f3899x;
    public final long f3900y;
    public static final g6.b D = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f3891a = mediaInfo;
        this.f3892b = nVar;
        this.f3893c = bool;
        this.d = j10;
        this.e = d;
        this.f3894f = jArr;
        this.f3895n = jSONObject;
        this.f3896r = str;
        this.f3897s = str2;
        this.f3898w = str3;
        this.f3899x = str4;
        this.f3900y = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f3895n, kVar.f3895n) && n6.l.k(this.f3891a, kVar.f3891a) && n6.l.k(this.f3892b, kVar.f3892b) && n6.l.k(this.f3893c, kVar.f3893c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f3894f, kVar.f3894f) && n6.l.k(this.f3896r, kVar.f3896r) && n6.l.k(this.f3897s, kVar.f3897s) && n6.l.k(this.f3898w, kVar.f3898w) && n6.l.k(this.f3899x, kVar.f3899x) && this.f3900y == kVar.f3900y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3891a, this.f3892b, this.f3893c, Long.valueOf(this.d), Double.valueOf(this.e), this.f3894f, String.valueOf(this.f3895n), this.f3896r, this.f3897s, this.f3898w, this.f3899x, Long.valueOf(this.f3900y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f3895n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f3891a, i10);
        h0.k(parcel, 3, this.f3892b, i10);
        h0.a(parcel, 4, this.f3893c);
        h0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        h0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        h0.j(parcel, 7, this.f3894f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.f3896r);
        h0.l(parcel, 10, this.f3897s);
        h0.l(parcel, 11, this.f3898w);
        h0.l(parcel, 12, this.f3899x);
        h0.s(parcel, 13, 8);
        parcel.writeLong(this.f3900y);
        h0.r(parcel, q6);
    }
}
