package g9;

import aa.b0;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.z0;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
public class l {
    public final String f13591a;

    public l(String str, pb.b bVar) {
        if (str != null) {
            this.f13591a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public static void b(a0 a0Var, ia.e eVar) {
        String str = (String) eVar.f15424b;
        if (str != null) {
            a0Var.l("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        a0Var.l("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a0Var.l("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        a0Var.l("Accept", "application/json");
        String str2 = (String) eVar.f15425c;
        if (str2 != null) {
            a0Var.l("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) eVar.d;
        if (str3 != null) {
            a0Var.l("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) eVar.f15426e;
        if (str4 != null) {
            a0Var.l("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((b0) eVar.f15429i).c().f784a;
        if (str5 != null) {
            a0Var.l("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(ia.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) eVar.h);
        hashMap.put("display_version", (String) eVar.f15428g);
        hashMap.put("source", Integer.toString(eVar.f15423a));
        String str = (String) eVar.f15427f;
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
                    sb2.append((CharSequence) this.f13591a);
                    sb2.append(f(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public JSONObject d(z0 z0Var) {
        int i7 = z0Var.f7297b;
        x9.b bVar = x9.b.f58546a;
        bVar.c("Settings response code was: " + i7);
        String str = this.f13591a;
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = z0Var.f7298c;
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

    public l(String str, int i7) {
        switch (i7) {
            case 2:
                this.f13591a = str;
                return;
            default:
                str.getClass();
                this.f13591a = str;
                return;
        }
    }
}
