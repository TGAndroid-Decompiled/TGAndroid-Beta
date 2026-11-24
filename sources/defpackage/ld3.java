package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
public final class ld3 implements qt3, iad {
    public final byte a;
    public String b;

    public ld3(String str) {
        this.a = (byte) 3;
        this.b = str;
    }

    public static void c(in3 in3Var, laa laaVar) {
        String str = laaVar.a;
        if (str != null) {
            in3Var.A("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        in3Var.A("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        in3Var.A("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        in3Var.A("Accept", "application/json");
        in3Var.A("X-CRASHLYTICS-DEVICE-MODEL", laaVar.b);
        String str2 = laaVar.c;
        if (str2 != null) {
            in3Var.A("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = laaVar.d;
        if (str3 != null) {
            in3Var.A("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = laaVar.e.c().a;
        if (str4 != null) {
            in3Var.A("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap d(laa laaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", laaVar.h);
        hashMap.put("display_version", laaVar.g);
        hashMap.put("source", Integer.toString(laaVar.i));
        String str = laaVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override
    public final int a(int i) {
        return -1;
    }

    @Override
    public final boolean b(int i) {
        return false;
    }

    @Override
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final JSONObject e(mi5 mi5Var) {
        String str = this.b;
        int i = mi5Var.b;
        f8e f8eVar = f8e.b;
        f8eVar.k("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String d = mle.d("Settings request failed; (status: ", i, ") from ", str);
            if (f8eVar.e(6)) {
                Log.e("FirebaseCrashlytics", d, null);
            }
            return null;
        }
        String str2 = mi5Var.c;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            f8eVar.l("Failed to parse settings JSON from ".concat(str), e);
            f8eVar.l("Settings response " + str2, null);
            return null;
        }
    }

    @Override
    public final int length() {
        return this.b.length();
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override
    public final Object zzp() {
        Object obj;
        boolean z;
        String str = this.b;
        ContentResolver contentResolver = i8d.g.getContentResolver();
        Uri uri = rjf.a;
        synchronized (rjf.class) {
            rjf.c(contentResolver);
            obj = rjf.k;
        }
        HashMap hashMap = rjf.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) rjf.a(hashMap, str, bool);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            String b = rjf.b(contentResolver, str);
            boolean z2 = false;
            if (b != null && !b.equals("")) {
                if (rjf.c.matcher(b).matches()) {
                    bool = Boolean.TRUE;
                    z2 = true;
                } else if (!rjf.d.matcher(b).matches()) {
                    Log.w("Gservices", b10.i("attempt to read gservices key ", str, " (value \"", b, "\") as boolean"));
                }
                rjf.e(obj, hashMap, str, bool);
                z = z2;
            }
            bool = bool2;
            rjf.e(obj, hashMap, str, bool);
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public ld3(byte b) {
        this.a = b;
    }

    public ld3(String str, fgf fgfVar) {
        this.a = (byte) 0;
        this.b = str;
    }
}
