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
    public final String f3938a;
    public final String f3939b;
    public final long f3940c;
    public final String d;
    public final String e;
    public final String f3941f;
    public final String h;
    public final String f3942n;
    public final String f3943r;
    public final long f3944s;
    public final String v;
    public final t f3945w;
    public final JSONObject f3946x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f3938a = str;
        this.f3939b = str2;
        this.f3940c = j3;
        this.d = str3;
        this.e = str4;
        this.f3941f = str5;
        this.h = str6;
        this.f3942n = str7;
        this.f3943r = str8;
        this.f3944s = j10;
        this.v = str9;
        this.f3945w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f3946x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f3946x = new JSONObject();
                return;
            }
        }
        this.f3946x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3938a);
            long j3 = this.f3940c;
            Pattern pattern = g6.a.f9415a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f3944s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f3942n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f3939b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f3941f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f3946x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f3943r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f3945w;
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
        if (g6.a.d(this.f3938a, aVar.f3938a) && g6.a.d(this.f3939b, aVar.f3939b) && this.f3940c == aVar.f3940c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f3941f, aVar.f3941f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f3942n, aVar.f3942n) && g6.a.d(this.f3943r, aVar.f3943r) && this.f3944s == aVar.f3944s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f3945w, aVar.f3945w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3938a, this.f3939b, Long.valueOf(this.f3940c), this.d, this.e, this.f3941f, this.h, this.f3942n, this.f3943r, Long.valueOf(this.f3944s), this.v, this.f3945w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f3938a);
        w7.f0.l(parcel, 3, this.f3939b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.f3940c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f3941f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f3942n);
        w7.f0.l(parcel, 10, this.f3943r);
        w7.f0.s(parcel, 11, 8);
        parcel.writeLong(this.f3944s);
        w7.f0.l(parcel, 12, this.v);
        w7.f0.k(parcel, 13, this.f3945w, i10);
        w7.f0.r(parcel, q6);
    }
}
