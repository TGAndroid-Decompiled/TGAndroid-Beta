package da;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class a {
    public final int f8225a = 1;
    public final String f8226b;

    public a(String str) {
        this.f8226b = str;
    }

    public static void a(aa.a aVar, e eVar) {
        String str = eVar.f8239a;
        if (str != null) {
            aVar.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.r("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.r("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.r("Accept", "application/json");
        String str2 = eVar.f8240b;
        if (str2 != null) {
            aVar.r("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = eVar.f8241c;
        if (str3 != null) {
            aVar.r("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = eVar.d;
        if (str4 != null) {
            aVar.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = eVar.f8242e.b().f50265a;
        if (str5 != null) {
            aVar.r("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", eVar.h);
        hashMap.put("display_version", eVar.f8244g);
        hashMap.put("source", Integer.toString(eVar.f8245i));
        String str = eVar.f8243f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(aa.b bVar) {
        int i10 = bVar.f388c;
        t9.b bVar2 = t9.b.f48289a;
        bVar2.c("Settings response code was: " + i10);
        String str = this.f8226b;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f387b;
        try {
            return new JSONObject(str3);
        } catch (Exception e7) {
            bVar2.d("Failed to parse settings JSON from " + str, e7);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f8225a) {
            case 1:
                return "<" + this.f8226b + '>';
            default:
                return super.toString();
        }
    }

    public a(String str, ob.a aVar) {
        if (str != null) {
            this.f8226b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
