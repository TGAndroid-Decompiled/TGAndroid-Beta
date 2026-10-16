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
    public final String f4432a;
    public final String f4433b;
    public final long f4434c;
    public final String d;
    public final String e;
    public final String f4435f;
    public final String h;
    public final String f4436n;
    public final String f4437r;
    public final long f4438s;
    public final String v;
    public final t f4439w;
    public final JSONObject f4440x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f4432a = str;
        this.f4433b = str2;
        this.f4434c = j10;
        this.d = str3;
        this.e = str4;
        this.f4435f = str5;
        this.h = str6;
        this.f4436n = str7;
        this.f4437r = str8;
        this.f4438s = j11;
        this.v = str9;
        this.f4439w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4440x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4440x = new JSONObject();
                return;
            }
        }
        this.f4440x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4432a);
            long j10 = this.f4434c;
            Pattern pattern = g6.a.f9935a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f4438s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f4436n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4433b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4435f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4440x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4437r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4439w;
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
        if (g6.a.d(this.f4432a, aVar.f4432a) && g6.a.d(this.f4433b, aVar.f4433b) && this.f4434c == aVar.f4434c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f4435f, aVar.f4435f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4436n, aVar.f4436n) && g6.a.d(this.f4437r, aVar.f4437r) && this.f4438s == aVar.f4438s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4439w, aVar.f4439w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4432a, this.f4433b, Long.valueOf(this.f4434c), this.d, this.e, this.f4435f, this.h, this.f4436n, this.f4437r, Long.valueOf(this.f4438s), this.v, this.f4439w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4432a);
        w7.f0.l(parcel, 3, this.f4433b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.f4434c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f4435f);
        w7.f0.l(parcel, 8, this.h);
        w7.f0.l(parcel, 9, this.f4436n);
        w7.f0.l(parcel, 10, this.f4437r);
        w7.f0.s(parcel, 11, 8);
        parcel.writeLong(this.f4438s);
        w7.f0.l(parcel, 12, this.v);
        w7.f0.k(parcel, 13, this.f4439w, i10);
        w7.f0.r(parcel, q6);
    }
}
