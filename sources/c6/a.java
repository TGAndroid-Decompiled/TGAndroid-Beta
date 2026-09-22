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
    public final String f3941a;
    public final String f3942b;
    public final long f3943c;
    public final String d;
    public final String e;
    public final String f3944f;
    public final String h;
    public final String f3945n;
    public final String f3946r;
    public final long f3947s;
    public final String v;
    public final t f3948w;
    public final JSONObject f3949x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f3941a = str;
        this.f3942b = str2;
        this.f3943c = j3;
        this.d = str3;
        this.e = str4;
        this.f3944f = str5;
        this.h = str6;
        this.f3945n = str7;
        this.f3946r = str8;
        this.f3947s = j10;
        this.v = str9;
        this.f3948w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f3949x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f3949x = new JSONObject();
                return;
            }
        }
        this.f3949x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3941a);
            long j3 = this.f3943c;
            Pattern pattern = g6.a.f9425a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f3947s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f3945n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f3942b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f3944f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f3949x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f3946r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f3948w;
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
        if (g6.a.d(this.f3941a, aVar.f3941a) && g6.a.d(this.f3942b, aVar.f3942b) && this.f3943c == aVar.f3943c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f3944f, aVar.f3944f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f3945n, aVar.f3945n) && g6.a.d(this.f3946r, aVar.f3946r) && this.f3947s == aVar.f3947s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f3948w, aVar.f3948w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3941a, this.f3942b, Long.valueOf(this.f3943c), this.d, this.e, this.f3944f, this.h, this.f3945n, this.f3946r, Long.valueOf(this.f3947s), this.v, this.f3948w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f3941a);
        w7.e0.l(parcel, 3, this.f3942b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f3943c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.l(parcel, 7, this.f3944f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f3945n);
        w7.e0.l(parcel, 10, this.f3946r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f3947s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f3948w, i10);
        w7.e0.r(parcel, q6);
    }
}
