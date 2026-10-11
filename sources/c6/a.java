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
    public final String f4306a;
    public final String f4307b;
    public final long f4308c;
    public final String d;
    public final String f4309e;
    public final String f4310f;
    public final String h;
    public final String f4311n;
    public final String f4312r;
    public final long f4313s;
    public final String v;
    public final t f4314w;
    public final JSONObject f4315x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4306a = str;
        this.f4307b = str2;
        this.f4308c = j3;
        this.d = str3;
        this.f4309e = str4;
        this.f4310f = str5;
        this.h = str6;
        this.f4311n = str7;
        this.f4312r = str8;
        this.f4313s = j10;
        this.v = str9;
        this.f4314w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4315x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4315x = new JSONObject();
                return;
            }
        }
        this.f4315x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4306a);
            long j3 = this.f4308c;
            Pattern pattern = g6.a.f10320a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4313s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4311n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4309e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4307b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4310f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4315x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4312r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4314w;
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
        if (g6.a.d(this.f4306a, aVar.f4306a) && g6.a.d(this.f4307b, aVar.f4307b) && this.f4308c == aVar.f4308c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4309e, aVar.f4309e) && g6.a.d(this.f4310f, aVar.f4310f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4311n, aVar.f4311n) && g6.a.d(this.f4312r, aVar.f4312r) && this.f4313s == aVar.f4313s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4314w, aVar.f4314w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4306a, this.f4307b, Long.valueOf(this.f4308c), this.d, this.f4309e, this.f4310f, this.h, this.f4311n, this.f4312r, Long.valueOf(this.f4313s), this.v, this.f4314w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4306a);
        w7.d0.l(parcel, 3, this.f4307b);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.f4308c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.l(parcel, 6, this.f4309e);
        w7.d0.l(parcel, 7, this.f4310f);
        w7.d0.l(parcel, 8, this.h);
        w7.d0.l(parcel, 9, this.f4311n);
        w7.d0.l(parcel, 10, this.f4312r);
        w7.d0.s(parcel, 11, 8);
        parcel.writeLong(this.f4313s);
        w7.d0.l(parcel, 12, this.v);
        w7.d0.k(parcel, 13, this.f4314w, i10);
        w7.d0.r(parcel, q6);
    }
}
