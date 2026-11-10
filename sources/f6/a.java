package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11214a;
    public final String f11215b;
    public final long f11216c;
    public final String d;
    public final String f11217e;
    public final String f11218f;
    public final String h;
    public final String f11219n;
    public final String f11220r;
    public final long f11221s;
    public final String f11222w;
    public final t f11223x;
    public final JSONObject f11224y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11214a = str;
        this.f11215b = str2;
        this.f11216c = j3;
        this.d = str3;
        this.f11217e = str4;
        this.f11218f = str5;
        this.h = str6;
        this.f11219n = str7;
        this.f11220r = str8;
        this.f11221s = j10;
        this.f11222w = str9;
        this.f11223x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11224y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11224y = new JSONObject();
                return;
            }
        }
        this.f11224y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11214a);
            long j3 = this.f11216c;
            Pattern pattern = j6.a.f16506a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11221s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11219n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11217e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11215b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11218f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11224y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11220r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11222w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11223x;
            if (tVar != null) {
                jSONObject.put("vastAdsRequest", tVar.b());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j6.a.d(this.f11214a, aVar.f11214a) && j6.a.d(this.f11215b, aVar.f11215b) && this.f11216c == aVar.f11216c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11217e, aVar.f11217e) && j6.a.d(this.f11218f, aVar.f11218f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11219n, aVar.f11219n) && j6.a.d(this.f11220r, aVar.f11220r) && this.f11221s == aVar.f11221s && j6.a.d(this.f11222w, aVar.f11222w) && j6.a.d(this.f11223x, aVar.f11223x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11214a, this.f11215b, Long.valueOf(this.f11216c), this.d, this.f11217e, this.f11218f, this.h, this.f11219n, this.f11220r, Long.valueOf(this.f11221s), this.f11222w, this.f11223x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11214a);
        xb.l(parcel, 3, this.f11215b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f11216c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f11217e);
        xb.l(parcel, 7, this.f11218f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f11219n);
        xb.l(parcel, 10, this.f11220r);
        xb.q(parcel, 11, 8);
        parcel.writeLong(this.f11221s);
        xb.l(parcel, 12, this.f11222w);
        xb.k(parcel, 13, this.f11223x, i7);
        xb.s(parcel, r10);
    }
}
