package gb;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public final class p implements rd.l {
    public final int f13741a;

    public p(int i7) {
        this.f13741a = i7;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f13741a) {
            case 0:
                m1.b ex = (m1.b) obj;
                kotlin.jvm.internal.j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return jb.j.f16628b;
            case 1:
                q1.b bVar = (q1.b) obj;
                q1.e eVar = sa.h.f55007c;
                long j3 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        q1.e eVar2 = (q1.e) entry.getKey();
                        String c10 = sa.h.c(System.currentTimeMillis());
                        if (((Set) entry.getValue()).contains(c10)) {
                            Object[] objArr = {c10};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (hashSet.add(obj2)) {
                                bVar.d(eVar2, DesugarCollections.unmodifiableSet(hashSet));
                                j3++;
                            } else {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j3 == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j3));
                }
                return null;
            default:
                id.f fVar = (id.f) obj;
                if (!(fVar instanceof zd.x)) {
                    return null;
                }
                return (zd.x) fVar;
        }
    }

    public p(sa.h hVar) {
        this.f13741a = 1;
    }
}
