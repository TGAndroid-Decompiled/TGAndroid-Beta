package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class eu6 extends c4 {
    public static final Parcelable.Creator<eu6> CREATOR = new zkd((byte) 15);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] h;
    public String n;
    public JSONObject r;

    public eu6(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
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
        if (!(obj instanceof eu6)) {
            return false;
        }
        eu6 eu6Var = (eu6) obj;
        JSONObject jSONObject = this.r;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = eu6Var.r;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || ax5.a(jSONObject, jSONObject2)) && qd1.d(this.a, eu6Var.a) && this.b == eu6Var.b && this.c == eu6Var.c && (((Double.isNaN(this.d) && Double.isNaN(eu6Var.d)) || this.d == eu6Var.d) && this.e == eu6Var.e && this.f == eu6Var.f && Arrays.equals(this.h, eu6Var.h))) {
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        int i2 = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.e;
        bye.q(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f;
        bye.q(parcel, 7, 8);
        parcel.writeDouble(d3);
        bye.j(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        bye.s(parcel, r);
    }

    public eu6(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
