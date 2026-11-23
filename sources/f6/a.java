package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.bc;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11372a;
    public final String f11373b;
    public final long f11374c;
    public final String d;
    public final String f11375e;
    public final String f11376f;
    public final String h;
    public final String f11377n;
    public final String f11378r;
    public final long f11379s;
    public final String f11380w;
    public final t f11381x;
    public final JSONObject f11382y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11372a = str;
        this.f11373b = str2;
        this.f11374c = j3;
        this.d = str3;
        this.f11375e = str4;
        this.f11376f = str5;
        this.h = str6;
        this.f11377n = str7;
        this.f11378r = str8;
        this.f11379s = j10;
        this.f11380w = str9;
        this.f11381x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11382y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11382y = new JSONObject();
                return;
            }
        }
        this.f11382y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11372a);
            long j3 = this.f11374c;
            Pattern pattern = j6.a.f17267a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11379s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11377n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11375e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11373b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11376f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11382y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11378r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11380w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11381x;
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
        if (j6.a.d(this.f11372a, aVar.f11372a) && j6.a.d(this.f11373b, aVar.f11373b) && this.f11374c == aVar.f11374c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11375e, aVar.f11375e) && j6.a.d(this.f11376f, aVar.f11376f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11377n, aVar.f11377n) && j6.a.d(this.f11378r, aVar.f11378r) && this.f11379s == aVar.f11379s && j6.a.d(this.f11380w, aVar.f11380w) && j6.a.d(this.f11381x, aVar.f11381x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11372a, this.f11373b, Long.valueOf(this.f11374c), this.d, this.f11375e, this.f11376f, this.h, this.f11377n, this.f11378r, Long.valueOf(this.f11379s), this.f11380w, this.f11381x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11372a);
        bc.l(parcel, 3, this.f11373b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11374c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f11375e);
        bc.l(parcel, 7, this.f11376f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11377n);
        bc.l(parcel, 10, this.f11378r);
        bc.q(parcel, 11, 8);
        parcel.writeLong(this.f11379s);
        bc.l(parcel, 12, this.f11380w);
        bc.k(parcel, 13, this.f11381x, i7);
        bc.s(parcel, r10);
    }
}
