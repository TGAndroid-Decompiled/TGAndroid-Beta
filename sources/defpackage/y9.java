package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class y9 extends b4 {
    public static final Parcelable.Creator<y9> CREATOR = new d3d((byte) 27);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final String n;
    public final String r;
    public final long s;
    public final String w;
    public final ebc x;
    public final JSONObject y;

    public y9(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, ebc ebcVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = str8;
        this.s = j2;
        this.w = str9;
        this.x = ebcVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.y = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.y = new JSONObject();
                return;
            }
        }
        this.y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            long j = this.c;
            Pattern pattern = qe1.a;
            jSONObject.put("duration", j / 1000.0d);
            long j2 = this.s;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", j2 / 1000.0d);
            }
            String str = this.n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            ebc ebcVar = this.x;
            if (ebcVar != null) {
                jSONObject.put("vastAdsRequest", ebcVar.b());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        if (qe1.d(this.a, y9Var.a) && qe1.d(this.b, y9Var.b) && this.c == y9Var.c && qe1.d(this.d, y9Var.d) && qe1.d(this.e, y9Var.e) && qe1.d(this.f, y9Var.f) && qe1.d(this.h, y9Var.h) && qe1.d(this.n, y9Var.n) && qe1.d(this.r, y9Var.r) && this.s == y9Var.s && qe1.d(this.w, y9Var.w) && qe1.d(this.x, y9Var.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.h, this.n, this.r, Long.valueOf(this.s), this.w, this.x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.n);
        mve.l(parcel, 10, this.r);
        mve.q(parcel, 11, 8);
        parcel.writeLong(this.s);
        mve.l(parcel, 12, this.w);
        mve.k(parcel, 13, this.x, i);
        mve.s(parcel, r);
    }
}
