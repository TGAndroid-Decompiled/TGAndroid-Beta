package n1;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import k1.m;
import kotlin.jvm.internal.j;
import m1.h;
import m1.i;
import m1.k;
public final class g {
    public static final g f17090a = new Object();

    public final b a(FileInputStream fileInputStream) {
        int i10;
        try {
            m1.f l10 = m1.f.l(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            j.e(pairs, "pairs");
            if (!bVar.f17084b.get()) {
                if (pairs.length <= 0) {
                    Map j10 = l10.j();
                    j.d(j10, "preferencesProto.preferencesMap");
                    for (Map.Entry entry : j10.entrySet()) {
                        String name = (String) entry.getKey();
                        k value = (k) entry.getValue();
                        j.d(name, "name");
                        j.d(value, "value");
                        int x4 = value.x();
                        if (x4 == 0) {
                            i10 = -1;
                        } else {
                            i10 = f.f17089a[m1.j.b(x4)];
                        }
                        switch (i10) {
                            case -1:
                                throw new IOException("Value case is null.", null);
                            case 0:
                            default:
                                throw new RuntimeException();
                            case 1:
                                bVar.b(new d(name), Boolean.valueOf(value.p()));
                                break;
                            case 2:
                                bVar.b(new d(name), Float.valueOf(value.s()));
                                break;
                            case 3:
                                bVar.b(new d(name), Double.valueOf(value.r()));
                                break;
                            case 4:
                                bVar.b(new d(name), Integer.valueOf(value.t()));
                                break;
                            case 5:
                                bVar.b(new d(name), Long.valueOf(value.u()));
                                break;
                            case 6:
                                d dVar = new d(name);
                                String v = value.v();
                                j.d(v, "value.string");
                                bVar.b(dVar, v);
                                break;
                            case 7:
                                d dVar2 = new d(name);
                                z k9 = value.w().k();
                                j.d(k9, "value.stringSet.stringsList");
                                bVar.b(dVar2, rc.g.p(k9));
                                break;
                            case 8:
                                throw new IOException("Value not set.", null);
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(bVar.f17083a);
                    j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                    return new b(new LinkedHashMap(unmodifiableMap), true);
                }
                e eVar = pairs[0];
                throw null;
            }
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        } catch (c0 e10) {
            throw new IOException("Unable to parse preferences proto.", e10);
        }
    }

    public final void b(Object obj, m mVar) {
        x a2;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) obj).f17083a);
        j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        m1.d k9 = m1.f.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object value = entry.getValue();
            String str = ((d) entry.getKey()).f17088a;
            if (value instanceof Boolean) {
                i y8 = k.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y8.c();
                k.m((k) y8.f1329b, booleanValue);
                a2 = y8.a();
            } else if (value instanceof Float) {
                i y10 = k.y();
                float floatValue = ((Number) value).floatValue();
                y10.c();
                k.n((k) y10.f1329b, floatValue);
                a2 = y10.a();
            } else if (value instanceof Double) {
                i y11 = k.y();
                double doubleValue = ((Number) value).doubleValue();
                y11.c();
                k.l((k) y11.f1329b, doubleValue);
                a2 = y11.a();
            } else if (value instanceof Integer) {
                i y12 = k.y();
                int intValue = ((Number) value).intValue();
                y12.c();
                k.o((k) y12.f1329b, intValue);
                a2 = y12.a();
            } else if (value instanceof Long) {
                i y13 = k.y();
                long longValue = ((Number) value).longValue();
                y13.c();
                k.i((k) y13.f1329b, longValue);
                a2 = y13.a();
            } else if (value instanceof String) {
                i y14 = k.y();
                y14.c();
                k.j((k) y14.f1329b, (String) value);
                a2 = y14.a();
            } else if (value instanceof Set) {
                i y15 = k.y();
                m1.g l10 = h.l();
                l10.c();
                h.i((h) l10.f1329b, (Set) value);
                y15.c();
                k.k((k) y15.f1329b, l10);
                a2 = y15.a();
            } else {
                throw new IllegalStateException(j.g(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            k9.getClass();
            k9.c();
            m1.f.i((m1.f) k9.f1329b).put(str, (k) a2);
        }
        m1.f fVar = (m1.f) k9.a();
        int a10 = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.k.h;
        if (a10 > 4096) {
            a10 = 4096;
        }
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(mVar, a10);
        fVar.c(kVar);
        if (kVar.f1268f > 0) {
            kVar.B();
        }
    }
}
