package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class qx5 {
    public final HashMap a = new HashMap();
    public final short b;

    public qx5(int i) {
        this.b = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        String b = b(this.b, str);
        if (this.a.size() >= 64 && !this.a.containsKey(b)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String b2 = b(this.b, str2);
        String str3 = (String) this.a.get(b);
        if (str3 == null) {
            if (b2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str3.equals(b2);
        }
        if (equals) {
            return false;
        }
        HashMap hashMap = this.a;
        if (str2 == null) {
            b2 = "";
        }
        hashMap.put(b, b2);
        return true;
    }

    public final synchronized void d(Map map) {
        String b;
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String b2 = b(this.b, str);
                if (this.a.size() >= 64 && !this.a.containsKey(b2)) {
                    i++;
                } else {
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.a;
                    if (str2 == null) {
                        b = "";
                    } else {
                        b = b(this.b, str2);
                    }
                    hashMap.put(b2, b);
                }
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
        }
    }
}
