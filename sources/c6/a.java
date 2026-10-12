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
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f4429a;
    public final String f4430b;
    public final long f4431c;
    public final String d;
    public final String e;
    public final String f4432f;
    public final String h;
    public final String f4433n;
    public final String f4434r;
    public final long f4435s;
    public final String v;
    public final t f4436w;
    public final JSONObject f4437x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f4429a = str;
        this.f4430b = str2;
        this.f4431c = j10;
        this.d = str3;
        this.e = str4;
        this.f4432f = str5;
        this.h = str6;
        this.f4433n = str7;
        this.f4434r = str8;
        this.f4435s = j11;
        this.v = str9;
        this.f4436w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4437x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4437x = new JSONObject();
                return;
            }
        }
        this.f4437x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4429a);
            long j10 = this.f4431c;
            Pattern pattern = g6.a.f9932a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f4435s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f4433n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4430b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4432f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4437x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4434r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4436w;
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
        if (g6.a.d(this.f4429a, aVar.f4429a) && g6.a.d(this.f4430b, aVar.f4430b) && this.f4431c == aVar.f4431c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f4432f, aVar.f4432f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4433n, aVar.f4433n) && g6.a.d(this.f4434r, aVar.f4434r) && this.f4435s == aVar.f4435s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4436w, aVar.f4436w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4429a, this.f4430b, Long.valueOf(this.f4431c), this.d, this.e, this.f4432f, this.h, this.f4433n, this.f4434r, Long.valueOf(this.f4435s), this.v, this.f4436w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4429a);
        g0.l(parcel, 3, this.f4430b);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.f4431c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.l(parcel, 7, this.f4432f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f4433n);
        g0.l(parcel, 10, this.f4434r);
        g0.s(parcel, 11, 8);
        parcel.writeLong(this.f4435s);
        g0.l(parcel, 12, this.v);
        g0.k(parcel, 13, this.f4436w, i10);
        g0.r(parcel, q6);
    }
}
