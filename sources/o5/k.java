package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends a6.a {
    public final MediaInfo f19278a;
    public final n f19279b;
    public final Boolean f19280c;
    public final long d;
    public final double f19281e;
    public final long[] f19282f;
    public String h;
    public final JSONObject f19283n;
    public final String f19284r;
    public final String f19285s;
    public final String v;
    public final String f19286w;
    public final long f19287x;
    public static final s5.b f19277y = new s5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f19278a = mediaInfo;
        this.f19279b = nVar;
        this.f19280c = bool;
        this.d = j10;
        this.f19281e = d;
        this.f19282f = jArr;
        this.f19283n = jSONObject;
        this.f19284r = str;
        this.f19285s = str2;
        this.v = str3;
        this.f19286w = str4;
        this.f19287x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (g6.c.a(this.f19283n, kVar.f19283n) && z5.l.l(this.f19278a, kVar.f19278a) && z5.l.l(this.f19279b, kVar.f19279b) && z5.l.l(this.f19280c, kVar.f19280c) && this.d == kVar.d && this.f19281e == kVar.f19281e && Arrays.equals(this.f19282f, kVar.f19282f) && z5.l.l(this.f19284r, kVar.f19284r) && z5.l.l(this.f19285s, kVar.f19285s) && z5.l.l(this.v, kVar.v) && z5.l.l(this.f19286w, kVar.f19286w) && this.f19287x == kVar.f19287x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19278a, this.f19279b, this.f19280c, Long.valueOf(this.d), Double.valueOf(this.f19281e), this.f19282f, String.valueOf(this.f19283n), this.f19284r, this.f19285s, this.v, this.f19286w, Long.valueOf(this.f19287x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f19283n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19278a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f19279b, i10);
        com.google.android.gms.internal.cast.o.a(parcel, 4, this.f19280c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeDouble(this.f19281e);
        com.google.android.gms.internal.cast.o.j(parcel, 7, this.f19282f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.f19284r);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f19285s);
        com.google.android.gms.internal.cast.o.l(parcel, 11, this.v);
        com.google.android.gms.internal.cast.o.l(parcel, 12, this.f19286w);
        com.google.android.gms.internal.cast.o.s(parcel, 13, 8);
        parcel.writeLong(this.f19287x);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
