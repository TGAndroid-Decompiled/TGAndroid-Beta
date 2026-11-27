package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class sc3 {
    public String a;

    public static void a(pm3 pm3Var, cca ccaVar) {
        String str = ccaVar.a;
        if (str != null) {
            pm3Var.A("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        pm3Var.A("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        pm3Var.A("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        pm3Var.A("Accept", "application/json");
        pm3Var.A("X-CRASHLYTICS-DEVICE-MODEL", ccaVar.b);
        String str2 = ccaVar.c;
        if (str2 != null) {
            pm3Var.A("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = ccaVar.d;
        if (str3 != null) {
            pm3Var.A("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = ccaVar.e.c().a;
        if (str4 != null) {
            pm3Var.A("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(cca ccaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", ccaVar.h);
        hashMap.put("display_version", ccaVar.g);
        hashMap.put("source", Integer.toString(ccaVar.i));
        String str = ccaVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final JSONObject c(pi5 pi5Var) {
        String str = this.a;
        int i = pi5Var.b;
        sae saeVar = sae.b;
        saeVar.k("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String d = dze.d("Settings request failed; (status: ", i, ") from ", str);
            if (saeVar.d(6)) {
                Log.e("FirebaseCrashlytics", d, null);
            }
            return null;
        }
        String str2 = pi5Var.c;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            saeVar.l("Failed to parse settings JSON from ".concat(str), e);
            saeVar.l("Settings response " + str2, null);
            return null;
        }
    }
}
