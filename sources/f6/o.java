package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f11306a;
    public int f11307b;
    public boolean f11308c;
    public double d;
    public double f11309e;
    public double f11310f;
    public long[] h;
    public String f11311n;
    public JSONObject f11312r;

    public o(MediaInfo mediaInfo, int i7, boolean z9, double d, double d2, double d10, long[] jArr, String str) {
        this.f11306a = mediaInfo;
        this.f11307b = i7;
        this.f11308c = z9;
        this.d = d;
        this.f11309e = d2;
        this.f11310f = d10;
        this.h = jArr;
        this.f11311n = str;
        if (str == null) {
            this.f11312r = null;
            return;
        }
        try {
            this.f11312r = new JSONObject(this.f11311n);
        } catch (JSONException unused) {
            this.f11312r = null;
            this.f11311n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z9;
        long[] jArr;
        boolean z10;
        int i7;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.f11306a = new MediaInfo(jSONObject.getJSONObject("media"));
            z9 = true;
        } else {
            z9 = false;
        }
        if (jSONObject.has("itemId") && this.f11307b != (i7 = jSONObject.getInt("itemId"))) {
            this.f11307b = i7;
            z9 = true;
        }
        if (jSONObject.has("autoplay") && this.f11308c != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.f11308c = z10;
            z9 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z9 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f11309e) > 1.0E-7d) {
                this.f11309e = d;
                z9 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f11310f) > 1.0E-7d) {
                this.f11310f = d2;
                z9 = true;
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
            z11 = true;
            break;
        } else {
            jArr = null;
        }
        if (z11) {
            this.h = jArr;
            z9 = true;
        }
        if (jSONObject.has("customData")) {
            this.f11312r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z9;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f11306a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i7 = this.f11307b;
            if (i7 != 0) {
                jSONObject.put("itemId", i7);
            }
            jSONObject.put("autoplay", this.f11308c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f11309e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f11310f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j3 : this.h) {
                    jSONArray.put(j3);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f11312r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.f11312r;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = oVar.f11312r;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && j6.a.d(this.f11306a, oVar.f11306a) && this.f11307b == oVar.f11307b && this.f11308c == oVar.f11308c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f11309e == oVar.f11309e && this.f11310f == oVar.f11310f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11306a, Integer.valueOf(this.f11307b), Boolean.valueOf(this.f11308c), Double.valueOf(this.d), Double.valueOf(this.f11309e), Double.valueOf(this.f11310f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f11312r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11312r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11311n = jSONObject;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11306a, i7);
        int i10 = this.f11307b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z9 = this.f11308c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(z9 ? 1 : 0);
        double d = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f11309e;
        xb.q(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d10 = this.f11310f;
        xb.q(parcel, 7, 8);
        parcel.writeDouble(d10);
        xb.j(parcel, 8, this.h);
        xb.l(parcel, 9, this.f11311n);
        xb.s(parcel, r10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
