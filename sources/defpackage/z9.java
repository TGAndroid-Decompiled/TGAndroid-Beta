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
public final class z9 extends c4 {
    public static final Parcelable.Creator<z9> CREATOR = new s5d((byte) 27);
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
    public final ddc x;
    public final JSONObject y;

    public z9(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, ddc ddcVar) {
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
        this.x = ddcVar;
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
            Pattern pattern = qd1.a;
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
            ddc ddcVar = this.x;
            if (ddcVar != null) {
                jSONObject.put("vastAdsRequest", ddcVar.b());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        if (qd1.d(this.a, z9Var.a) && qd1.d(this.b, z9Var.b) && this.c == z9Var.c && qd1.d(this.d, z9Var.d) && qd1.d(this.e, z9Var.e) && qd1.d(this.f, z9Var.f) && qd1.d(this.h, z9Var.h) && qd1.d(this.n, z9Var.n) && qd1.d(this.r, z9Var.r) && this.s == z9Var.s && qd1.d(this.w, z9Var.w) && qd1.d(this.x, z9Var.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.h, this.n, this.r, Long.valueOf(this.s), this.w, this.x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.l(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        bye.l(parcel, 10, this.r);
        bye.q(parcel, 11, 8);
        parcel.writeLong(this.s);
        bye.l(parcel, 12, this.w);
        bye.k(parcel, 13, this.x, i);
        bye.s(parcel, r);
    }
}
