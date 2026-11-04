package e6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f9652a;
    public final String f9653b;
    public final long f9654c;
    public final String d;
    public final String f9655e;
    public final String f9656f;
    public final String h;
    public final String f9657n;
    public final String f9658r;
    public final long f9659s;
    public final String f9660w;
    public final t f9661x;
    public final JSONObject f9662y;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f9652a = str;
        this.f9653b = str2;
        this.f9654c = j10;
        this.d = str3;
        this.f9655e = str4;
        this.f9656f = str5;
        this.h = str6;
        this.f9657n = str7;
        this.f9658r = str8;
        this.f9659s = j11;
        this.f9660w = str9;
        this.f9661x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f9662y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f9662y = new JSONObject();
                return;
            }
        }
        this.f9662y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f9652a);
            long j10 = this.f9654c;
            Pattern pattern = i6.a.f14618a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f9659s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f9657n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f9655e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f9653b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f9656f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f9662y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f9658r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f9660w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f9661x;
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
        if (i6.a.d(this.f9652a, aVar.f9652a) && i6.a.d(this.f9653b, aVar.f9653b) && this.f9654c == aVar.f9654c && i6.a.d(this.d, aVar.d) && i6.a.d(this.f9655e, aVar.f9655e) && i6.a.d(this.f9656f, aVar.f9656f) && i6.a.d(this.h, aVar.h) && i6.a.d(this.f9657n, aVar.f9657n) && i6.a.d(this.f9658r, aVar.f9658r) && this.f9659s == aVar.f9659s && i6.a.d(this.f9660w, aVar.f9660w) && i6.a.d(this.f9661x, aVar.f9661x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9652a, this.f9653b, Long.valueOf(this.f9654c), this.d, this.f9655e, this.f9656f, this.h, this.f9657n, this.f9658r, Long.valueOf(this.f9659s), this.f9660w, this.f9661x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9652a);
        j8.a.m(parcel, 3, this.f9653b);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.f9654c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f9655e);
        j8.a.m(parcel, 7, this.f9656f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.f9657n);
        j8.a.m(parcel, 10, this.f9658r);
        j8.a.r(parcel, 11, 8);
        parcel.writeLong(this.f9659s);
        j8.a.m(parcel, 12, this.f9660w);
        j8.a.l(parcel, 13, this.f9661x, i3);
        j8.a.t(parcel, s6);
    }
}
