package ec;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.a1;
import java.util.HashMap;
import org.json.JSONObject;

public final class a {

    public final int f5367a;

    public String f5368b;

    public a() {
        this.f5367a = 2;
    }

    public static void a(j9.a aVar, m9.c cVar) {
        String str = cVar.f17886a;
        if (str != null) {
            aVar.E("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.E("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.E("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.E("Accept", "application/json");
        String str2 = cVar.f17887b;
        if (str2 != null) {
            aVar.E("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.f17888c;
        if (str3 != null) {
            aVar.E("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            aVar.E("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.f17889e.b().f5927a;
        if (str5 != null) {
            aVar.E("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(m9.c cVar) {
        HashMap map = new HashMap();
        map.put("build_version", cVar.h);
        map.put("display_version", cVar.f17891g);
        map.put("source", Integer.toString(cVar.f17892i));
        String str = cVar.f17890f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(a1 a1Var) {
        String str = this.f5368b;
        int i10 = a1Var.f3774b;
        c9.c cVar = c9.c.f2568a;
        cVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = a1Var.f3775c;
        try {
            return new JSONObject(str3);
        } catch (Exception e9) {
            cVar.d("Failed to parse settings JSON from " + str, e9);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f5367a) {
            case 3:
                return "<" + this.f5368b + '>';
            default:
                return super.toString();
        }
    }

    public a(String str, int i10) {
        this.f5367a = i10;
        this.f5368b = str;
    }

    public a(String str, xa.a aVar) {
        this.f5367a = 1;
        if (str != null) {
            this.f5368b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
