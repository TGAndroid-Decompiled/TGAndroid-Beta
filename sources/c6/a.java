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
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f3830a;
    public final String f3831b;
    public final long f3832c;
    public final String d;
    public final String e;
    public final String f3833f;
    public final String h;
    public final String f3834n;
    public final String f3835r;
    public final long f3836s;
    public final String f3837w;
    public final t f3838x;
    public final JSONObject f3839y;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f3830a = str;
        this.f3831b = str2;
        this.f3832c = j10;
        this.d = str3;
        this.e = str4;
        this.f3833f = str5;
        this.h = str6;
        this.f3834n = str7;
        this.f3835r = str8;
        this.f3836s = j11;
        this.f3837w = str9;
        this.f3838x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f3839y = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f3839y = new JSONObject();
                return;
            }
        }
        this.f3839y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3830a);
            long j10 = this.f3832c;
            Pattern pattern = g6.a.f7365a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f3836s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f3834n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f3831b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f3833f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f3839y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f3835r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f3837w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f3838x;
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
        if (g6.a.d(this.f3830a, aVar.f3830a) && g6.a.d(this.f3831b, aVar.f3831b) && this.f3832c == aVar.f3832c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f3833f, aVar.f3833f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f3834n, aVar.f3834n) && g6.a.d(this.f3835r, aVar.f3835r) && this.f3836s == aVar.f3836s && g6.a.d(this.f3837w, aVar.f3837w) && g6.a.d(this.f3838x, aVar.f3838x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3830a, this.f3831b, Long.valueOf(this.f3832c), this.d, this.e, this.f3833f, this.h, this.f3834n, this.f3835r, Long.valueOf(this.f3836s), this.f3837w, this.f3838x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f3830a);
        h0.l(parcel, 3, this.f3831b);
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.f3832c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f3833f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.f3834n);
        h0.l(parcel, 10, this.f3835r);
        h0.s(parcel, 11, 8);
        parcel.writeLong(this.f3836s);
        h0.l(parcel, 12, this.f3837w);
        h0.k(parcel, 13, this.f3838x, i10);
        h0.r(parcel, q6);
    }
}
