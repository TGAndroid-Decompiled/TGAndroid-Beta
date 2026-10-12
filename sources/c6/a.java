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
    public final String f4305a;
    public final String f4306b;
    public final long f4307c;
    public final String d;
    public final String f4308e;
    public final String f4309f;
    public final String h;
    public final String f4310n;
    public final String f4311r;
    public final long f4312s;
    public final String v;
    public final t f4313w;
    public final JSONObject f4314x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4305a = str;
        this.f4306b = str2;
        this.f4307c = j3;
        this.d = str3;
        this.f4308e = str4;
        this.f4309f = str5;
        this.h = str6;
        this.f4310n = str7;
        this.f4311r = str8;
        this.f4312s = j10;
        this.v = str9;
        this.f4313w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4314x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4314x = new JSONObject();
                return;
            }
        }
        this.f4314x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4305a);
            long j3 = this.f4307c;
            Pattern pattern = g6.a.f10319a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4312s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4310n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4308e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4306b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4309f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4314x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4311r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4313w;
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
        if (g6.a.d(this.f4305a, aVar.f4305a) && g6.a.d(this.f4306b, aVar.f4306b) && this.f4307c == aVar.f4307c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4308e, aVar.f4308e) && g6.a.d(this.f4309f, aVar.f4309f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4310n, aVar.f4310n) && g6.a.d(this.f4311r, aVar.f4311r) && this.f4312s == aVar.f4312s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4313w, aVar.f4313w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4305a, this.f4306b, Long.valueOf(this.f4307c), this.d, this.f4308e, this.f4309f, this.h, this.f4310n, this.f4311r, Long.valueOf(this.f4312s), this.v, this.f4313w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f4305a);
        w7.c0.l(parcel, 3, this.f4306b);
        w7.c0.s(parcel, 4, 8);
        parcel.writeLong(this.f4307c);
        w7.c0.l(parcel, 5, this.d);
        w7.c0.l(parcel, 6, this.f4308e);
        w7.c0.l(parcel, 7, this.f4309f);
        w7.c0.l(parcel, 8, this.h);
        w7.c0.l(parcel, 9, this.f4310n);
        w7.c0.l(parcel, 10, this.f4311r);
        w7.c0.s(parcel, 11, 8);
        parcel.writeLong(this.f4312s);
        w7.c0.l(parcel, 12, this.v);
        w7.c0.k(parcel, 13, this.f4313w, i10);
        w7.c0.r(parcel, q6);
    }
}
