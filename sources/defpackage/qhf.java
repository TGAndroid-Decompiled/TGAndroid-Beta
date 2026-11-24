package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
public abstract class qhf {
    public static HashMap f;
    public static Object k;
    public static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();
    public static final String[] m = new String[0];

    public static Object a(HashMap hashMap, String str, Object obj) {
        synchronized (qhf.class) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            }
            return null;
        }
    }

    public static java.lang.String b(android.content.ContentResolver r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhf.b(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static void c(ContentResolver contentResolver) {
        HashMap hashMap = f;
        AtomicBoolean atomicBoolean = e;
        if (hashMap == null) {
            atomicBoolean.set(false);
            f = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new hd1(null, (byte) 3));
        } else if (atomicBoolean.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    public static void d(Object obj, String str, String str2) {
        synchronized (qhf.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    public static void e(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (qhf.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }
}
