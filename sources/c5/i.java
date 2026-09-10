package c5;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class i implements fb.n {
    public String f4314a;

    public i(String str) {
        this.f4314a = str;
    }

    public static void a(aa.a aVar, da.d dVar) {
        String str = dVar.f6358a;
        if (str != null) {
            aVar.t("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.t("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.t("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.t("Accept", "application/json");
        String str2 = dVar.f6359b;
        if (str2 != null) {
            aVar.t("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f6360c;
        if (str3 != null) {
            aVar.t("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.t("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f43873a;
        if (str5 != null) {
            aVar.t("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f6362g);
        hashMap.put("source", Integer.toString(dVar.f6363i));
        String str = dVar.f6361f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static i d(e2.v vVar) {
        String str;
        String str2;
        vVar.K(2);
        int x10 = vVar.x();
        int i10 = x10 >> 1;
        int x11 = ((vVar.x() >> 3) & 31) | ((x10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7 && i10 != 8) {
            if (i10 == 9) {
                str = "dvav";
            } else if (i10 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder u10 = a4.a.u(str);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        u10.append(str2);
        u10.append(i10);
        if (x11 < 10) {
            str3 = ".0";
        }
        u10.append(str3);
        u10.append(x11);
        return new i(u10.toString());
    }

    public JSONObject c(aa.b bVar) {
        String str = this.f4314a;
        int i10 = bVar.f359c;
        t9.b bVar2 = t9.b.f42120a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f358b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar2.d("Failed to parse settings JSON from " + str, e);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object n2() {
        throw new RuntimeException(this.f4314a);
    }
}
