package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import h7.r8;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p extends z5.a {
    public static final Parcelable.Creator<p> CREATOR = new w(14);

    public MediaInfo f17824a;

    public int f17825b;

    public boolean f17826c;
    public double d;

    public double f17827e;

    public double f17828f;
    public long[] h;

    public String f17829n;

    public JSONObject f17830r;

    public p(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f17824a = mediaInfo;
        this.f17825b = i10;
        this.f17826c = z10;
        this.d = d;
        this.f17827e = d10;
        this.f17828f = d11;
        this.h = jArr;
        this.f17829n = str;
        if (str == null) {
            this.f17830r = null;
            return;
        }
        try {
            this.f17830r = new JSONObject(this.f17829n);
        } catch (JSONException unused) {
            this.f17830r = null;
            this.f17829n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) throws JSONException {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f17824a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f17825b != (i10 = jSONObject.getInt("itemId"))) {
            this.f17825b = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f17826c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f17826c = z11;
            z10 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.d) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.d) > 1.0E-7d)) {
            this.d = dOptDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f17827e) > 1.0E-7d) {
                this.f17827e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f17828f) > 1.0E-7d) {
                this.f17828f = d10;
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
            if (jArr2 == null || jArr2.length != length) {
                z12 = true;
                break;
            }
            for (int i12 = 0; i12 < length; i12++) {
                if (this.h[i12] != jArr[i12]) {
                    z12 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z12) {
            this.h = jArr;
            z10 = true;
        }
        if (!jSONObject.has("customData")) {
            return z10;
        }
        this.f17830r = jSONObject.getJSONObject("customData");
        return true;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f17824a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i10 = this.f17825b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f17826c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f17827e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f17828f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f17830r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        JSONObject jSONObject = this.f17830r;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = pVar.f17830r;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || f6.c.a(jSONObject, jSONObject2)) && r5.a.d(this.f17824a, pVar.f17824a) && this.f17825b == pVar.f17825b && this.f17826c == pVar.f17826c && ((Double.isNaN(this.d) && Double.isNaN(pVar.d)) || this.d == pVar.d) && this.f17827e == pVar.f17827e && this.f17828f == pVar.f17828f && Arrays.equals(this.h, pVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17824a, Integer.valueOf(this.f17825b), Boolean.valueOf(this.f17826c), Double.valueOf(this.d), Double.valueOf(this.f17827e), Double.valueOf(this.f17828f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f17830r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f17830r;
        this.f17829n = jSONObject == null ? null : jSONObject.toString();
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f17824a, i10);
        int i11 = this.f17825b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.f17826c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        r8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.f17827e;
        r8.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f17828f;
        r8.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        r8.j(parcel, 8, this.h);
        r8.l(parcel, 9, this.f17829n);
        r8.r(parcel, iQ);
    }

    public p(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
