package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class gr6 extends b4 {
    public final MediaInfo a;
    public final yr6 b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    public String h;
    public final JSONObject n;
    public final String r;
    public final String s;
    public final String w;
    public final String x;
    public final long y;
    public static final dc6 E = new dc6("MediaLoadRequestData", null);
    public static final Parcelable.Creator<gr6> CREATOR = new igd((byte) 9);

    public gr6(MediaInfo mediaInfo, yr6 yr6Var, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = yr6Var;
        this.c = bool;
        this.d = j;
        this.e = d;
        this.f = jArr;
        this.n = jSONObject;
        this.r = str;
        this.s = str2;
        this.w = str3;
        this.x = str4;
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr6)) {
            return false;
        }
        gr6 gr6Var = (gr6) obj;
        if (vu5.a(this.n, gr6Var.n) && cqe.a(this.a, gr6Var.a) && cqe.a(this.b, gr6Var.b) && cqe.a(this.c, gr6Var.c) && this.d == gr6Var.d && this.e == gr6Var.e && Arrays.equals(this.f, gr6Var.f) && cqe.a(this.r, gr6Var.r) && cqe.a(this.s, gr6Var.s) && cqe.a(this.w, gr6Var.w) && cqe.a(this.x, gr6Var.x) && this.y == gr6Var.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.w, this.x, Long.valueOf(this.y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.k(parcel, 3, this.b, i);
        jte.a(parcel, 4, this.c);
        jte.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        jte.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        jte.j(parcel, 7, this.f);
        jte.l(parcel, 8, this.h);
        jte.l(parcel, 9, this.r);
        jte.l(parcel, 10, this.s);
        jte.l(parcel, 11, this.w);
        jte.l(parcel, 12, this.x);
        jte.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        jte.s(parcel, r);
    }
}
