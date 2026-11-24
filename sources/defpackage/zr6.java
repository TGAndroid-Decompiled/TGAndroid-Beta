package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class zr6 extends b4 {
    public static final Parcelable.Creator<zr6> CREATOR = new igd((byte) 15);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] h;
    public String n;
    public JSONObject r;

    public zr6(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.h = jArr;
        this.n = str;
        if (str != null) {
            try {
                this.r = new JSONObject(this.n);
                return;
            } catch (JSONException unused) {
                this.r = null;
                this.n = null;
                return;
            }
        }
        this.r = null;
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.b != (i = jSONObject.getInt("itemId"))) {
            this.b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.c = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f) > 1.0E-7d) {
                this.f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.h[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.h = jArr;
            z = true;
        }
        if (jSONObject.has("customData")) {
            this.r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i = this.b;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.h) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr6)) {
            return false;
        }
        zr6 zr6Var = (zr6) obj;
        JSONObject jSONObject = this.r;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = zr6Var.r;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || vu5.a(jSONObject, jSONObject2)) && id1.d(this.a, zr6Var.a) && this.b == zr6Var.b && this.c == zr6Var.c && (((Double.isNaN(this.d) && Double.isNaN(zr6Var.d)) || this.d == zr6Var.d) && this.e == zr6Var.e && this.f == zr6Var.f && Arrays.equals(this.h, zr6Var.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.n = jSONObject;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        int i2 = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.e;
        jte.q(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f;
        jte.q(parcel, 7, 8);
        parcel.writeDouble(d3);
        jte.j(parcel, 8, this.h);
        jte.l(parcel, 9, this.n);
        jte.s(parcel, r);
    }

    public zr6(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
