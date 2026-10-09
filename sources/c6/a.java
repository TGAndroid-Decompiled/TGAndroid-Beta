package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f4307a;
    public final String f4308b;
    public final long f4309c;
    public final String d;
    public final String f4310e;
    public final String f4311f;
    public final String h;
    public final String f4312n;
    public final String f4313r;
    public final long f4314s;
    public final String v;
    public final t f4315w;
    public final JSONObject f4316x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4307a = str;
        this.f4308b = str2;
        this.f4309c = j3;
        this.d = str3;
        this.f4310e = str4;
        this.f4311f = str5;
        this.h = str6;
        this.f4312n = str7;
        this.f4313r = str8;
        this.f4314s = j10;
        this.v = str9;
        this.f4315w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4316x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4316x = new JSONObject();
                return;
            }
        }
        this.f4316x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4307a);
            long j3 = this.f4309c;
            Pattern pattern = g6.a.f10321a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4314s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4312n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4310e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4308b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4311f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4316x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4313r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4315w;
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
        if (g6.a.d(this.f4307a, aVar.f4307a) && g6.a.d(this.f4308b, aVar.f4308b) && this.f4309c == aVar.f4309c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4310e, aVar.f4310e) && g6.a.d(this.f4311f, aVar.f4311f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4312n, aVar.f4312n) && g6.a.d(this.f4313r, aVar.f4313r) && this.f4314s == aVar.f4314s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4315w, aVar.f4315w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4307a, this.f4308b, Long.valueOf(this.f4309c), this.d, this.f4310e, this.f4311f, this.h, this.f4312n, this.f4313r, Long.valueOf(this.f4314s), this.v, this.f4315w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4307a);
        w7.d0.l(parcel, 3, this.f4308b);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.f4309c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.l(parcel, 6, this.f4310e);
        w7.d0.l(parcel, 7, this.f4311f);
        w7.d0.l(parcel, 8, this.h);
        w7.d0.l(parcel, 9, this.f4312n);
        w7.d0.l(parcel, 10, this.f4313r);
        w7.d0.s(parcel, 11, 8);
        parcel.writeLong(this.f4314s);
        w7.d0.l(parcel, 12, this.v);
        w7.d0.k(parcel, 13, this.f4315w, i10);
        w7.d0.r(parcel, q6);
    }
}
