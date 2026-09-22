package c5;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class i {
    public String f3897a;

    public static void a(aa.a aVar, da.d dVar) {
        String str = dVar.f7584a;
        if (str != null) {
            aVar.s("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.s("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.s("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.s("Accept", "application/json");
        String str2 = dVar.f7585b;
        if (str2 != null) {
            aVar.s("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f7586c;
        if (str3 != null) {
            aVar.s("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.s("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f44910a;
        if (str5 != null) {
            aVar.s("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f7588g);
        hashMap.put("source", Integer.toString(dVar.f7589i));
        String str = dVar.f7587f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(aa.b bVar) {
        String str = this.f3897a;
        int i10 = bVar.f363c;
        t9.b bVar2 = t9.b.f43047a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f362b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar2.d("Failed to parse settings JSON from " + str, e);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }
}
