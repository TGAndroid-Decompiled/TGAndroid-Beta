package d9;

import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
public class l {
    public String f7892a;

    public l(String str, int i10) {
        switch (i10) {
            case 3:
                this.f7892a = str;
                return;
            default:
                str.getClass();
                this.f7892a = str;
                return;
        }
    }

    public static void b(androidx.biometric.e eVar, ea.d dVar) {
        String str = dVar.f8551a;
        if (str != null) {
            eVar.q("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        eVar.q("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        eVar.q("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.0");
        eVar.q("Accept", "application/json");
        String str2 = dVar.f8552b;
        if (str2 != null) {
            eVar.q("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f8553c;
        if (str3 != null) {
            eVar.q("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.d;
        if (str4 != null) {
            eVar.q("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f49677a;
        if (str5 != null) {
            eVar.q("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(ea.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.h);
        hashMap.put("display_version", dVar.f8555g);
        hashMap.put("source", Integer.toString(dVar.f8556i));
        String str = dVar.f8554f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(f(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f7892a);
                    sb2.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JSONObject d(ba.a aVar) {
        String str = this.f7892a;
        int i10 = aVar.f4227c;
        u9.b bVar = u9.b.f47633a;
        bVar.c("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = aVar.f4226b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            bVar.d("Failed to parse settings JSON from " + str, e);
            bVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public String e(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }
}
