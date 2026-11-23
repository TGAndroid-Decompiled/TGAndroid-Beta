package f5;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.y0;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
public class g {
    public String f11281a;

    public g(String str) {
        str.getClass();
        this.f11281a = str;
    }

    public static void b(android.support.v4.media.session.a0 a0Var, ia.e eVar) {
        String str = (String) eVar.f16191b;
        if (str != null) {
            a0Var.m("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.m("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.m("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.m("Accept", "application/json");
        String str2 = (String) eVar.f16192c;
        if (str2 != null) {
            a0Var.m("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) eVar.d;
        if (str3 != null) {
            a0Var.m("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) eVar.f16193e;
        if (str4 != null) {
            a0Var.m("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((aa.a0) eVar.f16196i).c().f783a;
        if (str5 != null) {
            a0Var.m("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(ia.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) eVar.h);
        hashMap.put("display_version", (String) eVar.f16195g);
        hashMap.put("source", Integer.toString(eVar.f16190a));
        String str = (String) eVar.f16194f;
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
                    sb2.append((CharSequence) this.f11281a);
                    sb2.append(f(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public JSONObject d(y0 y0Var) {
        String str = this.f11281a;
        int i7 = y0Var.f6959b;
        x9.b bVar = x9.b.f60437a;
        bVar.c("Settings response code was: " + i7);
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = y0Var.f6960c;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            bVar.d("Failed to parse settings JSON from " + str, e10);
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
