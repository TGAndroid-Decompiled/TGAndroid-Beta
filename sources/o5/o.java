package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends a6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f19304a;
    public int f19305b;
    public boolean f19306c;
    public double d;
    public double f19307e;
    public double f19308f;
    public long[] h;
    public String f19309n;
    public JSONObject f19310r;

    public o(MediaInfo mediaInfo, int i10, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.f19304a = mediaInfo;
        this.f19305b = i10;
        this.f19306c = z10;
        this.d = d;
        this.f19307e = d10;
        this.f19308f = d11;
        this.h = jArr;
        this.f19309n = str;
        if (str == null) {
            this.f19310r = null;
            return;
        }
        try {
            this.f19310r = new JSONObject(this.f19309n);
        } catch (JSONException unused) {
            this.f19310r = null;
            this.f19309n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f19304a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f19305b != (i10 = jSONObject.getInt("itemId"))) {
            this.f19305b = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f19306c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f19306c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f19307e) > 1.0E-7d) {
                this.f19307e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f19308f) > 1.0E-7d) {
                this.f19308f = d10;
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
            this.f19310r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f19304a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i10 = this.f19305b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f19306c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f19307e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f19308f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f19310r;
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
        JSONObject jSONObject = this.f19310r;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.f19310r;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || g6.c.a(jSONObject, jSONObject2)) && s5.a.d(this.f19304a, oVar.f19304a) && this.f19305b == oVar.f19305b && this.f19306c == oVar.f19306c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f19307e == oVar.f19307e && this.f19308f == oVar.f19308f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19304a, Integer.valueOf(this.f19305b), Boolean.valueOf(this.f19306c), Double.valueOf(this.d), Double.valueOf(this.f19307e), Double.valueOf(this.f19308f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f19310r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f19310r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f19309n = jSONObject;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19304a, i10);
        int i11 = this.f19305b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.f19306c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.f19307e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f19308f;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        com.google.android.gms.internal.cast.o.j(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.f19309n);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
