package c5;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.e2;
import java.util.HashMap;
import org.json.JSONObject;
public final class j implements com.google.android.gms.internal.clearcut.g {
    public String f4387a;

    public j(String str) {
        this.f4387a = str;
    }

    public static void a(androidx.biometric.e eVar, ea.d dVar) {
        String str = dVar.f8669a;
        if (str != null) {
            eVar.s("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        eVar.s("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        eVar.s("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        eVar.s("Accept", "application/json");
        String str2 = dVar.f8670b;
        if (str2 != null) {
            eVar.s("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f8671c;
        if (str3 != null) {
            eVar.s("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            eVar.s("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f48281a;
        if (str5 != null) {
            eVar.s("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(ea.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f8673g);
        hashMap.put("source", Integer.toString(dVar.f8674i));
        String str = dVar.f8672f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(ba.a aVar) {
        String str = this.f4387a;
        int i10 = aVar.f2614c;
        u9.b bVar = u9.b.f46235a;
        bVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = aVar.f2613b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar.d("Failed to parse settings JSON from " + str, e);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.f4387a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.f5458g.getContentResolver();
        Uri uri = e2.f5473a;
        synchronized (e2.class) {
            e2.c(contentResolver);
            obj = e2.f5480k;
        }
        HashMap hashMap = e2.f5477g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) e2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = e2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (e2.f5475c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!e2.d.matcher(b10).matches()) {
                    Log.w("Gservices", org.telegram.ui.Cells.d0.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                e2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            e2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
