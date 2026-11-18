package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11405a;
    public final n f11406b;
    public final Boolean f11407c;
    public final long d;
    public final double f11408e;
    public final long[] f11409f;
    public String h;
    public final JSONObject f11410n;
    public final String f11411r;
    public final String f11412s;
    public final String f11413w;
    public final String f11414x;
    public final long f11415y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11405a = mediaInfo;
        this.f11406b = nVar;
        this.f11407c = bool;
        this.d = j3;
        this.f11408e = d;
        this.f11409f = jArr;
        this.f11410n = jSONObject;
        this.f11411r = str;
        this.f11412s = str2;
        this.f11413w = str3;
        this.f11414x = str4;
        this.f11415y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11410n, kVar.f11410n) && q6.m.l(this.f11405a, kVar.f11405a) && q6.m.l(this.f11406b, kVar.f11406b) && q6.m.l(this.f11407c, kVar.f11407c) && this.d == kVar.d && this.f11408e == kVar.f11408e && Arrays.equals(this.f11409f, kVar.f11409f) && q6.m.l(this.f11411r, kVar.f11411r) && q6.m.l(this.f11412s, kVar.f11412s) && q6.m.l(this.f11413w, kVar.f11413w) && q6.m.l(this.f11414x, kVar.f11414x) && this.f11415y == kVar.f11415y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11405a, this.f11406b, this.f11407c, Long.valueOf(this.d), Double.valueOf(this.f11408e), this.f11409f, String.valueOf(this.f11410n), this.f11411r, this.f11412s, this.f11413w, this.f11414x, Long.valueOf(this.f11415y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11410n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11405a, i7);
        bc.k(parcel, 3, this.f11406b, i7);
        bc.a(parcel, 4, this.f11407c);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        bc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11408e);
        bc.j(parcel, 7, this.f11409f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11411r);
        bc.l(parcel, 10, this.f11412s);
        bc.l(parcel, 11, this.f11413w);
        bc.l(parcel, 12, this.f11414x);
        bc.q(parcel, 13, 8);
        parcel.writeLong(this.f11415y);
        bc.s(parcel, r10);
    }
}
