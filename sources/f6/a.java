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
    public final String f11369a;
    public final String f11370b;
    public final long f11371c;
    public final String d;
    public final String f11372e;
    public final String f11373f;
    public final String h;
    public final String f11374n;
    public final String f11375r;
    public final long f11376s;
    public final String f11377w;
    public final t f11378x;
    public final JSONObject f11379y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11369a = str;
        this.f11370b = str2;
        this.f11371c = j3;
        this.d = str3;
        this.f11372e = str4;
        this.f11373f = str5;
        this.h = str6;
        this.f11374n = str7;
        this.f11375r = str8;
        this.f11376s = j10;
        this.f11377w = str9;
        this.f11378x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11379y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11379y = new JSONObject();
                return;
            }
        }
        this.f11379y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11369a);
            long j3 = this.f11371c;
            Pattern pattern = j6.a.f17264a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11376s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11374n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11372e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11370b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11373f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11379y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11375r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11377w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11378x;
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
        if (j6.a.d(this.f11369a, aVar.f11369a) && j6.a.d(this.f11370b, aVar.f11370b) && this.f11371c == aVar.f11371c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11372e, aVar.f11372e) && j6.a.d(this.f11373f, aVar.f11373f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11374n, aVar.f11374n) && j6.a.d(this.f11375r, aVar.f11375r) && this.f11376s == aVar.f11376s && j6.a.d(this.f11377w, aVar.f11377w) && j6.a.d(this.f11378x, aVar.f11378x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11369a, this.f11370b, Long.valueOf(this.f11371c), this.d, this.f11372e, this.f11373f, this.h, this.f11374n, this.f11375r, Long.valueOf(this.f11376s), this.f11377w, this.f11378x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11369a);
        bc.l(parcel, 3, this.f11370b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11371c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f11372e);
        bc.l(parcel, 7, this.f11373f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11374n);
        bc.l(parcel, 10, this.f11375r);
        bc.q(parcel, 11, 8);
        parcel.writeLong(this.f11376s);
        bc.l(parcel, 12, this.f11377w);
        bc.k(parcel, 13, this.f11378x, i7);
        bc.s(parcel, r10);
    }
}
