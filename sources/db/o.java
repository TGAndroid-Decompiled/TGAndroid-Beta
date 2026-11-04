package db;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public final class o implements od.l {
    public final int f8709a;

    public o(int i3) {
        this.f8709a = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8709a) {
            case 0:
                l1.b ex = (l1.b) obj;
                kotlin.jvm.internal.j.e(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return gb.j.f12223b;
            case 1:
                p1.b bVar = (p1.b) obj;
                p1.e eVar = ra.i.f54466c;
                long j10 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        p1.e eVar2 = (p1.e) entry.getKey();
                        String c2 = ra.i.c(System.currentTimeMillis());
                        if (((Set) entry.getValue()).contains(c2)) {
                            Object[] objArr = {c2};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (hashSet.add(obj2)) {
                                bVar.d(eVar2, DesugarCollections.unmodifiableSet(hashSet));
                                j10++;
                            } else {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j10 == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j10));
                }
                return null;
            default:
                fd.f fVar = (fd.f) obj;
                if (!(fVar instanceof wd.x)) {
                    return null;
                }
                return (wd.x) fVar;
        }
    }

    public o(ra.i iVar) {
        this.f8709a = 1;
    }
}
