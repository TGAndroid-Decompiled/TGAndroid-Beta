package defpackage;

import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
public final class zb3 {
    public String a;

    public zb3(String str) {
        str.getClass();
        this.a = str;
    }

    public static void b(xl3 xl3Var, l8a l8aVar) {
        String str = l8aVar.a;
        if (str != null) {
            xl3Var.B("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        xl3Var.B("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        xl3Var.B("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        xl3Var.B("Accept", "application/json");
        xl3Var.B("X-CRASHLYTICS-DEVICE-MODEL", l8aVar.b);
        String str2 = l8aVar.c;
        if (str2 != null) {
            xl3Var.B("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = l8aVar.d;
        if (str3 != null) {
            xl3Var.B("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = l8aVar.e.c().a;
        if (str4 != null) {
            xl3Var.B("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap c(l8a l8aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", l8aVar.h);
        hashMap.put("display_version", l8aVar.g);
        hashMap.put("source", Integer.toString(l8aVar.i));
        String str = l8aVar.f;
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

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(f(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            fi7.g(e);
        }
    }

    public final JSONObject d(ng5 ng5Var) {
        String str = this.a;
        int i = ng5Var.b;
        c6e c6eVar = c6e.b;
        c6eVar.k("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String d = mue.d("Settings request failed; (status: ", i, ") from ", str);
            if (c6eVar.d(6)) {
                Log.e("FirebaseCrashlytics", d, null);
            }
            return null;
        }
        String str2 = ng5Var.c;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            c6eVar.l("Failed to parse settings JSON from ".concat(str), e);
            c6eVar.l("Settings response " + str2, null);
            return null;
        }
    }

    public final String e(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
