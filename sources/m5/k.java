package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import g7.p8;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends y5.a {
    public final MediaInfo f17419a;
    public final n f17420b;
    public final Boolean f17421c;
    public final long d;
    public final double f17422e;
    public final long[] f17423f;
    public String h;
    public final JSONObject f17424n;
    public final String f17425r;
    public final String f17426s;
    public final String v;
    public final String f17427w;
    public final long f17428x;
    public static final q5.b f17418y = new q5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f17419a = mediaInfo;
        this.f17420b = nVar;
        this.f17421c = bool;
        this.d = j10;
        this.f17422e = d;
        this.f17423f = jArr;
        this.f17424n = jSONObject;
        this.f17425r = str;
        this.f17426s = str2;
        this.v = str3;
        this.f17427w = str4;
        this.f17428x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (e6.c.a(this.f17424n, kVar.f17424n) && x5.l.l(this.f17419a, kVar.f17419a) && x5.l.l(this.f17420b, kVar.f17420b) && x5.l.l(this.f17421c, kVar.f17421c) && this.d == kVar.d && this.f17422e == kVar.f17422e && Arrays.equals(this.f17423f, kVar.f17423f) && x5.l.l(this.f17425r, kVar.f17425r) && x5.l.l(this.f17426s, kVar.f17426s) && x5.l.l(this.v, kVar.v) && x5.l.l(this.f17427w, kVar.f17427w) && this.f17428x == kVar.f17428x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17419a, this.f17420b, this.f17421c, Long.valueOf(this.d), Double.valueOf(this.f17422e), this.f17423f, String.valueOf(this.f17424n), this.f17425r, this.f17426s, this.v, this.f17427w, Long.valueOf(this.f17428x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f17424n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17419a, i9);
        p8.k(parcel, 3, this.f17420b, i9);
        p8.a(parcel, 4, this.f17421c);
        p8.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        p8.s(parcel, 6, 8);
        parcel.writeDouble(this.f17422e);
        p8.j(parcel, 7, this.f17423f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.f17425r);
        p8.l(parcel, 10, this.f17426s);
        p8.l(parcel, 11, this.v);
        p8.l(parcel, 12, this.f17427w);
        p8.s(parcel, 13, 8);
        parcel.writeLong(this.f17428x);
        p8.r(parcel, q10);
    }
}
