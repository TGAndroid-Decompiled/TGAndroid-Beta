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
    public final String f4257a;
    public final String f4258b;
    public final long f4259c;
    public final String d;
    public final String f4260e;
    public final String f4261f;
    public final String h;
    public final String f4262n;
    public final String f4263r;
    public final long f4264s;
    public final String v;
    public final t f4265w;
    public final JSONObject f4266x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4257a = str;
        this.f4258b = str2;
        this.f4259c = j3;
        this.d = str3;
        this.f4260e = str4;
        this.f4261f = str5;
        this.h = str6;
        this.f4262n = str7;
        this.f4263r = str8;
        this.f4264s = j10;
        this.v = str9;
        this.f4265w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4266x = new JSONObject(str6);
                return;
            } catch (JSONException e7) {
                Locale locale = Locale.ROOT;
                String message = e7.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4266x = new JSONObject();
                return;
            }
        }
        this.f4266x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4257a);
            long j3 = this.f4259c;
            Pattern pattern = g6.a.f10248a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4264s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4262n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4260e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4258b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4261f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4266x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4263r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4265w;
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
        if (g6.a.d(this.f4257a, aVar.f4257a) && g6.a.d(this.f4258b, aVar.f4258b) && this.f4259c == aVar.f4259c && g6.a.d(this.d, aVar.d) && g6.a.d(this.f4260e, aVar.f4260e) && g6.a.d(this.f4261f, aVar.f4261f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4262n, aVar.f4262n) && g6.a.d(this.f4263r, aVar.f4263r) && this.f4264s == aVar.f4264s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4265w, aVar.f4265w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4257a, this.f4258b, Long.valueOf(this.f4259c), this.d, this.f4260e, this.f4261f, this.h, this.f4262n, this.f4263r, Long.valueOf(this.f4264s), this.v, this.f4265w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4257a);
        g0.l(parcel, 3, this.f4258b);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.f4259c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.f4260e);
        g0.l(parcel, 7, this.f4261f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f4262n);
        g0.l(parcel, 10, this.f4263r);
        g0.s(parcel, 11, 8);
        parcel.writeLong(this.f4264s);
        g0.l(parcel, 12, this.v);
        g0.k(parcel, 13, this.f4265w, i10);
        g0.r(parcel, q6);
    }
}
