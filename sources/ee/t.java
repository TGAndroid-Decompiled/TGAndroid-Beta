package ee;

import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.y0;
import java.util.HashMap;
import org.json.JSONObject;
public final class t {
    public final int f10940a;
    public final String f10941b;

    public t(String str, int i7) {
        this.f10940a = i7;
        this.f10941b = str;
    }

    public static void a(a0 a0Var, ia.e eVar) {
        String str = (String) eVar.f16288b;
        if (str != null) {
            a0Var.m("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.m("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.m("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.m("Accept", "application/json");
        String str2 = (String) eVar.f16289c;
        if (str2 != null) {
            a0Var.m("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) eVar.d;
        if (str3 != null) {
            a0Var.m("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) eVar.f16290e;
        if (str4 != null) {
            a0Var.m("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((aa.a0) eVar.f16293i).c().f783a;
        if (str5 != null) {
            a0Var.m("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(ia.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) eVar.h);
        hashMap.put("display_version", (String) eVar.f16292g);
        hashMap.put("source", Integer.toString(eVar.f16287a));
        String str = (String) eVar.f16291f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(y0 y0Var) {
        int i7 = y0Var.f6958b;
        x9.b bVar = x9.b.f60555a;
        bVar.c("Settings response code was: " + i7);
        String str = this.f10941b;
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = y0Var.f6959c;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            bVar.d("Failed to parse settings JSON from " + str, e10);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f10940a) {
            case 0:
                return "<" + this.f10941b + '>';
            default:
                return super.toString();
        }
    }

    public t(String str, qb.a aVar) {
        this.f10940a = 1;
        if (str != null) {
            this.f10941b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
