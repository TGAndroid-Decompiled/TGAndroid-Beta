package g9;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class d {

    public final HashMap f6801a = new HashMap();

    public final int f6802b = 64;

    public final int f6803c;

    public d(int i10) {
        this.f6803c = i10;
    }

    public static String b(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f6801a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean zEquals;
        String strB = b(this.f6803c, str);
        if (this.f6801a.size() >= this.f6802b && !this.f6801a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f6802b, null);
            return false;
        }
        String strB2 = b(this.f6803c, str2);
        String str3 = (String) this.f6801a.get(strB);
        if (str3 == null) {
            zEquals = strB2 == null;
        } else {
            zEquals = str3.equals(strB2);
        }
        if (zEquals) {
            return false;
        }
        HashMap map = this.f6801a;
        if (str2 == null) {
            strB2 = "";
        }
        map.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f6803c, str);
                if (this.f6801a.size() < this.f6802b || this.f6801a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f6801a.put(strB, str2 == null ? "" : b(this.f6803c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f6802b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
