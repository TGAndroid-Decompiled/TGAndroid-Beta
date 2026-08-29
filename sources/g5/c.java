package g5;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.a1;
import java.util.HashMap;
import org.json.JSONObject;
public final class c implements pa.m {
    public String f7032a;

    public c(String str) {
        this.f7032a = str;
    }

    public static void a(androidx.biometric.e eVar, n9.c cVar) {
        String str = cVar.f17169a;
        if (str != null) {
            eVar.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        eVar.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        eVar.x("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        eVar.x("Accept", "application/json");
        String str2 = cVar.f17170b;
        if (str2 != null) {
            eVar.x("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.f17171c;
        if (str3 != null) {
            eVar.x("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            eVar.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.f17172e.b().f7149a;
        if (str5 != null) {
            eVar.x("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(n9.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", cVar.h);
        hashMap.put("display_version", cVar.f17174g);
        hashMap.put("source", Integer.toString(cVar.f17175i));
        String str = cVar.f17173f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static c d(f5.w wVar) {
        String str;
        wVar.D(2);
        int r6 = wVar.r();
        int i10 = r6 >> 1;
        int r9 = ((wVar.r() >> 3) & 31) | ((r6 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (r9 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(r9);
        return new c(sb2.toString());
    }

    public JSONObject c(a1 a1Var) {
        String str = this.f7032a;
        int i10 = a1Var.f4346b;
        d9.d dVar = d9.d.f5538a;
        dVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (dVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = a1Var.f4347c;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            dVar.d("Failed to parse settings JSON from " + str, e10);
            dVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object p2() {
        throw new RuntimeException(this.f7032a);
    }
}
