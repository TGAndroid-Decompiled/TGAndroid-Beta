package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.yb;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11023a;
    public final String f11024b;
    public final long f11025c;
    public final String d;
    public final String f11026e;
    public final String f11027f;
    public final String h;
    public final String f11028n;
    public final String f11029r;
    public final long f11030s;
    public final String f11031w;
    public final t f11032x;
    public final JSONObject f11033y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11023a = str;
        this.f11024b = str2;
        this.f11025c = j3;
        this.d = str3;
        this.f11026e = str4;
        this.f11027f = str5;
        this.h = str6;
        this.f11028n = str7;
        this.f11029r = str8;
        this.f11030s = j10;
        this.f11031w = str9;
        this.f11032x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11033y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11033y = new JSONObject();
                return;
            }
        }
        this.f11033y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11023a);
            long j3 = this.f11025c;
            Pattern pattern = j6.a.f16857a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11030s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11028n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11026e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11024b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11027f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11033y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11029r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11031w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11032x;
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
        if (j6.a.d(this.f11023a, aVar.f11023a) && j6.a.d(this.f11024b, aVar.f11024b) && this.f11025c == aVar.f11025c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11026e, aVar.f11026e) && j6.a.d(this.f11027f, aVar.f11027f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11028n, aVar.f11028n) && j6.a.d(this.f11029r, aVar.f11029r) && this.f11030s == aVar.f11030s && j6.a.d(this.f11031w, aVar.f11031w) && j6.a.d(this.f11032x, aVar.f11032x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11023a, this.f11024b, Long.valueOf(this.f11025c), this.d, this.f11026e, this.f11027f, this.h, this.f11028n, this.f11029r, Long.valueOf(this.f11030s), this.f11031w, this.f11032x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f11023a);
        yb.l(parcel, 3, this.f11024b);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.f11025c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f11026e);
        yb.l(parcel, 7, this.f11027f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.f11028n);
        yb.l(parcel, 10, this.f11029r);
        yb.q(parcel, 11, 8);
        parcel.writeLong(this.f11030s);
        yb.l(parcel, 12, this.f11031w);
        yb.k(parcel, 13, this.f11032x, i7);
        yb.s(parcel, r10);
    }
}
