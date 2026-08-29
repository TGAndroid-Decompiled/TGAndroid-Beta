package i2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import h7.m8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class a {
    public static volatile a d;
    public static final Object f8209e = new Object();
    public final Context f8212c;
    public final HashSet f8211b = new HashSet();
    public final HashMap f8210a = new HashMap();

    public a(Context context) {
        this.f8212c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (f8209e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f8212c.getString(2131701265);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f8211b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f8210a;
        if (m8.b()) {
            try {
                m8.a(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f8212c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
