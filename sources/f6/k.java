package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11088a;
    public final n f11089b;
    public final Boolean f11090c;
    public final long d;
    public final double f11091e;
    public final long[] f11092f;
    public String h;
    public final JSONObject f11093n;
    public final String f11094r;
    public final String f11095s;
    public final String f11096w;
    public final String f11097x;
    public final long f11098y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11088a = mediaInfo;
        this.f11089b = nVar;
        this.f11090c = bool;
        this.d = j3;
        this.f11091e = d;
        this.f11092f = jArr;
        this.f11093n = jSONObject;
        this.f11094r = str;
        this.f11095s = str2;
        this.f11096w = str3;
        this.f11097x = str4;
        this.f11098y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11093n, kVar.f11093n) && q6.m.k(this.f11088a, kVar.f11088a) && q6.m.k(this.f11089b, kVar.f11089b) && q6.m.k(this.f11090c, kVar.f11090c) && this.d == kVar.d && this.f11091e == kVar.f11091e && Arrays.equals(this.f11092f, kVar.f11092f) && q6.m.k(this.f11094r, kVar.f11094r) && q6.m.k(this.f11095s, kVar.f11095s) && q6.m.k(this.f11096w, kVar.f11096w) && q6.m.k(this.f11097x, kVar.f11097x) && this.f11098y == kVar.f11098y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11088a, this.f11089b, this.f11090c, Long.valueOf(this.d), Double.valueOf(this.f11091e), this.f11092f, String.valueOf(this.f11093n), this.f11094r, this.f11095s, this.f11096w, this.f11097x, Long.valueOf(this.f11098y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11093n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11088a, i7);
        yb.k(parcel, 3, this.f11089b, i7);
        yb.a(parcel, 4, this.f11090c);
        yb.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        yb.q(parcel, 6, 8);
        parcel.writeDouble(this.f11091e);
        yb.j(parcel, 7, this.f11092f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.f11094r);
        yb.l(parcel, 10, this.f11095s);
        yb.l(parcel, 11, this.f11096w);
        yb.l(parcel, 12, this.f11097x);
        yb.q(parcel, 13, 8);
        parcel.writeLong(this.f11098y);
        yb.s(parcel, r10);
    }
}
