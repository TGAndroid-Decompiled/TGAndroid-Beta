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
    public String f10981a;

    public g(String str, int i7) {
        switch (i7) {
            case 3:
                this.f10981a = str;
                return;
            default:
                str.getClass();
                this.f10981a = str;
                return;
        }
    }

    public static void b(android.support.v4.media.session.a0 a0Var, ia.f fVar) {
        String str = (String) fVar.f15884b;
        if (str != null) {
            a0Var.m("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.m("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.m("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.m("Accept", "application/json");
        String str2 = (String) fVar.f15885c;
        if (str2 != null) {
            a0Var.m("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) fVar.d;
        if (str3 != null) {
            a0Var.m("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) fVar.f15886e;
        if (str4 != null) {
            a0Var.m("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((aa.a0) fVar.f15889i).c().f784a;
        if (str5 != null) {
            a0Var.m("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(ia.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) fVar.h);
        hashMap.put("display_version", (String) fVar.f15888g);
        hashMap.put("source", Integer.toString(fVar.f15883a));
        String str = (String) fVar.f15887f;
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
                    sb2.append((CharSequence) this.f10981a);
                    sb2.append(f(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public JSONObject d(y0 y0Var) {
        String str = this.f10981a;
        int i7 = y0Var.f6684b;
        x9.b bVar = x9.b.f59856a;
        bVar.c("Settings response code was: " + i7);
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = y0Var.f6685c;
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
