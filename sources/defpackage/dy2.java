package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class dy2 implements rr4 {
    public final byte a;

    public dy2(rf5 rf5Var) {
        this.a = (byte) 2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ay2 ay2Var = (ay2) obj;
                if (!(ay2Var instanceof fy2)) {
                    return null;
                }
                return (fy2) ay2Var;
            case 1:
                py2 py2Var = (py2) obj;
                py2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", py2Var);
                return dhf.e;
            default:
                lj7 lj7Var = (lj7) obj;
                Map a = lj7Var.a();
                LinkedHashMap linkedHashMap = lj7Var.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            ni8 ni8Var = (ni8) entry.getKey();
                            String c = rf5.c(System.currentTimeMillis());
                            if (((Set) entry.getValue()).contains(c)) {
                                Object[] objArr = {c};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    lj7Var.c(ni8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    u36.i(obj2, "duplicate element: ");
                                }
                            } else {
                                ni8Var.getClass();
                                lj7Var.b();
                                linkedHashMap.remove(ni8Var);
                            }
                        }
                    } else {
                        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        ni8 ni8Var2 = rf5.c;
                        if (i == 0) {
                            ni8Var2.getClass();
                            lj7Var.b();
                            linkedHashMap.remove(ni8Var2);
                        } else {
                            lj7Var.c(ni8Var2, Long.valueOf(j));
                        }
                    }
                }
                return null;
        }
    }

    public dy2(byte b) {
        this.a = b;
    }
}
