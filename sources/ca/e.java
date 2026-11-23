package ca;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class e {
    public final HashMap f5145a = new HashMap();
    public final int f5146b = 64;
    public final int f5147c;

    public e(int i7) {
        this.f5147c = i7;
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
        return DesugarCollections.unmodifiableMap(new HashMap(this.f5145a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        String b10 = b(this.f5147c, str);
        if (this.f5145a.size() >= this.f5146b && !this.f5145a.containsKey(b10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f5146b, null);
            return false;
        }
        String b11 = b(this.f5147c, str2);
        String str3 = (String) this.f5145a.get(b10);
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
        HashMap hashMap = this.f5145a;
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
                    String b11 = b(this.f5147c, str);
                    if (this.f5145a.size() >= this.f5146b && !this.f5145a.containsKey(b11)) {
                        i7++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f5145a;
                    if (str2 == null) {
                        b10 = "";
                    } else {
                        b10 = b(this.f5147c, str2);
                    }
                    hashMap.put(b11, b10);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f5146b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
