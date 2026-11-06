package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f11301a;
    public int f11302b;
    public boolean f11303c;
    public double d;
    public double f11304e;
    public double f11305f;
    public long[] h;
    public String f11306n;
    public JSONObject f11307r;

    public o(MediaInfo mediaInfo, int i7, boolean z9, double d, double d2, double d10, long[] jArr, String str) {
        this.f11301a = mediaInfo;
        this.f11302b = i7;
        this.f11303c = z9;
        this.d = d;
        this.f11304e = d2;
        this.f11305f = d10;
        this.h = jArr;
        this.f11306n = str;
        if (str == null) {
            this.f11307r = null;
            return;
        }
        try {
            this.f11307r = new JSONObject(this.f11306n);
        } catch (JSONException unused) {
            this.f11307r = null;
            this.f11306n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z9;
        long[] jArr;
        boolean z10;
        int i7;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.f11301a = new MediaInfo(jSONObject.getJSONObject("media"));
            z9 = true;
        } else {
            z9 = false;
        }
        if (jSONObject.has("itemId") && this.f11302b != (i7 = jSONObject.getInt("itemId"))) {
            this.f11302b = i7;
            z9 = true;
        }
        if (jSONObject.has("autoplay") && this.f11303c != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.f11303c = z10;
            z9 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z9 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f11304e) > 1.0E-7d) {
                this.f11304e = d;
                z9 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f11305f) > 1.0E-7d) {
                this.f11305f = d2;
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
            this.f11307r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z9;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f11301a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i7 = this.f11302b;
            if (i7 != 0) {
                jSONObject.put("itemId", i7);
            }
            jSONObject.put("autoplay", this.f11303c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.f11304e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f11305f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j3 : this.h) {
                    jSONArray.put(j3);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f11307r;
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
        JSONObject jSONObject = this.f11307r;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = oVar.f11307r;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && j6.a.d(this.f11301a, oVar.f11301a) && this.f11302b == oVar.f11302b && this.f11303c == oVar.f11303c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.f11304e == oVar.f11304e && this.f11305f == oVar.f11305f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11301a, Integer.valueOf(this.f11302b), Boolean.valueOf(this.f11303c), Double.valueOf(this.d), Double.valueOf(this.f11304e), Double.valueOf(this.f11305f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f11307r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11307r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11306n = jSONObject;
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f11301a, i7);
        int i10 = this.f11302b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z9 = this.f11303c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(z9 ? 1 : 0);
        double d = this.d;
        wb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f11304e;
        wb.q(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d10 = this.f11305f;
        wb.q(parcel, 7, 8);
        parcel.writeDouble(d10);
        wb.j(parcel, 8, this.h);
        wb.l(parcel, 9, this.f11306n);
        wb.s(parcel, r10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
