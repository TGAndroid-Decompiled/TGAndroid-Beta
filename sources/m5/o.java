package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import g7.p8;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends y5.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f17445a;
    public int f17446b;
    public boolean f17447c;
    public double d;
    public double f17448e;
    public double f17449f;
    public long[] h;
    public String f17450n;
    public JSONObject f17451r;

    public o(MediaInfo mediaInfo, int i9, boolean z10, double d, double d9, double d10, long[] jArr, String str) {
        this.f17445a = mediaInfo;
        this.f17446b = i9;
        this.f17447c = z10;
        this.d = d;
        this.f17448e = d9;
        this.f17449f = d10;
        this.h = jArr;
        this.f17450n = str;
        if (str == null) {
            this.f17451r = null;
            return;
        }
        try {
            this.f17451r = new JSONObject(this.f17450n);
        } catch (JSONException unused) {
            this.f17451r = null;
            this.f17450n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i9;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f17445a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f17446b != (i9 = jSONObject.getInt("itemId"))) {
            this.f17446b = i9;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f17447c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f17447c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f17448e) > 1.0E-7d) {
                this.f17448e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d9 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d9 - this.f17449f) > 1.0E-7d) {
                this.f17449f = d9;
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
            this.f17451r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f17445a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i9 = this.f17446b;
            if (i9 != 0) {
                jSONObject.put("itemId", i9);
            }
            jSONObject.put("autoplay", this.f17447c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f17448e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f17449f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f17451r;
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
        JSONObject jSONObject = this.f17451r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f17451r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || e6.c.a(jSONObject, jSONObject2)) && q5.a.d(this.f17445a, oVar.f17445a) && this.f17446b == oVar.f17446b && this.f17447c == oVar.f17447c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f17448e == oVar.f17448e && this.f17449f == oVar.f17449f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17445a, Integer.valueOf(this.f17446b), Boolean.valueOf(this.f17447c), Double.valueOf(this.d), Double.valueOf(this.f17448e), Double.valueOf(this.f17449f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f17451r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f17451r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f17450n = jSONObject;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17445a, i9);
        int i10 = this.f17446b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z10 = this.f17447c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d9 = this.f17448e;
        p8.s(parcel, 6, 8);
        parcel.writeDouble(d9);
        double d10 = this.f17449f;
        p8.s(parcel, 7, 8);
        parcel.writeDouble(d10);
        p8.j(parcel, 8, this.h);
        p8.l(parcel, 9, this.f17450n);
        p8.r(parcel, q10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
