package e6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f9744a;
    public int f9745b;
    public boolean f9746c;
    public double d;
    public double f9747e;
    public double f9748f;
    public long[] h;
    public String f9749n;
    public JSONObject f9750r;

    public o(MediaInfo mediaInfo, int i3, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f9744a = mediaInfo;
        this.f9745b = i3;
        this.f9746c = z10;
        this.d = d;
        this.f9747e = d10;
        this.f9748f = d11;
        this.h = jArr;
        this.f9749n = str;
        if (str == null) {
            this.f9750r = null;
            return;
        }
        try {
            this.f9750r = new JSONObject(this.f9749n);
        } catch (JSONException unused) {
            this.f9750r = null;
            this.f9749n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i3;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f9744a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f9745b != (i3 = jSONObject.getInt("itemId"))) {
            this.f9745b = i3;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f9746c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f9746c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f9747e) > 1.0E-7d) {
                this.f9747e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f9748f) > 1.0E-7d) {
                this.f9748f = d10;
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
            this.f9750r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f9744a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i3 = this.f9745b;
            if (i3 != 0) {
                jSONObject.put("itemId", i3);
            }
            jSONObject.put("autoplay", this.f9746c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f9747e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f9748f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f9750r;
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
        JSONObject jSONObject = this.f9750r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f9750r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w6.c.a(jSONObject, jSONObject2)) && i6.a.d(this.f9744a, oVar.f9744a) && this.f9745b == oVar.f9745b && this.f9746c == oVar.f9746c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f9747e == oVar.f9747e && this.f9748f == oVar.f9748f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9744a, Integer.valueOf(this.f9745b), Boolean.valueOf(this.f9746c), Double.valueOf(this.d), Double.valueOf(this.f9747e), Double.valueOf(this.f9748f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f9750r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String jSONObject;
        JSONObject jSONObject2 = this.f9750r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f9749n = jSONObject;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9744a, i3);
        int i10 = this.f9745b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z10 = this.f9746c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.f9747e;
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f9748f;
        j8.a.r(parcel, 7, 8);
        parcel.writeDouble(d11);
        j8.a.k(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.f9749n);
        j8.a.t(parcel, s6);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
