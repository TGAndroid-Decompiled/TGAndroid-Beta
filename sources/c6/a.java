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
    public final String f4450a;
    public final String f4451b;
    public final long f4452c;
    public final String d;
    public final String f4453e;
    public final String f4454f;
    public final String h;
    public final String f4455n;
    public final String f4456r;
    public final long f4457s;
    public final String v;
    public final t f4458w;
    public final JSONObject f4459x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4450a = str;
        this.f4451b = str2;
        this.f4452c = j3;
        this.d = str3;
        this.f4453e = str4;
        this.f4454f = str5;
        this.h = str6;
        this.f4455n = str7;
        this.f4456r = str8;
        this.f4457s = j10;
        this.v = str9;
        this.f4458w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4459x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4459x = new JSONObject();
                return;
            }
        }
        this.f4459x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4450a);
            long j3 = this.f4452c;
            Pattern pattern = g6.a.f10384a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4457s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4455n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4453e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4451b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4454f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4459x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4456r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4458w;
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
        if (g6.a.d(this.f4450a, aVar.f4450a) && g6.a.d(this.f4451b, aVar.f4451b) && this.f4452c == aVar.f4452c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4453e, aVar.f4453e) && g6.a.d(this.f4454f, aVar.f4454f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4455n, aVar.f4455n) && g6.a.d(this.f4456r, aVar.f4456r) && this.f4457s == aVar.f4457s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4458w, aVar.f4458w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4450a, this.f4451b, Long.valueOf(this.f4452c), this.d, this.f4453e, this.f4454f, this.h, this.f4455n, this.f4456r, Long.valueOf(this.f4457s), this.v, this.f4458w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4450a);
        w7.e0.l(parcel, 3, this.f4451b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f4452c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.f4453e);
        w7.e0.l(parcel, 7, this.f4454f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4455n);
        w7.e0.l(parcel, 10, this.f4456r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f4457s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f4458w, i10);
        w7.e0.r(parcel, q6);
    }
}
