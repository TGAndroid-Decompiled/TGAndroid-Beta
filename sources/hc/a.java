package hc;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.z0;
import java.util.HashMap;
import l7.w0;
import org.json.JSONObject;
import ra.m;
public final class a implements m {
    public final String f7370a;

    public a(String str) {
        this.f7370a = str;
    }

    public static void a(w0 w0Var, p9.c cVar) {
        String str = cVar.f44222a;
        if (str != null) {
            w0Var.w("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        w0Var.w("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        w0Var.w("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        w0Var.w("Accept", "application/json");
        String str2 = cVar.f44223b;
        if (str2 != null) {
            w0Var.w("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.f44224c;
        if (str3 != null) {
            w0Var.w("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            w0Var.w("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.f44225e.b().f7940a;
        if (str5 != null) {
            w0Var.w("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(p9.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", cVar.h);
        hashMap.put("display_version", cVar.f44227g);
        hashMap.put("source", Integer.toString(cVar.f44228i));
        String str = cVar.f44226f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(z0 z0Var) {
        int i10 = z0Var.f3430b;
        f9.b bVar = f9.b.f6225a;
        bVar.c("Settings response code was: " + i10);
        String str = this.f7370a;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = z0Var.f3431c;
        try {
            return new JSONObject(str3);
        } catch (Exception e6) {
            bVar.d("Failed to parse settings JSON from " + str, e6);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object y2() {
        throw new RuntimeException(this.f7370a);
    }

    public a(String str, db.a aVar) {
        if (str != null) {
            this.f7370a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
