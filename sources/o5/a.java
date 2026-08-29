package o5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f19212a;
    public final String f19213b;
    public final long f19214c;
    public final String d;
    public final String f19215e;
    public final String f19216f;
    public final String h;
    public final String f19217n;
    public final String f19218r;
    public final long f19219s;
    public final String v;
    public final t f19220w;
    public final JSONObject f19221x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f19212a = str;
        this.f19213b = str2;
        this.f19214c = j10;
        this.d = str3;
        this.f19215e = str4;
        this.f19216f = str5;
        this.h = str6;
        this.f19217n = str7;
        this.f19218r = str8;
        this.f19219s = j11;
        this.v = str9;
        this.f19220w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f19221x = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f19221x = new JSONObject();
                return;
            }
        }
        this.f19221x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f19212a);
            long j10 = this.f19214c;
            Pattern pattern = s5.a.f47578a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f19219s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f19217n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f19215e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f19213b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f19216f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f19221x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f19218r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f19220w;
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
        if (s5.a.d(this.f19212a, aVar.f19212a) && s5.a.d(this.f19213b, aVar.f19213b) && this.f19214c == aVar.f19214c && s5.a.d(this.d, aVar.d) && s5.a.d(this.f19215e, aVar.f19215e) && s5.a.d(this.f19216f, aVar.f19216f) && s5.a.d(this.h, aVar.h) && s5.a.d(this.f19217n, aVar.f19217n) && s5.a.d(this.f19218r, aVar.f19218r) && this.f19219s == aVar.f19219s && s5.a.d(this.v, aVar.v) && s5.a.d(this.f19220w, aVar.f19220w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19212a, this.f19213b, Long.valueOf(this.f19214c), this.d, this.f19215e, this.f19216f, this.h, this.f19217n, this.f19218r, Long.valueOf(this.f19219s), this.v, this.f19220w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19212a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19213b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.f19214c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f19215e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f19216f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.f19217n);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f19218r);
        com.google.android.gms.internal.cast.o.s(parcel, 11, 8);
        parcel.writeLong(this.f19219s);
        com.google.android.gms.internal.cast.o.l(parcel, 12, this.v);
        com.google.android.gms.internal.cast.o.k(parcel, 13, this.f19220w, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
