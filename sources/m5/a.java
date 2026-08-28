package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f17351a;
    public final String f17352b;
    public final long f17353c;
    public final String d;
    public final String f17354e;
    public final String f17355f;
    public final String h;
    public final String f17356n;
    public final String f17357r;
    public final long f17358s;
    public final String v;
    public final t f17359w;
    public final JSONObject f17360x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f17351a = str;
        this.f17352b = str2;
        this.f17353c = j10;
        this.d = str3;
        this.f17354e = str4;
        this.f17355f = str5;
        this.h = str6;
        this.f17356n = str7;
        this.f17357r = str8;
        this.f17358s = j11;
        this.v = str9;
        this.f17359w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f17360x = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f17360x = new JSONObject();
                return;
            }
        }
        this.f17360x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f17351a);
            long j10 = this.f17353c;
            Pattern pattern = q5.a.f46007a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f17358s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f17356n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f17354e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f17352b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f17355f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f17360x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f17357r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f17359w;
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
        if (q5.a.d(this.f17351a, aVar.f17351a) && q5.a.d(this.f17352b, aVar.f17352b) && this.f17353c == aVar.f17353c && q5.a.d(this.d, aVar.d) && q5.a.d(this.f17354e, aVar.f17354e) && q5.a.d(this.f17355f, aVar.f17355f) && q5.a.d(this.h, aVar.h) && q5.a.d(this.f17356n, aVar.f17356n) && q5.a.d(this.f17357r, aVar.f17357r) && this.f17358s == aVar.f17358s && q5.a.d(this.v, aVar.v) && q5.a.d(this.f17359w, aVar.f17359w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17351a, this.f17352b, Long.valueOf(this.f17353c), this.d, this.f17354e, this.f17355f, this.h, this.f17356n, this.f17357r, Long.valueOf(this.f17358s), this.v, this.f17359w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17351a);
        p8.l(parcel, 3, this.f17352b);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.f17353c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f17354e);
        p8.l(parcel, 7, this.f17355f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.f17356n);
        p8.l(parcel, 10, this.f17357r);
        p8.s(parcel, 11, 8);
        parcel.writeLong(this.f17358s);
        p8.l(parcel, 12, this.v);
        p8.k(parcel, 13, this.f17359w, i9);
        p8.r(parcel, q10);
    }
}
