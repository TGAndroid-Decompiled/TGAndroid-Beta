package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class gt6 extends b4 {
    public final MediaInfo a;
    public final zt6 b;
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
    public static final ce6 E = new ce6("MediaLoadRequestData", null);
    public static final Parcelable.Creator<gt6> CREATOR = new jid((byte) 9);

    public gt6(MediaInfo mediaInfo, zt6 zt6Var, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = zt6Var;
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
        if (!(obj instanceof gt6)) {
            return false;
        }
        gt6 gt6Var = (gt6) obj;
        if (vw5.a(this.n, gt6Var.n) && fse.a(this.a, gt6Var.a) && fse.a(this.b, gt6Var.b) && fse.a(this.c, gt6Var.c) && this.d == gt6Var.d && this.e == gt6Var.e && Arrays.equals(this.f, gt6Var.f) && fse.a(this.r, gt6Var.r) && fse.a(this.s, gt6Var.s) && fse.a(this.w, gt6Var.w) && fse.a(this.x, gt6Var.x) && this.y == gt6Var.y) {
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.a(parcel, 4, this.c);
        mve.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        mve.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        mve.j(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.r);
        mve.l(parcel, 10, this.s);
        mve.l(parcel, 11, this.w);
        mve.l(parcel, 12, this.x);
        mve.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        mve.s(parcel, r);
    }
}
