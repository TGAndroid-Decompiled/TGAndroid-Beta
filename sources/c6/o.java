package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f4542a;
    public int f4543b;
    public boolean f4544c;
    public double d;
    public double f4545e;
    public double f4546f;
    public long[] h;
    public String f4547n;
    public JSONObject f4548r;

    public o(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f4542a = mediaInfo;
        this.f4543b = i10;
        this.f4544c = z10;
        this.d = d;
        this.f4545e = d10;
        this.f4546f = d11;
        this.h = jArr;
        this.f4547n = str;
        if (str == null) {
            this.f4548r = null;
            return;
        }
        try {
            this.f4548r = new JSONObject(this.f4547n);
        } catch (JSONException unused) {
            this.f4548r = null;
            this.f4547n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f4542a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f4543b != (i10 = jSONObject.getInt("itemId"))) {
            this.f4543b = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f4544c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f4544c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f4545e) > 1.0E-7d) {
                this.f4545e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f4546f) > 1.0E-7d) {
                this.f4546f = d10;
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
            this.f4548r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f4542a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i10 = this.f4543b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f4544c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f4545e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f4546f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j3 : this.h) {
                    jSONArray.put(j3);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f4548r;
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
        JSONObject jSONObject = this.f4548r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f4548r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && g6.a.d(this.f4542a, oVar.f4542a) && this.f4543b == oVar.f4543b && this.f4544c == oVar.f4544c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f4545e == oVar.f4545e && this.f4546f == oVar.f4546f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4542a, Integer.valueOf(this.f4543b), Boolean.valueOf(this.f4544c), Double.valueOf(this.d), Double.valueOf(this.f4545e), Double.valueOf(this.f4546f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f4548r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4548r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4547n = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4542a, i10);
        int i11 = this.f4543b;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.f4544c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        w7.e0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.f4545e;
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f4546f;
        w7.e0.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        w7.e0.j(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4547n);
        w7.e0.r(parcel, q6);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
