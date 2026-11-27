package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class kt6 extends c4 {
    public final MediaInfo a;
    public final du6 b;
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
    public static final he6 E = new he6("MediaLoadRequestData", null);
    public static final Parcelable.Creator<kt6> CREATOR = new zkd((byte) 9);

    public kt6(MediaInfo mediaInfo, du6 du6Var, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = du6Var;
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
        if (!(obj instanceof kt6)) {
            return false;
        }
        kt6 kt6Var = (kt6) obj;
        if (ax5.a(this.n, kt6Var.n) && vue.a(this.a, kt6Var.a) && vue.a(this.b, kt6Var.b) && vue.a(this.c, kt6Var.c) && this.d == kt6Var.d && this.e == kt6Var.e && Arrays.equals(this.f, kt6Var.f) && vue.a(this.r, kt6Var.r) && vue.a(this.s, kt6Var.s) && vue.a(this.w, kt6Var.w) && vue.a(this.x, kt6Var.x) && this.y == kt6Var.y) {
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.a(parcel, 4, this.c);
        bye.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        bye.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        bye.j(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.r);
        bye.l(parcel, 10, this.s);
        bye.l(parcel, 11, this.w);
        bye.l(parcel, 12, this.x);
        bye.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        bye.s(parcel, r);
    }
}
