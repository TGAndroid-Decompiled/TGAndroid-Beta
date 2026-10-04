package c5;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class i implements fb.n {
    public String f4209a;

    public i(String str) {
        this.f4209a = str;
    }

    public static void a(aa.a aVar, da.d dVar) {
        String str = dVar.f8186a;
        if (str != null) {
            aVar.q("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.q("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.q("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        aVar.q("Accept", "application/json");
        String str2 = dVar.f8187b;
        if (str2 != null) {
            aVar.q("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f8188c;
        if (str3 != null) {
            aVar.q("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            aVar.q("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.f8189e.b().f48923a;
        if (str5 != null) {
            aVar.q("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(da.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f8191g);
        hashMap.put("source", Integer.toString(dVar.f8192i));
        String str = dVar.f8190f;
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
        String str = this.f4209a;
        int i10 = bVar.f390c;
        t9.b bVar2 = t9.b.f46936a;
        bVar2.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar2.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = bVar.f389b;
        try {
            return new JSONObject(str3);
        } catch (Exception e7) {
            bVar2.d("Failed to parse settings JSON from " + str, e7);
            bVar2.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object p2() {
        throw new RuntimeException(this.f4209a);
    }
}
