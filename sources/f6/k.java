package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11408a;
    public final n f11409b;
    public final Boolean f11410c;
    public final long d;
    public final double f11411e;
    public final long[] f11412f;
    public String h;
    public final JSONObject f11413n;
    public final String f11414r;
    public final String f11415s;
    public final String f11416w;
    public final String f11417x;
    public final long f11418y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11408a = mediaInfo;
        this.f11409b = nVar;
        this.f11410c = bool;
        this.d = j3;
        this.f11411e = d;
        this.f11412f = jArr;
        this.f11413n = jSONObject;
        this.f11414r = str;
        this.f11415s = str2;
        this.f11416w = str3;
        this.f11417x = str4;
        this.f11418y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11413n, kVar.f11413n) && q6.m.l(this.f11408a, kVar.f11408a) && q6.m.l(this.f11409b, kVar.f11409b) && q6.m.l(this.f11410c, kVar.f11410c) && this.d == kVar.d && this.f11411e == kVar.f11411e && Arrays.equals(this.f11412f, kVar.f11412f) && q6.m.l(this.f11414r, kVar.f11414r) && q6.m.l(this.f11415s, kVar.f11415s) && q6.m.l(this.f11416w, kVar.f11416w) && q6.m.l(this.f11417x, kVar.f11417x) && this.f11418y == kVar.f11418y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11408a, this.f11409b, this.f11410c, Long.valueOf(this.d), Double.valueOf(this.f11411e), this.f11412f, String.valueOf(this.f11413n), this.f11414r, this.f11415s, this.f11416w, this.f11417x, Long.valueOf(this.f11418y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11413n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11408a, i7);
        bc.k(parcel, 3, this.f11409b, i7);
        bc.a(parcel, 4, this.f11410c);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        bc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11411e);
        bc.j(parcel, 7, this.f11412f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11414r);
        bc.l(parcel, 10, this.f11415s);
        bc.l(parcel, 11, this.f11416w);
        bc.l(parcel, 12, this.f11417x);
        bc.q(parcel, 13, 8);
        parcel.writeLong(this.f11418y);
        bc.s(parcel, r10);
    }
}
