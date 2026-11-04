package e6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends q6.a {
    public final MediaInfo f9717a;
    public final n f9718b;
    public final Boolean f9719c;
    public final long d;
    public final double f9720e;
    public final long[] f9721f;
    public String h;
    public final JSONObject f9722n;
    public final String f9723r;
    public final String f9724s;
    public final String f9725w;
    public final String f9726x;
    public final long f9727y;
    public static final i6.b E = new i6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f9717a = mediaInfo;
        this.f9718b = nVar;
        this.f9719c = bool;
        this.d = j10;
        this.f9720e = d;
        this.f9721f = jArr;
        this.f9722n = jSONObject;
        this.f9723r = str;
        this.f9724s = str2;
        this.f9725w = str3;
        this.f9726x = str4;
        this.f9727y = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (w6.c.a(this.f9722n, kVar.f9722n) && p6.m.k(this.f9717a, kVar.f9717a) && p6.m.k(this.f9718b, kVar.f9718b) && p6.m.k(this.f9719c, kVar.f9719c) && this.d == kVar.d && this.f9720e == kVar.f9720e && Arrays.equals(this.f9721f, kVar.f9721f) && p6.m.k(this.f9723r, kVar.f9723r) && p6.m.k(this.f9724s, kVar.f9724s) && p6.m.k(this.f9725w, kVar.f9725w) && p6.m.k(this.f9726x, kVar.f9726x) && this.f9727y == kVar.f9727y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9717a, this.f9718b, this.f9719c, Long.valueOf(this.d), Double.valueOf(this.f9720e), this.f9721f, String.valueOf(this.f9722n), this.f9723r, this.f9724s, this.f9725w, this.f9726x, Long.valueOf(this.f9727y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String jSONObject;
        JSONObject jSONObject2 = this.f9722n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9717a, i3);
        j8.a.l(parcel, 3, this.f9718b, i3);
        j8.a.b(parcel, 4, this.f9719c);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.d);
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(this.f9720e);
        j8.a.k(parcel, 7, this.f9721f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.f9723r);
        j8.a.m(parcel, 10, this.f9724s);
        j8.a.m(parcel, 11, this.f9725w);
        j8.a.m(parcel, 12, this.f9726x);
        j8.a.r(parcel, 13, 8);
        parcel.writeLong(this.f9727y);
        j8.a.t(parcel, s6);
    }
}
