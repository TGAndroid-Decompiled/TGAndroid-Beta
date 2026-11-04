package be;

import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class t {
    public final int f3284a;
    public final String f3285b;

    public t(String str, int i3) {
        this.f3284a = i3;
        this.f3285b = str;
    }

    public static void a(a0 a0Var, ha.e eVar) {
        String str = (String) eVar.f14381b;
        if (str != null) {
            a0Var.n("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.n("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.n("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.n("Accept", "application/json");
        String str2 = (String) eVar.f14382c;
        if (str2 != null) {
            a0Var.n("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) eVar.d;
        if (str3 != null) {
            a0Var.n("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) eVar.f14383e;
        if (str4 != null) {
            a0Var.n("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((z9.v) eVar.f14386i).c().f60167a;
        if (str5 != null) {
            a0Var.n("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(ha.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) eVar.h);
        hashMap.put("display_version", (String) eVar.f14385g);
        hashMap.put("source", Integer.toString(eVar.f14380a));
        String str = (String) eVar.f14384f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(ad.b bVar) {
        int i3 = bVar.f316c;
        w9.c cVar = w9.c.f57426a;
        cVar.c("Settings response code was: " + i3);
        String str = this.f3285b;
        if (i3 != 200 && i3 != 201 && i3 != 202 && i3 != 203) {
            String str2 = "Settings request failed; (status: " + i3 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f315b;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            cVar.d("Failed to parse settings JSON from " + str, e10);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f3284a) {
            case 0:
                return "<" + this.f3285b + '>';
            default:
                return super.toString();
        }
    }

    public t(String str, kb.a aVar) {
        this.f3284a = 1;
        if (str != null) {
            this.f3285b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
