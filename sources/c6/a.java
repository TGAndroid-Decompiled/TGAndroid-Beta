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
    public final String f4477a;
    public final String f4478b;
    public final long f4479c;
    public final String d;
    public final String f4480e;
    public final String f4481f;
    public final String h;
    public final String f4482n;
    public final String f4483r;
    public final long f4484s;
    public final String v;
    public final t f4485w;
    public final JSONObject f4486x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4477a = str;
        this.f4478b = str2;
        this.f4479c = j3;
        this.d = str3;
        this.f4480e = str4;
        this.f4481f = str5;
        this.h = str6;
        this.f4482n = str7;
        this.f4483r = str8;
        this.f4484s = j10;
        this.v = str9;
        this.f4485w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4486x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4486x = new JSONObject();
                return;
            }
        }
        this.f4486x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4477a);
            long j3 = this.f4479c;
            Pattern pattern = g6.a.f10412a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4484s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4482n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4480e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4478b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4481f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4486x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4483r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4485w;
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
        if (g6.a.d(this.f4477a, aVar.f4477a) && g6.a.d(this.f4478b, aVar.f4478b) && this.f4479c == aVar.f4479c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4480e, aVar.f4480e) && g6.a.d(this.f4481f, aVar.f4481f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4482n, aVar.f4482n) && g6.a.d(this.f4483r, aVar.f4483r) && this.f4484s == aVar.f4484s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4485w, aVar.f4485w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4477a, this.f4478b, Long.valueOf(this.f4479c), this.d, this.f4480e, this.f4481f, this.h, this.f4482n, this.f4483r, Long.valueOf(this.f4484s), this.v, this.f4485w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4477a);
        w7.e0.l(parcel, 3, this.f4478b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f4479c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.f4480e);
        w7.e0.l(parcel, 7, this.f4481f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4482n);
        w7.e0.l(parcel, 10, this.f4483r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f4484s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f4485w, i10);
        w7.e0.r(parcel, q6);
    }
}
