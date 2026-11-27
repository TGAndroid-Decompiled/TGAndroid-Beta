package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class nx2 implements ur4 {
    public final byte a;

    public nx2(uf5 uf5Var) {
        this.a = (byte) 2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kx2 kx2Var = (kx2) obj;
                if (!(kx2Var instanceof px2)) {
                    return null;
                }
                return (px2) kx2Var;
            case 1:
                zx2 zx2Var = (zx2) obj;
                zx2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", zx2Var);
                return sjf.e;
            default:
                sj7 sj7Var = (sj7) obj;
                Map a = sj7Var.a();
                LinkedHashMap linkedHashMap = sj7Var.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            zj8 zj8Var = (zj8) entry.getKey();
                            String c = uf5.c(System.currentTimeMillis());
                            if (((Set) entry.getValue()).contains(c)) {
                                Object[] objArr = {c};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    sj7Var.c(zj8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    lq5.q(obj2, "duplicate element: ");
                                }
                            } else {
                                zj8Var.getClass();
                                sj7Var.b();
                                linkedHashMap.remove(zj8Var);
                            }
                        }
                    } else {
                        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        zj8 zj8Var2 = uf5.c;
                        if (i == 0) {
                            zj8Var2.getClass();
                            sj7Var.b();
                            linkedHashMap.remove(zj8Var2);
                        } else {
                            sj7Var.c(zj8Var2, Long.valueOf(j));
                        }
                    }
                }
                return null;
        }
    }

    public nx2(byte b) {
        this.a = b;
    }
}
