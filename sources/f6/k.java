package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11437a;
    public final n f11438b;
    public final Boolean f11439c;
    public final long d;
    public final double f11440e;
    public final long[] f11441f;
    public String h;
    public final JSONObject f11442n;
    public final String f11443r;
    public final String f11444s;
    public final String f11445w;
    public final String f11446x;
    public final long f11447y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11437a = mediaInfo;
        this.f11438b = nVar;
        this.f11439c = bool;
        this.d = j3;
        this.f11440e = d;
        this.f11441f = jArr;
        this.f11442n = jSONObject;
        this.f11443r = str;
        this.f11444s = str2;
        this.f11445w = str3;
        this.f11446x = str4;
        this.f11447y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11442n, kVar.f11442n) && q6.m.l(this.f11437a, kVar.f11437a) && q6.m.l(this.f11438b, kVar.f11438b) && q6.m.l(this.f11439c, kVar.f11439c) && this.d == kVar.d && this.f11440e == kVar.f11440e && Arrays.equals(this.f11441f, kVar.f11441f) && q6.m.l(this.f11443r, kVar.f11443r) && q6.m.l(this.f11444s, kVar.f11444s) && q6.m.l(this.f11445w, kVar.f11445w) && q6.m.l(this.f11446x, kVar.f11446x) && this.f11447y == kVar.f11447y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11437a, this.f11438b, this.f11439c, Long.valueOf(this.d), Double.valueOf(this.f11440e), this.f11441f, String.valueOf(this.f11442n), this.f11443r, this.f11444s, this.f11445w, this.f11446x, Long.valueOf(this.f11447y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11442n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11437a, i7);
        bc.k(parcel, 3, this.f11438b, i7);
        bc.a(parcel, 4, this.f11439c);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        bc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11440e);
        bc.j(parcel, 7, this.f11441f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11443r);
        bc.l(parcel, 10, this.f11444s);
        bc.l(parcel, 11, this.f11445w);
        bc.l(parcel, 12, this.f11446x);
        bc.q(parcel, 13, 8);
        parcel.writeLong(this.f11447y);
        bc.s(parcel, r10);
    }
}
