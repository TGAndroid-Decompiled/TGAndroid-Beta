package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends r6.a {
    public final MediaInfo f11434a;
    public final n f11435b;
    public final Boolean f11436c;
    public final long d;
    public final double f11437e;
    public final long[] f11438f;
    public String h;
    public final JSONObject f11439n;
    public final String f11440r;
    public final String f11441s;
    public final String f11442w;
    public final String f11443x;
    public final long f11444y;
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f11434a = mediaInfo;
        this.f11435b = nVar;
        this.f11436c = bool;
        this.d = j3;
        this.f11437e = d;
        this.f11438f = jArr;
        this.f11439n = jSONObject;
        this.f11440r = str;
        this.f11441s = str2;
        this.f11442w = str3;
        this.f11443x = str4;
        this.f11444y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (x6.c.a(this.f11439n, kVar.f11439n) && q6.m.l(this.f11434a, kVar.f11434a) && q6.m.l(this.f11435b, kVar.f11435b) && q6.m.l(this.f11436c, kVar.f11436c) && this.d == kVar.d && this.f11437e == kVar.f11437e && Arrays.equals(this.f11438f, kVar.f11438f) && q6.m.l(this.f11440r, kVar.f11440r) && q6.m.l(this.f11441s, kVar.f11441s) && q6.m.l(this.f11442w, kVar.f11442w) && q6.m.l(this.f11443x, kVar.f11443x) && this.f11444y == kVar.f11444y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11434a, this.f11435b, this.f11436c, Long.valueOf(this.d), Double.valueOf(this.f11437e), this.f11438f, String.valueOf(this.f11439n), this.f11440r, this.f11441s, this.f11442w, this.f11443x, Long.valueOf(this.f11444y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11439n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11434a, i7);
        bc.k(parcel, 3, this.f11435b, i7);
        bc.a(parcel, 4, this.f11436c);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        bc.q(parcel, 6, 8);
        parcel.writeDouble(this.f11437e);
        bc.j(parcel, 7, this.f11438f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11440r);
        bc.l(parcel, 10, this.f11441s);
        bc.l(parcel, 11, this.f11442w);
        bc.l(parcel, 12, this.f11443x);
        bc.q(parcel, 13, 8);
        parcel.writeLong(this.f11444y);
        bc.s(parcel, r10);
    }
}
