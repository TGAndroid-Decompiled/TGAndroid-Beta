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
    public final String f3944a;
    public final String f3945b;
    public final long f3946c;
    public final String d;
    public final String e;
    public final String f3947f;
    public final String h;
    public final String f3948n;
    public final String f3949r;
    public final long f3950s;
    public final String v;
    public final t f3951w;
    public final JSONObject f3952x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f3944a = str;
        this.f3945b = str2;
        this.f3946c = j3;
        this.d = str3;
        this.e = str4;
        this.f3947f = str5;
        this.h = str6;
        this.f3948n = str7;
        this.f3949r = str8;
        this.f3950s = j10;
        this.v = str9;
        this.f3951w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f3952x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f3952x = new JSONObject();
                return;
            }
        }
        this.f3952x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3944a);
            long j3 = this.f3946c;
            Pattern pattern = g6.a.f9428a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f3950s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f3948n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f3945b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f3947f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f3952x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f3949r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f3951w;
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
        if (g6.a.d(this.f3944a, aVar.f3944a) && g6.a.d(this.f3945b, aVar.f3945b) && this.f3946c == aVar.f3946c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f3947f, aVar.f3947f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f3948n, aVar.f3948n) && g6.a.d(this.f3949r, aVar.f3949r) && this.f3950s == aVar.f3950s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f3951w, aVar.f3951w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3944a, this.f3945b, Long.valueOf(this.f3946c), this.d, this.e, this.f3947f, this.h, this.f3948n, this.f3949r, Long.valueOf(this.f3950s), this.v, this.f3951w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f3944a);
        w7.e0.l(parcel, 3, this.f3945b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f3946c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.l(parcel, 7, this.f3947f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f3948n);
        w7.e0.l(parcel, 10, this.f3949r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f3950s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f3951w, i10);
        w7.e0.r(parcel, q6);
    }
}
