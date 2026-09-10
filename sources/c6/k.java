package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends o6.a {
    public final MediaInfo f4419a;
    public final n f4420b;
    public final Boolean f4421c;
    public final long d;
    public final double e;
    public final long[] f4422f;
    public String h;
    public final JSONObject f4423n;
    public final String f4424r;
    public final String f4425s;
    public final String v;
    public final String f4426w;
    public final long f4427x;
    public static final g6.b f4418y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f4419a = mediaInfo;
        this.f4420b = nVar;
        this.f4421c = bool;
        this.d = j3;
        this.e = d;
        this.f4422f = jArr;
        this.f4423n = jSONObject;
        this.f4424r = str;
        this.f4425s = str2;
        this.v = str3;
        this.f4426w = str4;
        this.f4427x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (u6.c.a(this.f4423n, kVar.f4423n) && n6.l.l(this.f4419a, kVar.f4419a) && n6.l.l(this.f4420b, kVar.f4420b) && n6.l.l(this.f4421c, kVar.f4421c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f4422f, kVar.f4422f) && n6.l.l(this.f4424r, kVar.f4424r) && n6.l.l(this.f4425s, kVar.f4425s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.f4426w, kVar.f4426w) && this.f4427x == kVar.f4427x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4419a, this.f4420b, this.f4421c, Long.valueOf(this.d), Double.valueOf(this.e), this.f4422f, String.valueOf(this.f4423n), this.f4424r, this.f4425s, this.v, this.f4426w, Long.valueOf(this.f4427x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4423n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4419a, i10);
        w7.e0.k(parcel, 3, this.f4420b, i10);
        w7.e0.a(parcel, 4, this.f4421c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.e0.j(parcel, 7, this.f4422f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4424r);
        w7.e0.l(parcel, 10, this.f4425s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.f4426w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.f4427x);
        w7.e0.r(parcel, q6);
    }
}
