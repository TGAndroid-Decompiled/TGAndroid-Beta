package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11209a;
    public final String f11210b;
    public final long f11211c;
    public final String d;
    public final String f11212e;
    public final String f11213f;
    public final String h;
    public final String f11214n;
    public final String f11215r;
    public final long f11216s;
    public final String f11217w;
    public final t f11218x;
    public final JSONObject f11219y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11209a = str;
        this.f11210b = str2;
        this.f11211c = j3;
        this.d = str3;
        this.f11212e = str4;
        this.f11213f = str5;
        this.h = str6;
        this.f11214n = str7;
        this.f11215r = str8;
        this.f11216s = j10;
        this.f11217w = str9;
        this.f11218x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11219y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11219y = new JSONObject();
                return;
            }
        }
        this.f11219y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11209a);
            long j3 = this.f11211c;
            Pattern pattern = j6.a.f16503a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11216s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11214n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11212e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11210b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11213f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11219y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11215r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11217w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11218x;
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
        if (j6.a.d(this.f11209a, aVar.f11209a) && j6.a.d(this.f11210b, aVar.f11210b) && this.f11211c == aVar.f11211c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11212e, aVar.f11212e) && j6.a.d(this.f11213f, aVar.f11213f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11214n, aVar.f11214n) && j6.a.d(this.f11215r, aVar.f11215r) && this.f11216s == aVar.f11216s && j6.a.d(this.f11217w, aVar.f11217w) && j6.a.d(this.f11218x, aVar.f11218x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11209a, this.f11210b, Long.valueOf(this.f11211c), this.d, this.f11212e, this.f11213f, this.h, this.f11214n, this.f11215r, Long.valueOf(this.f11216s), this.f11217w, this.f11218x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11209a);
        xb.l(parcel, 3, this.f11210b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f11211c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f11212e);
        xb.l(parcel, 7, this.f11213f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f11214n);
        xb.l(parcel, 10, this.f11215r);
        xb.q(parcel, 11, 8);
        parcel.writeLong(this.f11216s);
        xb.l(parcel, 12, this.f11217w);
        xb.k(parcel, 13, this.f11218x, i7);
        xb.s(parcel, r10);
    }
}
