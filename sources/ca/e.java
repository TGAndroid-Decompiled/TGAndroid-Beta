package ca;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class e {
    public final HashMap f6004a = new HashMap();
    public final int f6005b = 64;
    public final int f6006c;

    public e(int i7) {
        this.f6006c = i7;
    }

    public static String b(int i7, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i7) {
                return str.substring(0, i7);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f6004a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        String b10 = b(this.f6006c, str);
        if (this.f6004a.size() >= this.f6005b && !this.f6004a.containsKey(b10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f6005b, null);
            return false;
        }
        String b11 = b(this.f6006c, str2);
        String str3 = (String) this.f6004a.get(b10);
        if (str3 == null) {
            if (b11 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str3.equals(b11);
        }
        if (equals) {
            return false;
        }
        HashMap hashMap = this.f6004a;
        if (str2 == null) {
            b11 = "";
        }
        hashMap.put(b10, b11);
        return true;
    }

    public final synchronized void d(Map map) {
        String b10;
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String b11 = b(this.f6006c, str);
                    if (this.f6004a.size() >= this.f6005b && !this.f6004a.containsKey(b11)) {
                        i7++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f6004a;
                    if (str2 == null) {
                        b10 = "";
                    } else {
                        b10 = b(this.f6006c, str2);
                    }
                    hashMap.put(b11, b10);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f6005b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
