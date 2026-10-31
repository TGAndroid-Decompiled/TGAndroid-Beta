package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.h0;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f3914a;
    public int f3915b;
    public boolean f3916c;
    public double d;
    public double e;
    public double f3917f;
    public long[] h;
    public String f3918n;
    public JSONObject f3919r;

    public o(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f3914a = mediaInfo;
        this.f3915b = i10;
        this.f3916c = z10;
        this.d = d;
        this.e = d10;
        this.f3917f = d11;
        this.h = jArr;
        this.f3918n = str;
        if (str == null) {
            this.f3919r = null;
            return;
        }
        try {
            this.f3919r = new JSONObject(this.f3918n);
        } catch (JSONException unused) {
            this.f3919r = null;
            this.f3918n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f3914a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f3915b != (i10 = jSONObject.getInt("itemId"))) {
            this.f3915b = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f3916c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f3916c = z11;
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
            if (Math.abs(d10 - this.f3917f) > 1.0E-7d) {
                this.f3917f = d10;
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
            this.f3919r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f3914a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i10 = this.f3915b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f3916c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f3917f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f3919r;
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
        JSONObject jSONObject = this.f3919r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f3919r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && g6.a.d(this.f3914a, oVar.f3914a) && this.f3915b == oVar.f3915b && this.f3916c == oVar.f3916c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f3917f == oVar.f3917f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3914a, Integer.valueOf(this.f3915b), Boolean.valueOf(this.f3916c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f3917f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f3919r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f3919r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f3918n = jSONObject;
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f3914a, i10);
        int i11 = this.f3915b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.f3916c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        h0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.e;
        h0.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f3917f;
        h0.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        h0.j(parcel, 8, this.h);
        h0.l(parcel, 9, this.f3918n);
        h0.r(parcel, q6);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
