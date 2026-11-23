package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f11427a;
    public int f11428b;
    public boolean f11429c;
    public double d;
    public double f11430e;
    public double f11431f;
    public long[] h;
    public String f11432n;
    public JSONObject f11433r;

    public o(MediaInfo mediaInfo, int i7, boolean z10, double d, double d2, double d10, long[] jArr, String str) {
        this.f11427a = mediaInfo;
        this.f11428b = i7;
        this.f11429c = z10;
        this.d = d;
        this.f11430e = d2;
        this.f11431f = d10;
        this.h = jArr;
        this.f11432n = str;
        if (str == null) {
            this.f11433r = null;
            return;
        }
        try {
            this.f11433r = new JSONObject(this.f11432n);
        } catch (JSONException unused) {
            this.f11433r = null;
            this.f11432n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i7;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f11427a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f11428b != (i7 = jSONObject.getInt("itemId"))) {
            this.f11428b = i7;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f11429c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f11429c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f11430e) > 1.0E-7d) {
                this.f11430e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f11431f) > 1.0E-7d) {
                this.f11431f = d2;
                z10 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.getLong(i10);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.h[i11] == jArr[i11]) {
                    }
                }
            }
            z12 = true;
            break;
        } else {
            jArr = null;
        }
        if (z12) {
            this.h = jArr;
            z10 = true;
        }
        if (jSONObject.has("customData")) {
            this.f11433r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f11427a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i7 = this.f11428b;
            if (i7 != 0) {
                jSONObject.put("itemId", i7);
            }
            jSONObject.put("autoplay", this.f11429c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f11430e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f11431f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j3 : this.h) {
                    jSONArray.put(j3);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f11433r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.f11433r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f11433r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && j6.a.d(this.f11427a, oVar.f11427a) && this.f11428b == oVar.f11428b && this.f11429c == oVar.f11429c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f11430e == oVar.f11430e && this.f11431f == oVar.f11431f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11427a, Integer.valueOf(this.f11428b), Boolean.valueOf(this.f11429c), Double.valueOf(this.d), Double.valueOf(this.f11430e), Double.valueOf(this.f11431f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f11433r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11433r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11432n = jSONObject;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11427a, i7);
        int i10 = this.f11428b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z10 = this.f11429c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        cc.q(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f11430e;
        cc.q(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d10 = this.f11431f;
        cc.q(parcel, 7, 8);
        parcel.writeDouble(d10);
        cc.j(parcel, 8, this.h);
        cc.l(parcel, 9, this.f11432n);
        cc.s(parcel, r10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
