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
    public final String f3939a;
    public final String f3940b;
    public final long f3941c;
    public final String d;
    public final String e;
    public final String f3942f;
    public final String h;
    public final String f3943n;
    public final String f3944r;
    public final long f3945s;
    public final String v;
    public final t f3946w;
    public final JSONObject f3947x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f3939a = str;
        this.f3940b = str2;
        this.f3941c = j3;
        this.d = str3;
        this.e = str4;
        this.f3942f = str5;
        this.h = str6;
        this.f3943n = str7;
        this.f3944r = str8;
        this.f3945s = j10;
        this.v = str9;
        this.f3946w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f3947x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f3947x = new JSONObject();
                return;
            }
        }
        this.f3947x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3939a);
            long j3 = this.f3941c;
            Pattern pattern = g6.a.f9423a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f3945s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f3943n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f3940b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f3942f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f3947x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f3944r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f3946w;
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
        if (g6.a.d(this.f3939a, aVar.f3939a) && g6.a.d(this.f3940b, aVar.f3940b) && this.f3941c == aVar.f3941c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f3942f, aVar.f3942f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f3943n, aVar.f3943n) && g6.a.d(this.f3944r, aVar.f3944r) && this.f3945s == aVar.f3945s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f3946w, aVar.f3946w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3939a, this.f3940b, Long.valueOf(this.f3941c), this.d, this.e, this.f3942f, this.h, this.f3943n, this.f3944r, Long.valueOf(this.f3945s), this.v, this.f3946w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f3939a);
        w7.e0.l(parcel, 3, this.f3940b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f3941c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.l(parcel, 7, this.f3942f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f3943n);
        w7.e0.l(parcel, 10, this.f3944r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f3945s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f3946w, i10);
        w7.e0.r(parcel, q6);
    }
}
