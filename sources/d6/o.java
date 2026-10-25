package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f8111a;
    public int f8112b;
    public boolean f8113c;
    public double d;
    public double e;
    public double f8114f;
    public long[] h;
    public String f8115n;
    public JSONObject f8116r;

    public o(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f8111a = mediaInfo;
        this.f8112b = i10;
        this.f8113c = z10;
        this.d = d;
        this.e = d10;
        this.f8114f = d11;
        this.h = jArr;
        this.f8115n = str;
        if (str == null) {
            this.f8116r = null;
            return;
        }
        try {
            this.f8116r = new JSONObject(this.f8115n);
        } catch (JSONException unused) {
            this.f8116r = null;
            this.f8115n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f8111a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f8112b != (i10 = jSONObject.getInt("itemId"))) {
            this.f8112b = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f8113c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f8113c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f8114f) > 1.0E-7d) {
                this.f8114f = d10;
                z10 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = jSONArray.getLong(i11);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.h[i12] == jArr[i12]) {
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
            this.f8116r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f8111a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i10 = this.f8112b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f8113c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f8114f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f8116r;
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
        JSONObject jSONObject = this.f8116r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f8116r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || v6.c.a(jSONObject, jSONObject2)) && h6.a.d(this.f8111a, oVar.f8111a) && this.f8112b == oVar.f8112b && this.f8113c == oVar.f8113c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f8114f == oVar.f8114f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8111a, Integer.valueOf(this.f8112b), Boolean.valueOf(this.f8113c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f8114f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f8116r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f8116r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f8115n = jSONObject;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8111a, i10);
        int i11 = this.f8112b;
        df.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.f8113c;
        df.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        df.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.e;
        df.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f8114f;
        df.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        df.j(parcel, 8, this.h);
        df.l(parcel, 9, this.f8115n);
        df.r(parcel, q5);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
